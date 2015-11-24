package dk.cphbusiness.exampleapp.widgets;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.support.v4.view.MotionEventCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

/**
 * Created by AKA on 24/11/15.
 */
public class ItemSlider extends TextView {
    private static final String TAG = "ItemSlider";

    public ItemSlider(Context context, AttributeSet attrs) {
        super(context, attrs);
        }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d(TAG, " " + event.getX() + " " + event.getY());
        int action = MotionEventCompat.getActionMasked(event);
        String text = getText().toString();
        switch(action) {
            case (MotionEvent.ACTION_DOWN) :
                Log.d(TAG,"Action was DOWN on "+text);
                return true;
            case (MotionEvent.ACTION_MOVE) :
                Log.d(TAG,"Action was MOVE on "+text);
                return true;
            case (MotionEvent.ACTION_UP) :
                Log.d(TAG,"Action was UP");
                return true;
            case (MotionEvent.ACTION_CANCEL) :
                Log.d(TAG,"Action was CANCEL");
                return true;
            case (MotionEvent.ACTION_OUTSIDE) :
                Log.d(TAG,"Movement occurred outside bounds " +
                        "of current screen element");
                return true;
            default :
                return super.onTouchEvent(event);
            }
        }

    }
