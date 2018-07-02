package com.darshan.ugandanknucklessoundboard;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;


/**
 * Created by Darshan on 12/3/2017.
 */

public class Tab2Act extends Fragment {

    private static final String TAG = "Favorites";
    private Button mButton0;
    private Button mButton1;
    private Button mButton2;
    private Button mButton16;
    private Button mButton3;
    private Button mButton4;
    private Button mButton5;
    private Button mButton6;
    private Button mButton7;
    private Button mButton8;
    private Button mButton9;
    private Button mButton10;
    private Button mButton11;
    private Button mButton12;
    private Button mButton13;
    private Button mButton14;
    private Button mButton15;
    private Button mButton17;
    private Button mButton18;
    private Button mButton19;
    private Button mButton20;
    private Button mButton21;
    private Button mButton22;
    private Button mButton23;
    private Button mButton24;
    private Button mButton25;
    private Button mButton26;
    private Button mButton27;
    private Button mButton28;
    private Button mButton29;
    private Button random;

    ArrayList<MediaPlayer> sp = new ArrayList();
    private ArrayList<String> all = new ArrayList();
    private ArrayList<String> alln = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        sp.add(MediaPlayer.create(getActivity(), R.raw.blueknuckles));
        sp.add(MediaPlayer.create(getActivity(), R.raw.clicking));
        sp.add(MediaPlayer.create(getActivity(), R.raw.clickingtwo));
        sp.add(MediaPlayer.create(getActivity(), R.raw.clickingthree));
        sp.add(MediaPlayer.create(getActivity(), R.raw.clickingfour));
        sp.add(MediaPlayer.create(getActivity(), R.raw.clickingfive));
        sp.add(MediaPlayer.create(getActivity(), R.raw.dancemybrothers));
        sp.add(MediaPlayer.create(getActivity(), R.raw.devilisonourside));
        sp.add(MediaPlayer.create(getActivity(), R.raw.doyouknowthewayofthedevil));
        sp.add(MediaPlayer.create(getActivity(), R.raw.doyouknowtheway));
        sp.add(MediaPlayer.create(getActivity(), R.raw.doyouknowthewaytwo));
        sp.add(MediaPlayer.create(getActivity(), R.raw.doyouknowthewaythree));
        sp.add(MediaPlayer.create(getActivity(), R.raw.ebolatoknowtheway));
        sp.add(MediaPlayer.create(getActivity(), R.raw.iknowtheway));
        sp.add(MediaPlayer.create(getActivity(), R.raw.letusconquer));
        sp.add(MediaPlayer.create(getActivity(), R.raw.meandmybrothersknowtheway));
        sp.add(MediaPlayer.create(getActivity(), R.raw.messwithusandwewillspit));
        sp.add(MediaPlayer.create(getActivity(), R.raw.mybrother));
        sp.add(MediaPlayer.create(getActivity(), R.raw.notthequeen));
        sp.add(MediaPlayer.create(getActivity(), R.raw.ohmygod));
        sp.add(MediaPlayer.create(getActivity(), R.raw.smellslikeebola));
        sp.add(MediaPlayer.create(getActivity(), R.raw.sniff));
        sp.add(MediaPlayer.create(getActivity(), R.raw.snifftwo));
        sp.add(MediaPlayer.create(getActivity(), R.raw.sniffthree));
        sp.add(MediaPlayer.create(getActivity(), R.raw.spit));
        sp.add(MediaPlayer.create(getActivity(), R.raw.ugandawarrior));
        sp.add(MediaPlayer.create(getActivity(), R.raw.wemustprayforthisone));
        sp.add(MediaPlayer.create(getActivity(), R.raw.whereisthecommander));
        sp.add(MediaPlayer.create(getActivity(), R.raw.whyareyourunning));
        sp.add(MediaPlayer.create(getActivity(), R.raw.youarethenewcommander));
        final MainActivity x = (MainActivity) (getActivity());

        alln = x.getEntitiesnotChange();
        all = x.getEntities();


        final View view = inflater.inflate(R.layout.fragment_favorites, container, false);
        random = (Button) view.findViewById(R.id.randomBtn1);
        FrameLayout layout = (FrameLayout) view.findViewById(R.id.frameLayout);
        final Button[] button = allButtons(view);
        //   Toast.makeText(getContext(),""+alln,Toast.LENGTH_SHORT).show();
        ArrayList<String> lister = text();
        int size = alln.size();

        if (size != 0) {

            for (int showingButton = 0; showingButton < size; showingButton++) {
                button[showingButton].setVisibility(View.VISIBLE);
                button[showingButton].setText(lister.get(Integer.parseInt(alln.get(showingButton))));

            }
            for (int showing = size; showing < 30; showing++) {
                button[showing].setVisibility(View.GONE);

            }
        } else {

            for (int showing = 0; showing < 30; showing++) {
                button[showing].setVisibility(View.GONE);

            }
        }





/*
        final Button mRandom = (Button) view.findViewById(R.id.randomBtn);
        final Button mButton0 = (Button) view.findViewById(R.id.Button0);
        final Button mButton1 = (Button) view.findViewById(R.id.Button1);
        final Button mButton2 = (Button) view.findViewById(R.id.Button2);

        final Button mButton3 = (Button) view.findViewById(R.id.Button3);
        final Button mButton4 = (Button) view.findViewById(R.id.Button4);
        final Button mButton5 = (Button) view.findViewById(R.id.Button5);
        final Button mButton6 = (Button) view.findViewById(R.id.Button6);
        final Button mButton7 = (Button) view.findViewById(R.id.Button7);
        final Button mButton8 = (Button) view.findViewById(R.id.Button8);
        final Button mButton9 = (Button) view.findViewById(R.id.Button9);
        final Button mButton10 = (Button) view.findViewById(R.id.Button10);
        final Button mButton11 = (Button) view.findViewById(R.id.Button11);
        final Button mButton12 = (Button) view.findViewById(R.id.Button12);
        final Button mButton13 = (Button) view.findViewById(R.id.Button13);
        final Button mButton14 = (Button) view.findViewById(R.id.Button14);
        final Button mButton15 = (Button) view.findViewById(R.id.Button15);
        final Button mButton16 = (Button) view.findViewById(R.id.Button16);
        final Button mButton17 = (Button) view.findViewById(R.id.Button17);
        final Button mButton18 = (Button) view.findViewById(R.id.Button18);
        final Button mButton19 = (Button) view.findViewById(R.id.Button19);
        final Button mButton20 = (Button) view.findViewById(R.id.Button20);
        final Button mButton21 = (Button) view.findViewById(R.id.Button21);
        final Button mButton22 = (Button) view.findViewById(R.id.Button22);
        final Button mButton23 = (Button) view.findViewById(R.id.Button23);
        final Button mButton24 = (Button) view.findViewById(R.id.Button24);
        final Button mButton25 = (Button) view.findViewById(R.id.Button25);
        final Button mButton26 = (Button) view.findViewById(R.id.Button26);
        final Button mButton27 = (Button) view.findViewById(R.id.Button27);
        final Button mButton28 = (Button) view.findViewById(R.id.Button28);
        final Button mButton29 = (Button) view.findViewById(R.id.Button29);
*/


        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                all = x.getEntities();
                random.setBackgroundColor(color());

                if (all.size() != 0) {
                    int x = getRandom(all);
                    sp.get(x).start();
                } else {
                    Toast.makeText(getActivity(), "ERROR NO SOUNDS IN FAVORITES", Toast.LENGTH_SHORT).show();

                }
            }
        });
        button[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.valueOf(alln.get(0));

                button[0].setBackgroundColor(color());
                sp.get(num).start();


            }
        });
        button[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.valueOf(alln.get(1));
                button[1].setBackgroundColor(color());

                sp.get(num).start();


            }
        });
        button[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.valueOf(alln.get(2));
                button[2].setBackgroundColor(color());

                sp.get(num).start();


            }
        });
        button[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.valueOf(alln.get(3));
                button[3].setBackgroundColor(color());

                sp.get(num).start();


            }
        });
        button[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.valueOf(alln.get(4));
                button[4].setBackgroundColor(color());

                sp.get(num).start();


            }
        });
        button[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.valueOf(alln.get(5));
                button[5].setBackgroundColor(color());
                sp.get(num).start();


            }
        });

        button[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.valueOf(alln.get(6));
                button[6].setBackgroundColor(color());

                sp.get(num).start();


            }
        });
        button[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.valueOf(alln.get(7));
                button[7].setBackgroundColor(color());

                sp.get(num).start();


            }
        });
        button[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.valueOf(alln.get(8));
                button[8].setBackgroundColor(color());

                sp.get(num).start();


            }
        });
        button[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.valueOf(alln.get(9));
                button[9].setBackgroundColor(color());

                sp.get(num).start();


            }
        });
        button[10].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.valueOf(alln.get(10));
                button[10].setBackgroundColor(color());

                sp.get(num).start();


            }
        });
        button[11].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.valueOf(alln.get(11));
                button[11].setBackgroundColor(color());

                sp.get(num).start();


            }
        });
        button[12].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.valueOf(alln.get(12));
                button[12].setBackgroundColor(color());

                sp.get(num).start();


            }
        });
        button[13].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.valueOf(alln.get(13));
                button[13].setBackgroundColor(color());

                sp.get(num).start();


            }
        });
        button[14].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.valueOf(alln.get(14));
                button[14].setBackgroundColor(color());
                sp.get(num).start();


            }
        });
        button[15].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.valueOf(alln.get(16));
                button[15].setBackgroundColor(color());
                sp.get(num).start();

            }
        });
        button[17].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.valueOf(alln.get(17));
                button[17].setBackgroundColor(color());
                sp.get(num).start();


            }
        });
        button[18].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.valueOf(alln.get(18));

                button[18].setBackgroundColor(color());
                sp.get(num).start();


            }
        });
        button[19].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.valueOf(alln.get(19));
                button[19].setBackgroundColor(color());

                sp.get(num).start();


            }
        });
        button[20].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.valueOf(alln.get(20));
                button[20].setBackgroundColor(color());

                sp.get(num).start();


            }
        });
        button[21].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.valueOf(alln.get(21));

                button[21].setBackgroundColor(color());
                sp.get(num).start();


            }
        });
        button[22].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.valueOf(alln.get(22));
                button[22].setBackgroundColor(color());

                sp.get(num).start();

            }
        });
        button[23].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.valueOf(alln.get(23));
                button[23].setBackgroundColor(color());
                sp.get(num).start();


            }
        });
        button[24].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.valueOf(alln.get(25));
                sp.get(num).start();
                button[24].setBackgroundColor(color());

            }
        });
        button[26].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.valueOf(alln.get(26));
                button[26].setBackgroundColor(color());

                sp.get(num).start();

            }
        });
        button[27].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.valueOf(alln.get(27));
                sp.get(num).start();
                button[27].setBackgroundColor(color());
            }
        });
        button[28].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.valueOf(alln.get(28));
                button[28].setBackgroundColor(color());
                sp.get(num).start();

                button[1].setBackgroundColor(color());
            }
        });
        button[29].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.valueOf(alln.get(29));
                button[29].setBackgroundColor(color());
                sp.get(num).start();


            }
        });
        button[25].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.valueOf(alln.get(25));
                button[25].setBackgroundColor(color());
                sp.get(num).start();


            }
        });
        button[16].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.valueOf(alln.get(16));
                button[16].setBackgroundColor(color());
                sp.get(num).start();


            }
        });


        this.viewe = view;

        return view;


    }

    public static Tab2Act newInstance() {


        Tab2Act fragment = new Tab2Act();

        return fragment;
    }

    public ArrayList<String> text() {
        ArrayList<String> man = new ArrayList<String>();

        man.add("BLUE KNUCKLES ");
        man.add("CLICKING ");
        man.add("CLICKING 2 ");
        man.add("CLICKING 3 ");
        man.add("CLICKING 4 ");
        man.add("CLICKING 5 ");
        man.add("DANCE MY BROS");
        man.add("DEVIL IS ON OUR SIDE ");
        man.add("DO YOU KNOW DE WEY OF THE DEVIL ");
        man.add("DO YOU KNOW DE WEY ");
        man.add("DO YOU KNOW DE WEY 2 ");
        man.add("DO YOU KNOW DE WEY 3 ");
        man.add("NEED EBOLA TO KNOW DE WEY ");
        man.add("I KNOW DEY WEY ");
        man.add("LET US CONQUER ");
        man.add("MY BROS KNOW DE WAY ");
        man.add("MESS WITH US AND SPIT ");
        man.add("MY BROTHER ");
        man.add("NOT THE QUEEN ");
        man.add("OH MY GOD ");
        man.add("SMELLS LIKE EBOLA ");
        man.add("SNIFF ");
        man.add("SNIFF 2 ");
        man.add("SNIFF 3 ");
        man.add("SPIT ");
        man.add("UGANDA WARRIOR ");
        man.add("WE MUST PRAY FOR THIS ONE ");
        man.add("WHERE IS CMDR ");
        man.add("WHY ARE YOU RUNNING ");
        man.add("YOU ARE THE NEW CMDR ");

        return man;
    }

    public Button[] allButtons(View view) {
        Button buttons[] = new Button[30];
        buttons[0] = view.findViewById(R.id.Button0);
        buttons[1] = view.findViewById(R.id.Button1);
        buttons[2] = view.findViewById(R.id.Button2);
        buttons[3] = view.findViewById(R.id.Button3);
        buttons[4] = view.findViewById(R.id.Button4);
        buttons[5] = view.findViewById(R.id.Button5);
        buttons[6] = view.findViewById(R.id.Button6);
        buttons[7] = view.findViewById(R.id.Button7);
        buttons[8] = view.findViewById(R.id.Button8);
        buttons[9] = view.findViewById(R.id.Button9);
        buttons[10] = view.findViewById(R.id.Button10);
        buttons[11] = view.findViewById(R.id.Button11);
        buttons[12] = view.findViewById(R.id.Button12);
        buttons[13] = view.findViewById(R.id.Button13);
        buttons[14] = view.findViewById(R.id.Button14);
        buttons[15] = view.findViewById(R.id.Button15);
        buttons[16] = view.findViewById(R.id.Button16);
        buttons[17] = view.findViewById(R.id.Button17);
        buttons[18] = view.findViewById(R.id.Button18);
        buttons[19] = view.findViewById(R.id.Button19);
        buttons[20] = view.findViewById(R.id.Button20);
        buttons[21] = view.findViewById(R.id.Button21);
        buttons[22] = view.findViewById(R.id.Button22);
        buttons[23] = view.findViewById(R.id.Button23);
        buttons[24] = view.findViewById(R.id.Button24);
        buttons[25] = view.findViewById(R.id.Button25);
        buttons[26] = view.findViewById(R.id.Button26);
        buttons[27] = view.findViewById(R.id.Button27);
        buttons[28] = view.findViewById(R.id.Button28);
        buttons[29] = view.findViewById(R.id.Button29);


        return buttons;
    }


    public void addButton(ArrayList all, int id, boolean addOrDelete) {

        if (addOrDelete) {

            ArrayList<String> ha = text();
            if (all.size() == 1) {
                mButton0.setVisibility(View.VISIBLE);
                mButton0.setText(ha.get(id));

            } else if (all.size() == 2) {

                mButton1.setVisibility(View.VISIBLE);
                mButton1.setText(ha.get(id));

            } else if (all.size() == 3) {
                mButton2.setVisibility(View.VISIBLE);
                mButton2.setText(ha.get(id));


            } else if (all.size() == 4) {
                mButton3.setVisibility(View.VISIBLE);
                mButton3.setText(ha.get(id));

            } else if (all.size() == 5) {
                mButton4.setVisibility(View.VISIBLE);
                mButton4.setText(ha.get(id));


            } else if (all.size() == 6) {
                mButton5.setVisibility(View.VISIBLE);
                mButton5.setText(ha.get(id));

            } else if (all.size() == 7) {
                mButton6.setVisibility(View.VISIBLE);
                mButton6.setText(ha.get(id));


            } else if (all.size() == 8) {
                mButton7.setVisibility(View.VISIBLE);
                mButton7.setText(ha.get(id));

            } else if (all.size() == 9) {
                mButton8.setVisibility(View.VISIBLE);
                mButton8.setText(ha.get(id));


            } else if (all.size() == 10) {
                mButton9.setVisibility(View.VISIBLE);
                mButton9.setText(ha.get(id));

            } else if (all.size() == 11) {

                mButton10.setVisibility(View.VISIBLE);
                mButton10.setText(ha.get(id));

            } else if (all.size() == 12) {
                mButton11.setVisibility(View.VISIBLE);
                mButton11.setText(ha.get(id));

            } else if (all.size() == 13) {
                mButton12.setVisibility(View.VISIBLE);
                mButton12.setText(ha.get(id));


            } else if (all.size() == 14) {
                mButton13.setVisibility(View.VISIBLE);
                mButton13.setText(ha.get(id));

            } else if (all.size() == 15) {
                mButton14.setVisibility(View.VISIBLE);
                mButton14.setText(ha.get(id));


            } else if (all.size() == 16) {
                mButton15.setVisibility(View.VISIBLE);
                mButton15.setText(ha.get(id));

            } else if (all.size() == 17) {
                mButton16.setVisibility(View.VISIBLE);
                mButton16.setText(ha.get(id));


            } else if (all.size() == 18) {
                mButton17.setVisibility(View.VISIBLE);
                mButton17.setText(ha.get(id));

            } else if (all.size() == 19) {
                mButton18.setVisibility(View.VISIBLE);
                mButton18.setText(ha.get(id));


            } else if (all.size() == 20) {
                mButton19.setVisibility(View.VISIBLE);
                mButton19.setText(ha.get(id));

            } else if (all.size() == 21) {
                mButton20.setVisibility(View.VISIBLE);
                mButton20.setText(ha.get(id));


            } else if (all.size() == 22) {
                mButton21.setVisibility(View.VISIBLE);
                mButton21.setText(ha.get(id));

            } else if (all.size() == 23) {

                mButton22.setVisibility(View.VISIBLE);
                mButton22.setText(ha.get(id));

            } else if (all.size() == 24) {
                mButton23.setVisibility(View.VISIBLE);
                mButton23.setText(ha.get(id));

            } else if (all.size() == 25) {
                mButton24.setVisibility(View.VISIBLE);
                mButton24.setText(ha.get(id));

            } else if (all.size() == 26) {
                mButton25.setVisibility(View.VISIBLE);
                mButton25.setText(ha.get(id));


            } else if (all.size() == 27) {
                mButton26.setVisibility(View.VISIBLE);
                mButton26.setText(ha.get(id));

            } else if (all.size() == 28) {
                mButton27.setVisibility(View.VISIBLE);
                mButton27.setText(ha.get(id));

            } else if (all.size() == 29) {
                mButton28.setVisibility(View.VISIBLE);
                mButton28.setText(ha.get(id));


            } else if (all.size() == 30) {
                mButton29.setVisibility(View.VISIBLE);
                mButton29.setText(ha.get(id));

            }
        } else {
            int index = 0;
            for (int y = 0; y < alln.size(); y++) {
                if (id == Integer.valueOf(String.valueOf(alln.get(y)))) {
                    index = y + 1;
                    break;


                }


            }

            ArrayList<String> ha = text();
            if (index == 1) {
                mButton0.setVisibility(View.INVISIBLE);
                mButton0.setText(ha.get(id));

            } else if (index == 2) {

                mButton1.setVisibility(View.INVISIBLE);
                mButton1.setText(ha.get(id));

            } else if (index == 3) {
                mButton2.setVisibility(View.INVISIBLE);
                mButton2.setText(ha.get(id));


            } else if (index == 4) {
                mButton3.setVisibility(View.INVISIBLE);
                mButton3.setText(ha.get(id));

            } else if (index == 5) {
                mButton4.setVisibility(View.INVISIBLE);
                mButton4.setText(ha.get(id));


            } else if (index == 6) {
                mButton5.setVisibility(View.INVISIBLE);
                mButton5.setText(ha.get(id));

            } else if (index == 7) {
                mButton6.setVisibility(View.INVISIBLE);
                mButton6.setText(ha.get(id));


            } else if (index == 8) {
                mButton7.setVisibility(View.INVISIBLE);
                mButton7.setText(ha.get(id));

            } else if (index == 9) {
                mButton8.setVisibility(View.INVISIBLE);
                mButton8.setText(ha.get(id));


            } else if (index == 10) {
                mButton9.setVisibility(View.INVISIBLE);
                mButton9.setText(ha.get(id));

            } else if (index == 11) {

                mButton10.setVisibility(View.INVISIBLE);
                mButton10.setText(ha.get(id));

            } else if (index == 12) {
                mButton11.setVisibility(View.INVISIBLE);
                mButton11.setText(ha.get(id));

            } else if (index == 13) {
                mButton12.setVisibility(View.INVISIBLE);
                mButton12.setText(ha.get(id));


            } else if (index == 14) {
                mButton13.setVisibility(View.INVISIBLE);
                mButton13.setText(ha.get(id));

            } else if (index == 15) {
                mButton14.setVisibility(View.INVISIBLE);
                mButton14.setText(ha.get(id));


            } else if (index == 16) {
                mButton15.setVisibility(View.INVISIBLE);
                mButton15.setText(ha.get(id));

            } else if (index == 17) {
                mButton16.setVisibility(View.INVISIBLE);
                mButton16.setText(ha.get(id));


            } else if (index == 18) {
                mButton17.setVisibility(View.INVISIBLE);
                mButton17.setText(ha.get(id));

            } else if (index == 19) {
                mButton18.setVisibility(View.INVISIBLE);
                mButton18.setText(ha.get(id));


            } else if (index == 20) {
                mButton19.setVisibility(View.INVISIBLE);
                mButton19.setText(ha.get(id));

            } else if (index == 21) {
                mButton20.setVisibility(View.INVISIBLE);
                mButton20.setText(ha.get(id));


            } else if (index == 22) {
                mButton21.setVisibility(View.INVISIBLE);
                mButton21.setText(ha.get(id));

            } else if (index == 23) {

                mButton22.setVisibility(View.INVISIBLE);
                mButton22.setText(ha.get(id));

            } else if (index == 24) {
                mButton23.setVisibility(View.INVISIBLE);
                mButton23.setText(ha.get(id));

            } else if (index == 25) {
                mButton24.setVisibility(View.INVISIBLE);
                mButton24.setText(ha.get(id));

            } else if (index == 26) {
                mButton25.setVisibility(View.INVISIBLE);
                mButton25.setText(ha.get(id));


            } else if (index == 27) {
                mButton26.setVisibility(View.INVISIBLE);
                mButton26.setText(ha.get(id));

            } else if (index == 28) {
                mButton27.setVisibility(View.INVISIBLE);
                mButton27.setText(ha.get(id));

            } else if (index == 29) {
                mButton28.setVisibility(View.INVISIBLE);
                mButton28.setText(ha.get(id));


            } else if (index == 30) {
                mButton29.setVisibility(View.INVISIBLE);
                mButton29.setText(ha.get(id));

            }


        }


    }

    private View viewe;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        View viewer = getView();
        if (viewer == null) {
            //    Toast.makeText(getActivity(),"null",Toast.LENGTH_SHORT).show();
        } else {
            //      Toast.makeText(getActivity(),""+viewer.toString(),Toast.LENGTH_SHORT).show();
        }
        viewe = viewer;
        mButton0 = view.findViewById(R.id.Button0);
        mButton1 = (Button) view.findViewById(R.id.Button1);
        mButton2 = (Button) view.findViewById(R.id.Button2);
        mButton3 = (Button) view.findViewById(R.id.Button3);
        mButton4 = (Button) view.findViewById(R.id.Button4);
        mButton5 = (Button) view.findViewById(R.id.Button5);
        mButton6 = (Button) view.findViewById(R.id.Button6);
        mButton7 = (Button) view.findViewById(R.id.Button7);
        mButton8 = (Button) view.findViewById(R.id.Button8);
        mButton9 = (Button) view.findViewById(R.id.Button9);
        mButton10 = (Button) view.findViewById(R.id.Button10);
        mButton11 = (Button) view.findViewById(R.id.Button11);
        mButton12 = (Button) view.findViewById(R.id.Button12);
        mButton13 = (Button) view.findViewById(R.id.Button13);
        mButton14 = (Button) view.findViewById(R.id.Button14);
        mButton15 = (Button) view.findViewById(R.id.Button15);
        mButton16 = (Button) view.findViewById(R.id.Button16);
        mButton17 = (Button) view.findViewById(R.id.Button17);
        mButton18 = (Button) view.findViewById(R.id.Button18);
        mButton19 = (Button) view.findViewById(R.id.Button19);
        mButton20 = (Button) view.findViewById(R.id.Button20);
        mButton21 = (Button) view.findViewById(R.id.Button21);
        mButton22 = (Button) view.findViewById(R.id.Button22);
        mButton23 = (Button) view.findViewById(R.id.Button23);
        mButton24 = (Button) view.findViewById(R.id.Button24);
        mButton25 = (Button) view.findViewById(R.id.Button25);
        mButton26 = (Button) view.findViewById(R.id.Button26);
        mButton27 = (Button) view.findViewById(R.id.Button27);
        mButton28 = (Button) view.findViewById(R.id.Button28);
        mButton29 = (Button) view.findViewById(R.id.Button29);

        final MainActivity x = (MainActivity) (getActivity());
        mButton0.setOnLongClickListener(new View.OnLongClickListener() {

            @Override

            public boolean onLongClick(View view) {
                alln = x.getEntitiesnotChange();
                //Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3, Gravity.CENTER, false, false, false, Integer.valueOf(alln.get(0)));
                return true;
            }
        });
        mButton1.setOnLongClickListener(new View.OnLongClickListener() {

            @Override

            public boolean onLongClick(View view) {
                alln = x.getEntitiesnotChange();
                //Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3, Gravity.CENTER, false, false, false, Integer.valueOf(alln.get(1)));
                return true;
            }
        });
        mButton2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                alln = x.getEntitiesnotChange();
                //  Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3, Gravity.CENTER, false, false, false, Integer.valueOf(alln.get(2)));
                return true;
            }
        });
        mButton3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                alln = x.getEntitiesnotChange();
                x.showDialog(3, Gravity.CENTER, false, false, false, Integer.valueOf(alln.get(3)));

                return true;
            }
        });
        mButton4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                alln = x.getEntitiesnotChange();
                x.showDialog(3, Gravity.CENTER, false, false, false, Integer.valueOf(alln.get(4)));

                return true;
            }
        });
        mButton5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                alln = x.getEntitiesnotChange();
                //    Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3, Gravity.CENTER, false, false, false, Integer.valueOf(alln.get(5)));
                return true;
            }
        });
        mButton6.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                alln = x.getEntitiesnotChange();


                x.showDialog(3, Gravity.CENTER, false, false, false, Integer.valueOf(alln.get(6)));
                return true;
            }
        });
        mButton7.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                alln = x.getEntitiesnotChange();
                //       Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3, Gravity.CENTER, false, false, false, Integer.valueOf(alln.get(7)));

                return true;
            }
        });
        mButton8.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                alln = x.getEntitiesnotChange();
                //       Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3, Gravity.CENTER, false, false, false, Integer.valueOf(alln.get(8)));

                return true;
            }
        });
        mButton9.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                alln = x.getEntitiesnotChange();
                //    Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3, Gravity.CENTER, false, false, false, Integer.valueOf(alln.get(9)));

                return true;
            }
        });
        mButton10.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                alln = x.getEntitiesnotChange();
                //    Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3, Gravity.CENTER, false, false, false, Integer.valueOf(alln.get(10)));

                return true;
            }
        });
        mButton11.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                alln = x.getEntitiesnotChange();
                //   Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3, Gravity.CENTER, false, false, false, Integer.valueOf(alln.get(11)));

                return true;
            }
        });
        mButton12.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                alln = x.getEntitiesnotChange();
                //   Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3, Gravity.CENTER, false, false, false, Integer.valueOf(alln.get(12)));

                return true;
            }
        });
        mButton13.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                alln = x.getEntitiesnotChange();
                //   Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3, Gravity.CENTER, false, false, false, Integer.valueOf(alln.get(13)));

                return true;
            }
        });
        mButton14.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                alln = x.getEntitiesnotChange();
                //   Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3, Gravity.CENTER, false, false, false, Integer.valueOf(alln.get(14)));
                return true;
            }
        });
        mButton15.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                alln = x.getEntitiesnotChange();
                x.showDialog(3, Gravity.CENTER, false, false, false, Integer.valueOf(alln.get(15)));

                return true;
            }
        });
        mButton16.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                alln = x.getEntitiesnotChange();
                x.showDialog(3, Gravity.CENTER, false, false, false, Integer.valueOf(alln.get(16)));

                return true;
            }
        });
        mButton17.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                alln = x.getEntitiesnotChange();
                //     Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3, Gravity.CENTER, false, false, false, Integer.valueOf(alln.get(17)));
                return true;
            }
        });
        mButton18.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                alln = x.getEntitiesnotChange();
                //     Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3, Gravity.CENTER, false, false, false, Integer.valueOf(alln.get(18)));
                return true;
            }
        });
        mButton19.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                alln = x.getEntitiesnotChange();
                //    Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3, Gravity.CENTER, false, false, false, 19);
                return true;
            }
        });
        mButton20.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                alln = x.getEntitiesnotChange();
                //    Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3, Gravity.CENTER, false, false, false, Integer.valueOf(alln.get(20)));
                return true;
            }
        });
        mButton21.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                alln = x.getEntitiesnotChange();
                //      Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3, Gravity.CENTER, false, false, false, Integer.valueOf(alln.get(21)));
                return true;
            }
        });
        mButton22.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                alln = x.getEntities();
                //     Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3, Gravity.CENTER, false, false, false, Integer.valueOf(alln.get(22)));
                return true;
            }
        });
        mButton23.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                all = x.getEntitiesnotChange();
                //      Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3, Gravity.CENTER, false, false, false, Integer.valueOf(alln.get(23)));
                return true;
            }
        });
        mButton24.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                alln = x.getEntitiesnotChange();
                //      Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3, Gravity.CENTER, false, false, false, Integer.valueOf(alln.get(24)));
                return true;
            }
        });
        mButton25.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                alln = x.getEntitiesnotChange();
                //   Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3, Gravity.CENTER, false, false, false, Integer.valueOf(alln.get(25)));
                return true;
            }
        });
        mButton26.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                alln = x.getEntitiesnotChange();
                //  Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3, Gravity.CENTER, false, false, false, Integer.valueOf(alln.get(26)));
                return true;
            }
        });
        mButton27.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                alln = x.getEntitiesnotChange();
                //   Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3, Gravity.CENTER, false, false, false, Integer.valueOf(alln.get(27)));
                return true;
            }
        });
        mButton28.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                alln = x.getEntitiesnotChange();
                //  Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3, Gravity.CENTER, false, false, false, Integer.valueOf(alln.get(28)));
                return true;
            }
        });
        mButton29.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                alln = x.getEntitiesnotChange();
                //   Toast.makeText(getContext(), "Long Clicked ", Toast.LENGTH_SHORT).show();
                x.showDialog(3, Gravity.CENTER, false, false, false, Integer.valueOf(alln.get(29)));
                return true;
            }
        });

    }

    public static int getRandom(ArrayList mine) {
        if (mine.size() != 0) {
            int num = (int) (Math.random() * (mine.size()));
            return ((Integer.valueOf(String.valueOf(mine.get(num)))));
        }
        return -1;

    }

    public int color() {
        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));

        return color;

    }


}
