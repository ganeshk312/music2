package com.spider.gk.music.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ArtistList implements Serializable
{

    @SerializedName("artist")
    @Expose
    private static Artist_ artist;
    private final static long serialVersionUID = -6467770387963052232L;

    /**
     * No args constructor for use in serialization
     *
     */
    public ArtistList() {
    }

    /**
     *
     * @param artist
     */
    public ArtistList(Artist_ artist) {
        super();
        this.artist = artist;
    }

    public static Artist_ getArtist() {
        return artist;
    }

    public void setArtist(Artist_ artist) {
        this.artist = artist;
    }



}