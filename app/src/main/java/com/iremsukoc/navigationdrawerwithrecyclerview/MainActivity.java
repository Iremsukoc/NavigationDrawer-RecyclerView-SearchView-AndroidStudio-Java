package com.iremsukoc.navigationdrawerwithrecyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    SearchView searchView;
    List<MovieData> movieData;
    MovieAdapter adapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchView = findViewById(R.id.searchView);
        searchView.clearFocus();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                filterList(newText);
                return true;
            }
        });


        toolbar = findViewById(R.id.toolbarMain);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);


        RecyclerView recyclerView = findViewById(R.id.recyclerViewMain);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        movieData = new ArrayList<>();

        movieData.add(new MovieData("Avatar", "James Cameron", R.drawable.avatar_image));
        movieData.add(new MovieData("Shrek", "Andrew Adamson, Vicky Jenson", R.drawable.shrek_image));
        movieData.add(new MovieData("Harry Potter 1", "Chris Columbus", R.drawable.harrypotter_image));
        movieData.add(new MovieData("Eternal Sunshine of the Spotless Mind", "Michel Gondry", R.drawable.eternalsunshine_image));
        movieData.add(new MovieData("Titanic", "James Horner", R.drawable.titanic_image));
        movieData.add(new MovieData("Intouchables", "Eric Toledano, Olivier Nakache", R.drawable.intouchables_image));
        movieData.add(new MovieData("Life Is Beautiful", "Roberto Benigni", R.drawable.lifeisbeautiful_image));

        adapter = new MovieAdapter(movieData,MainActivity.this);
        recyclerView.setAdapter(adapter);



    }

    private void filter (String newText)
    {
        List<MovieData> filteredList = new ArrayList<>();



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        Toast.makeText(this, "" + item.getTitle(), Toast.LENGTH_SHORT).show();

        return true;
    }


    @SuppressLint("NotifyDataSetChanged")
    public void filterList (String text)
    {
        List <MovieData> filteredList = new ArrayList<>();


        for(MovieData movies : movieData)
        {
            if (movies.getMovieName().toLowerCase().contains(text.toLowerCase())|| movies.getMovieDirector().toLowerCase().contains(text.toLowerCase()))
            {
                filteredList.add(movies);
            }
        }

        if (filteredList.isEmpty())
        {
            Toast.makeText(this,"No data found",Toast.LENGTH_SHORT).show();
        } else
        {
            adapter.setFilteredList(filteredList);
        }


    }

}