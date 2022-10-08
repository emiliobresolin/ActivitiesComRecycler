package com.example.activitiescomrecycler.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.activitiescomrecycler.Adapters.PhotoAdapter;
import com.example.activitiescomrecycler.Entities.Photos;
import com.example.activitiescomrecycler.R;
import com.example.activitiescomrecycler.RetrofitClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PhotosActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ProgressBar progressBar;
    LinearLayoutManager layoutManager;
    PhotoAdapter adapter;
    List<Photos> photoList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photos);

        recyclerView = findViewById(R.id.recyclerView);
        progressBar = findViewById(R.id.progressBar);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new PhotoAdapter(photoList);
        recyclerView.setAdapter(adapter);

        fetchPhotos();
    }
    private void fetchPhotos()
    {
        progressBar.setVisibility(View.VISIBLE);
        RetrofitClient.getRetrofitClient().getPhotos().enqueue(new Callback<List<Photos>>() {
            @Override
            public void onResponse(Call<List<Photos>> call, Response<List<Photos>> response) {
                if (response.isSuccessful() && response.body() != null)
                {
                    photoList.addAll(response.body());
                    adapter.notifyDataSetChanged();
                    progressBar.setVisibility(View.GONE);
                }
            }

            @Override
            public void onFailure(Call<List<Photos>> call, Throwable t)
            {
                progressBar.setVisibility(View.GONE);
                Toast.makeText(PhotosActivity.this, "Error: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}