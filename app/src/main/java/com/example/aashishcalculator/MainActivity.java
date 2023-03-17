package com.example.aashishcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText costOfServiceText;
    private Button calcButton;
    private RadioGroup radioGroup;

    private Switch roundUpSwitch;

    private TextView tipAmountText;


    private double tipAmount;
    private double tipPercent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        costOfServiceText = findViewById(R.id.editTextTextPersonName);
        calcButton = findViewById(R.id.button);
        radioGroup = findViewById(R.id.radioGroup);
        roundUpSwitch = findViewById(R.id.switch1);
        tipAmountText = findViewById(R.id.textView4);

        calcButton.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                String cost = costOfServiceText.getText().toString();
                int costAmount = Integer.parseInt(cost);
                int checkedRadioButton = radioGroup.getCheckedRadioButtonId();
                if(checkedRadioButton == R.id.radioButton){
                    tipPercent = 0.2;
                }else if(checkedRadioButton == R.id.radioButton2){
                    tipPercent = 0.18;
                }else if(checkedRadioButton == R.id.radioButton3){
                    tipPercent = 0.15;
                }else{
                    tipPercent = 0.0;
                }

                tipAmount = costAmount * tipPercent;
                if(roundUpSwitch.isChecked()){
                    tipAmount = Math.round(tipAmount);
                }
                tipAmountText.setText(""+tipAmount);
            }
        });


    }
}