package com.example.tourguideapp;

/**
 * It contains resource IDs for each recommendation.
 */
public class CityCategoryItem {

    /**
     * Resource ID for icon of each item.
     */
    private int mIconResourceId;

    /**
     * Resource ID for the title of each recommendation.
     */
    private int mTitle;

    /**
     * Resource ID for the location of each recommendation.
     */
    private int mInfo;

    /**
     * Create a new CityCategoryItem object.
     *
     * @param iconResourceId is the icon for each item that shows to which category it belongs.
     * @param title          is the string resource Id for the upper TextView of each item.
     * @param info           is the string resource Id for the lower TextView of each item.
     */
    public CityCategoryItem(int iconResourceId, int title, int info) {
        mIconResourceId = iconResourceId;
        mTitle = title;
        mInfo = info;
    }

    /**
     * Get the string resource ID for the title of each item.
     */
    public int getText() {
        return mTitle;
    }

    /**
     * Get the image resource ID for the icon of each item.
     */
    public int getIconResourceId() {
        return mIconResourceId;
    }

    /**
     * Get the string resource ID for the location of each item.
     */
    public int getInfoId() {
        return mInfo;
    }
}