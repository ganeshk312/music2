
package com.spider.gk.music.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Body implements Serializable
{

    @SerializedName("track_list")
    @Expose
    private ArrayList<Track_> trackList = null;
    private final static long serialVersionUID = 5084334223794337997L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Body() {
    }

    /**
     * 
     * @param trackList
     */
    public Body(ArrayList<Track_> trackList) {
        super();
        this.trackList = trackList;
    }

    public ArrayList<Track_> getTrackList() {
        return trackList;
    }

    public void setTrackList(ArrayList<Track_> trackList) {
        this.trackList = trackList;
    }

}
