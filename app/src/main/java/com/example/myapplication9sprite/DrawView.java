package com.example.myapplication9sprite;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class DrawView extends View {
    Sprite sprite;
    Paint bg = new Paint();

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        sprite = new Sprite(1,100,110,210,0,3,Color.MAGENTA);
        sprite.setBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.spritexb_1344));
    }

    public DrawView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        bg.setColor(Color.BLACK);
        canvas.drawRect(0,0,1200,2100,bg);
        sprite.update();
        sprite.draw(canvas);
        invalidate();
    }
}
