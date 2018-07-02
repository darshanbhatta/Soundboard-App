package com.darshan.ugandanknucklessoundboard;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;

public class devInfo extends Fragment {
    private SoundPool sp = new SoundPool(20, AudioManager.STREAM_MUSIC, 20);

    public final class DownloadFilesTask extends AsyncTask<String, String, String> {
        protected String doInBackground(String... args) {
            sp.load(getActivity(), R.raw.blueknuckles, 1);
            sp.load(getActivity(), R.raw.clicking, 2);
            sp.load(getActivity(), R.raw.clickingtwo, 3);
            sp.load(getActivity(), R.raw.clickingthree, 4);
            sp.load(getActivity(), R.raw.clickingfour, 5);
            sp.load(getActivity(), R.raw.clickingfive, 6);
            sp.load(getActivity(), R.raw.dancemybrothers, 7);
            sp.load(getActivity(), R.raw.devilisonourside, 8);
            sp.load(getActivity(), R.raw.doyouknowthewayofthedevil, 9);
            sp.load(getActivity(), R.raw.doyouknowtheway, 10);
            sp.load(getActivity(), R.raw.doyouknowthewaytwo, 11);
            sp.load(getActivity(), R.raw.doyouknowthewaythree, 12);
            sp.load(getActivity(), R.raw.ebolatoknowtheway, 13);
            sp.load(getActivity(), R.raw.iknowtheway, 14);
            sp.load(getActivity(), R.raw.letusconquer, 15);
            sp.load(getActivity(), R.raw.meandmybrothersknowtheway, 16);
            sp.load(getActivity(), R.raw.messwithusandwewillspit, 17);
            sp.load(getActivity(), R.raw.mybrother, 18);
            sp.load(getActivity(), R.raw.notthequeen, 19);
            sp.load(getActivity(), R.raw.ohmygod, 20);
            sp.load(getActivity(), R.raw.smellslikeebola, 21);
            sp.load(getActivity(), R.raw.sniff, 22);
            sp.load(getActivity(), R.raw.snifftwo, 23);
            sp.load(getActivity(), R.raw.sniffthree, 24);
            sp.load(getActivity(), R.raw.spit, 25);
            sp.load(getActivity(), R.raw.ugandawarrior, 26);
            sp.load(getActivity(), R.raw.wemustprayforthisone, 27);
            sp.load(getActivity(), R.raw.whereisthecommander, 28);
            sp.load(getActivity(), R.raw.whyareyourunning, 29);
            sp.load(getActivity(), R.raw.youarethenewcommander, 30);

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

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.activity_dev_info, container, false);
        devInfo.DownloadFilesTask myAsyncTasks = new devInfo.DownloadFilesTask();
        myAsyncTasks.execute();
        final Button lilP = (Button) view.findViewById(R.id.imageView74);
        ImageButton share = (ImageButton) view.findViewById(R.id.imageButton);
        ImageButton rate = (ImageButton) view.findViewById(R.id.imageButton1);
        Button suges = (Button) view.findViewById(R.id.suggetion);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String shareBody = "Hey try out the funny Ugandan Knuckles soundboard app! http://bit.ly/2mDEBiq";
                String shareSub = "Check out this funny app!";
                myIntent.putExtra(Intent.EXTRA_SUBJECT, shareBody);
                myIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(myIntent, "Share using"));
            }
        });

        rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("market://details?id=" + getActivity().getPackageName());
                Intent myAppLinkToMarket = new Intent(Intent.ACTION_VIEW, uri);
                try {
                    startActivity(myAppLinkToMarket);
                } catch (ActivityNotFoundException e) {
                    Toast.makeText(getActivity().getApplicationContext(), " unable to find market app", Toast.LENGTH_LONG).show();
                }
            }
        });

        final ArrayList<Integer> image = new ArrayList<>();
        image.add(R.drawable.about_pic);
        image.add(R.drawable.about_pic_click);
        final int[] count = {0};
        lilP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count[0]++;

                int num = (int) (Math.random() * (30));
                sp.play(num, 1, 1, 0, 0, 1);

                lilP.setBackgroundResource(image.get(1));
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        /* Create an Intent that will start the Menu-Activity. */

                        lilP.setBackgroundResource(image.get(0));
                    }
                }, 200);


            }

        });
        suges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://goo.gl/forms/N7N3woSZBMWPsnsT2");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


        return view;

    }

    public static devInfo newInstance() {


        devInfo fragment = new devInfo();

        return fragment;
    }

}
