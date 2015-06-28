package com.khoax123.ssbsb;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Phoenix extends Fragment {

    private MediaPlayer mp;


    public Phoenix() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_phoenix, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        Button phoe1 = (Button) getActivity().findViewById(R.id.phoe1);
        phoe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(), R.raw.phoenix_objection);
                mp.start();
            }
        });

        Button phoe2 = (Button) getActivity().findViewById(R.id.phoe2);
        phoe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(),R.raw.phoenix_holdit);
                mp.start();
            }
        });

        Button phoe3 = (Button) getActivity().findViewById(R.id.phoe3);
        phoe3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(),R.raw.phoenix_takethat);
                mp.start();
            }
        });

        Button ath1 = (Button) getActivity().findViewById(R.id.ath1);
        ath1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(),R.raw.athena_objection);
                mp.start();
            }
        });

        Button ath2 = (Button) getActivity().findViewById(R.id.ath2);
        ath2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(),R.raw.athena_holdit);
                mp.start();
            }
        });

        Button ath3 = (Button) getActivity().findViewById(R.id.ath3);
        ath3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(),R.raw.athena_takethat);
                mp.start();
            }
        });

        Button apo1 = (Button) getActivity().findViewById(R.id.apo1);
        apo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(),R.raw.apollo_objection);
                mp.start();
            }
        });

        Button apo2 = (Button) getActivity().findViewById(R.id.apo2);
        apo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(),R.raw.apollo_holdit);
                mp.start();
            }
        });

        Button apo3 = (Button) getActivity().findViewById(R.id.apo3);
        apo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(),R.raw.apollo_takethat);
                mp.start();
            }
        });

        Button simon = (Button) getActivity().findViewById(R.id.simobj);
        simon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(),R.raw.simon_objection);
                mp.start();
            }
        });

        Button edge = (Button) getActivity().findViewById(R.id.milesobj);
        edge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(),R.raw.miles_objection);
                mp.start();
            }
        });

        Button kla = (Button) getActivity().findViewById(R.id.klaobj);
        kla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(),R.raw.klavier_objection);
                mp.start();
            }
        });

        Button stop = (Button) getActivity().findViewById(R.id.stopper3);
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

    @Override
    public void onPause() {
        super.onPause();
        stopPlaying();
    }
}
