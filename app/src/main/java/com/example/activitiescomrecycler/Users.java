package com.example.activitiescomrecycler;

public class Users
{
    private String name;
    private String email;

    public Users(String title, String body)
    {
        this.name = title;
        this.email = body;
    }

    public String getTitle()
    {
        return name;
    }

    public String getBody()
    {
        return email;
    }
}
