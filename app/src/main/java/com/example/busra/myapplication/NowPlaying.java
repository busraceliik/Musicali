package com.example.busra.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NowPlaying extends AppCompatActivity {

    TextView nameofSong;
    TextView nameofSinger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        String songName = getIntent().getStringExtra("song_name");
        String singerName = getIntent().getStringExtra("singer_name");

        nameofSong = findViewById(R.id.name_of_song);
        nameofSong.setText(songName);

        nameofSinger = findViewById(R.id.name_of_singer);
        nameofSinger.setText(singerName);
    }
}
