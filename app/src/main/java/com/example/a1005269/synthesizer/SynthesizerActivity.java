package com.example.a1005269.synthesizer;


import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TextView;

public class SynthesizerActivity extends AppCompatActivity {
    private static final String TAG =
            SynthesizerActivity.class.getName();
    private final int WHOLE_NOTE = 1000;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;
    private Button button12;
    private Button button13;
    private Button button14;
    private Button button15;
    private MediaPlayer mpA;
    private MediaPlayer mpB;
    private MediaPlayer mpBB;
    private MediaPlayer mpC;
    private MediaPlayer mpCS;
    private MediaPlayer mpD;
    private MediaPlayer mpDS;
    private MediaPlayer mpE;
    private MediaPlayer mpF;
    private MediaPlayer mpG;
    private MediaPlayer mpGS;
    private MediaPlayer mpHIGHE;
    private MediaPlayer mpHIGHF;
    private MediaPlayer mpHIGHFS;
    private MediaPlayer mpHIGHG;
    private Button mChallenge1;
    private Button mChallenge2;
    private Button mChallenge3;
    private Button mChallenge4;
    private NumberPicker np1;
    private NumberPicker np2;
    private NumberPicker np3;
    private NumberPicker np4;
    private MediaPlayer[] sounds = new MediaPlayer[8];
    private MediaPlayer[] notes = new MediaPlayer[15];
    private int i = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);

        np1 = (NumberPicker) findViewById(R.id.np1);
        np1.setMaxValue(14);
        np1.setMinValue(0);

        np2 = (NumberPicker) findViewById(R.id.np2);
        np2.setMaxValue(10);
        np2.setMinValue(0);

        button1 = (Button) findViewById(R.id.aButton);
        button2 = (Button) findViewById(R.id.bButton);
        button3 = (Button) findViewById(R.id.bbButton);
        button4 = (Button) findViewById(R.id.cButton);
        button5 = (Button) findViewById(R.id.csButton);
        button6 = (Button) findViewById(R.id.dButton);
        button7 = (Button) findViewById(R.id.dsButton);
        button8 = (Button) findViewById(R.id.eButton);
        button9 = (Button) findViewById(R.id.fButton);
        button10 = (Button) findViewById(R.id.gButton);
        button11= (Button) findViewById(R.id.gsButton);
        button12 = (Button) findViewById(R.id.higheButton);
        button13 = (Button) findViewById(R.id.highfButton);
        button14 = (Button) findViewById(R.id.highfsButton);
        button15 = (Button) findViewById(R.id.highgButton);
        mChallenge1 = (Button) findViewById(R.id.mChallenge1Button);
        mChallenge2 = (Button) findViewById(R.id.mChallenge2Button);
        mChallenge3 = (Button) findViewById(R.id.mChallenge3Button);
        mChallenge4 = (Button) findViewById(R.id.mChallenge4Button);

        mpA = MediaPlayer.create(this, R.raw.scalea);
        mpB = MediaPlayer.create(this, R.raw.scaleb);
        mpBB = MediaPlayer.create(this, R.raw.scalebb);
        mpC = MediaPlayer.create(this, R.raw.scalec);
        mpCS = MediaPlayer.create(this, R.raw.scalecs);
        mpD = MediaPlayer.create(this, R.raw.scaled);
        mpDS = MediaPlayer.create(this, R.raw.scaleds);
        mpE = MediaPlayer.create(this, R.raw.scalee);
        mpF = MediaPlayer.create(this, R.raw.scalef);
        mpG = MediaPlayer.create(this, R.raw.scaleg);
        mpGS = MediaPlayer.create(this, R.raw.scalegs);
        mpHIGHE = MediaPlayer.create(this, R.raw.scalehighe);
        mpHIGHF = MediaPlayer.create(this, R.raw.scalehighf);
        mpHIGHFS = MediaPlayer.create(this, R.raw.scalehighfs);
        mpHIGHG = MediaPlayer.create(this, R.raw.scalehighg);

        sounds[0] = mpE;
        sounds[1] = mpHIGHFS;
        sounds[2] = mpG;
        sounds[3] = mpA;
        sounds[4] = mpB;
        sounds[5] = mpCS;
        sounds[6] = mpD;
        sounds[7] = mpE;

        notes[0] = mpA;
        notes[1] = mpB;
        notes[2] = mpBB;
        notes[3] = mpC;
        notes[4] = mpCS;
        notes[5] = mpD;
        notes[6] = mpDS;
        notes[7] = mpE;
        notes[8] = mpF;
        notes[9] = mpG;
        notes[10] = mpGS;
        notes[11] = mpHIGHE;
        notes[12] = mpHIGHF;
        notes[13] = mpHIGHFS;
        notes[14] = mpHIGHG;
    }

    private void delayPlaying(int delay) throws InterruptedException {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Log.e("SynthesizerActivity","Audio playback interrupted");
        }
    }
     public void onmChallenge1Click(View v) {
            Log.e("SynthesizerActivity", "Challenge 0 Button clicked");
            try {
                mpE.start();
                delayPlaying(WHOLE_NOTE/2);
                mpHIGHFS.start();
                delayPlaying(WHOLE_NOTE/2);
                mpG.start();
                delayPlaying(WHOLE_NOTE/2);
                mpA.start();
                delayPlaying(WHOLE_NOTE/2);
                mpB.start();
                delayPlaying(WHOLE_NOTE/2);
                mpCS.start();
                delayPlaying(WHOLE_NOTE/2);
                mpD.start();
                delayPlaying(WHOLE_NOTE/2);
                mpE.start();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
     }


    public void onButton1Click(View v) {
        mpA.seekTo(0);
        Log.e(TAG, "Button 1 clicked");
        mpA.start();
    }
    public void onButton2Click(View v) {
        mpB.seekTo(0);
        Log.e(TAG, "Button 2 clicked");
        mpB.start();
    }
    public void onButton3Click(View v) {
        mpBB.seekTo(0);
        Log.e(TAG, "Button 3 clicked");
        mpBB.start();
    }
    public void onButton4Click(View v) {
        mpC.seekTo(0);
        Log.e(TAG, "Button 4 clicked");
        mpC.start();
    }
    public void onButton5Click(View v) {
        mpCS.seekTo(0);
        Log.e(TAG, "Button 5 clicked");
        mpCS.start();
    }
    public void onButton6Click(View v) {
        mpD.seekTo(0);
        Log.e(TAG, "Button 6 clicked");
        mpD.start();
    }
    public void onButton7Click(View v) {
        mpDS.seekTo(0);
        Log.e(TAG, "Button 7 clicked");
        mpDS.start();
    }
    public void onButton8Click(View v) {
        mpE.seekTo(0);
        Log.e(TAG, "Button 8 clicked");
        mpE.start();
    }
    public void onButton9Click(View v) {
        mpF.seekTo(0);
        Log.e(TAG, "Button 9 clicked");
        mpF.start();
    }
    public void onButton10Click(View v) {
        mpG.seekTo(0);
        Log.e(TAG, "Button 10 clicked");
        mpG.start();
    }
    public void onButton11Click(View v) {
        mpGS.seekTo(0);
        Log.e(TAG, "Button 11 clicked");
        mpGS.start();
    }
    public void onButton12Click(View v) {
        mpHIGHE.seekTo(0);
        Log.e(TAG, "Button 12 clicked");
        mpHIGHE.start();
    }
    public void onButton13Click(View v) {
        mpHIGHF.seekTo(0);
        Log.e(TAG, "Button 13 clicked");
        mpHIGHF.start();
    }
    public void onButton14Click(View v) {
        mpHIGHFS.seekTo(0);
        Log.e(TAG, "Button 14 clicked");
        mpHIGHFS.start();
    }
    public void onButton15Click(View v) {
        mpHIGHG.seekTo(0);
        Log.e(TAG, "Button 15 clicked");
        mpHIGHG.start();
    }
    public void onmChallenge2Click(View v){
        np1.clearFocus();
        int a = np1.getValue();

        np2.clearFocus();
        int b = np2.getValue();

        if (a == 0){
            playA(v, b);
        }
        else if (a == 1){
            playB(v, b);
        }
        else if (a == 2){
            playBB(v, b);
        }
        else if (a == 3){
            playC(v, b);
        }
        else if (a == 4){
            playCS(v, b);
        }
        else if (a == 5){
            playD(v, b);
        }
        else if (a == 6){
            playDS(v, b);
        }
        else if (a == 7){
            playE(v, b);
        }
        else if (a == 8){
            playF(v, b);
        }
        else if (a == 9){
            playG(v, b);
        }
        else if (a == 10){
            playGS(v, b);
        }
        else if (a == 11){
            playHIGHe(v, b);
        }
        else if (a == 12){
            playHIGHf(v, b);
        }
        else if (a == 13){
            playHIGHfs(v, b);
        }
        else{
            playHIGHg(v, b);
        }
    }

    public void playA(View v,int b) {
        for (int i=0; i<b; i++) {
            Log.e(TAG, "Play A");
            mpA.seekTo(0);
            mpA.start();
        }
    }
    public void playB(View v,int b) {
        for (int i=0; i<b; i++) {
            Log.e(TAG, "Play B");
            mpB.seekTo(0);
            mpB.start();
        }
    }
    public void playBB(View v,int b) {
        for (int i=0; i<b; i++) {
            Log.e(TAG, "Play BB");
            mpBB.seekTo(0);
            mpBB.start();
        }
    }
    public void playC(View v,int b) {
        for (int i=0; i<b; i++) {
            Log.e(TAG, "Play C");
            mpC.seekTo(0);
            mpC.start();
        }
    }
    public void playCS(View v,int b) {
        for (int i=0; i<b; i++) {
            Log.e(TAG, "Play CS");
            mpCS.seekTo(0);
            mpCS.start();
        }
    }
    public void playD(View v,int b) {
        for (int i=0; i<b; i++) {
            Log.e(TAG, "Play D");
            mpD.seekTo(0);
            mpD.start();
        }
    }
    public void playDS(View v,int b) {
        for (int i=0; i<b; i++) {
            Log.e(TAG, "Play DS");
            mpDS.seekTo(0);
            mpDS.start();
        }
    }
    public void playE(View v,int b) {
        for (int i=0; i<b; i++) {
            Log.e(TAG, "Play E");
            mpE.start();
        }
    }
    public void playF(View v,int b) {
        for (int i=0; i<b; i++) {
            Log.e(TAG, "Play F");
            mpF.seekTo(0);
            mpF.start();
        }
    }
    public void playG(View v,int b) {
        for (int i=0; i<b; i++) {
            Log.e(TAG, "Play G");
            mpG.seekTo(0);
            mpG.start();
        }
    }
    public void playGS(View v,int b) {
        for (int i=0; i<b; i++) {
            Log.e(TAG, "Play GS");
            mpGS.seekTo(0);
            mpGS.start();
        }
    }
    public void playHIGHg(View v,int b) {
        for (int i=0; i<b; i++) {
            Log.e(TAG, "Play High G");
            mpHIGHG.seekTo(0);
            mpHIGHG.start();
        }
    }
    public void playHIGHf(View v,int b) {
        for (int i=0; i<b; i++) {
            Log.e(TAG, "Play High F");
            mpHIGHF.seekTo(0);
            mpHIGHF.start();
        }
    }
    public void playHIGHfs(View v,int b) {
        for (int i=0; i<b; i++) {
            Log.e(TAG, "Play High FS");
            mpHIGHFS.seekTo(0);
            mpHIGHFS.start();
        }
    }
    public void playHIGHe(View v,int b) {
        for (int i=0; i<b; i++) {
            Log.e(TAG, "Play High E");
            mpHIGHE.seekTo(0);
            mpHIGHE.start();
        }
    }
    public void onmChallenge3Click(View v) {
        Log.e("SynthesizerActivity", "Challenge 3 Button clicked");
        for (MediaPlayer mp : sounds) {
            Log.i(TAG,"Note " + i);
            i++;
            playNote(mp);
        }
    }
    public void playNote(MediaPlayer sound){
        try {
            sound.seekTo(0);
            sound.start();
            delayPlaying(WHOLE_NOTE);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void onmChallenge4Click(View v){
        Log.e("SynthesizerActivity", "Challenge 4 Button clicked");

        np1.clearFocus();
        int a = np1.getValue();

        np2.clearFocus();
        int b = np2.getValue();

        if (a == 0){
            playA(v, b);
        }
        else if (a == 1){
            playB(v, b);
        }
        else if (a == 2){
            playBB(v, b);
        }
        else if (a == 3){
            playC(v, b);
        }
        else if (a == 4){
            playCS(v, b);
        }
        else if (a == 5){
            playD(v, b);
        }
        else if (a == 6){
            playDS(v, b);
        }
        else if (a == 7){
            playE(v, b);
        }
        else if (a == 8){
            playF(v, b);
        }
        else if (a == 9){
            playG(v, b);
        }
        else if (a == 10){
            playGS(v, b);
        }
        else if (a == 11){
            playHIGHe(v, b);
        }
        else if (a == 12){
            playHIGHf(v, b);
        }
        else if (a == 13){
            playHIGHfs(v, b);
        }
        else{
            playHIGHg(v, b);
        }
    }
}
