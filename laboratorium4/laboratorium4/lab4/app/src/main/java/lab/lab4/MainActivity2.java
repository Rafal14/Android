package lab.lab4;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity2 extends Activity implements View.OnClickListener {

    EditText recvData;
    Button  btnEnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        recvData = (EditText) findViewById(R.id.IndTextEdit);
        btnEnd = (Button) findViewById(R.id.BtnEnd);
        btnEnd.setOnClickListener(this);

        Intent intentFromActivity = getIntent();

        Bundle nBundle = intentFromActivity.getExtras();

        int ind = nBundle.getInt("indVal");

        String str = "Nie znaleziono";

        if (ind == 218526) {
            str = "Rafał Januszewski";
            recvData.setText("Znaleziono osobę: " + str);
            nBundle.putString("valRes", str);
        }
        else {
            recvData.setText("Nie znaleziono osoby o takim indeksie");
        }

        intentFromActivity.putExtras(nBundle);
        setResult(Activity.RESULT_OK, intentFromActivity);
    }

    @Override
    public void onClick(View view) {
        finish();
    }
}
