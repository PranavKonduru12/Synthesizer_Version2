package com.example.pranavkonduru.synthesizerversion3;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;

public class SynthesierActivity extends AppCompatActivity {
    private static final String TAG = SynthesierActivity.class.getName();
    private Button button1;
    private Button button2;
    private Button mChallenge1;
    private Button mChallenge8;
    private Button metromoneButon;

    private NumberPicker selectNote;
    private NumberPicker timesToPlay;

    private MediaPlayer mpE;
    private MediaPlayer mpF;
    private MediaPlayer mpFs;
    private MediaPlayer mpG;
    private MediaPlayer mpGs;
    private MediaPlayer mpA;
    private MediaPlayer mpB;
    private MediaPlayer mpBb;
    private MediaPlayer mpCs;
    private MediaPlayer mpC;
    private MediaPlayer mpD;
    private MediaPlayer mpDs;
    private MediaPlayer mpHighE;
    private MediaPlayer mpHighF;
    private MediaPlayer mpHighFs;
    private MediaPlayer beats;
    private static final int WHOLE_NOTE = 1000;
    private static final int NUMBER_OF_NOTES = 13;
    private static final int E = 0;
    private static final int F = 1;
    private static final int F_SHARP = 2;
    private static final int G = 3;
    private static final int G_SHARP = 4;
    private static final int A = 5;
    private static final int B_FLAT = 6;
    private static final int B = 7;
    private static final int C = 8;
    private static final int C_SHARP = 9;
    private static final int D = 10;
    private static final int D_SHARP = 11;
    private static final int HIGH_E = 12;
    private static final int HIGH_F = 13;
    private static final int HIGH_F_SHARP = 14;
    private MediaPlayer [] notes = new MediaPlayer[8];
    private int [] twinkleTwinkle = {A, A, HIGH_E, HIGH_E, HIGH_F_SHARP, HIGH_F_SHARP,
            HIGH_E, D, D, C_SHARP, C_SHARP, B, B, A};
    private int [] twinkleTiming = {4, 4, 4, 4, 4, 4, 2};
    private MediaPlayer [] moreNotes = new MediaPlayer[15];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesier);

        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        mChallenge1 = (Button)findViewById(R.id.button3);
        mChallenge8 = (Button)findViewById(R.id.button4);
        metromoneButon = (Button)findViewById(R.id.button5);
        mpE = MediaPlayer.create(this, R.raw.scalee);
        mpF = MediaPlayer.create(this, R.raw.scalef);
        mpFs = MediaPlayer.create(this, R.raw.scalefs);
        mpG = MediaPlayer.create(this, R.raw.scaleg);
        mpGs = MediaPlayer.create(this, R.raw.scalegs);
        mpA = MediaPlayer.create(this, R.raw.scalea);
        mpB = MediaPlayer.create(this, R.raw.scaleb);
        mpBb = MediaPlayer.create(this, R.raw.scalebb);
        mpC = MediaPlayer.create(this, R.raw.scalec);
        mpCs = MediaPlayer.create(this, R.raw.scalecs);
        mpD = MediaPlayer.create(this, R.raw.scaled);
        mpDs = MediaPlayer.create(this, R.raw.scaleds);
        mpHighE = MediaPlayer.create(this, R.raw.scalehighe);
        mpHighFs = MediaPlayer.create(this, R.raw.scalehighfs);
        mpHighF = MediaPlayer.create(this, R.raw.scalehighf);
        beats = MediaPlayer.create(this, R.raw.click);
        notes[0]=mpE;notes[1]=mpFs;notes[2]=mpG;notes[3]=mpA;notes[4]=mpB;notes[5]=mpCs;notes[6]=mpD;notes[7]=mpHighE;
        moreNotes[0]=mpE;moreNotes[1]=mpF;moreNotes[2]=mpFs;moreNotes[3]=mpG;moreNotes[4]=mpGs;moreNotes[5]=mpA;moreNotes[6]=mpBb;moreNotes[7]=mpB;
        moreNotes[8]=mpC;moreNotes[9]=mpCs;moreNotes[10]=mpD;moreNotes[11]=mpDs;moreNotes[12]=mpHighE;moreNotes[13]=mpHighF;moreNotes[14]=mpHighFs;

        selectNote = (NumberPicker)findViewById(R.id.numberPicker);
        timesToPlay = (NumberPicker)findViewById(R.id.numberPicker2);




    }

    public void onButton1Click (View v) {
        mpE.seekTo(0);
        //Log.i(TAG, "Button 1 Clicked");
        Log.e(TAG, "Button 1 Clicked");
        mpE.start();
    }

    private void delayPlaying(int delay) throws InterruptedException {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Log.e("SynthesizerActivity", "Audio playback interruped");
        }
    }

    public void onButton2Click (View v) {
        mpF.seekTo(0);
        //Log.i(TAG, "Button 2 Clicked");
        Log.e(TAG, "Button 2 Clicked");
        mpF.start();
    }

    public void onChallenge1Click(View v) {
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

    private void playSome(MediaPlayer noteToPlay) {
        try {
            noteToPlay.seekTo(0);
            noteToPlay.start();
            delayPlaying(WHOLE_NOTE);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void playSome(MediaPlayer noteToPlay, int wholeNoteDivisor) {
        try {
            noteToPlay.seekTo(0);
            noteToPlay.start();
            delayPlaying(WHOLE_NOTE / wholeNoteDivisor);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void onChallenge8Click(View view) {
        Log.e(TAG, "Challenge 8 Button clicked");
        for (int note = 0; note < twinkleTwinkle.length; note++) {
            playSome(moreNotes[twinkleTwinkle[note]], twinkleTiming[note % twinkleTiming.length]);
        }
    }

    public void onMatromoneClick(View view) {
        Log.e(TAG, "Matromone clicked");
        for (int i = 0; i < 50; i++) {
            try {
                beats.start();
                delayPlaying(WHOLE_NOTE/2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //Metromone m = new Metromone(2);

        //m.createPlayer();
    }
}
