package ru.nikita.samsung.hw17;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class MyView extends View {

    Paint paint = new Paint();
    float x = 0;
    float y = 0;

    public MyView(Context context){
        super(context);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setColor(Color.BLUE);
        x = canvas.getWidth()/2;
        canvas.drawCircle(x, y, 20, paint);
        //x += 0.5f;
        y += 0.5f;
        invalidate();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_UP:
                x = event.getX();
                y = event.getY();
                break;
        }
        return true;
    }
}
