package com.example.activitiescomrecycler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.activitiescomrecycler.Activities.AlbumsActivity;
import com.example.activitiescomrecycler.Activities.CommentsActivity;
import com.example.activitiescomrecycler.Activities.PhotosActivity;
import com.example.activitiescomrecycler.Activities.PostsActivity;
import com.example.activitiescomrecycler.Activities.TodosActivity;
import com.example.activitiescomrecycler.Activities.UsersApiActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void onClickPosts(View view)
    {
        Intent intent = new Intent(view.getContext(), PostsActivity.class);
        startActivity(intent);
    }
    public void onClickUsers(View view)
    {
        Intent intent = new Intent(view.getContext(), UsersApiActivity.class);
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
    public void onClickAlbums(View view)
    {
        Intent intent = new Intent(view.getContext(), AlbumsActivity.class);
        startActivity(intent);
    }
}