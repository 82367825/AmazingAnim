package com.zero.amazinganim;

import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.graphics.drawable.AnimatedVectorDrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * @author linzewu
 * @date 2017/2/21
 */

public class MorphingFingerActivity extends AppCompatActivity {

    private ImageView mImageView;
    
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morphing_finger);

        mImageView = (ImageView) findViewById(R.id.imageview);
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat = AnimatedVectorDrawableCompat.create(
                this, R.drawable.animated_vector_finger);
        mImageView.setImageDrawable(animatedVectorDrawableCompat);
        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Animatable)mImageView.getDrawable()).start();
            }
        });
    }
}
