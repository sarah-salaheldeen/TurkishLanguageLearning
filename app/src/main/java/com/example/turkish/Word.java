package com.example.turkish;

public class Word {

    private String mDefaultTranslation ;
    private String mTurkishTranslation ;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String turkishTranslation){
        mDefaultTranslation = defaultTranslation;
        mTurkishTranslation = turkishTranslation;
    }

    public Word(String defaultTranslation, String turkishTranslation, int imageResourceId){
        mDefaultTranslation = defaultTranslation;
        mTurkishTranslation = turkishTranslation;
        mImageResourceId = imageResourceId;
    }

    public String getDefaultTranslation(){

        return mDefaultTranslation;
    }

    public String getTurkishTranslation(){

        return mTurkishTranslation;
    }

    public int getImageResourceId(){

        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
