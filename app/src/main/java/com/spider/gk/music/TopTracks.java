package com.spider.gk.music;

import android.app.ProgressDialog;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;
import android.util.Log;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;

import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.spider.gk.music.model.Body;
import com.spider.gk.music.model.TrackList;
import com.spider.gk.music.model.Track_;
import com.spider.gk.music.rest.ApiService;
import com.spider.gk.music.rest.RetroClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Callback;
import retrofit2.Response;

public class TopTracks extends AppCompatActivity {
    Boolean net;
    ArrayList<Track_> trackList;
    View parentView;
    ListView trackListView;
    TrackAdaptar trackAdaptar;
    public final static String Api_Key = "a3892703932d0df9deae42864549fd5e";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_tracks);

        trackList = new ArrayList<>();
        parentView = findViewById(R.id.parent);
        trackListView = (ListView) findViewById(R.id.track_listview);
        trackListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                // TODO open track details activity
                Toast.makeText(getApplicationContext(), "" + position + "is clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }


    public void refresh(int h) {
        /**
         * Checking Internet Connection
         */

        ConnectivityManager cm = (ConnectivityManager) getSystemService(CONNECTIVITY_SERVICE);
        NetworkInfo[] ni = cm.getAllNetworkInfo();
        for (NetworkInfo netInfo : ni) {
            if (netInfo.isConnected()) {
                net = true;
            }
        }

        if (net == true) {
            Log.i("net", "connected");

            /**
             * Progress Dialog for User Interaction
             */
            ApiService api = RetroClient.getApiService();
            //calling json
            retrofit2.Call<TrackList> call = api.getTrack(Api_Key);
         call.enqueue(new Callback<TrackList>() {
                @Override
                public void onResponse(retrofit2.Call<TrackList> call, Response<TrackList> response) {


                    if (response.isSuccessful()) {
                        /**
                         * Got Successfully
                         */
                        trackList = response.body().getTrack();
Log.i("nameismyname","");
                        /**
                         * Binding that List to Adapter
                         */
                        trackAdaptar = new TrackAdaptar(TopTracks.this,R.layout.track_list_item, trackList);
                        trackList.add(new Track_(1234,"trackmb",00,01,02,00,"trackname",04,"album",05,06,"ic_icon","mbid","artit"));

                        trackListView = (ListView) findViewById(R.id.track_listview);
                        trackListView.setAdapter(trackAdaptar);

                    }

                }


                public void onFailure(retrofit2.Call<TrackList> call, Throwable t) {

                }
            });


        }
else{
            Log.i("internet","not connected");
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu options from the res/menu/menu_catalog.xml file.
        // This adds menu items to the app bar.
        getMenuInflater().inflate(R.menu.menu_track, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // User clicked on a menu option in the app bar overflow menu
        switch (item.getItemId()) {
            // Respond to a click on the "Insert dummy data" menu option
            case R.id.refresh:
                refresh(6);
                return true;
            // Respond to a click on the "Delete all entries" menu option
            case R.id.goto_top_artist:
                // Do nothing for now
                return true;
            case R.id.search_button:
                //do nothing for now
                return true;

        }
        return super.onOptionsItemSelected(item);
    }

}