package com.spider.gk.music.rest;

import com.spider.gk.music.model.ArtistList;
import com.spider.gk.music.model.TrackList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {


    @GET("chart.track.get")
    Call<TrackList> getTrack(@Query("apikey") String api_key);


}