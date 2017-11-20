package com.example.abdoh.egypttourguide;

/**
 * Created by abdoh on 2017-02-05.
 */

public class Word {

    private int ImageResourceId;

    private String TextResourceId;

    public Word(int imageResourceId, String textResourceId){
        ImageResourceId = imageResourceId;
        TextResourceId = textResourceId;
    }

    public int getImageResourceId(){
        return ImageResourceId;
    }

    public String getTextResourceId(){
        return TextResourceId;
    }
}
