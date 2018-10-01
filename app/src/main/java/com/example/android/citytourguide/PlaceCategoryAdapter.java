package com.example.android.citytourguide;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceCategoryAdapter extends ArrayAdapter<PlaceCategory>{

    private static String TAG = PlaceCategoryAdapter.class.getSimpleName();

    private int bgcolorResId;


    PlaceCategoryAdapter(Activity context, ArrayList<PlaceCategory> arrayOfPlaceCategory, int backgroundColorResId){
        super(context, 0, arrayOfPlaceCategory);
        this.bgcolorResId = backgroundColorResId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Log.d(TAG, "getView() started");

        final PlaceCategory currentPlaceCategory;

        View listView = convertView;
        // Check if the existing view is being reused, otherwise inflate the view
        if(listView == null){
            listView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        currentPlaceCategory = getItem(position);

        TextView placeTextView = listView.findViewById(R.id.place_name_text_view);
        ImageView placeImgView = listView.findViewById(R.id.place_image);

        if (currentPlaceCategory != null) {
            placeTextView.setText(currentPlaceCategory.getPlaceNameResID());
            placeImgView.setImageResource(currentPlaceCategory.getPageImageResID());
        }

        int color = ContextCompat.getColor(getContext(),bgcolorResId);
        View textContainer = listView.findViewById(R.id.text_container);
        textContainer.setBackgroundColor(color);

        listView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), PlaceActivity.class);
                if (currentPlaceCategory != null) {
                    intent.putExtra("pageTitleResID",currentPlaceCategory.getPageTitleResID());
                }
                if (currentPlaceCategory != null) {
                    intent.putExtra("pageImageResID",currentPlaceCategory.getPageImageResID());
                }
                if (currentPlaceCategory != null) {
                    intent.putExtra("pageDescResID",currentPlaceCategory.getPageDescResID());
                }
                view.getContext().startActivity(intent);
            }
        }
        );

        Log.d(TAG, "getView() ended");

        return listView;
    }

}
