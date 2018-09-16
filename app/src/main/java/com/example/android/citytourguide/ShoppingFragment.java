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
public class ShoppingFragment extends Fragment {

    private static String TAG = ShoppingFragment.class.getSimpleName();

    PlaceCategoryAdapter shoppingAdapter;

    public ShoppingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView started");

        View rootView = inflater.inflate(R.layout.activity_category, container, false);

        ArrayList<PlaceCategory> arrayOfEducationalPlaces = new ArrayList<>();

        arrayOfEducationalPlaces.add(new PlaceCategory(R.string.chowringhee_title,R.string.chowringhee_title, R.drawable.chowringhee, R.string.chowringhee_description));
        arrayOfEducationalPlaces.add(new PlaceCategory(R.string.park_street_title,R.string.park_street_title, R.drawable.park_street, R.string.park_street_description));
        arrayOfEducationalPlaces.add(new PlaceCategory(R.string.new_market_title,R.string.new_market_title, R.drawable.new_market_area, R.string.new_market_description));

        shoppingAdapter = new PlaceCategoryAdapter(getActivity(), arrayOfEducationalPlaces, R.color.category_shopping);

        ListView listView = rootView.findViewById(R.id.activity_category);
        listView.setAdapter(shoppingAdapter);

        Log.d(TAG, "onCreateView ended");

        return rootView;
    }

}
