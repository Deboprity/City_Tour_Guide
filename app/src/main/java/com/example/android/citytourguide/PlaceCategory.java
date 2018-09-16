package com.example.android.citytourguide;

public class PlaceCategory {

    private int placeNameResID;

    private  int pageTitleResID;

    private int pageImageResID;

    private int pageDescResID;

    PlaceCategory(int placeNameResID, int pageTitleResID, int pageImageResID, int pageDescResID) {
        this.placeNameResID = placeNameResID;
        this.pageTitleResID = pageTitleResID;
        this.pageImageResID = pageImageResID;
        this.pageDescResID = pageDescResID;
    }

    public int getPlaceNameResID() {
        return placeNameResID;
    }

    public int getPageTitleResID() {
        return pageTitleResID;
    }

    public int getPageImageResID() {
        return pageImageResID;
    }

    public int getPageDescResID() {
        return pageDescResID;
    }

}
