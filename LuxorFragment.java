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
public class LuxorFragment extends Fragment {


    public LuxorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.drawable.egypt_luxor_medinet_habu,"Medinet Habu"));
        words.add(new Word(R.drawable.egypt_luxor_temple_of_deir_al_bahri
                ,"Temple Of Deir Al Bahri"));
        words.add(new Word(R.drawable.egypt_luxor_temple_of_karnak," Temple of Karnak"));
        words.add(new Word(R.drawable.egypt_luxor_valley_of_the_kings_view_over_tomb_entrances," Valley of the Kings"));


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

}
