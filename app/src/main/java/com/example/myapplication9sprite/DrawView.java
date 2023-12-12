package com.example.myapplication9sprite;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;

public class  DrawView extends View {
    Sprite sprite;
    Paint bg = new Paint();
    Paint block1 = new Paint();
    Paint block2 = new Paint();
    Paint block3 = new Paint();
    Paint block4 = new Paint();

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
        canvas.drawRect(0,0,1200,2100,bg);
        block1.setColor(Color.GREEN);
        block2.setColor(Color.MAGENTA);
        block3.setColor(Color.BLUE);
        block4.setColor(Color.RED);
        canvas.drawRect(.3f*getWidth(),0,.6f*getWidth(),.1f*getHeight(),block1);
        canvas.drawRect(.7f*getWidth(),.2f*getHeight(),.9f*getWidth(),.4f*getHeight(),block2);
        canvas.drawRect(.4f*getWidth(),.6f*getHeight(),.5f*getWidth(),.8f*getHeight(),block3);
        canvas.drawRect(.8f*getWidth(),.8f*getHeight(),1*getWidth(),.95f*getHeight(),block4);



        sprite.update();
        sprite.draw(canvas);
        invalidate();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(event.getAction()==MotionEvent.ACTION_DOWN){
            if(sprite.contains(event.getX(),event.getY())){
                dX = 3;

                sprite.setBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.spritexb_1344));
            }
        }

        return true;
    }

    public void onClick ()
    {



    }



}
