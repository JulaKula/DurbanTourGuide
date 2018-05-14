package com.example.android.durbantourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class NatureFragment extends Fragment {

    public NatureFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.objects_list, container, false);

        // Create an ArrayList and add newly created LocationObjects
        ArrayList<Location> objects = new ArrayList<>();
        objects.add(new Location(R.string.botanic_gardens, R.string.botanic_gardens_info));
        objects.add(new Location(R.string.mitchel_jameson, R.string.mitchel_jameson_info));
        objects.add(new Location(R.string.krantzkloof, R.string.krantzkloof_info));
        objects.add(new Location(R.string.palmiet, R.string.palmiet_info));
        objects.add(new Location(R.string.hawaan_forest, R.string.hawaan_forest_info));
        objects.add(new Location(R.string.new_germany, R.string.new_germany_info));
        objects.add(new Location(R.string.pigeon_valley, R.string.pigeon_valley_info));
        objects.add(new Location(R.string.bird_park, R.string.bird_park_info));
        objects.add(new Location(R.string.umhlanga_reserve, R.string.umhlanga_reserve_info));
        objects.add(new Location(R.string.burman_bush, R.string.burman_bush_info));

        // Create an LocationAdapter, with the foregoing ArrayList as data source. Connect adapter with listView
        LocationAdapter adapter = new LocationAdapter(getActivity(), objects);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
