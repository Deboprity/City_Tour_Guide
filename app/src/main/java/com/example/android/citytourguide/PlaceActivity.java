package com.example.android.citytourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class PlaceActivity extends AppCompatActivity {

    public static final String TAG = "PlaceActivity";

    int pageTitleResID;
    int pageImageResID;
    int pageDescResID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: started");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place);

        Intent intent= getIntent();
        pageTitleResID = intent.getIntExtra("pageTitleResID",R.string.content_not_found);
        pageImageResID = intent.getIntExtra("pageImageResID",R.drawable.home_page_image);
        pageDescResID = intent.getIntExtra("pageDescResID",R.string.content_not_found);

        TextView pageTitle = findViewById(R.id.home_page_title);
        ImageView pageImage = findViewById(R.id.home_page_image);
        TextView pageDesc = findViewById(R.id.home_page_description);

        pageTitle.setText(pageTitleResID);
        pageImage.setImageResource(pageImageResID);
        pageDesc.setText(pageDescResID);

        Log.d(TAG, "onCreate: ended");
    }
}
