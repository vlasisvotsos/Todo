package com.example.todo;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button changeText;
    TextView helloWorldTextView;
    TodoAdapter todoAdapter;
    RecyclerView recyclerView;
    ArrayList<Todo> todos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        todos = new ArrayList<>();
        changeText = findViewById(R.id.btn_change_text);
        helloWorldTextView = findViewById(R.id.textView);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        todoAdapter = new TodoAdapter( todos,this);
        recyclerView.setAdapter(todoAdapter);

        changeText.setOnClickListener(v -> {
            todos.add(new Todo(helloWorldTextView.getText().toString()));
            todoAdapter.notifyDataSetChanged();
//            postHttpRequest("",TodoSerializer(todo));
        });

    }

}