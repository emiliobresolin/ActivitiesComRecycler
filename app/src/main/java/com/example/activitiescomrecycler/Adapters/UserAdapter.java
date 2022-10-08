package com.example.activitiescomrecycler.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.activitiescomrecycler.Entities.Users;
import com.example.activitiescomrecycler.R;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder>
{
    private List<Users> usersList;

    public UserAdapter(List<Users> usersList) {
        this.usersList = usersList;
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
        holder.tvTitle.setText(usersList.get(position).getTitle());
        holder.tvBody.setText(usersList.get(position).getBody());
    }

    @Override
    public int getItemCount()
    {
        return usersList.size();
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
