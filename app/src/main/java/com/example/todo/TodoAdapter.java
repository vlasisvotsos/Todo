package com.example.todo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TodoAdapter extends RecyclerView.Adapter<TodoAdapter.TodoHolder> {
    private ArrayList<String> TodoList;
    private LayoutInflater mInflater;

    public TodoAdapter(ArrayList<String> todoList, LayoutInflater mInflater) {
        TodoList = todoList;
        this.mInflater = mInflater;
    }

    @NonNull
    @Override
    public TodoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.recycler_view_todo, parent, false);
        return new TodoHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TodoAdapter.TodoHolder holder, int position) {
        String desc = TodoList.get(position);
        holder.description.setText(desc);
    }

    @Override
    public int getItemCount() {
        return TodoList.size();
    }

    public static class TodoHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView description;
        public TodoHolder(@NonNull View itemView) {
            super(itemView);
            description = itemView.findViewById(R.id.textView4);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

        }
    }
}
