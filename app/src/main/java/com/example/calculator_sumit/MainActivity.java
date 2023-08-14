package com.example.calculator_sumit;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button
            button1,
            button2,
            button3,
            button_dot,
            button4,
            button5,
            button6,equal,
            button7,
            button8,
            button9,
            button_add,
            button_mul,
            button0,
            button_div,
            button_sub,
            button_back,
            button_clr;
    private TextView ans;
    Double v1,v2;
    Boolean add = false, min = false, mul= false ,div = false;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button1 = (Button) findViewById(R.id.button1);

        button2 = (Button) findViewById(R.id.button_2);

        button3 = (Button) findViewById(R.id.button_3);

        button4 = (Button) findViewById(R.id.button_4);

        button5 = (Button) findViewById(R.id.button_5);

        button6 = (Button) findViewById(R.id.button_6);

        button7 = (Button) findViewById(R.id.button_7);

        button8 = (Button) findViewById(R.id.button_8);

        button9 = (Button) findViewById(R.id.button_9);

        button0 = (Button) findViewById(R.id.button_0);
        equal = (Button) findViewById(R.id.button_equal);

        button_add = (Button) findViewById(R.id.button_add);

        button_mul = (Button) findViewById(R.id.button_mul);

        button_div = (Button) findViewById(R.id.button_div);

        button_sub = (Button) findViewById(R.id.button_sub);

        button_dot = (Button) findViewById(R.id.button_dot);

        button_back = (Button) findViewById(R.id.button_back);

        button_clr = (Button) findViewById(R.id.button_clr);
        ans = findViewById(R.id.ans);




        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "9");
            }
        });


        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "0");
            }
        });


        button_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + ".");
            }
        });


        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!ans.getText().toString().equals("")) {
                    String val = ans.getText().toString();
                    if (val.length() > 0) {
                        val = val.substring(0, val.length() - 1);
                        ans.setText(val);
                    }
                }

            }
        });


        button_clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText("");
            }
        });



        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(ans.getText() + "");
                add = true;
                ans.setText(null);


            }
        });


        button_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(ans.getText() + "");
                mul = true;
                ans.setText(null);
            }
        });



        button_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(ans.getText() + "");
                div = true;
                ans.setText(null);


            }
        });


        button_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v1 = Double.parseDouble(ans.getText() + "");
                min = true;
                ans.setText(null);


            }
        });


        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v2 = Double.parseDouble(ans.getText() + "");
                if (add == true) {
                    ans.setText(v1 + v2 + "");
                    add = false;
                } else if (min == true) {
                    ans.setText(v1 - v2 + "");
                    min = false;
                } else if (mul == true) {
                    ans.setText(v1 * v2 + "");
                    mul = false;
                } else if (div == true) {
                    ans.setText(v1 / v2 + "");
                    div = false;
                } else {
                    Toast.makeText(getApplicationContext(), "OPERATION FAILED.", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}