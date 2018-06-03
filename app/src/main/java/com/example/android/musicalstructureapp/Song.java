package com.example.android.musicalstructureapp;

/**
 * {@Link Song} represents an music artist within the musical structure app.
 * It contains an artist name and artist biography.
 */
public class Song {

    /** The name of the artist. */
    private String mArtist;

    /** The name of the song. */
    private String mSong;

    /**
     * Create a new Song object.
     *
     * @param vArtist is the artist's name.
     * @param vSong   is the artist's song.
     */
    public Song(String vArtist, String vSong) {
        mArtist = vArtist;
        mSong = vSong;
    }

    /** Get the artist's. */
    public String getArtist() {
        return mArtist;
    }

    /** Get the song. */
    public String getSong() {
        return mSong;
    }
}