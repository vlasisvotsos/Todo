package com.example.todo;

import static com.example.todo.HttpRequests.postHttpRequest;
import static com.example.todo.Todo.TodoSerializer;

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
    String path;

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

        path = "127.0.0.1:3000/todo/create";

        changeText.setOnClickListener(v -> {
            Todo todo = new Todo(helloWorldTextView.getText().toString());
            todos.add(todo);
            todoAdapter.notifyDataSetChanged();
            postHttpRequest(path,TodoSerializer(todo));
        });

    }

}