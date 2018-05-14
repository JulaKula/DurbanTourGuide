package com.example.android.durbantourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class AttractionsFragment extends Fragment {

    public AttractionsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.objects_list, container, false);

        // Create an ArrayList and add newly created LocationObjects
        ArrayList<Location> objects = new ArrayList<>();
        objects.add(new Location(R.drawable.moses_mabhida_stadium, R.string.moses_mabhida_stadium, R.string.moses_mabhida_stadium_info));
        objects.add(new Location(R.drawable.ushaka, R.string.uShaka, R.string.uShaka_info));
        objects.add(new Location(R.drawable.rickshaws, R.string.rickshaws, R.string.rickshaws_info));
        objects.add(new Location(R.drawable.kings_park_stadium, R.string.kings_park_stadium, R.string.kings_park_stadium_info));
        objects.add(new Location(R.drawable.bunny_chow, R.string.bunny_chow, R.string.bunny_chow_info));
        objects.add(new Location(R.drawable.durban_harbor, R.string.port_durban, R.string.port_durban_info));
        objects.add(new Location(R.drawable.kingsmead, R.string.kingsmead_cricket_ground, R.string.kingsmead_cricket_ground_info));
        objects.add(new Location(R.drawable.ice_arena, R.string.ice_arena, R.string.ice_arena_info));

        // Create an LocationAdapter, with the foregoing ArrayList as data source. Connect adapter with listView
        LocationAdapter adapter = new LocationAdapter(getActivity(), objects);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
