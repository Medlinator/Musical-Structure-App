package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class DiamondEyesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of songs.
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Deftones", "Diamond Eyes"));
        songs.add(new Song("Deftones", "Royal"));
        songs.add(new Song("Deftones", "CMND/CTRL"));
        songs.add(new Song("Deftones", "You've Seen the Butcher"));
        songs.add(new Song("Deftones", "Beauty School"));
        songs.add(new Song("Deftones", "Prince"));
        songs.add(new Song("Deftones", "Rocket Skates"));
        songs.add(new Song("Deftones", "Sextape"));
        songs.add(new Song("Deftones", "Risk"));
        songs.add(new Song("Deftones", "976-EVIL"));
        songs.add(new Song("Deftones", "This Place Is Death"));

        SongAdapter songAdapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(songAdapter);
    }
}
