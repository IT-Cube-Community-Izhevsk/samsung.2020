package ru.dpankratov.projects.rpg.mydraw;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class MyGame extends View implements View.OnTouchListener {

    private Paint paint = new Paint(); //Кисть
    private int viewWidth;
    private int viewHeight;

    private Bitmap pic;
    float touchX, touchY;

    float myShipX, myShipY;

    String myAction = "None";

    boolean fire = false;



    public MyGame(Context context) {
        super(context);
        setOnTouchListener(this);
        pic = BitmapFactory.decodeResource(getResources(), R.mipmap.ship1);
        myShipX = 0;
        paint.setColor(Color.RED);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w,h,oldw,oldh);
        viewHeight = h;
        viewWidth = w;
        myShipY = viewHeight-pic.getHeight();
    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        //canvas.scale(.5f, .5f);
        canvas.drawBitmap(pic, myShipX, myShipY, paint);
        paint.setTextSize(40);
        canvas.drawText(
                myAction + "=>X: " + String.valueOf(touchX) + ", Y:" + String.valueOf(touchY),
                100,100, paint );
        if (fire){
            fire = false;
            canvas.drawLine(
                    myShipX+pic.getWidth()/2,
                    myShipY,
                    myShipX+pic.getWidth()/2,
                    0, paint);
        }
        invalidate();
    }


    @Override
    public boolean onTouch(View v, MotionEvent event) {
        touchX = event.getX();
        touchY = event.getY();

        if (touchX>viewWidth-pic.getWidth()) {
            myShipX = viewWidth-pic.getWidth();
        } else {
            myShipX = touchX;
        }
        //myShipY = touchY;
        fire = true;

        switch(event.getAction()){
            case MotionEvent.ACTION_DOWN:
                myAction = "ACTION_DOWN";
                break;
            case MotionEvent.ACTION_UP:
                myAction = "ACTION_UP";
                break;
            case MotionEvent.ACTION_MOVE:
                myAction = "ACTION_MOVE";
                break;
        }
        return false;
    }
}
