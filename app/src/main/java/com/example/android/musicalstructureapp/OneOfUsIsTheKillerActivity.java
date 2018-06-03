package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class OneOfUsIsTheKillerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of songs.
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("The Dillinger Escape Plan", "Prancer"));
        songs.add(new Song("The Dillinger Escape Plan", "When I Lost My Bet"));
        songs.add(new Song("The Dillinger Escape Plan", "One of Us is the Killer"));
        songs.add(new Song("The Dillinger Escape Plan", "Hero of the Soviet Union"));
        songs.add(new Song("The Dillinger Escape Plan", "Nothing's Funny"));
        songs.add(new Song("The Dillinger Escape Plan", "Understanding Decay"));
        songs.add(new Song("The Dillinger Escape Plan", "Paranoia Shields"));
        songs.add(new Song("The Dillinger Escape Plan", "CH 375 268 277 ARS"));
        songs.add(new Song("The Dillinger Escape Plan", "Magic That I Held You Prisoner"));
        songs.add(new Song("The Dillinger Escape Plan", "Crossburner"));
        songs.add(new Song("The Dillinger Escape Plan", "The Threat Posed by Nuclear Weapons"));

        SongAdapter songAdapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(songAdapter);
    }
}
