package com.example.android.durbantourguide;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumFragment extends Fragment {

//    private DrawerLayout mDrawerLayout;


    public MuseumFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.objects_list, container, false);


//        Toolbar toolbar = rootView.findViewById(R.id.toolbar);
//        toolbar.setTitle("Museums");
//
//        mDrawerLayout = rootView.findViewById(R.id.drawer_layout);
//
//
//        toolbar.setNavigationIcon(R.drawable.ic_menu);
//        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mDrawerLayout.openDrawer(GravityCompat.START);
//                mDrawerLayout.closeDrawers();
//
//               // getActivity().onBackPressed();
//            }
//        });
//        rootView.setSupportActionBar(toolbar);
//        ActionBar actionbar = getSupportActionBar();
//        actionbar.setDisplayHomeAsUpEnabled(true);
//        actionbar.setHomeAsUpIndicator(R.drawable.ic_menu);

        final ArrayList<LocationObject> objects = new ArrayList<LocationObject>();
        objects.add(new LocationObject(R.string.natural_science_museum, R.string.nsm_address));
        objects.add(new LocationObject(R.string.old_house_museum, R.string.ohm_address));
        objects.add(new LocationObject(R.string.kwamuhle_museum, R.string.km_address));
        objects.add(new LocationObject(R.string.campbell_collection, R.string.cc_address));
        objects.add(new LocationObject(R.string.port_natal_museum, R.string.pnm_address));
        objects.add(new LocationObject(R.string.phansi_museum, R.string.pm_address));
        objects.add(new LocationObject(R.string.cato_manor_heritage_center, R.string.cmhc_address));


        ObjectAdapter adapter = new ObjectAdapter(getActivity(), objects);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);


        return rootView;

    }
}
