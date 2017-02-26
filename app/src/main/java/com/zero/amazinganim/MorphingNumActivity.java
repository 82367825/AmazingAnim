package com.zero.amazinganim;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by linzewu on 2017/2/6.
 */

public class MorphingNumActivity extends AppCompatActivity {

    private static final int[] DIGIT_STATES = {
            R.attr.state_zero,
            R.attr.state_one,
            R.attr.state_two,
            R.attr.state_three,
            R.attr.state_four,
            R.attr.state_five,
            R.attr.state_six,
            R.attr.state_seven,
            R.attr.state_eight,
            R.attr.state_nine,
    };
    
    private ImageView mImageView;
    
    private int mCurrentNum = 0;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morphing_num);

        mImageView = (ImageView) findViewById(R.id.imageview);
        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurrentNum++;
                if (mCurrentNum > 9) {
                    mCurrentNum = 0;
                }
                int[] state = new int[DIGIT_STATES.length];
                for (int i = 0 ; i < DIGIT_STATES.length; i++) {
                    if (i == mCurrentNum) {
                        state[i] = DIGIT_STATES[i];
                    } else {
                        state[i] = -DIGIT_STATES[i];
                    }
                }
                mImageView.setImageState(state, true);
            }
        });
    }
}
