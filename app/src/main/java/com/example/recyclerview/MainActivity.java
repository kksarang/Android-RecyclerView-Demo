package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView=findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MovieData[] movieData=new MovieData[]
                {
                        new MovieData("Drishyam","25/12/2020",R.drawable.drishyam),
                        new MovieData("Home","25/12/2020",R.drawable.home),
                        new MovieData("Kala","25/12/2020",R.drawable.kala),
                        new MovieData("Love","25/12/2020",R.drawable.love),
                        new MovieData("One","25/12/2020",R.drawable.one),
                        new MovieData("Uyara","25/12/2020",R.drawable.uyara),
                        new MovieData("Drishyam","25/12/2020",R.drawable.drishyam),
                        new MovieData("Home","25/12/2020",R.drawable.home)

                };

        MovieAdapter movieAdapter = new MovieAdapter(movieData, MainActivity.this);

        recyclerView.setAdapter(movieAdapter);

    }
}