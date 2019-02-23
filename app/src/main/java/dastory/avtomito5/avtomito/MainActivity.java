package dastory.avtomito5.avtomito;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private EditText aetText156;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                long mills = 35L;
                Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(mills);

                final EditText bill = (EditText) findViewById(R.id.editText);
                final EditText bill2 = (EditText) findViewById(R.id.editText2);
                final EditText bill3 = (EditText) findViewById(R.id.editText3);
                final EditText bill4 = (EditText) findViewById(R.id.editText4);

                if (bill.getText().length() == 0) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Введіть всі дані", Toast.LENGTH_LONG);
                    toast.show();
                }else if (bill2.getText().length() == 0) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Введіть всі дані", Toast.LENGTH_LONG);
                    toast.show();

                }else if (bill3.getText().length() == 0) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Введіть всі дані", Toast.LENGTH_LONG);
                    toast.show();
                }else if (bill4.getText().length() == 0) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Введіть всі дані", Toast.LENGTH_LONG);
                    toast.show();
                }else{


                    TextView textView1000 = (TextView) findViewById(R.id.textView1);
                    TextView textView1001 = (TextView) findViewById(R.id.textView143);
                    TextView textView1002 = (TextView) findViewById(R.id.textView20);
                    TextView textView1003 = (TextView) findViewById(R.id.textView242);
                    TextView textView1004 = (TextView) findViewById(R.id.textView24);
                    EditText editText001 = (EditText) findViewById(R.id.editText);
                    EditText editText002 = (EditText) findViewById(R.id.editText2);
                    EditText editText003 = (EditText) findViewById(R.id.editText3);
                    EditText editText004 = (EditText) findViewById(R.id.editText4);
                    TextView textView1005 = (TextView) findViewById(R.id.textView5);
                    float num1 = Float.parseFloat(editText001.getText().toString());
                    float num2 = Float.parseFloat(editText002.getText().toString());
                    float num3 = Float.parseFloat(editText003.getText().toString());
                    float num4 = Float.parseFloat(editText004.getText().toString());
                    float num5 = Float.parseFloat(textView1005.getText().toString());


                    float akciz50 = (num2*num3*num5);
                    //float akciz50 = (num2*num3*num5)/2;
                    float mito = (num1*10)/100;
                    float pdv = ((num1+mito+akciz50)*20)/100;
                    float pensia = (num1*5)/100;

                    float vse = mito+akciz50+pdv+num4+pensia+num1;

                    textView1000.setText(String.format(Locale.US, "%.0f", vse) + "");
                    textView1001.setText(String.format(Locale.US, "%.0f", mito) + "");
                    textView1002.setText(String.format(Locale.US, "%.0f", pdv) + "");
                    textView1003.setText(String.format(Locale.US, "%.0f", akciz50) + "");
                    textView1004.setText(String.format(Locale.US, "%.0f", pensia) + "");



                    Snackbar.make(view, "Розрахунок виконано", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }}
            //}
            //}
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            long mills = 15L;
            Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            vibrator.vibrate(mills);
            final Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            String textToSend="https://play.google.com/store/apps/details?id=dastory.avtomito5.avtomito";
            intent.putExtra(Intent.EXTRA_TEXT, textToSend);
            try
            {
                startActivity(Intent.createChooser(intent, "Поділитись з друзями"));
            }
            catch (android.content.ActivityNotFoundException ex)
            {
                Toast.makeText(getApplicationContext(), "Some error", Toast.LENGTH_SHORT).show();
                return true;
            }}

        return super.onOptionsItemSelected(item);
    }
    public void onClick_dim(View view) {

        long mills = 30L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
        TextView textView1000 = (TextView) findViewById(R.id.textView5);
        float w173 = 50;
        textView1000.setText(String.format(Locale.US, "%.0f", w173) + "");

        Toast toast = Toast.makeText(getApplicationContext(),
                "Бензиновий двигун", Toast.LENGTH_SHORT);
        toast.show();


    }
    public void onClick_dim2(View view) {

        long mills = 30L;
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(mills);
        TextView textView1000 = (TextView) findViewById(R.id.textView5);
        float w173 = 75;
        textView1000.setText(String.format(Locale.US, "%.0f", w173) + "");

        Toast toast = Toast.makeText(getApplicationContext(),
                "Дизельний двигун", Toast.LENGTH_SHORT);
        toast.show();


    }
}
