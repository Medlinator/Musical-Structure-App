package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MeridionalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of songs.
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Norma Jean", "Leaderless and Self Enlisted"));
        songs.add(new Song("Norma Jean", "The Anthem Of The Angry Birds"));
        songs.add(new Song("Norma Jean", "Deathbed Atheist"));
        songs.add(new Song("Norma Jean", "Bastardizer"));
        songs.add(new Song("Norma Jean", "A Media Friendly Turn For The Worse"));
        songs.add(new Song("Norma Jean", "Septentrional"));
        songs.add(new Song("Norma Jean", "Blood Burner"));
        songs.add(new Song("Norma Jean", "High Noise Low Output"));
        songs.add(new Song("Norma Jean", "Falling From The Sky: Day Seven"));
        songs.add(new Song("Norma Jean", "Everlasting Tapeworm"));
        songs.add(new Song("Norma Jean", "Occidental"));
        songs.add(new Song("Norma Jean", "The People That Surround You On A Regular Basis"));
        songs.add(new Song("Norma Jean", "Innocent Bystanders United"));
        songs.add(new Song("Norma Jean", "Oriental"));

        SongAdapter songAdapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(songAdapter);
    }
}
