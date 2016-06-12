package com.rent.blaze.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btndot, btnzero, btnadd, btnsub,
            btnmul, btndiv, btnclear, btnparanthesis, btnpercent, btnbackspace, btnequals;
    EditText edtinput;
    TextView txtdisp;
    Float Num1, Num2;
    String add, mul, sub, div, displayaddResult, displaySubResult, displayDivResult, displayMulResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();
        onBtnClick();
    }

    public void initview() {
        btn1 = (Button) findViewById(R.id.btn_one);
        btn2 = (Button) findViewById(R.id.btn_two);
        btn3 = (Button) findViewById(R.id.btn_three);
        btn4 = (Button) findViewById(R.id.btn_four);
        btn5 = (Button) findViewById(R.id.btn_five);
        btn6 = (Button) findViewById(R.id.btn_six);
        btn7 = (Button) findViewById(R.id.btn_seven);
        btn8 = (Button) findViewById(R.id.btn_eight);
        btn9 = (Button) findViewById(R.id.btn_nine);
        btndot = (Button) findViewById(R.id.btn_dot);
        btnzero = (Button) findViewById(R.id.btn_zero);
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
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtinput.setText(edtinput.getText() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtinput.setText(edtinput.getText() + "2");

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtinput.setText(edtinput.getText() + "3");

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtinput.setText(edtinput.getText() + "4");

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtinput.setText(edtinput.getText() + "5");

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtinput.setText(edtinput.getText() + "6");

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtinput.setText(edtinput.getText() + "7");

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtinput.setText(edtinput.getText() + "8");

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
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
        btnzero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtinput.setText(edtinput.getText() + "0");
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Num1 = Float.parseFloat(edtinput.getText() + "");
                add = "+";
                edtinput.setText(null);
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Num1 = Float.parseFloat(edtinput.getText() + "");
                sub = "-";
                edtinput.setText(null);
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Num1 = Float.parseFloat(edtinput.getText() + "");
                mul = "*";
                edtinput.setText(null);

            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Num1 = Float.parseFloat(edtinput.getText() + "");
                div = "/";
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
                displayaddResult = null;
                displaySubResult = null;
                displayMulResult = null;
                displaySubResult = null;
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
                edtinput.setText(space.substring(0, space.length() - 1));
            }
        });
        btnequals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Num2 = Float.parseFloat(edtinput.getText() + "");
                if (add == "+") {
                    Float addResult = Num1 + Num2;
                    displayaddResult = addResult.toString();
                    txtdisp.setText(displayaddResult);
                    return;

                }
                if (sub == "-") {
                    Float subResult = Num1 - Num2;
                    displaySubResult = subResult.toString();
                    txtdisp.setText(displaySubResult);
                    return;

                }
                if (mul == "*") {
                    Float mulResult = Num1 * Num2;
                    displayMulResult = mulResult.toString();
                    txtdisp.setText(displayMulResult);
                    return;

                }
                if (div == "/") {
                    Float divResult = Num1 / Num2;
                    displayDivResult = divResult.toString();
                    txtdisp.setText(displayDivResult);
                    return;

                }
            }
        });
    }
}
