package com.example.android.durbantourguide;

public class Location {

    private int mNameResId;

    private int mInfoResId;

    private int mPhotoResId;

    public Location(int nameId, int infoId) {
        mNameResId = nameId;
        mInfoResId = infoId;
    }

    public Location(int photoId, int nameId, int infoId) {
        mNameResId = nameId;
        mPhotoResId = photoId;
        mInfoResId = infoId;
    }

    public int getName() {
        return mNameResId;
    }

    public int getInfo() {
        return mInfoResId;
    }

    public int getPhoto() {
        return mPhotoResId;
    }

}
