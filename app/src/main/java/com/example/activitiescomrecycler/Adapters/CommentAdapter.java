package com.example.activitiescomrecycler.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.activitiescomrecycler.Entities.Comments;
import com.example.activitiescomrecycler.R;

import java.util.List;

public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.ViewHolder>
{
    private List<Comments> commentsList;

    public CommentAdapter(List<Comments> commentsList) {
        this.commentsList = commentsList;
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
        holder.tvTitle.setText(commentsList.get(position).getTitle());
        holder.tvBody.setText(commentsList.get(position).getBody());
    }

    @Override
    public int getItemCount()
    {
        return commentsList.size();
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
