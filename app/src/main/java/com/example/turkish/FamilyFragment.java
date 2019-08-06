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
public class FamilyFragment extends Fragment {


    public FamilyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        ArrayList<Word> familyArray = new ArrayList<>();
        familyArray.add(new Word("father","baba", R.drawable.family_father));
        familyArray.add(new Word("mother", "anne", R.drawable.family_mother));
        familyArray.add(new Word("son" , "oğul", R.drawable.family_son));
        familyArray.add(new Word("daughter" , "kız", R.drawable.family_daughter));
        familyArray.add(new Word("brother" , "kardeş", R.drawable.family_older_brother));
        familyArray.add(new Word("sister" , "kız kardeş", R.drawable.family_younger_sister));
        familyArray.add(new Word("older sister" , "abla", R.drawable.family_older_sister));
        familyArray.add(new Word("grandmother" , "büyükanne", R.drawable.family_grandmother));
        familyArray.add(new Word("grandfather" , "büyükbaba", R.drawable.family_grandfather));
        familyArray.add(new Word("husband" , "koca", R.drawable.family_older_brother));
        familyArray.add(new Word("wife" , "karı", R.drawable.family_older_sister));

        WordAdapter adapter = new WordAdapter(getActivity(), familyArray, R.color.category_family);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
