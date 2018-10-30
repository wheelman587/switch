package example.dmitry.com.worwithactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity implements View.OnClickListener{

    TextView textView2;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        button2 = findViewById(R.id.button2);
        textView2 = findViewById(R.id.textView2);

        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(this, ActivityMain.class);
        startActivity(intent);
    }
}
