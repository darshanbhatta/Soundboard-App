package com.darshan.ugandanknucklessoundboard;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.AsyncTaskLoader;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


import com.orhanobut.dialogplus.DialogPlus;
import com.orhanobut.dialogplus.OnItemClickListener;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.jar.Attributes;

/**
 * Created by Darshan on 12/3/2017.
 */

public class Tab1Act extends Fragment {
    private static final String TAG = "Normal";
    private SoundPool sp = new SoundPool(20, AudioManager.STREAM_MUSIC, 20);

    public final class DownloadFilesTask extends AsyncTask<String ,String,String>{
        protected String doInBackground(String ... args) {
            sp.load(getActivity(), R.raw.blueknuckles,1);
            sp.load(getActivity(),R.raw.clicking,2);
            sp.load(getActivity(),R.raw.clickingtwo,3);
            sp.load(getActivity(),R.raw.clickingthree,4);
            sp.load(getActivity(),R.raw.clickingfour,5);
            sp.load(getActivity(),R.raw.clickingfive,6);
            sp.load(getActivity(),R.raw.dancemybrothers,7);
            sp.load(getActivity(),R.raw.devilisonourside,8);
            sp.load(getActivity(),R.raw.doyouknowthewayofthedevil,9);
            sp.load(getActivity(),R.raw.doyouknowtheway,10);
            sp.load(getActivity(),R.raw.doyouknowthewaytwo,11);
            sp.load(getActivity(),R.raw.doyouknowthewaythree,12);
            sp.load(getActivity(),R.raw.ebolatoknowtheway,13);
            sp.load(getActivity(),R.raw.iknowtheway,14);
            sp.load(getActivity(),R.raw.letusconquer,15);
            sp.load(getActivity(),R.raw.meandmybrothersknowtheway,16);
            sp.load(getActivity(),R.raw.messwithusandwewillspit,17);
            sp.load(getActivity(),R.raw.mybrother,18);
            sp.load(getActivity(),R.raw.notthequeen,19);
            sp.load(getActivity(),R.raw.ohmygod,20);
            sp.load(getActivity(),R.raw.smellslikeebola,21);
            sp.load(getActivity(),R.raw.sniff,22);
            sp.load(getActivity(),R.raw.snifftwo,23);
            sp.load(getActivity(),R.raw.sniffthree,24);
            sp.load(getActivity(),R.raw.spit,25);
            sp.load(getActivity(),R.raw.ugandawarrior,26);
            sp.load(getActivity(),R.raw.wemustprayforthisone,27);
            sp.load(getActivity(),R.raw.whereisthecommander,28);
            sp.load(getActivity(),R.raw.whyareyourunning,29);
            sp.load(getActivity(),R.raw.youarethenewcommander,30);

// code that will run in the background


            return null;
        }

        protected void onProgressUpdate(Integer... progress) {
// receive progress updates from doInBackground
        }

        protected void onPostExecute(Long result) {


// update the UI after background processes completes
        }
    }


    int soundID;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

final MainActivity x = (MainActivity)getActivity();
        final View view = inflater.inflate(R.layout.fragment_normal, container, false);
        Tab1Act.DownloadFilesTask myAsyncTasks = new Tab1Act.DownloadFilesTask();
        myAsyncTasks.execute();
        final Button mRandom = (Button) view.findViewById(R.id.randomBtn);
        final Button mButton0 = (Button) view.findViewById(R.id.button0);
        final Button mButton1 = (Button) view.findViewById(R.id.button1);
        final Button mButton2 = (Button) view.findViewById(R.id.button2);

        final Button mButton3 = (Button) view.findViewById(R.id.button3);
        final Button mButton4 = (Button) view.findViewById(R.id.button4);
        final Button mButton5 = (Button) view.findViewById(R.id.button5);
        final Button mButton6 = (Button) view.findViewById(R.id.button6);
        final Button mButton7 = (Button) view.findViewById(R.id.button7);
        final Button mButton8 = (Button) view.findViewById(R.id.button8);
        final Button mButton9 = (Button) view.findViewById(R.id.button9);
        final Button mButton10 = (Button) view.findViewById(R.id.button10);
        final Button mButton11 = (Button) view.findViewById(R.id.button11);
        final Button mButton12 = (Button) view.findViewById(R.id.button12);
        final Button mButton13 = (Button) view.findViewById(R.id.button13);
        final Button mButton14 = (Button) view.findViewById(R.id.button14);
        final Button mButton15 = (Button) view.findViewById(R.id.button15);
        final Button mButton16 = (Button) view.findViewById(R.id.button16);
        final Button mButton17 = (Button) view.findViewById(R.id.button17);
        final Button mButton18 = (Button) view.findViewById(R.id.button18);
        final Button mButton19 = (Button) view.findViewById(R.id.button19);
        final Button mButton20 = (Button) view.findViewById(R.id.button20);
        final Button mButton21 = (Button) view.findViewById(R.id.button21);
        final Button mButton22 = (Button) view.findViewById(R.id.button22);
        final Button mButton23 = (Button) view.findViewById(R.id.button23);
        final Button mButton24 = (Button) view.findViewById(R.id.button24);
        final Button mButton25 = (Button) view.findViewById(R.id.button25);
        final Button mButton26 = (Button) view.findViewById(R.id.button26);
        final Button mButton27 = (Button) view.findViewById(R.id.button27);
        final Button mButton28 = (Button) view.findViewById(R.id.button28);
        final Button mButton29 = (Button) view.findViewById(R.id.button29);
        mButton0.setText("BLUE KNUCKLES");
        mButton1.setText("CLICKING");
        mButton2.setText("CLICKING 2");
        mButton3.setText("CLICKING 3");
        mButton4.setText("CLICKING 4");
        mButton5.setText("CLICKING 5");
        mButton6.setText("DANCE MY BROS");
        mButton7.setText("DEVIL IS ON OUR SIDE");
        mButton8.setText("DO YOU KNOW DE WEY OF THE DEVIL");
        mButton9.setText("DO YOU KNOW DE WEY");
        mButton10.setText("DO YOU KNOW DE WEY 2");
        mButton11.setText("DO YOU KNOW DE WEY 3");
        mButton12.setText("NEED EBOLA TO KNOW DEY WEY");
        mButton13.setText("I KNOW DE WEY");
        mButton14.setText("LET US CONQUER");
        mButton15.setText("MY BROS KNOW DE WAY");
        mButton16.setText("MESS WITH US AND WE WILL SPIT");
        mButton17.setText("MY BROTHER");
        mButton18.setText("NOT THE QUEEN");
        mButton19.setText("OH MY GOD");
        mButton20.setText("SMELLS LIKE EBOLA");
        mButton21.setText("SNIFF");
        mButton22.setText("SNIFF 2");
        mButton23.setText("SNIFF 3");
        mButton24.setText("SPIT");
        mButton25.setText("UGANDA WARRIOR");
        mButton26.setText("WE MUST PRAY FOR THIS ONE");
        mButton27.setText("WHERE IS CMDR");
        mButton28.setText("WHY ARE YOU RUNNING");
        mButton29.setText("YOU ARE THE NEW CMDR");
















        View.OnClickListener listener = new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Random rnd = new Random();
                int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));

                if (v.equals(mRandom)) {
                    int num = (int) (Math.random() * (30));
                    sp.play(num,1,1,0,0,1);
mRandom.setBackgroundColor(color);

                } else if (v.equals(mButton0)) {
                    sp.play(1,1,1,0,0,1);
                    mButton0.setBackgroundColor(color);


                } else if (v.equals(mButton1)) {
                    sp.play(2,1,1,0,0,1);mButton1.setBackgroundColor(color);
                } else if (v.equals(mButton2)) {
                    sp.play(3,1,1,0,0,1);mButton2.setBackgroundColor(color);
                } else if (v.equals(mButton3)) {
                    sp.play(4,1,1,0,0,1);mButton3.setBackgroundColor(color);

                } else if (v.equals(mButton4)) {
                    sp.play(5,1,1,0,0,1);mButton4.setBackgroundColor(color);
                } else if (v.equals(mButton5)) {
                    sp.play(6,1,1,0,0,1);mButton5.setBackgroundColor(color);
                } else if (v.equals(mButton6)) {
                    sp.play(7,1,1,0,0,1);mButton6.setBackgroundColor(color);
                } else if (v.equals(mButton7)) {
                    sp.play(8,1,1,0,0,1);mButton7.setBackgroundColor(color);
                } else if (v.equals(mButton8)) {
                    sp.play(9,1,1,0,0,1);mButton8.setBackgroundColor(color);
                } else if (v.equals(mButton9)) {
                    sp.play(10,1,1,0,0,1);mButton9.setBackgroundColor(color);
                } else if (v.equals(mButton10)) {
                    sp.play(11,1,1,0,0,1);mButton10.setBackgroundColor(color);
                } else if (v.equals(mButton11)) {
                    sp.play(12,1,1,0,0,1);mButton11.setBackgroundColor(color);
                } else if (v.equals(mButton12)) {
                    sp.play(13,1,1,0,0,1);mButton12.setBackgroundColor(color);
                } else if (v.equals(mButton13)) {
                    sp.play(14,1,1,0,0,1);mButton13.setBackgroundColor(color);
                } else if (v.equals(mButton14)) {
                    sp.play(15,1,1,0,0,1);mButton14.setBackgroundColor(color);
                } else if (v.equals(mButton15)) {
                    sp.play(16,1,1,0,0,1);mButton15.setBackgroundColor(color);
                } else if (v.equals(mButton16)) {
                    sp.play(17,1,1,0,0,1);mButton16.setBackgroundColor(color);
                } else if (v.equals(mButton17)) {
                    sp.play(18,1,1,0,0,1);mButton17.setBackgroundColor(color);
                } else if (v.equals(mButton18)) {
                    sp.play(19,1,1,0,0,1);mButton18.setBackgroundColor(color);
                } else if (v.equals(mButton19)) {
                    sp.play(20,1,1,0,0,1);mButton19.setBackgroundColor(color);
                } else if (v.equals(mButton20)) {
                    sp.play(21,1,1,0,0,1);mButton20.setBackgroundColor(color);
                } else if (v.equals(mButton21)) {
                    sp.play(22,1,1,0,0,1);mButton21.setBackgroundColor(color);
                }
            else if (v.equals(mButton22)) {
                    sp.play(23,1,1,0,0,1);mButton22.setBackgroundColor(color);
                } else if (v.equals(mButton23)) {
                    sp.play(24,1,1,0,0,1);mButton23.setBackgroundColor(color);
                } else if (v.equals(mButton24)) {
                    sp.play(25,1,1,0,0,1);mButton24.setBackgroundColor(color);
                } else if (v.equals(mButton25)) {
                    sp.play(26,1,1,0,0,1);mButton25.setBackgroundColor(color);
                } else if (v.equals(mButton26)) {
                    sp.play(27,1,1,0,0,1);mButton26.setBackgroundColor(color);
                } else if (v.equals(mButton27)) {
                    sp.play(28,1,1,0,0,1);mButton27.setBackgroundColor(color);
                } else if (v.equals(mButton28)) {
                    sp.play(29,1,1,0,0,1);mButton28.setBackgroundColor(color);
                } else if (v.equals(mButton29)) {
                    sp.play(30,1,1,0,0,1);mButton29.setBackgroundColor(color);
                }


            }

        };
        mRandom.setOnClickListener(listener);
        mButton0.setOnClickListener(listener);
        mButton1.setOnClickListener(listener);
        mButton2.setOnClickListener(listener);
        mButton3.setOnClickListener(listener);
        mButton4.setOnClickListener(listener);
        mButton5.setOnClickListener(listener);
        mButton6.setOnClickListener(listener);
        mButton7.setOnClickListener(listener);
        mButton8.setOnClickListener(listener);
        mButton9.setOnClickListener(listener);
        mButton10.setOnClickListener(listener);
        mButton11.setOnClickListener(listener);
        mButton12.setOnClickListener(listener);
        mButton13.setOnClickListener(listener);
        mButton14.setOnClickListener(listener);
        mButton15.setOnClickListener(listener);
        mButton16.setOnClickListener(listener);
        mButton17.setOnClickListener(listener);
        mButton18.setOnClickListener(listener);
        mButton19.setOnClickListener(listener);
        mButton20.setOnClickListener(listener);
        mButton21.setOnClickListener(listener);
        mButton22.setOnClickListener(listener);
        mButton23.setOnClickListener(listener);
        mButton24.setOnClickListener(listener);
        mButton25.setOnClickListener(listener);
        mButton26.setOnClickListener(listener);
        mButton27.setOnClickListener(listener);
        mButton28.setOnClickListener(listener);
        mButton29.setOnClickListener(listener);

        mButton0.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

x.showDialog(3,Gravity.CENTER,false,false,false,0);


                return true;
            }
        });
        mButton1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                //Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3,Gravity.CENTER,false,false,false,1);
                return true;
            }
        });
        mButton2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
              //  Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3,Gravity.CENTER,false,false,false,2);
                return true;
            }
        });
        mButton3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
             //   Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3,Gravity.CENTER,false,false,false,3);
                return true;
            }
        });
        mButton4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
             //   Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3,Gravity.CENTER,false,false,false,4);
                return true;
            }
        });
        mButton5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
             //   Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3,Gravity.CENTER,false,false,false,5);
                return true;
            }
        });mButton6.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                x.showDialog(3,Gravity.CENTER,false,false,false,6);

             //   Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        mButton7.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
             //   Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3,Gravity.CENTER,false,false,false,7);

                return true;
            }
        });
        mButton8.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
             //   Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3,Gravity.CENTER,false,false,false,8);

                return true;
            }
        });
        mButton9.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
             //   Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3,Gravity.CENTER,false,false,false,9);

                return true;
            }
        });
        mButton10.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
               // Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3,Gravity.CENTER,false,false,false,10);

                return true;
            }
        });
        mButton11.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
              //  Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3,Gravity.CENTER,false,false,false,11);

                return true;
            }
        });
        mButton12.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
             //   Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3,Gravity.CENTER,false,false,false,12);

                return true;
            }
        });
        mButton13.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
             //   Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3,Gravity.CENTER,false,false,false,13);

                return true;
            }
        });
        mButton14.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
             //   Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3,Gravity.CENTER,false,false,false,14);
                return true;
            }
        });
        mButton15.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
             //   Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3,Gravity.CENTER,false,false,false,15);
                return true;
            }
        });
        mButton16.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
              //  Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3,Gravity.CENTER,false,false,false,16);
                return true;
            }
        });mButton17.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
             //   Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3,Gravity.CENTER,false,false,false,17);
                return true;
            }
        });
        mButton18.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
             //   Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3,Gravity.CENTER,false,false,false,18);
                return true;
            }
        });
        mButton19.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
             //   Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3,Gravity.CENTER,false,false,false,19);
                return true;
            }
        });
        mButton20.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
              //  Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3,Gravity.CENTER,false,false,false,20);
                return true;
            }
        });
        mButton21.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
             //   Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3,Gravity.CENTER,false,false,false,21);
                return true;
            }
        });
        mButton22.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
             //   Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3,Gravity.CENTER,false,false,false,22);
                return true;
            }
        });
        mButton23.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
             //   Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3,Gravity.CENTER,false,false,false,23);
                return true;
            }
        });
        mButton24.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
              //  Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3,Gravity.CENTER,false,false,false,24);
                return true;
            }
        });
        mButton25.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
             //   Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3,Gravity.CENTER,false,false,false,25);
                return true;
            }
        });
        mButton26.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
             //   Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3,Gravity.CENTER,false,false,false,26);
                return true;
            }
        });
        mButton27.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
             //   Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3,Gravity.CENTER,false,false,false,27);
                return true;
            }
        });
        mButton28.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
             //   Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3,Gravity.CENTER,false,false,false,28);
                return true;
            }
        });
        mButton29.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
              //  Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3,Gravity.CENTER,false,false,false,29);
                return true;
            }
        });


return view;
    }
    public static Tab1Act newInstance() {


        Tab1Act fragment = new Tab1Act();

        return fragment;
    }





}

