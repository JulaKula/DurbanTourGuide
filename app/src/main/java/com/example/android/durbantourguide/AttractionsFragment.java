package com.example.android.durbantourguide;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;


public class AttractionsFragment extends Fragment {


    public AttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.objects_list, container, false);
//
//        ImageView imageView = rootView.
//                //findViewById(R.id.image_view);
//        imageView.setVisibility(View.VISIBLE);

        final ArrayList<LocationObject> objects = new ArrayList<LocationObject>();
        objects.add(new LocationObject(R.drawable.moses_mabhida_stadium, R.string.moses_mabhida_stadium, R.string.moses_mabhida_stadium_info));
        objects.add(new LocationObject(R.drawable.ushaka, R.string.uShaka, R.string.uShaka_info));
        objects.add(new LocationObject(R.drawable.rickshaws, R.string.rickshaws, R.string.rickshaws_info));
        objects.add(new LocationObject(R.drawable.kings_park_stadium, R.string.kings_park_stadium, R.string.kings_park_stadium_info));
        objects.add(new LocationObject(R.drawable.bunny_chow, R.string.bunny_chow, R.string.bunny_chow_info));
        objects.add(new LocationObject(R.drawable.durban_harbor, R.string.port_durban, R.string.port_durban_info));
        objects.add(new LocationObject(R.drawable.kingsmead, R.string.kingsmead_cricket_ground, R.string.kingsmead_cricket_ground_info));
        objects.add(new LocationObject(R.drawable.ice_arena, R.string.ice_arena, R.string.ice_arena_info));


        ObjectAdapter adapter = new ObjectAdapter(getActivity(), objects);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);



        return rootView;
    }


}
