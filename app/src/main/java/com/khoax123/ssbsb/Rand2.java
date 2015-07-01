package com.khoax123.ssbsb;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.io.IOException;


/**
 * A simple {@link Fragment} subclass.
 */
public class Rand2 extends Fragment {

    private MediaPlayer mp;

    public Rand2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rand2, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        Button just_do_it = (Button) getActivity().findViewById(R.id.just_do_it);
        just_do_it.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(), R.raw.just_do_it);
                mp.start();
            }
        });

        Button indestructible = (Button) getActivity().findViewById(R.id.indestructible);
        indestructible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(), R.raw.indestructible);
                mp.start();
            }
        });

        Button tetris = (Button) getActivity().findViewById(R.id.tetris);
        tetris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(), R.raw.tetris);
                mp.start();
            }
        });

        Button stop = (Button) getActivity().findViewById(R.id.stopper6);
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
            }
        });
    }


    private void stopPlaying() {
        if (mp != null) {
            mp.stop();
            mp.release();
            mp = null;
        }
    }


}
