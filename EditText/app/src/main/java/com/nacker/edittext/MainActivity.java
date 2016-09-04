package com.nacker.edittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText_name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText_name = (EditText) findViewById(R.id.editText);

        editText_name.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                System.out.println("beforeTextChanged---"+s);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                System.out.println("onTextChanged---"+s);
            }

            @Override
            public void afterTextChanged(Editable s) {
                System.out.println("afterTextChanged---"+s);
            }
        });

        /**
         * @param savedInstanceState 按回车后这个方法会调用
         */
        editText_name.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

                Toast.makeText(MainActivity.this,v.getText().toString(),Toast.LENGTH_LONG).show();
                return true;
            }
        });
    }
}
