package com.example.user.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etWeight, etHeight;
    TextView tvResultNum, tvResultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etWeight = findViewById(R.id.etWeight);
        etHeight = findViewById(R.id.etHeight);
        tvResultNum = findViewById(R.id.tvResultNum);
        tvResultText = findViewById(R.id.tvResultText);
    }

    public void tombolDitekan(View view) {
        String weight = etWeight . getText().toString();
        double dWeight = Double.parseDouble(weight);

        String height = etHeight . getText().toString();
        double dHeight = Double.parseDouble(height)/100;

        double bmi = dWeight / (dHeight*dHeight);

        if(bmi<18.5){
            tvResultText.setText("bmi anda kurang dari ideal");
        }else if(bmi>22.5){
            tvResultText.setText("bmi anda lebih dari ideal");
        }else{
            tvResultText.setText("bmi anda ideal");
        }

        tvResultNum.setText(""+bmi);
    }
}
