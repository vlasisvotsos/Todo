package com.example.todo;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button changeText;
    TextView helloWorldTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeText = findViewById(R.id.btn_change_text);
        helloWorldTextView = findViewById(R.id.textView);
        changeText.setOnClickListener(v -> {
            if(helloWorldTextView.getText().toString().equals(getString(R.string.hello_world))){
                helloWorldTextView.setText(R.string.hi);
            }else {
                helloWorldTextView.setText(R.string.hello_world);
            }
        });

    }
}