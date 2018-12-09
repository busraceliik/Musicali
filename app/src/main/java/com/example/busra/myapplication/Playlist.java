package com.example.busra.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import java.util.ArrayList;


public class Playlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        final ArrayList<Songs> songs = new ArrayList<Songs>();
        songs.add(new Songs("All I Want", "Kodaline", R.drawable.imgg));
        songs.add(new Songs("Miss You More", "Ane Brun", R.drawable.imgg));
        songs.add(new Songs("Dağlar Dağlar", "Barış Manço", R.drawable.imgg));
        songs.add(new Songs("Postcards From Italy", "Beirut", R.drawable.imgg));
        songs.add(new Songs("Sedayem Kon", "Omid Nemati", R.drawable.imgg));
        songs.add(new Songs("Mevsim Çiçekleri", "Evrencan Gündüz", R.drawable.imgg));
        songs.add(new Songs("Shed A Tear", "Kodaline", R.drawable.imgg));
        songs.add(new Songs("Rahatsız Vals", "Son Feci Bisiklet", R.drawable.imgg));
        songs.add(new Songs("Rhineland", "Beirut", R.drawable.imgg));
        songs.add(new Songs("Erevan", "Radiodervish", R.drawable.imgg));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listview = (ListView) findViewById(R.id.list);

        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int position, long id) {
                Intent intent = new Intent(Playlist.this, NowPlaying.class);
                intent.putExtra("song_name", songs.get(position).getNameOfSong());
                intent.putExtra("singer_name", songs.get(position).getNameOfSinger());
                startActivity(intent);
            }
        });
    }
}
