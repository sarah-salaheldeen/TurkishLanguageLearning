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
public class NumbersFragment extends Fragment {


    public NumbersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        /** TODO: Insert all the code from the NumberActivity’s onCreate() method after the setContentView method call */

        ArrayList<Word> numbersArray = new ArrayList<>();
        numbersArray.add(new Word("one","bir", R.drawable.number_one));
        numbersArray.add(new Word("two", "iki", R.drawable.number_two));
        numbersArray.add(new Word("three" , "üç", R.drawable.number_three));
        numbersArray.add(new Word("four" , "dört", R.drawable.number_four));
        numbersArray.add(new Word("five" , "beş", R.drawable.number_five));
        numbersArray.add(new Word("six" , "altı", R.drawable.number_six));
        numbersArray.add(new Word("seven" , "yedi", R.drawable.number_seven));
        numbersArray.add(new Word("eight" , "sekiz", R.drawable.number_eight));
        numbersArray.add(new Word("nine" , "dokuz", R.drawable.number_nine));
        numbersArray.add(new Word("ten" , "on", R.drawable.number_ten));

        WordAdapter adapter = new WordAdapter(getActivity(), numbersArray, R.color.category_numbers);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
