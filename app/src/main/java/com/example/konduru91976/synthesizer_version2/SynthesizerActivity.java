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
    private Button mChallenge1;
    //private Button bu
    private MediaPlayer mpE;
    private MediaPlayer mpF;
    private MediaPlayer mpFs;
    private MediaPlayer mpG;
    private MediaPlayer mpGs;
    private MediaPlayer mpA;
    private MediaPlayer mpBb;
    private MediaPlayer mpB;
    private MediaPlayer mpC;
    private MediaPlayer mpCs;
    private MediaPlayer mpD;
    private MediaPlayer mpDs;
    private MediaPlayer mpHighE;
    private MediaPlayer mpHighF;
    private MediaPlayer mpHighFs;
    private final int WHOLE_NOTE = 1000;
    private final int HALF_NOTE = WHOLE_NOTE/2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);

        button1 = (Button)findViewById(R.id.eButton);
        button2 = (Button)findViewById(R.id.fButton);
        mChallenge1 = (Button)findViewById(R.id.mChallenge1);
        mpE = MediaPlayer.create(this, R.raw.scalee);
        mpF = MediaPlayer.create(this, R.raw.scalef);
        mpFs = MediaPlayer.create(this, R.raw.scalefs);
        mpG = MediaPlayer.create(this, R.raw.scaleg);
        mpGs = MediaPlayer.create(this, R.raw.scalegs);
        mpA = MediaPlayer.create(this, R.raw.scalea);
        mpBb = MediaPlayer.create(this, R.raw.scalebb);
        mpB = MediaPlayer.create(this, R.raw.scaleb);
        mpC = MediaPlayer.create(this, R.raw.scalec);
        mpCs = MediaPlayer.create(this, R.raw.scalecs);
        mpD = MediaPlayer.create(this, R.raw.scaled);
        mpDs = MediaPlayer.create(this, R.raw.scaleds);
        mpHighE = MediaPlayer.create(this, R.raw.scalehighe);
        mpHighF = MediaPlayer.create(this, R.raw.scalehighf);
        mpHighFs = MediaPlayer.create(this, R.raw.scalehighfs);
        //mpG = MediaPlayer.create(this, R.raw.scaleg);

    }

    private void delayPlaying(int delay) throws InterruptedException {
        try {
            Thread.sleep(delay);
        }
        catch (InterruptedException e) {
            Log.e("SynthesizerActivity", "Autio playback interrupted");
        }
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

    public void onChallenge1Click(View view) {
        Log.e(TAG, "Challenge 1 Button clicked");
        try {
            mpE.start();
            delayPlaying(WHOLE_NOTE/2);
            mpFs.start();
            delayPlaying(WHOLE_NOTE/2);
            mpG.start();
            delayPlaying(WHOLE_NOTE/2);
            mpA.start();
            delayPlaying(WHOLE_NOTE/2);
            mpB.start();
            delayPlaying(WHOLE_NOTE/2);
            mpCs.start();
            delayPlaying(WHOLE_NOTE/2);
            mpD.start();
            delayPlaying(WHOLE_NOTE/2);
            mpHighE.start();
            delayPlaying(WHOLE_NOTE/2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
