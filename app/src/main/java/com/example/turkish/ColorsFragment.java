package com.example.turkish;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ColorsFragment extends Fragment {


    public ColorsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        ArrayList<Word> colorsArray = new ArrayList<>();
        colorsArray.add(new Word("red","kırmızı", R.drawable.color_red));
        colorsArray.add(new Word("yellow", "sarı", R.drawable.color_dusty_yellow));
        colorsArray.add(new Word("green" , "yeşil", R.drawable.color_green));
        colorsArray.add(new Word("brown" , "kahverengi",R.drawable.color_brown));
        colorsArray.add(new Word("gray" , "grī", R.drawable.color_gray));
        colorsArray.add(new Word("black" , "siyah", R.drawable.color_black));
        colorsArray.add(new Word("white" , "beyaz", R.drawable.color_white));
        colorsArray.add(new Word("blue" , "māvi"));

        WordAdapter adapter = new WordAdapter(getActivity(), colorsArray, R.color.category_colors);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
