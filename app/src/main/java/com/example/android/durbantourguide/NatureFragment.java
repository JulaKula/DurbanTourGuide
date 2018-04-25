package com.example.android.durbantourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class NatureFragment extends Fragment {


    public NatureFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.objects_list, container, false);
        final ArrayList<LocationObject> objects = new ArrayList<LocationObject>();

        objects.add(new LocationObject(R.string.burman_bush, R.string.address_mozambik));
        objects.add(new LocationObject(R.string.botanic_gardens, R.string.address_mozambik));
        objects.add(new LocationObject(R.string.hawaan_forest, R.string.address_mozambik));
        objects.add(new LocationObject(R.string.new_germany, R.string.address_mozambik));
        objects.add(new LocationObject(R.string.pigeon_valley, R.string.address_mozambik));
        objects.add(new LocationObject(R.string.bird_park, R.string.address_mozambik));
        objects.add(new LocationObject(R.string.umhlanga_reserve, R.string.address_mozambik));
        objects.add(new LocationObject(R.string.krantzkloof, R.string.address_mozambik));

        ObjectAdapter adapter = new ObjectAdapter(getActivity(), objects);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);


        return rootView;
    }

}
