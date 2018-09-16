package com.example.android.citytourguide;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecreationalFragment extends Fragment {

    private static String TAG = RecreationalFragment.class.getSimpleName();

    PlaceCategoryAdapter recreationalAdapter;

    public RecreationalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView started");

        View rootView = inflater.inflate(R.layout.activity_category, container, false);

        ArrayList<PlaceCategory> arrayOfEducationalPlaces = new ArrayList<>();

        arrayOfEducationalPlaces.add(new PlaceCategory(R.string.howrah_bridge_title,R.string.howrah_bridge_title, R.drawable.howrah_bridge, R.string.howrah_bridge_description));
        arrayOfEducationalPlaces.add(new PlaceCategory(R.string.eden_gardens_title,R.string.eden_gardens_title, R.drawable.eden_gardens, R.string.eden_gardens_description));
        arrayOfEducationalPlaces.add(new PlaceCategory(R.string.alipore_zoo_title,R.string.alipore_zoo_title, R.drawable.alipore_zoo, R.string.alipore_zoo_description));
        arrayOfEducationalPlaces.add(new PlaceCategory(R.string.ecopark_title,R.string.ecopark_title, R.drawable.eco_tourism_park, R.string.ecopark_description));
        arrayOfEducationalPlaces.add(new PlaceCategory(R.string.princep_ghat_title,R.string.princep_ghat_title, R.drawable.princep_ghat, R.string.princep_ghat_description));

        recreationalAdapter = new PlaceCategoryAdapter(getActivity(), arrayOfEducationalPlaces, R.color.category_recreational);

        ListView listView = rootView.findViewById(R.id.activity_category);
        listView.setAdapter(recreationalAdapter);

        Log.d(TAG, "onCreateView ended");

        return rootView;
    }

}
