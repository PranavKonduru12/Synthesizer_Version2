package com.example.konduru91976.synthesizer_version2;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.InflateException;
import android.view.View;
import android.widget.Button;

public class SynthesizerActivity extends AppCompatActivity {
    private static final String TAG = SynthesizerActivity.class.getName();
    private Button button1;
    private Button button2;
    private MediaPlayer mpE;
    private MediaPlayer mpF;
    private final int WHOLE_NOTE = 1000;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);

        button1 = (Button)findViewById(R.id.eButton);
        button2 = (Button)findViewById(R.id.fButton);
        mpE = MediaPlayer.create(this, R.raw.scalee);
        mpF = MediaPlayer.create(this, R.raw.scalef);
    }

    public void onClick(View view) {
        Log.e("SynthesizeerActivity", "Challenge 0 Button clicked");
        try {
            mpE.start();
            delayPlaying(WHOLE_NOTE);
            mpF.start();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void delayPlaying(int delay) throws InterruptedException {
        try {
            Thread.sleep(delay);
        }
        catch (InterruptedException e) {
            Log.e("SynthesizerActivity", "Autio playback interrupted");
        }
    }
    public void onButton1Click(View view) {
        //Log.i(TAG, "Button 1 Clicked");
        //Log.e(TAG,"Button 1 Clicked");
        mpE.seekTo(0);
        Log.e("SynthesizerActivity", "Button 1 clicked");
        mpE.start();
    }
    public void onButton2Click(View view) {
        //Log.i(TAG, "Button 2 Clicked");
        //Log.e(TAG,"Button 2 Clicked");
        mpF.seekTo(0);
        Log.e("SynthesizerActivity", "Button 2 clicked");
        mpF.start();
    }

}
