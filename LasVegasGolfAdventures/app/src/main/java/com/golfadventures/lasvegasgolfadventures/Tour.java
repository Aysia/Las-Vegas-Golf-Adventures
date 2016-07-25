package com.golfadventures.lasvegasgolfadventures;

import android.util.Log;

/**
 * Created by Lani on 7/20/2016.
 */
public class Tour {

    /**
     * Facility Name
     **/
    private int mTourName;

    /**
     * Facility Info
     */
    private int mTourInfo;

    /**
     * Facility Address
     */
    private int mTourAddress;

    /**
     * Facility Phone Number
     */
    private int mPhoneNumber;

    /**
     * Type (Restaurant/nightclubs) description
     */
    private String mTourType;

    /** Image resource ID for the tour */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this tour */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Tour object.
     *
     * @param tourName        is the name of the Tour / Facility
     * @param imageResourceId is the resouce ID for the image file associated to the tour
     * @param tourInfo       is the rate for the tour / Facility
     * @param tourAddress     is the address for the tour / facility
     * @param phoneNumber     is the phone number for the tour / facility
     */
    public Tour(int tourName, int imageResourceId, int tourInfo, int tourAddress, int phoneNumber) {
        mTourName = tourName;
        mImageResourceId = imageResourceId;
        mTourInfo = tourInfo;
        mTourAddress = tourAddress;
        mPhoneNumber = phoneNumber;
    }

    /**
     * Create a second Tour Object to support no image but instead a Info
     *
     * @param tourName is the name of the facility / tour
     * @param tourInfo is the short information for the facility
     * @param tourAddress is the Hotel Location of the facility
     * @param phoneNumber is the phone number associated to the facility / tour
     */
    public Tour(int tourName, int tourInfo, int tourAddress, int phoneNumber) {
        mTourName = tourName;
        mTourInfo = tourInfo;
        mTourAddress = tourAddress;
        mPhoneNumber = phoneNumber;
    }

    /**
     * Get the name of the Tour
     */
    public int getTourName() {
        return mTourName;
    }

    /**
     * Get Tour Image.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getTourAddress() {
        return mTourAddress;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public int getPhoneNumber() {
        return mPhoneNumber;
    }

    /**
     * Returns Info
     */
    public int getTourInfo() {
        return mTourInfo;
    }
}
