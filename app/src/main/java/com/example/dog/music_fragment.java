package com.example.dog;

import android.content.Context;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.SeekBar;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link music_fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class music_fragment extends Fragment {


    ImageButton bt,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12;
    SeekBar mSeekBar;
    AudioManager audioManager;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public music_fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment music_fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static music_fragment newInstance(String param1, String param2) {
        music_fragment fragment = new music_fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);


        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_music, container, false);


        audioManager = (AudioManager) getActivity().getSystemService(Context.AUDIO_SERVICE);

        int maxVolume = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        int currentVolume = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);

        mSeekBar = (SeekBar) view.findViewById(R.id.seekbar);
        mSeekBar.setMax(maxVolume);
        mSeekBar.setProgress(currentVolume);






        final MediaPlayer mp = MediaPlayer.create (getContext(), R.raw.night);
        bt = (ImageButton) view.findViewById(R.id.imageButton1);
        final MediaPlayer mp2 = MediaPlayer.create (getContext(), R.raw.firecamp);
        bt2 = (ImageButton) view.findViewById(R.id.imageButton2);
        final MediaPlayer mp3 = MediaPlayer.create (getContext(), R.raw.stream);
        bt3 = (ImageButton) view.findViewById(R.id.imageButton3);
        final MediaPlayer mp4 = MediaPlayer.create (getContext(), R.raw.train);
        bt4 = (ImageButton) view.findViewById(R.id.imageButton4);
        final MediaPlayer mp5 = MediaPlayer.create (getContext(), R.raw.wind);
        bt5 = (ImageButton) view.findViewById(R.id.imageButton5);
        final MediaPlayer mp6 = MediaPlayer.create (getContext(), R.raw.rain);
        bt6 = (ImageButton) view.findViewById(R.id.imageButton6);
        final MediaPlayer mp7 = MediaPlayer.create (getContext(), R.raw.forest);
        bt7 = (ImageButton) view.findViewById(R.id.imageButton7);
        final MediaPlayer mp8 = MediaPlayer.create (getContext(), R.raw.pub);
        bt8 = (ImageButton) view.findViewById(R.id.imageButton8);
        final MediaPlayer mp9 = MediaPlayer.create (getContext(), R.raw.forest);
        bt9 = (ImageButton) view.findViewById(R.id.imageButton9);
        final MediaPlayer mp10 = MediaPlayer.create (getContext(), R.raw.waves);
        bt10 = (ImageButton) view.findViewById(R.id.imageButton10);
        final MediaPlayer mp11 = MediaPlayer.create (getContext(), R.raw.heart);
        bt11 = (ImageButton) view.findViewById(R.id.imageButton11);
        final MediaPlayer mp12 = MediaPlayer.create (getContext(), R.raw.car);
        bt12 = (ImageButton) view.findViewById(R.id.imageButton12);


        mSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, i, 0);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mp.isPlaying()) {
                    mp.pause();
                }   else {
                    mp.start();
                }

            }



        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mp2.isPlaying()) {
                    mp2.pause();
                }   else {
                    mp2.start();
                }
            }



        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mp3.isPlaying()) {
                    mp3.pause();
                }   else {
                    mp3.start();
                }
            }



        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mp4.isPlaying()) {
                    mp4.pause();
                }   else {
                    mp4.start();
                }
            }



        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mp5.isPlaying()) {
                    mp5.pause();
                }   else {
                    mp5.start();
                }
            }



        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mp6.isPlaying()) {
                    mp6.pause();
                }   else {
                    mp6.start();
                }
            }



        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mp7.isPlaying()) {
                    mp7.pause();
                }   else {
                    mp7.start();
                }
            }



        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mp8.isPlaying()) {
                    mp8.pause();
                }   else {
                    mp8.start();
                }
            }



        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mp9.isPlaying()) {
                    mp9.pause();
                }   else {
                    mp9.start();
                }
            }



        });
        bt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mp10.isPlaying()) {
                    mp10.pause();
                }   else {
                    mp10.start();
                }
            }



        });

        bt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mp11.isPlaying()) {
                    mp11.pause();
                }   else {
                    mp11.start();
                }
            }



        });

        bt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mp12.isPlaying()) {
                    mp12.pause();
                }   else {
                    mp12.start();
                }
            }
        });


        return view;

    }









}
