package com.example.busra.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Songs> {

    ArrayList<Songs> songs;

    private static final String LOG_TAG = SongAdapter.class.getSimpleName();

    public SongAdapter(Activity context, ArrayList<Songs> songs) {
        super(context, 0, songs);
        this.songs = songs;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Songs currentSong = songs.get(position);

        TextView nameOfSongButton = (TextView) listItemView.findViewById(R.id.song_text_view);

        nameOfSongButton.setText(currentSong.getNameOfSong());

        TextView nameOfSingerButton = (TextView) listItemView.findViewById(R.id.singer_text_view);

        nameOfSingerButton.setText(currentSong.getNameOfSinger());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);

        iconView.setImageResource(currentSong.getImageId());

        return listItemView;
    }
}
