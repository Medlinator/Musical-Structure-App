package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class EmptyBlackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Create a list of songs.
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Greyhaven", "Sweet Machine"));
        songs.add(new Song("Greyhaven", "Blemish"));
        songs.add(new Song("Greyhaven", "Echo and Dust Pt. I"));
        songs.add(new Song("Greyhaven", "Mortality Rate"));
        songs.add(new Song("Greyhaven", "Ten Dogs - Red Heaven"));
        songs.add(new Song("Greyhaven", "White Lighters"));
        songs.add(new Song("Greyhaven", "Kappa (River Child)"));
        songs.add(new Song("Greyhaven", "Day is Gone"));
        songs.add(new Song("Greyhaven", "Broadcast Network"));
        songs.add(new Song("Greyhaven", "Echo and Dust Pt. II"));

        SongAdapter songAdapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(songAdapter);
    }
}
