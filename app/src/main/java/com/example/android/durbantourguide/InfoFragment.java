package com.example.android.durbantourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class InfoFragment extends Fragment {


    public InfoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_item, container, false);

        LinearLayout background = rootView.findViewById(R.id.background);
        background.setBackgroundColor(getResources().getColor(R.color.white));

        ImageView imageView = rootView.findViewById(R.id.image_view);
        imageView.setVisibility(View.VISIBLE);
        imageView.setImageResource(R.drawable.screen_side);

        TextView textView1 = rootView.findViewById(R.id.name_text_view);
        textView1.setVisibility(View.GONE);

        TextView textView = rootView.findViewById(R.id.info_text_view);
        textView.setText(R.string.info_text);

        ScrollView scrollView = rootView.findViewById(R.id.scroll_view);
        scrollView.setVisibility(View.VISIBLE);

        return rootView;
    }

}
