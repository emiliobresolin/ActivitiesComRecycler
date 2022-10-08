package com.example.activitiescomrecycler;

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
}
