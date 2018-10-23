package com.example.tssh.sample_001;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.tssh.sample_001.*;

import static com.example.tssh.sample_001.DispalyMessageActivity.*;

public class MainActivity extends AppCompatActivity {
    private Button listButton;
    private TextView showTime;
    public static final String EXTRA_MESSAGE = "com.exsample.firstApp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        listButton = (Button) findViewById(R.id.button);
        showTime = (TextView) findViewById(R.id.editText);
        listButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helloDate dateTime = new helloDate();
                showTime.setText(dateTime.gettime());
            }
        });
        */
    }
    public void sendMessage(View view) {
        //Do something when user click button
        Intent intent = new Intent(this, DispalyMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        //instance DispalyMessageActivity Object
        startActivity(intent);
    }
}
