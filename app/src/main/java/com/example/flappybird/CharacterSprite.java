package com.example.flappybird;

import static com.example.flappybird.MainThread.canvas;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;


public class CharacterSprite {

    private Bitmap image;
    public int x, y;
    private int xVelocity = 15;
    public int yVelocity = 5;
    private int screenWidth = Resources.getSystem().getDisplayMetrics().widthPixels;
    private int screenHeight = Resources.getSystem().getDisplayMetrics().heightPixels;
    public Paint scorePaint;

    public CharacterSprite(Bitmap bmp) {
        image = bmp;
        x = 100;
        y = 100;
        scorePaint = new Paint();
        scorePaint.setColor(Color.BLACK);
        scorePaint.setTextSize(100);
        scorePaint.setFakeBoldText(true);
    }


    public void draw(Canvas canvas) {
        canvas.drawBitmap(image, x, y, null);
    }

    public void updateScore(Canvas canvas, int score) {
        canvas.drawText("Score: " + score, 60, 90, scorePaint);
    }

    public void update() {
        y += yVelocity;
    }
}

