package com.example.activitiescomrecycler.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.activitiescomrecycler.R;
import com.example.activitiescomrecycler.RetrofitClient;
import com.example.activitiescomrecycler.Adapters.TodoAdapter;
import com.example.activitiescomrecycler.Entities.Todos;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TodosActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ProgressBar progressBar;
    LinearLayoutManager layoutManager;
    TodoAdapter adapter;
    List<Todos> todoList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todos);

        recyclerView = findViewById(R.id.recyclerView);
        progressBar = findViewById(R.id.progressBar);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new TodoAdapter(todoList);
        recyclerView.setAdapter(adapter);

        fetchTodos();
    }
    private void fetchTodos()
    {
        progressBar.setVisibility(View.VISIBLE);
        RetrofitClient.getRetrofitClient().getTodos().enqueue(new Callback<List<Todos>>() {
            @Override
            public void onResponse(Call<List<Todos>> call, Response<List<Todos>> response) {
                if (response.isSuccessful() && response.body() != null)
                {
                    todoList.addAll(response.body());
                    adapter.notifyDataSetChanged();
                    progressBar.setVisibility(View.GONE);
                }
            }

            @Override
            public void onFailure(Call<List<Todos>> call, Throwable t)
            {
                progressBar.setVisibility(View.GONE);
                Toast.makeText(TodosActivity.this, "Error: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}