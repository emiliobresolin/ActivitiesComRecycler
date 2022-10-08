package com.example.activitiescomrecycler;

import com.example.activitiescomrecycler.Entities.Albums;
import com.example.activitiescomrecycler.Entities.Comments;
import com.example.activitiescomrecycler.Entities.Photos;
import com.example.activitiescomrecycler.Entities.Posts;
import com.example.activitiescomrecycler.Entities.Todos;
import com.example.activitiescomrecycler.Entities.Users;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface
{
    @GET("/posts")
    Call<List<Posts>> getPosts();

    @GET("/users")
    Call<List<Users>> getUsers();

    @GET("/comments")
    Call<List<Comments>> getComments();

    @GET("/photos")
    Call<List<Photos>> getPhotos();

    @GET("/todos")
    Call<List<Todos>> getTodos();

    @GET("/albums")
    Call<List<Albums>> getAlbums();
}
