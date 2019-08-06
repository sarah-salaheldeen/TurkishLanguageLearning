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
public class PhrasesFragment extends Fragment {


    public PhrasesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        ArrayList<Word> phrasesArray = new ArrayList<>();
        phrasesArray.add(new Word("Where are you going?", "nereye gidiyorsun"));
        phrasesArray.add(new Word("What is your name?", "Adın ne?"));
        phrasesArray.add(new Word("My name is..." , "Benim adım..."));
        phrasesArray.add(new Word("How are you feeling?" , "Nasıl hissediyorsun?"));
        phrasesArray.add(new Word("I am feeling good." , "İyi hissediyorum."));
        phrasesArray.add(new Word("Are you coming?" , "Geliyormusun?"));
        phrasesArray.add(new Word("Yes, I'm coming." , "Evet geliyorum."));
        phrasesArray.add(new Word("I'm coming." , "Geliyorum."));
        phrasesArray.add(new Word("Let's go." , "Hadi gidelim."));
        phrasesArray.add(new Word("Come here." , "Buraya gel."));

        WordAdapter adapter = new WordAdapter(getActivity(), phrasesArray, R.color.category_phrases);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);


        return rootView;
    }

}
