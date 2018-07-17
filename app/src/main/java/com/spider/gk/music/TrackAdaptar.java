package com.spider.gk.music;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.spider.gk.music.model.Artist_;
import com.spider.gk.music.model.TrackList;
import com.spider.gk.music.model.Track_;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class TrackAdaptar extends ArrayAdapter {

    ArrayList<Track_> tracks=new ArrayList<>();

    public TrackAdaptar(@NonNull Context context,int Resource ,@NonNull ArrayList<Track_> tracks) {
        super(context, Resource, tracks);
        this.tracks=tracks;

    }

    @Override
    public Track_ getItem(int position) {
        return tracks.get(position);
    }


    @Override
    public int getCount() {
        return super.getCount();

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.track_list_item, parent, false);
        }
        Track_ currentTrack =(Track_) getItem(position);
        ImageView trackIcon=(ImageView) listItemView.findViewById(R.id.track_image);
        Picasso.with(getContext()).load(currentTrack.getAlbumCoverart100x100()).placeholder(R.drawable.ic_icon).error(R.drawable.ic_icon).into(trackIcon);
        TextView albumName=(TextView) listItemView.findViewById(R.id.album_name);
        albumName.setText(currentTrack.getTrackName());
        return listItemView;
    }
}
