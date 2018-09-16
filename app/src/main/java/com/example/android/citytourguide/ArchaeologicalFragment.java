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
public class ArchaeologicalFragment extends Fragment {

    private static String TAG = ArchaeologicalFragment.class.getSimpleName();

    PlaceCategoryAdapter archaeologicalAdapter;

    public ArchaeologicalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView started");

        View rootView = inflater.inflate(R.layout.activity_category, container, false);

        ArrayList<PlaceCategory> arrayOfArcheologicalPlaces = new ArrayList<>();

        arrayOfArcheologicalPlaces.add(new PlaceCategory(R.string.victoria_memorial_title,R.string.victoria_memorial_title, R.drawable.victoria_memorial, R.string.victoria_memorial_description));
        arrayOfArcheologicalPlaces.add(new PlaceCategory(R.string.fort_william_title,R.string.fort_william_title, R.drawable.fort_william, R.string.fort_william_description));
        arrayOfArcheologicalPlaces.add(new PlaceCategory(R.string.shobhabajar_rajbari_title,R.string.shobhabajar_rajbari_title, R.drawable.shobhabajar_rajbari, R.string.shobhabajar_rajbari_description));

        archaeologicalAdapter = new PlaceCategoryAdapter(getActivity(), arrayOfArcheologicalPlaces, R.color.category_archaeological);

        ListView listView = rootView.findViewById(R.id.activity_category);
        listView.setAdapter(archaeologicalAdapter);

        Log.d(TAG, "onCreateView ended");

        return rootView;
    }

}
