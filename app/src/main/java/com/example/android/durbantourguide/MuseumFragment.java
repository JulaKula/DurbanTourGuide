package com.example.android.durbantourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumFragment extends Fragment {

    public MuseumFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.objects_list, container, false);

        // Create an ArrayList and add newly created LocationObjects
        ArrayList<Location> objects = new ArrayList<>();
        objects.add(new Location(R.string.natural_science_museum, R.string.nsm_address));
        objects.add(new Location(R.string.old_house_museum, R.string.ohm_address));
        objects.add(new Location(R.string.kwamuhle_museum, R.string.km_address));
        objects.add(new Location(R.string.campbell_collection, R.string.cc_address));
        objects.add(new Location(R.string.port_natal_museum, R.string.pnm_address));
        objects.add(new Location(R.string.phansi_museum, R.string.pm_address));
        objects.add(new Location(R.string.cato_manor_heritage_center, R.string.cmhc_address));
        objects.add(new Location(R.string.bergtheil_museum, R.string.bm_address));
        objects.add(new Location(R.string.old_court_house, R.string.och_address));

        // Create an LocationAdapter, with the foregoing ArrayList as data source. Connect adapter with listView
        LocationAdapter adapter = new LocationAdapter(getActivity(), objects);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
