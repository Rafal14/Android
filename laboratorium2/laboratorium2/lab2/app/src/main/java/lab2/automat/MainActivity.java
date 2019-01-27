package lab2.automat;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends Activity {

    CheckBox checkSugar;
    CheckBox checkCream;
    Button btnPayment;
    Button btnExit;
    RadioGroup radioDrinkType;
    RadioButton radioBlackCoffee;
    RadioButton radioEspresso;
    RadioButton radioTea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkSugar = findViewById(R.id.checkSugar);
        checkCream = findViewById(R.id.checkCream);
        btnPayment = findViewById(R.id.btnPayment);
        btnExit    = findViewById(R.id.btnExit);
        radioDrinkType = findViewById(R.id.radioGroupDrinkType);

        radioBlackCoffee = findViewById(R.id.radioBtnBlackCoffee);
        radioTea = findViewById(R.id.radioBtnTea);
        radioEspresso = findViewById(R.id.radioBtnEspresso);
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btnPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = "i wybrane dodatki: ";
                if (checkSugar.isChecked())
                    message += "cukier ";
                if (checkCream.isChecked())
                    message += "śmietanka ";

                int radId = radioDrinkType.getCheckedRadioButtonId();

                if (radioTea.getId() == radId)
                    message = "Herbata, " + message;

                if (radioBlackCoffee.isChecked())
                    message = "Czarna kawa " + message;

                if (radioEspresso.isChecked())
                    message = "Espresso " + message;
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", 1).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", 1).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", 1).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", 1).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", 1).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", 1).show();
    }
}
