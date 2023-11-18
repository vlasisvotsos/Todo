package com.example.todo;

import static com.example.todo.HttpRequests.postHttpRequest;
import static com.example.todo.Todo.TodoSerializer;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONException;
import org.json.JSONObject;

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
            Todo todo = new Todo(1,helloWorldTextView.getText().toString());
            postHttpRequest("",TodoSerializer(todo));
        });

    }

}