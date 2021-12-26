package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {

    MovieData[] movieData;
    Context context;

    public MovieAdapter(MovieData[] movieData,MainActivity activity)
    {
        this.movieData=movieData;
        this.context=activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.movie_iteak_list,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        final MovieData movieDataList = movieData[position];
        holder.Title.setText(movieDataList.getMovieName());
        holder.Date.setText(movieDataList.getMovieDate());
        holder.MovieImage.setImageResource(movieDataList.getImg());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,movieDataList.getMovieName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount()
    {
        return movieData.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView MovieImage;
        TextView Title,Date;

        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            MovieImage=itemView.findViewById(R.id.image_card_viwe);
            Title=itemView.findViewById(R.id.movie_name);
            Date=itemView.findViewById(R.id.moviedate);
        }
    }
}
