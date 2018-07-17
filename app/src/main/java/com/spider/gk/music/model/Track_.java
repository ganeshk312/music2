
package com.spider.gk.music.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Track_ implements Serializable
{

    @SerializedName("track_id")
    @Expose
    private long trackId;
    @SerializedName("track_mbid")
    @Expose
    private String trackMbid;
    @SerializedName("track_length")
    @Expose
    private long trackLength;
    @SerializedName("lyrics_id")
    @Expose
    private long lyricsId;
    @SerializedName("instrumental")
    @Expose
    private long instrumental;
    @SerializedName("subtitle_id")
    @Expose
    private long subtitleId;
    @SerializedName("track_name")
    @Expose
    private String trackName;
    @SerializedName("track_rating")
    @Expose
    private long trackRating;
    @SerializedName("album_name")
    @Expose
    private String albumName;
    @SerializedName("album_id")
    @Expose
    private long albumId;
    @SerializedName("artist_id")
    @Expose
    private long artistId;
    @SerializedName("album_coverart_100x100")
    @Expose
    private String albumCoverart100x100;
    @SerializedName("artist_mbid")
    @Expose
    private String artistMbid;
    @SerializedName("artist_name")
    @Expose
    private String artistName;
    private final static long serialVersionUID = -2261508822871940721L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Track_() {
    }

    /**
     * 
     * @param albumCoverart100x100
     * @param trackId
     * @param albumName
     * @param albumId
     * @param artistMbid
     * @param trackName
     * @param trackMbid
     * @param trackRating
     * @param subtitleId
     * @param lyricsId
     * @param artistId
     * @param instrumental
     * @param artistName
     * @param trackLength
     */
    public Track_(long trackId, String trackMbid, long trackLength, long lyricsId, long instrumental, long subtitleId, String trackName, long trackRating, String albumName, long albumId, long artistId, String albumCoverart100x100, String artistMbid, String artistName) {
        super();
        this.trackId = trackId;
        this.trackMbid = trackMbid;
        this.trackLength = trackLength;
        this.lyricsId = lyricsId;
        this.instrumental = instrumental;
        this.subtitleId = subtitleId;
        this.trackName = trackName;
        this.trackRating = trackRating;
        this.albumName = albumName;
        this.albumId = albumId;
        this.artistId = artistId;
        this.albumCoverart100x100 = albumCoverart100x100;
        this.artistMbid = artistMbid;
        this.artistName = artistName;
    }

    public long getTrackId() {
        return trackId;
    }

    public void setTrackId(long trackId) {
        this.trackId = trackId;
    }

    public String getTrackMbid() {
        return trackMbid;
    }

    public void setTrackMbid(String trackMbid) {
        this.trackMbid = trackMbid;
    }

    public long getTrackLength() {
        return trackLength;
    }

    public void setTrackLength(long trackLength) {
        this.trackLength = trackLength;
    }

    public long getLyricsId() {
        return lyricsId;
    }

    public void setLyricsId(long lyricsId) {
        this.lyricsId = lyricsId;
    }

    public long getInstrumental() {
        return instrumental;
    }

    public void setInstrumental(long instrumental) {
        this.instrumental = instrumental;
    }

    public long getSubtitleId() {
        return subtitleId;
    }

    public void setSubtitleId(long subtitleId) {
        this.subtitleId = subtitleId;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public long getTrackRating() {
        return trackRating;
    }

    public void setTrackRating(long trackRating) {
        this.trackRating = trackRating;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public long getAlbumId() {
        return albumId;
    }

    public void setAlbumId(long albumId) {
        this.albumId = albumId;
    }

    public long getArtistId() {
        return artistId;
    }

    public void setArtistId(long artistId) {
        this.artistId = artistId;
    }

    public String getAlbumCoverart100x100() {
        return albumCoverart100x100;
    }

    public void setAlbumCoverart100x100(String albumCoverart100x100) {
        this.albumCoverart100x100 = albumCoverart100x100;
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

}
