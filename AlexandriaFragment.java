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
public class AlexandriaFragment extends Fragment {


    public AlexandriaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.drawable.egypt_alexandria_fort_qaitbey,"Fort Qaitbey"));
        words.add(new Word(R.drawable.egypt_alexandria_kom_el_dikka
                ,"Kom El Dikka"));
        words.add(new Word(R.drawable.egypt_alexandria_pompeys_pillar,"Pompeys Pillar"));
        words.add(new Word(R.drawable.egypt_alexandria_ras_el_tin_palace,"Ras El Tin Palace"));


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
