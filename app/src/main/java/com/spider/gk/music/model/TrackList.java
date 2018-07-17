
package com.spider.gk.music.model;

import java.io.Serializable;
import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TrackList implements Serializable
{

    @SerializedName("track")
    @Expose
    private ArrayList<Track_> track;
    private final static long serialVersionUID = -813659086501027506L;






    /* No args constructor for use in serialization
     * 
     */
    public TrackList() {
    }

    /**
     * 
     * @param track
     */
    public TrackList(ArrayList<Track_> track) {
        super();
        this.track = track;
    }

    public ArrayList<Track_> getTrack() {
        return track;
    }

    public void setTrack(ArrayList<Track_> track) {
        this.track = track;
    }

}
