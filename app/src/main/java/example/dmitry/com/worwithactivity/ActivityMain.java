package example.dmitry.com.worwithactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityMain extends AppCompatActivity implements View.OnClickListener{

    private static final String TAG = "MyTag";

    TextView textView1;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "Activity1OnCreate");

        textView1 = findViewById(R.id.textView);
        button1 = findViewById(R.id.button);;

        button1.setOnClickListener(this);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Activity1OnStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "Activity1OnRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Activity1OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Activity1OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Activity1OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Activity1OnDestroy");
    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(this, ActivityTwo.class);
        startActivity(intent);
    }
}
