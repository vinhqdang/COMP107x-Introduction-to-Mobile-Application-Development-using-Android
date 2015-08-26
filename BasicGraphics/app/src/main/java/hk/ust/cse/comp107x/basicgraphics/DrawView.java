package hk.ust.cse.comp107x.basicgraphics;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by muppala on 23/5/15.
 */
public class DrawView extends View {

    private int width, height;
    Paint redpaint, bluepaint;
    Bitmap android_guy;

    public DrawView(Context context, AttributeSet attrs) {
        super(context, attrs);


        //TODO CREATE PAINT OBJECTS


        //TODO CREATE AN ANDROID GUY BITMAP
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


        //TODO DRAW ITEMS ON CANVAS

    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);

        width = w;
        height = h;
    }
}
