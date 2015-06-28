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
public class MLG extends Fragment {

    private MediaPlayer mp;

    public MLG() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mlg, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        Button sad4me = (Button) getActivity().findViewById(R.id.Sad4Me2);
        sad4me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(), R.raw.sad4me);
                mp.start();
            }
        });

        Button air = (Button) getActivity().findViewById(R.id.airHorn);
        air.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(), R.raw.airhorn);
                mp.start();
            }
        });

        Button Damn = (Button) getActivity().findViewById(R.id.DamnSon);
        Damn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(),R.raw.damn_son_where_you_find_this);
                mp.start();
            }
        });

        Button Darude = (Button) getActivity().findViewById(R.id.Darude);
        Darude.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(),R.raw.darude_darkstorm);
                mp.start();
            }
        });

        Button mom = (Button) getActivity().findViewById(R.id.Mom_Camera);
        mom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(),R.raw.mom_get_the_camera);
                mp.start();
            }
        });

        Button triple = (Button) getActivity().findViewById(R.id.triple);
        triple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(),R.raw.oh_baby_a_triple);
                mp.start();
            }
        });

        Button trick = (Button) getActivity().findViewById(R.id.trickshot);
        trick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(),R.raw.omg_trickshot);
                mp.start();
            }
        });

        Button omg = (Button) getActivity().findViewById(R.id.OMG);
        omg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(),R.raw.omg);
                mp.start();
            }
        });

        Button sanic = (Button) getActivity().findViewById(R.id.Sanic);
        sanic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(),R.raw.sanic);
                mp.start();
            }
        });

        Button swamp = (Button) getActivity().findViewById(R.id.swamp);
        swamp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(),R.raw.shrek_swamp);
                mp.start();
            }
        });

        Button sike = (Button) getActivity().findViewById(R.id.Sike);
        sike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(),R.raw.sike_thats_the_wrong_number);
                mp.start();
            }
        });

        Button skrillex = (Button) getActivity().findViewById(R.id.skrillex);
        skrillex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(),R.raw.skrillex_scary);
                mp.start();
            }
        });

        Button smoke = (Button) getActivity().findViewById(R.id.Smoke);
        smoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(),R.raw.smoke_weed_everyday);
                mp.start();
            }
        });

        Button skeleton = (Button) getActivity().findViewById(R.id.skeleton);
        skeleton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(),R.raw.spooky_scary_skeleton);
                mp.start();
            }
        });

        Button nuke = (Button) getActivity().findViewById(R.id.nuke);
        nuke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(),R.raw.tactical_nuke);
                mp.start();
            }
        });

        Button whatcha = (Button) getActivity().findViewById(R.id.Whatcha);
        whatcha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(),R.raw.whatcha_say);
                mp.start();
            }
        });

        Button wombo = (Button) getActivity().findViewById(R.id.Wombo);
        wombo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(),R.raw.wombo_combo);
                mp.start();
            }
        });

        Button wow = (Button) getActivity().findViewById(R.id.wow);
        wow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(), R.raw.wow);
                mp.start();
            }
        });

        Button hitmarker = (Button) getActivity().findViewById(R.id.hitmarker);
        hitmarker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(), R.raw.cod_hitmarker);
                mp.start();

            }
        });

        Button bruh = (Button) getActivity().findViewById(R.id.bruh);
        bruh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(), R.raw.bruh);
                mp.start();
            }
        });

        Button noscope = (Button) getActivity().findViewById(R.id.no_scope);
        noscope.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(getActivity(), R.raw.no_scope);
                mp.start();
            }
        });


        Button stop = (Button) getActivity().findViewById(R.id.stopper2);
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
