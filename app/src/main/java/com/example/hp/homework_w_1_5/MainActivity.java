package com.example.hp.homework_w_1_5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int temp = 0;
    private TextView textView;
    private static final String KEY = "key";
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textID);
        final Button buttonMinus = findViewById(R.id.buttonMinus);
        final Button buttonPlus = findViewById(R.id.buttonPlus);
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp--;
                textView.setText(String.valueOf(temp));
            }
        });
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp++;
                textView.setText(String.valueOf(temp));
            }
        });
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY, temp);
    }
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        temp = savedInstanceState.getInt(KEY);
        textView.setText(String.valueOf(temp));
    }
}
