package com.example.abdoh.egypttourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AswanFragment extends Fragment {


    public AswanFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.drawable.egypt_aswan_philae_temple,"Philae Temple"));
        words.add(new Word(R.drawable.egypt_aswanl_ephantine_island_village_architecture
                ,"Elephantine Island Village Architecture"));
        words.add(new Word(R.drawable.egypt_aswan_tombs_of_the_nobles,"Temple At Wadi Al Subua"));
        words.add(new Word(R.drawable.egypt_aswan_kalabsha_temples,"Kalabsha Temples"));


        WordAdapter adapter = new WordAdapter(getActivity(), words);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {



            }
        });

        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}
