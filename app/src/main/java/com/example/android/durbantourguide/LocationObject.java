package com.example.android.durbantourguide;

public class LocationObject {

    private int mObjectNameId;

    private int mObjectAddressId;

    private int mObjectInfo;

    private int mObjectPhotoId;

    public LocationObject(int objectNameId, int objectAddressId) {
        mObjectNameId = objectNameId;
        mObjectAddressId = objectAddressId;
    }

    public LocationObject(int objectPhotoId, int objectNameId, int objectAddressId) {
        mObjectNameId = objectNameId;
        mObjectPhotoId = objectPhotoId;
        mObjectAddressId = objectAddressId;
    }

//    public LocationObject(int objectInfo) {
//        mObjectInfo = objectInfo;
//    }

    public int getObjectNameId() {
        return mObjectNameId;
    }

    public int getObjectAddressId() {
        return mObjectAddressId;
    }

    public int getObjectPhotoId() {
        return mObjectPhotoId;
    }


}
