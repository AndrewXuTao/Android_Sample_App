package com.example.tssh.sample_001;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class DispalyMessageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dispaly_message);
        //Get the Intent that started this activity and extract the message
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        //Capture the layout's TextView and  set the String as it text
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(DispalyMessageActivity.this,"I am onPause", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(DispalyMessageActivity.this,"I am Resume", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(DispalyMessageActivity.this,"I am onStart",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(DispalyMessageActivity.this,"I am onStop",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(DispalyMessageActivity.this,"I am onDestroy",Toast.LENGTH_LONG);
    }
}
