package com.example.todo;

import org.json.JSONException;
import org.json.JSONObject;

public class Todo {
    private int id;
    private String description;

    public Todo(int id, String description){
        this.id =id;
        this.description = description;
    }

    public Todo(String description){
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static JSONObject TodoSerializer(Todo todo){
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("id",todo.getId());
            jsonObject.put("description",todo.getDescription());
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }

        return jsonObject;
    }

}
