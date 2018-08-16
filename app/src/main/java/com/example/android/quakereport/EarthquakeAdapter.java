package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by clarissajarem on 8/16/18.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {
    public EarthquakeAdapter(Context context, ArrayList<Earthquake> earthquakes){
        super(context, 0, earthquakes);
    }

    /**
     * returns a list item view that gives us the information about the earthquake
     *
     * @return
     */

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if(null = listItemView){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_earthquakes, parent, false);
        }
        //Find earthquake in a list of earthquakes
        Earthquake currentEarthquake = getItem(position);
        return listItemView;
    }
}
