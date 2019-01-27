package lab.lab4;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    Button btnCheck;
    Button btnSendSms;
    Button btnLocate;
    Button btnNewActivity;
    TextView txtViewRes;
    EditText numberEdit;
    EditText msgEdit;
    EditText latEdit;
    EditText longEdit;
    EditText indEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCheck = (Button) findViewById(R.id.BtnCheck);
        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String contactStrUri = "content://contacts/people";
                Intent myActivityCheckContact = new Intent(Intent.ACTION_VIEW, Uri.parse(contactStrUri));
                startActivity(myActivityCheckContact);
            }
        });
        txtViewRes = (TextView) findViewById(R.id.txtRes);
        numberEdit = (EditText) findViewById(R.id.telNumEdit);
        msgEdit = (EditText) findViewById(R.id.msgEdit);
        btnSendSms = (Button) findViewById(R.id.BtnSend);
        btnSendSms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numberStr = numberEdit.getText().toString();
                String msg       = msgEdit.getText().toString();

                Intent msgSendIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:" + numberStr));
                msgSendIntent.putExtra("sms_body", msg);

                startActivity(msgSendIntent);
            }
        });

        latEdit   = (EditText) findViewById(R.id.latEdit);
        longEdit  = (EditText) findViewById(R.id.longEdit);

        latEdit.setText("51.1000000");
        longEdit.setText("17.0333300");

        btnLocate = (Button) findViewById(R.id.BtnLocate);
        btnLocate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String latitude = latEdit.getText().toString();
                String longitude= longEdit.getText().toString();

                Intent geoLocation = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:" +
                                                            latitude + "," + longitude + "&z=16"));
                startActivity(geoLocation);

            }
        });
        indEdit = (EditText) findViewById(R.id.indEdit);
        btnNewActivity = (Button) findViewById(R.id.BtnNewActivity);
        btnNewActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myNewIntent = new Intent(MainActivity.this, MainActivity2.class);

                String numIndStr = indEdit.getText().toString();
                int numInd = Integer.parseInt(numIndStr);

                Bundle dataBundle = new Bundle();
                dataBundle.putInt("indVal", numInd);

                myNewIntent.putExtras(dataBundle);

                startActivityForResult(myNewIntent, 1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        try {
            if ((requestCode == 1 ) && (resultCode == Activity.RESULT_OK)) {
                Bundle resultBundle = data.getExtras();
                String resultStr = resultBundle.getString("valRes");
                txtViewRes.setText("Znaleziona osoba: " + resultStr);
            }
        }
        catch (Exception err) {
            txtViewRes.setText("Bląd");
        }
    }
}
