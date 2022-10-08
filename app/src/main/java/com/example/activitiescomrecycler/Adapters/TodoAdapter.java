package com.example.activitiescomrecycler.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.activitiescomrecycler.Entities.Todos;
import com.example.activitiescomrecycler.R;

import java.util.List;

public class TodoAdapter extends RecyclerView.Adapter<TodoAdapter.ViewHolder>
{
    private List<Todos> todosList;

    public TodoAdapter(List<Todos> todosList)
    {
        this.todosList = todosList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        holder.tvTitle.setText(todosList.get(position).getTitle());
        holder.tvBody.setText(todosList.get(position).getBody());
    }

    @Override
    public int getItemCount()
    {
        return todosList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView tvTitle;
        TextView tvBody;
        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvBody = itemView.findViewById(R.id.tvBody);
        }
    }
}
