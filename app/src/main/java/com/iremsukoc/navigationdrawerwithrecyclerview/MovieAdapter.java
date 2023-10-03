package com.iremsukoc.navigationdrawerwithrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {

    List<MovieData> movieDataList;
    Context context;

    public MovieAdapter(List<MovieData> movieDataList, MainActivity activity) {
        this.movieDataList = movieDataList;
        this.context = activity;
    }

    @NonNull
    @Override
    public MovieAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.movie_item_list, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MovieAdapter.ViewHolder holder, int position) {
        MovieData movieItem = movieDataList.get(position);

        holder.movieName.setText(movieItem.getMovieName());
        holder.movieDirector.setText(movieItem.getMovieDirector());
        holder.movieImage.setImageResource(movieItem.getMovieImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "" + movieItem.getMovieName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return movieDataList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView movieName;
        TextView movieDirector;
        ImageView movieImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            movieName = itemView.findViewById(R.id.movieName);
            movieDirector = itemView.findViewById(R.id.movieDirector);
            movieImage = itemView.findViewById(R.id.movieImage);
        }
    }

    public void setFilteredList(List<MovieData> filteredList) {

        this.movieDataList = filteredList;
        notifyDataSetChanged();

    }

}
