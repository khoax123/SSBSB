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
public class Dota extends Fragment {

    private MediaPlayer mp;

    public Dota() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dota, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        Button first_blood = (Button) getActivity().findViewById(R.id.FrtBlood);
        first_blood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(), R.raw.firstblood);
                mp.start();
            }
        });

        Button double_kill = (Button) getActivity().findViewById(R.id.doukill);
        double_kill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(),R.raw.double_kill);
                mp.start();
            }
        });

        Button triple_kill = (Button) getActivity().findViewById(R.id.trikill);
        triple_kill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(), R.raw.triple_kill);
                mp.start();
            }
        });

        Button kill_spree = (Button) getActivity().findViewById(R.id.kill_spree);
        kill_spree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(),R.raw.killing_spree);
                mp.start();
            }
        });

        Button domi = (Button) getActivity().findViewById(R.id.dominating);
        domi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(),R.raw.dominating);
                mp.start();
            }
        });

        Button mega = (Button) getActivity().findViewById(R.id.mega_kill);
        mega.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(), R.raw.megakill);
                mp.start();
            }
        });

        Button unstop = (Button) getActivity().findViewById(R.id.unstoppable);
        unstop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(),R.raw.unstoppable);
                mp.start();
            }
        });

        Button wicked = (Button) getActivity().findViewById(R.id.wicked);
        wicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(),R.raw.whicked_sick);
                mp.start();
            }
        });

        Button monster = (Button) getActivity().findViewById(R.id.monster);
        monster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(),R.raw.monster_kill);
                mp.start();
            }
        });

        Button godlike = (Button) getActivity().findViewById(R.id.godlike);
       godlike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(),R.raw.godlike);
                mp.start();
            }
        });

        Button holy = (Button) getActivity().findViewById(R.id.holy);
        holy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(),R.raw.holyshit);
                mp.start();
            }
        });

        Button headshot = (Button) getActivity().findViewById(R.id.headshot);
        headshot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(), R.raw.headshot);
                mp.start();
            }
        });


        Button stop = (Button) getActivity().findViewById(R.id.stopper4);
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
