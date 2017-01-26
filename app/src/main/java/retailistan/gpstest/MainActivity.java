package retailistan.gpstest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();


    @Override
    protected void onStart() {
        super.onStart();

        startService(new Intent(this, LocationService.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    private void makingChanges() {
        Log.d(TAG, "This change was maded in a clone or branch.");
        Toast.makeText(getApplicationContext(), "changes js side", Toast.LENGTH_LONG).show();


        Toast.makeText(this, "This was added by Zain!", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "kjahsdkjadjkajksdjashdjasd", Toast.LENGTH_SHORT).show();
    }


    private void showData() {

        Toast.makeText(this, "Hello 0", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Hello Zain!", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Hello JS1", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Hello Zain2", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Hello JS3", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Hello Zain4", Toast.LENGTH_SHORT).show();
    }


    private void newMethodInDevelopment() {

    }

    private void newgithub1Method() {


    }
}
