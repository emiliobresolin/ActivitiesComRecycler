package com.example.activitiescomrecycler;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickPosts(View view)
    {
        Intent intent = new Intent(view.getContext(), PostsActivity.class);
        startActivity(intent);
    }
    public void onClickUsers(View view)
    {
        Intent intent = new Intent(view.getContext(), UsersActivity.class);
        startActivity(intent);
    }
    public void onClickComments(View view)
    {
        Intent intent = new Intent(view.getContext(), CommentsActivity.class);
        startActivity(intent);
    }
    public void onClickPhotos(View view)
    {
        Intent intent = new Intent(view.getContext(), PhotosActivity.class);
        startActivity(intent);
    }
    public void onClickTodos(View view)
    {
        Intent intent = new Intent(view.getContext(), TodosActivity.class);
        startActivity(intent);
    }
}