package com.nacker.textview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class textView extends AppCompatActivity {

    private TextView textView_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_textview);

        textView_email = (TextView) findViewById(R.id.textView_email);

        textView_email.setText("www.baidu.com");

    }
}
