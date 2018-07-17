package com.spider.gk.music;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.spider.gk.music.model.ArtistList;
import com.spider.gk.music.model.Artist_;

import java.util.ArrayList;
import java.util.List;

public class ArtistAdaptar extends ArrayAdapter {
    public ArtistAdaptar(@NonNull Context context, int resource, @NonNull List<Artist_> artists) {
        super(context, resource, artists);
    }

    @Nullable
    @Override
    public Artist_ getItem(int position) {
        return ArtistList.getArtist();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(android.R.layout.simple_list_item_1, parent, false);
        }
        Artist_ currentArtist = getItem(position);


        TextView artistName = (TextView) listItemView.findViewById(android.R.id.text1);
        artistName.setText(currentArtist.getArtistName());
        return listItemView;
    }
}
