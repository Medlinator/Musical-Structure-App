package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Set the title to Library
        this.setTitle(getResources().getString(R.string.library_title));

        // Find the View that shows the album One of Us is the Killer
        View oneOfUsIsTheKiller = (View) findViewById(R.id.one_of_us_is_the_killer);

        // Find the View that shows the album Diamond Eyes
        View diamondEyes = (View) findViewById(R.id.diamond_eyes);

        // Find the View that shows the album Empty Black
        View emptyBlack = (View) findViewById(R.id.empty_black);

        // Find the View that shows the album Meridional
        View meridional = (View) findViewById(R.id.meridional);

        // Set a click listener on the album One of Us is the Killer
        oneOfUsIsTheKiller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oneOfUsIsTheKillerIntent = new Intent(MainActivity.this, OneOfUsIsTheKillerActivity.class);
                startActivity(oneOfUsIsTheKillerIntent);
            }
        });

        // Set a click listener on the album Diamond Eyes
        diamondEyes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent diamondEyesIntent = new Intent(MainActivity.this, DiamondEyesActivity.class);
                startActivity(diamondEyesIntent);
            }
        });

        // Set a click listener on the album Empty Black
        emptyBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emptyBlackIntent = new Intent(MainActivity.this, EmptyBlackActivity.class);
                startActivity(emptyBlackIntent);
            }
        });

        // Set a click listener on the album Meridional
        meridional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent meridionalIntent = new Intent(MainActivity.this, MeridionalActivity.class);
                startActivity(meridionalIntent);
            }
        });
    }
}
