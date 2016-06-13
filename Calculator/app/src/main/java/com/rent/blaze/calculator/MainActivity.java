package com.rent.blaze.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Button btnNum1, btnNum2, btnNum3, btnNum4, btnNum5, btnNum6, btnNum7, btnNum8, btnNum9, btndot,
            btnNumzero, btnadd, btnsub,
            btnmul, btndiv, btnclear, btnparanthesis, btnpercent, btnbackspace, btnequals;
    private EditText edtinput;
    private TextView txtdisp;
    private Double Num1, Num2;
    private String operand;
    private Double displayResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        onBtnClick();
    }

    public void initView() {
        btnNum1 = (Button) findViewById(R.id.btn_one);
        btnNum2 = (Button) findViewById(R.id.btn_two);
        btnNum3 = (Button) findViewById(R.id.btn_three);
        btnNum4 = (Button) findViewById(R.id.btn_four);
        btnNum5 = (Button) findViewById(R.id.btn_five);
        btnNum6 = (Button) findViewById(R.id.btn_six);
        btnNum7 = (Button) findViewById(R.id.btn_seven);
        btnNum8 = (Button) findViewById(R.id.btn_eight);
        btnNum9 = (Button) findViewById(R.id.btn_nine);
        btndot = (Button) findViewById(R.id.btn_dot);
        btnNumzero = (Button) findViewById(R.id.btn_zero);
        btnadd = (Button) findViewById(R.id.btn_plus);
        btnsub = (Button) findViewById(R.id.btn_minus);
        btnmul = (Button) findViewById(R.id.btn_multiple);
        btndiv = (Button) findViewById(R.id.btn_divide);
        btnclear = (Button) findViewById(R.id.btn_clear);
        btnparanthesis = (Button) findViewById(R.id.btn_small_bracket);
        btnpercent = (Button) findViewById(R.id.btn_percentage);
        btnbackspace = (Button) findViewById(R.id.btn_back);
        btnequals = (Button) findViewById(R.id.btn_equal);
        edtinput = (EditText) findViewById(R.id.edtinput);
        txtdisp = (TextView) findViewById(R.id.tvoutput);

    }

    public void onBtnClick() {
        btnNum1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtinput.setText(edtinput.getText() + "1");
            }
        });

        btnNum2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edtinput.setText(edtinput.getText() + "2");

            }
        });
        btnNum3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtinput.setText(edtinput.getText() + "3");

            }
        });
        btnNum4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtinput.setText(edtinput.getText() + "4");

            }
        });
        btnNum5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtinput.setText(edtinput.getText() + "5");

            }
        });
        btnNum6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtinput.setText(edtinput.getText() + "6");

            }
        });
        btnNum7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtinput.setText(edtinput.getText() + "7");

            }
        });
        btnNum8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtinput.setText(edtinput.getText() + "8");

            }
        });
        btnNum9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtinput.setText(edtinput.getText() + "9");
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtinput.setText(edtinput.getText() + ".");
            }
        });
        btnNumzero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtinput.setText(edtinput.getText() + "0");
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Num1 = Double.parseDouble(edtinput.getText() + "");
                operand = "+";
                edtinput.setText(null);
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Num1 = Double.parseDouble(edtinput.getText() + "");
                operand = "-";
                edtinput.setText(null);
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Num1 = Double.parseDouble(edtinput.getText() + "");
                operand = "*";
                edtinput.setText(null);

            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Num1 = Double.parseDouble(edtinput.getText() + "");
                operand = "/";
                edtinput.setText(null);


            }
        });
        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtinput.setText("");
                txtdisp.setText("");
            }
        });
        btnclear.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                edtinput.setText(null);
                txtdisp.setText(null);
                Num1 = null;
                Num2 = null;
                displayResult = null;
                return false;
            }
        });
        btnparanthesis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnpercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnbackspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String space = edtinput.getText().toString();
                if (space.length() > 0) {
                    edtinput.setText(space.substring(0, space.length() - 1));
                }


            }
        });
        btnequals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Num2 = Double.parseDouble(edtinput.getText() + "");

                if (operand == "+") {
                    displayResult = Calculate.addition(Num1, Num2);

                }
                if (operand == "-") {
                    displayResult = Calculate.subtraction(Num1, Num2);

                }
                if (operand == "*") {
                    displayResult = Calculate.multiplication(Num1, Num2);

                }
                if (operand == "/") {
                    displayResult = Calculate.division(Num1, Num2);

                }
                txtdisp.setText(String.valueOf(displayResult));
                edtinput.setText(null);

            }
        });
    }
}
