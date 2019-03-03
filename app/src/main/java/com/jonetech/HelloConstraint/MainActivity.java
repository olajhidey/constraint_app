package com.jonetech.HelloConstraint;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    private TextView score;

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        score = (TextView) findViewById(R.id.show_count);


    }


    public void sendToast(View view) {
        Toast.makeText(getApplicationContext(), "Hello Toast", Toast.LENGTH_SHORT).show();
    }

    public void countUp(View view) {

        count++;

        score.setText(Integer.toString(count));

    }

    public void zero(View view) {
        score.setText("0");
    }
}
