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
public class RestaurantsFragment extends Fragment {

    private static String TAG = RestaurantsFragment.class.getSimpleName();

    PlaceCategoryAdapter restaurantAdapter;

    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView started");

        View rootView = inflater.inflate(R.layout.activity_category, container, false);

        ArrayList<PlaceCategory> arrayOfEducationalPlaces = new ArrayList<>();

        arrayOfEducationalPlaces.add(new PlaceCategory(R.string.coffee_house_title,R.string.coffee_house_title, R.drawable.college_street_coffee_house, R.string.coffee_house_description));
        arrayOfEducationalPlaces.add(new PlaceCategory(R.string.six_ballygunge_place_title,R.string.six_ballygunge_place_title, R.drawable.six_ballygunge_place, R.string.six_ballygunge_place_description));
        arrayOfEducationalPlaces.add(new PlaceCategory(R.string.peter_cat_title,R.string.peter_cat_title, R.drawable.peter_cat, R.string.peter_cat_description));
        arrayOfEducationalPlaces.add(new PlaceCategory(R.string.arsalan_title,R.string.arsalan_title, R.drawable.arsalan, R.string.arsalan_description));
        arrayOfEducationalPlaces.add(new PlaceCategory(R.string.barbeque_nation_title,R.string.barbeque_nation_title, R.drawable.barbeque_nation, R.string.barbeque_nation_description));

        restaurantAdapter = new PlaceCategoryAdapter(getActivity(), arrayOfEducationalPlaces, R.color.category_restaurants);

        ListView listView = rootView.findViewById(R.id.activity_category);
        listView.setAdapter(restaurantAdapter);

        Log.d(TAG, "onCreateView ended");

        return rootView;
    }

}
