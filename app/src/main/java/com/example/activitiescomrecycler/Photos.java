package com.example.activitiescomrecycler;

public class Photos
{
    private String title;
    private String url;

    public Photos(String title, String body)
    {
        this.title = title;
        this.url = body;
    }

    public String getTitle()
    {
        return title;
    }

    public String getBody()
    {
        return url;
    }
}
