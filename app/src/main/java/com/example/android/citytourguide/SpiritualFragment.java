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
public class SpiritualFragment extends Fragment {

    private static String TAG = SpiritualFragment.class.getSimpleName();

    PlaceCategoryAdapter spiritualAdapter;

    public SpiritualFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView started");

        View rootView = inflater.inflate(R.layout.activity_category, container, false);

        ArrayList<PlaceCategory> arrayOfEducationalPlaces = new ArrayList<>();

        arrayOfEducationalPlaces.add(new PlaceCategory(R.string.belur_math_title,R.string.belur_math_title, R.drawable.belur_math, R.string.belur_math_description));
        arrayOfEducationalPlaces.add(new PlaceCategory(R.string.mother_house_title,R.string.mother_house_title, R.drawable.mother_house, R.string.mother_house_description));
        arrayOfEducationalPlaces.add(new PlaceCategory(R.string.birla_mandir_title,R.string.birla_mandir_title, R.drawable.birla_mandir, R.string.birla_mandir_description));
        arrayOfEducationalPlaces.add(new PlaceCategory(R.string.kalighat_temple_title,R.string.kalighat_temple_title, R.drawable.kalighat_temple, R.string.kalighat_temple_description));
        arrayOfEducationalPlaces.add(new PlaceCategory(R.string.south_park_street_cemetary_title,R.string.south_park_street_cemetary_title, R.drawable.south_park_street_cemetery, R.string.south_park_street_cemetary_description));

        spiritualAdapter = new PlaceCategoryAdapter(getActivity(), arrayOfEducationalPlaces, R.color.category_spiritual);

        ListView listView = rootView.findViewById(R.id.activity_category);
        listView.setAdapter(spiritualAdapter);

        Log.d(TAG, "onCreateView ended");

        return rootView;
    }

}
