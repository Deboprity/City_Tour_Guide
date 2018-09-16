package com.example.android.citytourguide;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    public static final String TAG = HomeFragment.class.getSimpleName();

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView: started");

        View rootView = inflater.inflate(R.layout.activity_place, container, false);

        TextView pageTitle = rootView.findViewById(R.id.home_page_title);
        pageTitle.setText(R.string.home_page_title);

        ImageView pageImage = rootView.findViewById(R.id.home_page_image);
        pageImage.setImageResource(R.drawable.home_page_image);

        TextView pageDesc = rootView.findViewById(R.id.home_page_description);
        pageDesc.setText(R.string.home_page_description);

        Log.d(TAG, "onCreateView: ended");

        return rootView;
    }

}
