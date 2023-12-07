package com.example.myapplication9sprite;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class  DrawView extends View {
    Sprite sprite;
    Paint bg = new Paint();
    Paint block1 = new Paint();
    Paint block2 = new Paint();
    Paint block3 = new Paint();

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        sprite = new Sprite(1,100,110,210,0,3,Color.BLACK);
        sprite.setBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.spritexb_1344));
    }

    public DrawView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        bg.setColor(Color.BLACK);
//        canvas.drawRect(0,0,1200,2100,bg);
        block1.setColor(Color.GREEN);
        block2.setColor(Color.MAGENTA);
        block3.setColor(Color.BLUE);
        canvas.drawRect(.3f*getWidth(),0,.6f*getWidth(),.1f*getHeight(),block1);
//        canvas.drawRect(1500,600,2000,1100,block2);
//        canvas.drawRect(1300,1500,1600,1800,block3);



//        sprite.update();
//        sprite.draw(canvas);
        invalidate();
    }
}
