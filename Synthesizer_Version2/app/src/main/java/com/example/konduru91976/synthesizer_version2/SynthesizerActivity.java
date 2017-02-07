package com.example.konduru91976.synthesizer_version2;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SynthesizerActivity extends AppCompatActivity {
    private static final String TAG = SynthesizerActivity.class.getName();
    private Button button1;
    private Button button2;
    private MediaPlayer mpE;
    private MediaPlayer mpF;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);

        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        mpE = MediaPlayer.create(this, R.raw.scalee);
        mpF = MediaPlayer.create(this, R.raw.scalef);
    }

    public void onButton1Click(View view) {
        //Log.i(TAG, "Button 1 Clicked");
        Log.e(TAG,"Button 1 Clicked");
        mpE.start();
    }
    public void onButton2Click(View view) {
        //Log.i(TAG, "Button 2 Clicked");
        Log.e(TAG,"Button 2 Clicked");
        mpF.start();
    }

}
