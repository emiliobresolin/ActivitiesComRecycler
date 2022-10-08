package com.example.activitiescomrecycler;

public class Todos
{
    private String title;
    private String id;

    public Todos(String title, String body)
    {
        this.title = title;
        this.id = body;
    }

    public String getTitle()
    {
        return title;
    }

    public String getBody()
    {
        return id;
    }
}
