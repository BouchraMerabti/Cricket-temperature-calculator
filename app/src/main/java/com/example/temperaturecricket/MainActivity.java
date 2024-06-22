package com.example.temperaturecricket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {



    TextView tvSecond;

    EditText et;

    Button btn;

    DecimalFormat format;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        format = new DecimalFormat("#0.00");
        et = findViewById(R.id.et);
        btn = findViewById(R.id.btn);
        tvSecond = findViewById(R.id.tvSecond);



        tvSecond.setVisibility(View.GONE);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (et.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Please enter all fields", Toast.LENGTH_SHORT).show();
                }
                else {
                    int cricketNumber = Integer.parseInt(et.getText().toString().trim());

                    double temp ;

                    temp = (cricketNumber/3) + 4;

                    String text = "The temperature is : " + format.format(temp) + "Cº";
                    tvSecond.setText(text);
                    tvSecond.setVisibility(View.VISIBLE);
                }


            }
        });
    }
}