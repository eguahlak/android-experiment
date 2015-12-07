package dk.cphbusiness.exampleapp.widgets;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.MotionEventCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;
import static java.lang.Math.*;

/**
 * Created by AKA on 24/11/15.
 */
public class ItemSlider extends TextView {
    private static final String TAG = "ItemSlider";
    private float downX = Float.MIN_VALUE;
    private boolean down = false;
    private float limit;

    public ItemSlider(Context context, AttributeSet attrs) {
        super(context, attrs);
        }



    @Override
    public boolean onTouchEvent(MotionEvent event) {
        limit = getWidth()/3;

        float x = event.getX();

        int action = MotionEventCompat.getActionMasked(event);
        String text = getText().toString();
        switch(action) {
            case (MotionEvent.ACTION_DOWN) :
                down = true;
                return true;
            case (MotionEvent.ACTION_MOVE) :
                if (!down) return true;
                float move = abs(x - downX);

                if (move < limit) setBackgroundColor(Color.WHITE);
                else if (move < 2*limit) setBackgroundColor(Color.YELLOW);
                else setBackgroundColor(Color.RED);

                return true;
            case (MotionEvent.ACTION_UP) :
                down = false;
                return true;
            case (MotionEvent.ACTION_CANCEL) :
                down = false;
                return true;
            case (MotionEvent.ACTION_OUTSIDE) :
                return true;
            default :
                return super.onTouchEvent(event);
            }
        }

    }
