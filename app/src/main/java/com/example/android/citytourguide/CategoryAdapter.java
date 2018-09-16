package com.example.android.citytourguide;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

/**
 * A simple {@link Fragment} subclass.
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;
    public static final String TAG = CategoryAdapter.class.getSimpleName();

    CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Log.d(TAG, "getItem: started");
        
        if (position == 0) {
            return new HomeFragment();
        } else if (position == 1) {
            return new ArchaeologicalFragment();
        } else if (position == 2) {
            return new SpiritualFragment();
        } else if (position == 3) {
            return new EducationalFragment();
        } else if (position == 4) {
            return new RecreationalFragment();
        } else if (position == 5) {
            return new ShoppingFragment();
        } else {
            return new RestaurantsFragment();
        }
    }

    @Override
    public int getCount() {
        Log.d(TAG, "getCount: started");
        return 7;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        Log.d(TAG, "getPageTitle: started");
        if (position == 0) {
            return mContext.getString(R.string.category_home);
        } else if (position == 1) {
            return mContext.getString(R.string.category_archaeological);
        } else if (position == 2) {
            return mContext.getString(R.string.category_spiritual);
        } else if (position == 3) {
            return mContext.getString(R.string.category_educational);
        } else if (position == 4) {
            return mContext.getString(R.string.category_recreational);
        } else if (position == 5) {
            return mContext.getString(R.string.category_shopping);
        } else {
            return mContext.getString(R.string.category_restaurants);
        }
    }
}
