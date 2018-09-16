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
public class EducationalFragment extends Fragment {

    PlaceCategoryAdapter educationalAdapter;

    public EducationalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String TAG = EducationalFragment.class.getSimpleName();
        Log.d(TAG, "onCreateView started");

        View rootView = inflater.inflate(R.layout.activity_category, container, false);

        ArrayList<PlaceCategory> arrayOfEducationalPlaces = new ArrayList<>();

        arrayOfEducationalPlaces.add(new PlaceCategory(R.string.birla_planetarium_title,R.string.birla_planetarium_title, R.drawable.birla_planetarium, R.string.birla_planetarium_description));
        arrayOfEducationalPlaces.add(new PlaceCategory(R.string.indian_museum_title,R.string.indian_museum_title, R.drawable.indian_museum, R.string.indian_museum_description));
        arrayOfEducationalPlaces.add(new PlaceCategory(R.string.science_city_title,R.string.science_city_title, R.drawable.science_city, R.string.science_city_description));
        arrayOfEducationalPlaces.add(new PlaceCategory(R.string.jorasanko_thakur_bari_title,R.string.jorasanko_thakur_bari_title, R.drawable.jorasankho_thakur_bari, R.string.jorasanko_thakur_bari_description));
        arrayOfEducationalPlaces.add(new PlaceCategory(R.string.botanical_garden_title,R.string.botanical_garden_title, R.drawable.botanical_garden, R.string.botanical_garden_description));

        educationalAdapter = new PlaceCategoryAdapter(getActivity(), arrayOfEducationalPlaces, R.color.category_educational);

        ListView listView = rootView.findViewById(R.id.activity_category);
        listView.setAdapter(educationalAdapter);

        Log.d(TAG, "onCreateView ended");

        return rootView;
    }

}
