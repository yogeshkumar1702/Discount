package com.example.discount;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Amount;
    EditText Discount;
    Button Calculate;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Amount = findViewById(R.id.amount);
        Discount = findViewById(R.id.discount);
        Calculate = findViewById(R.id.calculate);
        result = findViewById(R.id.result);

        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double amt = Double.parseDouble(Amount.getText().toString());
                double dis = Double.parseDouble(Discount.getText().toString());

                double value = (amt*100) / (100-dis) ;
                result.setText(Double.toString(value));
            }
        });
    }
}
