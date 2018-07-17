package com.spider.gk.music.model;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Artist_ implements Serializable
{

    @SerializedName("artist_id")
    @Expose
    private long artistId;
    @SerializedName("artist_mbid")
    @Expose
    private String artistMbid;
    @SerializedName("artist_name")
    @Expose
    private String artistName;
    @SerializedName("artist_alias_list")
    @Expose
    private List<Object> artistAliasList = null;
    @SerializedName("artist_rating")
    @Expose
    private long artistRating;
    @SerializedName("updated_time")
    @Expose
    private String updatedTime;
    private final static long serialVersionUID = -2443665851925106553L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Artist_() {
    }

    /**
     *
     * @param artistId
     * @param artistMbid
     * @param artistRating
     * @param artistAliasList
     * @param artistName
     * @param updatedTime
     */
    public Artist_(long artistId, String artistMbid, String artistName, List<Object> artistAliasList, long artistRating, String updatedTime) {
        super();
        this.artistId = artistId;
        this.artistMbid = artistMbid;
        this.artistName = artistName;
        this.artistAliasList = artistAliasList;
        this.artistRating = artistRating;
        this.updatedTime = updatedTime;
    }

    public long getArtistId() {
        return artistId;
    }

    public void setArtistId(long artistId) {
        this.artistId = artistId;
    }

    public String getArtistMbid() {
        return artistMbid;
    }

    public void setArtistMbid(String artistMbid) {
        this.artistMbid = artistMbid;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public List<Object> getArtistAliasList() {
        return artistAliasList;
    }

    public void setArtistAliasList(List<Object> artistAliasList) {
        this.artistAliasList = artistAliasList;
    }

    public long getArtistRating() {
        return artistRating;
    }

    public void setArtistRating(long artistRating) {
        this.artistRating = artistRating;
    }

    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }



}