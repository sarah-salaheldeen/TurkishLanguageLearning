package com.example.turkish;

import android.app.Activity;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId){
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }
    //@androidx.annotation.NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView turkishTextView = listItemView.findViewById(R.id.turkish_text_view);
        turkishTextView.setText(currentWord.getTurkishTranslation());

        TextView englishTextView = listItemView.findViewById(R.id.english_text_view);
        englishTextView.setText(currentWord.getDefaultTranslation());

        ImageView image = listItemView.findViewById(R.id.image);
        if(currentWord.hasImage()) {
            image.setImageResource(currentWord.getImageResourceId());
            //make sure the view is visible
            image.setVisibility(View.VISIBLE);
        }
        else {
            image.setVisibility(View.GONE);
        }

        //set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        //find the color that the resource id maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        //set the background color of the text container view
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
