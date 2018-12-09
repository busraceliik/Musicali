package com.example.busra.myapplication;

public class Songs {

    private String aNameOfSong;

    private String aNameOfSinger;

    private int aImageId;

    public Songs(String nameOfSong, String nameOfSinger, int imageId) {

        aNameOfSong = nameOfSong;
        aNameOfSinger = nameOfSinger;
        aImageId = imageId;

    }

    public String getNameOfSong() {
        return aNameOfSong;
    }

    public String getNameOfSinger() {
        return aNameOfSinger;
    }

    public int getImageId() {
        return aImageId;
    }
}
