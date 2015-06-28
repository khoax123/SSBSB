package com.khoax123.ssbsb;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Epic extends Fragment {

    private MediaPlayer mp;


    public Epic() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_epic, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Button sad4me = (Button) getActivity().findViewById(R.id.Sad4Me);
        sad4me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();

                if (rickedRolled()) {
                    mp = MediaPlayer.create(getActivity(), R.raw.ricked_rolled);
                    mp.start();
                } else {
                    mp = MediaPlayer.create(getActivity(), R.raw.sad4me);
                    mp.start();
                }


            }
        });

        Button guile = (Button) getActivity().findViewById(R.id.guile);
        guile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                if(rickedRolled()) {
                    mp = MediaPlayer.create(getActivity(), R.raw.ricked_rolled);
                    mp.start();
                }
                else {
                mp = MediaPlayer.create(getActivity(),R.raw.guiles_theme);
                mp.start();
            }}
        });

        Button megaman = (Button) getActivity().findViewById(R.id.megaman);
        megaman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();

                if(rickedRolled()) {
                    mp = MediaPlayer.create(getActivity(), R.raw.ricked_rolled);
                    mp.start();
                }
                else {
                mp = MediaPlayer.create(getActivity(), R.raw.megaman2);
                mp.start();
            }}

        });


        Button sax = (Button) getActivity().findViewById(R.id.sax);
        sax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                if(rickedRolled()) {
                    mp = MediaPlayer.create(getActivity(), R.raw.ricked_rolled);
                    mp.start();
                }
                else {
                mp = MediaPlayer.create(getActivity(), R.raw.epic_sax_guy);
                mp.start();
            }}
        });

        Button benny = (Button) getActivity().findViewById(R.id.bennyhill);
        benny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                if(rickedRolled()) {
                    mp = MediaPlayer.create(getActivity(), R.raw.ricked_rolled);
                    mp.start();
                }
                else {
                mp = MediaPlayer.create(getActivity(), R.raw.bennyhill);
                mp.start();
            }}
        });

        Button sephiroth = (Button) getActivity().findViewById(R.id.sephiroth);
        sephiroth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                if(rickedRolled()) {
                    mp = MediaPlayer.create(getActivity(), R.raw.ricked_rolled);
                    mp.start();
                }
                else {
                mp = MediaPlayer.create(getActivity(), R.raw.one_winged_angel);
                mp.start();
            }}
        });

        Button swiggity = (Button) getActivity().findViewById(R.id.swiggity);
        swiggity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                if(rickedRolled()) {
                    mp = MediaPlayer.create(getActivity(), R.raw.ricked_rolled);
                    mp.start();
                }
                else {
                mp = MediaPlayer.create(getActivity(), R.raw.swigity_swag);
                mp.start();
            }}
        });

        Button lonely = (Button) getActivity().findViewById(R.id.lonely);
        lonely.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                if(rickedRolled()) {
                    mp = MediaPlayer.create(getActivity(), R.raw.ricked_rolled);
                    mp.start();
                }
                else {
                    mp = MediaPlayer.create(getActivity(), R.raw.lonely_souls);
                    mp.start();
                }}
        });

        Button where_the_hood = (Button) getActivity().findViewById(R.id.where_the_hood_at);
        where_the_hood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                if(rickedRolled()) {
                    mp = MediaPlayer.create(getActivity(), R.raw.ricked_rolled);
                    mp.start();
                }
                else {
                    mp = MediaPlayer.create(getActivity(), R.raw.where_the_hood_at);
                    mp.start();
                }}
        });



        Button stop = (Button) getActivity().findViewById(R.id.stopper1);
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

    private boolean rickedRolled() {
        float x = 1f;
        Log.d("Random", "" + x);
        if (x < 0.01) {
            return true;
        }
        else {
            return false;
        }
    }
}
