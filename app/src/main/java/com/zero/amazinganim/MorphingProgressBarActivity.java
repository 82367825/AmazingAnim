package com.zero.amazinganim;

import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.graphics.drawable.AnimatedVectorDrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by linzewu on 2017/2/9.
 */

public class MorphingProgressBarActivity extends AppCompatActivity {

    
    private ImageView mImageView;
    
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morphing_progressbar);
        
        mImageView = (ImageView) findViewById(R.id.imageview);
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat = AnimatedVectorDrawableCompat.create(
                this, R.drawable.animated_vector_progressbar);
        mImageView.setImageDrawable(animatedVectorDrawableCompat);   
        ((Animatable)mImageView.getDrawable()).start();
    }
}
