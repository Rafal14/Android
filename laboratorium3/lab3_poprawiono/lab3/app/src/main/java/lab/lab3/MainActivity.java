package lab.lab3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn0;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btnEnd;
    Button btnAdd;
    Button btnSub;
    Button btnMul;
    Button btnDiv;
    Button btnClear;
    Button btnSqrt;
    Button btnEq;

    TextView textHistory;
    TextView textWin;

    double   number=0.0;
    char  sym='0';


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.Btn0);
        btn1 = findViewById(R.id.Btn1);
        btn2 = findViewById(R.id.Btn2);
        btn3 = findViewById(R.id.Btn3);
        btn4 = findViewById(R.id.Btn4);
        btn5 = findViewById(R.id.Btn5);
        btn6 = findViewById(R.id.Btn6);
        btn7 = findViewById(R.id.Btn7);
        btn8 = findViewById(R.id.Btn8);
        btn9 = findViewById(R.id.Btn9);

        btnEnd = findViewById(R.id.BtnEnd);
        btnAdd = findViewById(R.id.BtnAdd);
        btnClear = findViewById(R.id.BtnClear);

        btnDiv = findViewById(R.id.BtnDiv);
        btnEq  = findViewById(R.id.BtnEq);
        btnMul = findViewById(R.id.BtnMul);
        btnSub = findViewById(R.id.BtnSub);
        btnSqrt= findViewById(R.id.BtnSqrt);

        textWin = findViewById(R.id.TextView2);
        textHistory = findViewById(R.id.TextView1);

        textWin.setCursorVisible(true);


        btnEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textWin.setText("");
                number = 0;
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textWin.append("0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textWin.append("1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textWin.append("2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textWin.append("3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textWin.append("4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textWin.append("5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textWin.append("6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textWin.append("7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textWin.append("8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textWin.append("9");
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = textWin.getText().toString();

                if (!str.isEmpty()) {
                    number = Double.parseDouble(str);
                    textWin.setText("");
                    sym = '-';
                }
            }
        });


        //dodawanie
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = textWin.getText().toString();

                if (!str.isEmpty()) {
                    number = Double.parseDouble(str);
                    textWin.setText("");
                    sym = '+';
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = textWin.getText().toString();

                if (!str.isEmpty()) {
                    number = Double.parseDouble(str);
                    textWin.setText("");
                    sym = '/';
                }
            }
        });

        btnSqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = textWin.getText().toString();

                if (!str.isEmpty()) {
                    number = Double.parseDouble(str);
                    number = Math.sqrt(number);
                    textWin.setText(String.valueOf(number));
                    textHistory.append("\nWynik: " + String.valueOf(number));
                    number = 0;
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = textWin.getText().toString();

                if (!str.isEmpty()) {
                    number = Double.parseDouble(str);
                    textWin.setText("");
                    sym = '*';
                }
            }
        });

        btnEq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = textWin.getText().toString();



                if (!str.isEmpty()) {
                    double num = Double.parseDouble(str);

                    if (sym == '+')
                        number += num;

                    if (sym == '-')
                        number -= num;

                    if (sym =='/')
                        number /= num;

                    if (sym == '*')
                        number *= num;


                    textWin.setText(String.valueOf(number));
                    textHistory.append("\nWynik: " + String.valueOf(number));
                    number = 0;
                }
            }
        });


    }
}
