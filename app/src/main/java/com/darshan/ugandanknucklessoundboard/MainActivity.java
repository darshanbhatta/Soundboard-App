package com.darshan.ugandanknucklessoundboard;

import android.Manifest;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.provider.MediaStore;
import android.provider.Settings;
import android.support.design.widget.TabLayout;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.orhanobut.dialogplus.DialogPlus;
import com.orhanobut.dialogplus.GridHolder;
import com.orhanobut.dialogplus.Holder;
import com.orhanobut.dialogplus.ListHolder;
import com.orhanobut.dialogplus.OnCancelListener;
import com.orhanobut.dialogplus.OnDismissListener;
import com.orhanobut.dialogplus.OnItemClickListener;
import com.orhanobut.dialogplus.ViewHolder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Integer> allSound = new ArrayList();
    private static final String TAG = "MainActivity";
    private static final int PAGE_COUNT = 3;
    private SectionsPageAdapter mSectionsPageAdapter;
    private TabLayout tabLayout;
    ArrayList<String> man = new ArrayList();
    private AdView mAdView;

    private int id;
    private boolean addOrDelete;
    private List mList;
    private ViewPager mViewPager;

    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.d, menu);


        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // case R.id.action_settings:
            // User chose the "Settings" item, show the app settings UI...
            //    return true;


            case R.id.dev:
                dialog();
                // User chose the "Favorite" action, mark the current item
                // as a favorite...
                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);
        SharedPreferences settings = getSharedPreferences("ez", MODE_PRIVATE);

        MobileAds.initialize(this, "ca-app-pub-5667045213981762/2817427150");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        // Writing data to SharedPreferences
        SharedPreferences.Editor editor = settings.edit();
        String value = settings.getString("key", "");
        if (value.equals("")) {
            settingPermission();
            dialog();
        }
        editor.putString("key", "x");
        editor.commit();
        mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.

        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mViewPagerAdapter);

        getSupportActionBar().setDisplayShowTitleEnabled(true);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
        tabLayout.getTabAt(0).setText("Soundboard");
        tabLayout.getTabAt(1).setText("Favorites");
        tabLayout.getTabAt(2).setText("Info");

        loadArray(getApplicationContext());
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        allSound.add(R.raw.blueknuckles);
        allSound.add(R.raw.clicking);
        allSound.add(R.raw.clickingtwo);
        allSound.add(R.raw.clickingthree);
        allSound.add(R.raw.clickingfour);
        allSound.add(R.raw.clickingfive);
        allSound.add(R.raw.dancemybrothers);
        allSound.add(R.raw.devilisonourside);
        allSound.add(R.raw.doyouknowthewayofthedevil);
        allSound.add(R.raw.doyouknowtheway);
        allSound.add(R.raw.doyouknowthewaytwo);
        allSound.add(R.raw.doyouknowthewaythree);
        allSound.add(R.raw.ebolatoknowtheway);
        allSound.add(R.raw.iknowtheway);
        allSound.add(R.raw.letusconquer);
        allSound.add(R.raw.meandmybrothersknowtheway);
        allSound.add(R.raw.messwithusandwewillspit);
        allSound.add(R.raw.mybrother);
        allSound.add(R.raw.notthequeen);
        allSound.add(R.raw.ohmygod);
        allSound.add(R.raw.smellslikeebola);
        allSound.add(R.raw.sniff);
        allSound.add(R.raw.snifftwo);
        allSound.add(R.raw.sniffthree);
        allSound.add(R.raw.spit);
        allSound.add(R.raw.ugandawarrior);
        allSound.add(R.raw.wemustprayforthisone);
        allSound.add(R.raw.whereisthecommander);
        allSound.add(R.raw.whyareyourunning);
        allSound.add(R.raw.youarethenewcommander);
        man.add("BLUE_KNUCKLES.mp3");
        man.add("CLICKING.mp3");
        man.add("CLICKING_2.mp3");
        man.add("CLICKING_3.mp3");
        man.add("CLICKING_4.mp3");
        man.add("CLICKING_5.mp3");
        man.add("DANCE_MY_BROS");
        man.add("DEVIL_IS_ON_OUR_SIDE.mp3");
        man.add("DO_YOU_KNOW_DEY_WEY_DEVIL.mp3");
        man.add("DO_YOU_KNOW_DEY_WEY.mp3");
        man.add("DO_YOU_KNOW_DEY_WEY_2.mp3");
        man.add("DO_YOU_KNOW_DEY_WEY_3.mp3");
        man.add("NEED_EBOLA_TO_KNOW_DEY_WEY.mp3");
        man.add("I_KNOW_DEY_WEY.mp3");
        man.add("LET_US_CONQUER.mp3");
        man.add("MY_BROS_KNOW_DEY_WAY.mp3");
        man.add("MESS_WITH_US_AND_SPIT.mp3");
        man.add("MY_BROTHER.mp3");
        man.add("NOT_THE_QUEEN.mp3");
        man.add("OH_MY_GOD.mp3");
        man.add("SMELLS_LIKE_EBOLA.mp3");
        man.add("SNIFF.mp3");
        man.add("SNIFF_2.mp3");
        man.add("SNIFF_3.mp3");
        man.add("SPIT.mp3");
        man.add("UGANDA_WARRIOR.mp3");
        man.add("WE_MUST_PRAY_FOR_THIS_ONE.mp3");
        man.add("WHERE_IS_COMMANDER.mp3");
        man.add("WHY_ARE_YOU_RUNNING.mp3");
        man.add("YOU_ARE_THE_NEW_COMMANDER.mp3");
    }


    public void showDialog(int holderId, int gravity, boolean showHeader, boolean showFooter, boolean expanded, int buttonNum) {
        boolean isGrid;
        Holder holder;
        switch (holderId) {
            case 1:
                holder = new ViewHolder(R.layout.simple_grid_item);
                isGrid = false;
                break;
            case 2:
                holder = new ListHolder();
                isGrid = false;
                break;
            default:
                holder = new GridHolder(1);
                isGrid = true;
        }


        OnItemClickListener itemClickListener = new OnItemClickListener() {
            @Override
            public void onItemClick(DialogPlus dialog, Object item, View view, int position) {
                TextView textView = (TextView) view.findViewById(R.id.text_view69);
                String clickedAppName = textView.getText().toString();
                //        dialog.dismiss();
                //        Toast.makeText(MainActivity.this, clickedAppName + " clicked", Toast.LENGTH_LONG).show();
            }
        };

        OnDismissListener dismissListener = new OnDismissListener() {
            @Override
            public void onDismiss(DialogPlus dialog) {
                //Toast.makeText(MainActivity.this, "dismiss listener invoked!", Toast.LENGTH_SHORT).show();
            }
        };
        final Tab2Act x = new Tab2Act();
        OnCancelListener cancelListener = new OnCancelListener() {
            @Override
            public void onCancel(DialogPlus dialog) {

                //    Toast.makeText(MainActivity.this, "cancel listener invoked!", Toast.LENGTH_SHORT).show();
            }
        };

        SimpleAdapter adapter = new SimpleAdapter(MainActivity.this, isGrid);


        showOnlyContentDialog(holder, gravity, adapter, itemClickListener, dismissListener, cancelListener, expanded, buttonNum);
    }


    public void showOnlyContentDialog(Holder holder, int gravity, BaseAdapter adapter,
                                      OnItemClickListener itemClickListener, OnDismissListener dismissListener,
                                      OnCancelListener cancelListener, boolean expanded, final int buttonNum) {
        final DialogPlus dialog = DialogPlus.newDialog(this)
                .setContentHolder(holder)
                .setGravity(gravity)
                .setAdapter(adapter)
                .setOnItemClickListener(new OnItemClickListener() {
                    @Override
                    public void onItemClick(DialogPlus dialog, Object item, View view, int position) {
                        if (position == 0) {


                            // Toast.makeText(getApplicationContext(), ""+getEntities(), Toast.LENGTH_SHORT).show();
                            id = buttonNum;
                            if (entities.contains(String.valueOf(buttonNum))) {
                                addOrDelete = false;
                                notifyViewPagerDataSetChanged();
                                entities.remove(String.valueOf(buttonNum));
                                saveArray();
                                Toast.makeText(getApplicationContext(), "Unfavorited " + String.valueOf(man.get(buttonNum)), Toast.LENGTH_SHORT).show();

                            } else {
                                addEntity(buttonNum);
                                entitiesNoChange.add(String.valueOf(buttonNum));
                                addOrDelete = true;
                                Toast.makeText(getApplicationContext(), "Favorited " + String.valueOf(man.get(buttonNum)), Toast.LENGTH_SHORT).show();
                                notifyViewPagerDataSetChanged();

                            }


                            tabLayout.getTabAt(0).setText("Soundboard");
                            tabLayout.getTabAt(1).setText("Favorites");
                            tabLayout.getTabAt(2).setText("Info");
                        } else if (position == 1) {

                            noti(RingtoneManager.TYPE_NOTIFICATION, buttonNum);
                        } else if (position == 2) {

                            saveas(RingtoneManager.TYPE_RINGTONE, buttonNum);

                        } else if (position == 3) {
                            alarm(RingtoneManager.TYPE_ALARM, buttonNum);

                        }
                        Log.d("DialogPlus", "onItemClick() called with: " + "item = [" +
                                item + "], position = [" + position + "]");
                    }
                })
                .setOnDismissListener(dismissListener)
                .setOnCancelListener(cancelListener)
                .setExpanded(expanded)
                .setCancelable(true)
                .create();
        dialog.show();
    }

    private ArrayList<String> entities = new ArrayList();
    private ArrayList<String> entitiesNoChange = new ArrayList();

    //Way to read the stored data
    public ArrayList getEntities() {

        return entities;
    }

    public ArrayList getEntitiesnotChange() {

        return entitiesNoChange;
    }

    //Way to add new data
    public void addEntity(int text) {
        int count = 0;
        for (int x = 0; x < entities.size(); x++) {
            int hold = Integer.valueOf(entities.get(x));
            if (hold == text) {
                count++;

            }

        }
        if (count == 0) {
            entities.add(String.valueOf(text));
            saveArray();
        } else {


        }

    }


    public boolean saveArray() {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor mEdit1 = sp.edit();
        /* sKey is an array */
        mEdit1.putInt("Status_size", entities.size());

        for (int i = 0; i < entities.size(); i++) {
            mEdit1.remove("Status_" + i);
            mEdit1.putString("Status_" + i, String.valueOf(entities.get(i)));
        }

        return mEdit1.commit();
    }

    public void loadArray(Context mContext) {
        SharedPreferences mSharedPreference1 = PreferenceManager.getDefaultSharedPreferences(mContext);
        entities.clear();
        int size = mSharedPreference1.getInt("Status_size", 0);

        for (int i = 0; i < size; i++) {
            entities.add(mSharedPreference1.getString("Status_" + i, null));
            entitiesNoChange.add(mSharedPreference1.getString("Status_" + i, null));
        }

    }

    private void notifyViewPagerDataSetChanged() {
        Log.d(TAG, "\nnotifyDataSetChanged()");

        mViewPagerAdapter.notifyDataSetChanged();
    }


    private FragmentPagerAdapter mViewPagerAdapter = new FragmentPagerAdapter(getSupportFragmentManager()) {


        @Override
        public int getCount() {
            return PAGE_COUNT;
        }

        // Return the Fragment associated with a specified position.
        @Override
        public Fragment getItem(int position) {


            Log.d(TAG, "getItem(" + position + ")");
            if (position == 0) {

                return Tab1Act.newInstance();
            } else if (position == 1) {
                return Tab2Act.newInstance();
            } else if (position == 2) {
                return devInfo.newInstance();

            }

            return null;
        }


        // Remove a page for the given position. The adapter is responsible for removing the view from its container.
        @Override
        public void destroyItem(android.view.ViewGroup container, int position, Object object) {
            super.destroyItem(container, position, object);
            Log.d(TAG, "destroyItem(" + position + ")");

        }

        ;

        @Override
        // To update fragment in ViewPager, we should override getItemPosition() method,
        // in this method, we call the fragment's public updating method.
        public int getItemPosition(Object object) {
            Log.d(TAG, "getItemPosition(" + object.getClass().getSimpleName() + ")");
            if (object instanceof Tab2Act) {

                ((Tab2Act) object).addButton(entitiesNoChange, id, addOrDelete);
            } else if (object instanceof Tab2Act) {

                ((Tab2Act) object).addButton(entitiesNoChange, id, addOrDelete);
            }

            return super.getItemPosition(object);
        }

        ;
    };


    // In this method, we need to copy the mp3 file to the sd card location from
    // where android picks up ringtone files
    // After copying, we make the mp3 as current ringtone
    public boolean saveas(int type, int which) {
        settingPermission();
        byte[] buffer = null;
        InputStream fIn = getBaseContext().getResources().openRawResource(
                allSound.get(which));
        int size = 0;

        try {
            size = fIn.available();
            buffer = new byte[size];
            fIn.read(buffer);
            fIn.close();
        } catch (IOException e) {
            return false;
        }

        String path = Environment.getExternalStorageDirectory().getPath()
                + "/media/audio/ringtones" + "/";

        String filename = man.get(which);

        boolean exists = (new File(path + filename)).exists();
        if (!exists) {
            new File(path).mkdirs();
            FileOutputStream save;
            try {
                save = new FileOutputStream(path + filename);
                save.write(buffer);
                save.flush();
                save.close();
            } catch (FileNotFoundException e) {
                settingPermission();
                Toast.makeText(getApplicationContext(), "ERROR PLEASE CHECK PERMISSION IN APP SETTING", Toast.LENGTH_SHORT).show();

                return false;
            } catch (IOException e) {
                settingPermission();
                Toast.makeText(getApplicationContext(), "ERROR PLEASE CHECK PERMISSION IN APP SETTING", Toast.LENGTH_SHORT).show();

                return false;
            }

            sendBroadcast(new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE,
                    Uri.parse("file://" + path + filename)));

            File k = new File(path, filename);

            ContentValues values = new ContentValues();
            values.put(MediaStore.MediaColumns.DATA, k.getAbsolutePath());
            values.put(MediaStore.MediaColumns.TITLE, filename);
            values.put(MediaStore.MediaColumns.MIME_TYPE, "audio/ogg");

            // This method allows to change Notification and Alarm tone also. Just
            // pass corresponding type as parameter
            if (RingtoneManager.TYPE_RINGTONE == type) {
                values.put(MediaStore.Audio.Media.IS_RINGTONE, true);
            } else if (RingtoneManager.TYPE_NOTIFICATION == type) {
                values.put(MediaStore.Audio.Media.IS_NOTIFICATION, true);
            } else if (RingtoneManager.TYPE_ALARM == type) {
                values.put(MediaStore.Audio.Media.IS_ALARM, true);
            }

            Uri uri = MediaStore.Audio.Media.getContentUriForPath(k
                    .getAbsolutePath());
            Uri newUri = MainActivity.this.getContentResolver().insert(uri, values);
            RingtoneManager.setActualDefaultRingtoneUri(MainActivity.this, type,
                    newUri);

            // Insert it into the database
            this.getContentResolver()
                    .insert(MediaStore.Audio.Media.getContentUriForPath(k
                            .getAbsolutePath()), values);
            Toast.makeText(getApplicationContext(), "SET AS DEFAULT RINGTONE", Toast.LENGTH_SHORT).show();
        } else {

            Toast.makeText(getApplicationContext(), "THIS RINGTONE ALREADY EXISTS", Toast.LENGTH_SHORT).show();
        }


        return true;
    }

    // In this method, we need to copy the mp3 file to the sd card location from
    // where android picks up ringtone files
    // After copying, we make the mp3 as current ringtone
    public boolean alarm(int type, int which) {
        settingPermission();
        byte[] buffer = null;
        InputStream fIn = getBaseContext().getResources().openRawResource(
                allSound.get(which));
        int size = 0;

        try {
            size = fIn.available();
            buffer = new byte[size];
            fIn.read(buffer);
            fIn.close();
        } catch (IOException e) {

            return false;
        }

        String path = Environment.getExternalStorageDirectory().getPath()
                + "/media/audio/alarm" + "/";

        String filename = man.get(which);

        boolean exists = (new File(path + filename)).exists();
        if (!exists) {
            new File(path).mkdirs();
            FileOutputStream save;
            try {
                save = new FileOutputStream(path + filename);
                save.write(buffer);
                save.flush();
                save.close();
            } catch (FileNotFoundException e) {
                settingPermission();
                Toast.makeText(getApplicationContext(), "ERROR PLEASE CHECK PERMISSION IN APP SETTING", Toast.LENGTH_SHORT).show();

                return false;
            } catch (IOException e) {
                settingPermission();

                Toast.makeText(getApplicationContext(), "ERROR PLEASE CHECK PERMISSION IN APP SETTING", Toast.LENGTH_SHORT).show();

                return false;
            }

            sendBroadcast(new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE,
                    Uri.parse("file://" + path + filename)));

            File k = new File(path, filename);

            ContentValues values = new ContentValues();
            values.put(MediaStore.MediaColumns.DATA, k.getAbsolutePath());
            values.put(MediaStore.MediaColumns.TITLE, filename);
            values.put(MediaStore.MediaColumns.MIME_TYPE, "audio/ogg");

            // This method allows to change Notification and Alarm tone also. Just
            // pass corresponding type as parameter
            if (RingtoneManager.TYPE_RINGTONE == type) {
                values.put(MediaStore.Audio.Media.IS_RINGTONE, true);
            } else if (RingtoneManager.TYPE_NOTIFICATION == type) {
                values.put(MediaStore.Audio.Media.IS_NOTIFICATION, true);
            } else if (RingtoneManager.TYPE_ALARM == type) {
                values.put(MediaStore.Audio.Media.IS_ALARM, true);
            }

            Uri uri = MediaStore.Audio.Media.getContentUriForPath(k
                    .getAbsolutePath());
            Uri newUri = MainActivity.this.getContentResolver().insert(uri, values);
            RingtoneManager.setActualDefaultRingtoneUri(MainActivity.this, type,
                    newUri);

            // Insert it into the database
            this.getContentResolver()
                    .insert(MediaStore.Audio.Media.getContentUriForPath(k
                            .getAbsolutePath()), values);
            Toast.makeText(getApplicationContext(), "SET AS DEFAULT ALARM", Toast.LENGTH_SHORT).show();
        } else {

            Toast.makeText(getApplicationContext(), "THIS ALARM SOUND ALREADY EXISTS", Toast.LENGTH_SHORT).show();
        }


        return true;
    }

    // In this method, we need to copy the mp3 file to the sd card location from
    // where android picks up ringtone files
    // After copying, we make the mp3 as current ringtone
    public boolean noti(int type, int which) {
        settingPermission();
        byte[] buffer = null;
        InputStream fIn = getBaseContext().getResources().openRawResource(
                allSound.get(which));
        int size = 0;

        try {
            size = fIn.available();
            buffer = new byte[size];
            fIn.read(buffer);
            fIn.close();
        } catch (IOException e) {
            return false;
        }

        String path = Environment.getExternalStorageDirectory().getPath()
                + "/media/audio/notific" + "/";

        String filename = man.get(which);

        boolean exists = (new File(path + filename)).exists();
        if (!exists) {
            new File(path).mkdirs();
            FileOutputStream save;
            try {

                save = new FileOutputStream(path + filename);
                save.write(buffer);
                save.flush();
                save.close();
            } catch (FileNotFoundException e) {
                settingPermission();

                Toast.makeText(getApplicationContext(), "ERROR PLEASE CHECK PERMISSION IN APP SETTING", Toast.LENGTH_SHORT).show();

                return false;
            } catch (IOException e) {
                settingPermission();

                Toast.makeText(getApplicationContext(), "ERROR PLEASE CHECK PERMISSION IN APP SETTING", Toast.LENGTH_SHORT).show();

                return false;
            }

            sendBroadcast(new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE,
                    Uri.parse("file://" + path + filename)));

            File k = new File(path, filename);

            ContentValues values = new ContentValues();
            values.put(MediaStore.MediaColumns.DATA, k.getAbsolutePath());
            values.put(MediaStore.MediaColumns.TITLE, filename);
            values.put(MediaStore.MediaColumns.MIME_TYPE, "audio/ogg");

            // This method allows to change Notification and Alarm tone also. Just
            // pass corresponding type as parameter
            if (RingtoneManager.TYPE_RINGTONE == type) {
                values.put(MediaStore.Audio.Media.IS_RINGTONE, true);
            } else if (RingtoneManager.TYPE_NOTIFICATION == type) {
                values.put(MediaStore.Audio.Media.IS_NOTIFICATION, true);
            } else if (RingtoneManager.TYPE_ALARM == type) {
                values.put(MediaStore.Audio.Media.IS_ALARM, true);
            }

            Uri uri = MediaStore.Audio.Media.getContentUriForPath(k
                    .getAbsolutePath());
            Uri newUri = MainActivity.this.getContentResolver().insert(uri, values);
            RingtoneManager.setActualDefaultRingtoneUri(MainActivity.this, type,
                    newUri);

            // Insert it into the database
            this.getContentResolver()
                    .insert(MediaStore.Audio.Media.getContentUriForPath(k
                            .getAbsolutePath()), values);
            Toast.makeText(getApplicationContext(), "SET AS DEFAULT NOTIFICATION SOUND", Toast.LENGTH_SHORT).show();
        } else {

            Toast.makeText(getApplicationContext(), "THIS NOTIFICATION SOUND ALREADY EXISTS", Toast.LENGTH_SHORT).show();
        }


        return true;
    }

//Thus our ringtone was set successfuly


    public void settingPermission() {
        ActivityCompat.requestPermissions(MainActivity.this,
                new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
                1);
        ActivityCompat.requestPermissions(MainActivity.this,
                new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                1);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {

            if (!Settings.System.canWrite(getApplicationContext())) {
                Toast.makeText(getApplicationContext(), "PLEASE ALLOW PERMISSION FOR STORAGE", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Settings.ACTION_MANAGE_WRITE_SETTINGS, Uri.parse("package:" + getPackageName()));
                startActivityForResult(intent, 200);

            }
        }
    }

    public void dialog() {


        new AlertDialog.Builder(this)

                .setTitle("Welcome to the Ugandan Knuckles Soundboard App!")

                .setMessage("Play hilarious sounds from the famous meme!\n\nTo start, simply tap on the sounds you would like to hear.\n\nIf you find any of them you like, hold the sound button and click on \"add to favorites.\"\n\n" +
                        "If you like a sound even more, you can set it as your notication, ringtone and even your alarm sound by selecting the other options when holding on the button. \n\nEnjoy!")
                .setNegativeButton("I know de wey", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //start
                    }

                }).create().show();
    }
}





