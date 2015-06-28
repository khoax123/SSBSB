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
public class Rand extends Fragment {

    private MediaPlayer mp;



    public Rand() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rand, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        Button joker_button = (Button) getActivity().findViewById(R.id.joker);
        joker_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(), R.raw.jokers);
                mp.start();
            }
        });

        Button backslash_button = (Button) getActivity().findViewById(R.id.backslash);
        backslash_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(),R.raw.backslash);
                mp.start();
            }
        });

        Button ffvfanfare = (Button) getActivity().findViewById(R.id.fffanfare);
        ffvfanfare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(),R.raw.victory_fanfare);
                mp.start();
            }
        });

        Button get_item = (Button) getActivity().findViewById(R.id.get_item);
        get_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(),R.raw.get_item);
                mp.start();
            }
        });

        Button m_death = (Button) getActivity().findViewById(R.id.m_death);
        m_death.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(), R.raw.smb_mariodie);
                mp.start();
            }
        });

        Button wasnt_ready = (Button) getActivity().findViewById(R.id.wasnt_ready);
        wasnt_ready.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(), R.raw.she_wasnt_ready);
                mp.start();
            }
        });

        Button ricked_rolled = (Button) getActivity().findViewById(R.id.ricked_rolled);
        ricked_rolled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(), R.raw.ricked_rolled);
                mp.start();
            }
        });

        Button western = (Button) getActivity().findViewById(R.id.western_whistle);
        western.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(), R.raw.western_whistle);
                mp.start();
            }
        });

        Button dramatic = (Button) getActivity().findViewById(R.id.dramatic);
        dramatic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(), R.raw.dramatic_sound);
                mp.start();
            }
        });

        Button drums = (Button) getActivity().findViewById(R.id.drums);
        drums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(), R.raw.drum_roll);
                mp.start();
            }
        });

        Button dowewin = (Button) getActivity().findViewById(R.id.do_we_win);
        dowewin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(), R.raw.do_we_win);
                mp.start();
            }
        });

        Button fatality = (Button) getActivity().findViewById(R.id.fatality);
        fatality.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(), R.raw.fatality);
                mp.start();
            }
        });

        Button finish_him = (Button) getActivity().findViewById(R.id.finish_him);
        finish_him.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(), R.raw.finish_him);
                mp.start();
            }
        });

        Button toasty = (Button) getActivity().findViewById(R.id.toasty);
        toasty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(), R.raw.toasty);
                mp.start();
            }
        });

        Button ding = (Button) getActivity().findViewById(R.id.Ding);
        ding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(), R.raw.ding);
                mp.start();
            }
        });

        Button buzzer = (Button) getActivity().findViewById(R.id.Buzzer);
        buzzer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(), R.raw.buzzer);
                mp.start();
            }
        });


        Button illuminati = (Button) getActivity().findViewById(R.id.illuminati);
        illuminati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(), R.raw.illuminati);
                mp.start();
            }
        });

        Button let_them_fight = (Button) getActivity().findViewById(R.id.let_them_fight);
        let_them_fight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(), R.raw.let_them_fight);
                mp.start();
            }
        });

        Button hax = (Button) getActivity().findViewById(R.id.HAX);
        hax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(), R.raw.hax);
                mp.start();
            }
        });

        Button over_9000 = (Button) getActivity().findViewById(R.id.over_9000);
        over_9000.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(), R.raw.over_9000);
                mp.start();
            }
        });


        Button hotel_bell = (Button) getActivity().findViewById(R.id.bell);
        hotel_bell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                stopPlaying();
                mp = MediaPlayer.create(getActivity(), R.raw.hotel_bell);
                mp.start();

            }
        });


        Button stop = (Button) getActivity().findViewById(R.id.stopper5);
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
