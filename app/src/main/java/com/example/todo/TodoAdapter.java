package com.example.todo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TodoAdapter extends RecyclerView.Adapter<TodoAdapter.TodoHolder> {
    private final ArrayList<Todo> todoList;
    private final LayoutInflater mInflater;

    public TodoAdapter(ArrayList<Todo> todoList, Context context) {
        this.mInflater = LayoutInflater.from(context);
        this.todoList = todoList;
    }

    @NonNull
    @Override
    public TodoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.recycler_view_todo, parent, false);
        return new TodoHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TodoAdapter.TodoHolder holder, int position) {
        String desc = todoList.get(position).getDescription();
        holder.description.setText(desc);
    }

    @Override
    public int getItemCount() {
        return todoList.size();
    }

    public static class TodoHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        final TextView description;
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
