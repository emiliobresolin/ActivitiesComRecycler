package com.example.activitiescomrecycler.Entities;

public class Comments
{
    private String name;
    private String body;

    public Comments(String title, String body)
    {
        this.name = title;
        this.body = body;
    }

    public String getTitle()
    {
        return name;
    }

    public String getBody()
    {
        return body;
    }
}
