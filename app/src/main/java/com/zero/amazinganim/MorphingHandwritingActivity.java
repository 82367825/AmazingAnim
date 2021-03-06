package com.zero.amazinganim;

import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.graphics.drawable.AnimatedVectorDrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by linzewu on 17-2-23.
 */

public class MorphingHandwritingActivity extends AppCompatActivity {

    private ImageView mImageView;
    private ImageView mImageView2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morphing_handwriting);

        mImageView = (ImageView) findViewById(R.id.imageview);
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat = AnimatedVectorDrawableCompat.create(
                this, R.drawable.animated_vector_pathmorphing_handwriting_android);
        mImageView.setImageDrawable(animatedVectorDrawableCompat);
        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Animatable)mImageView.getDrawable()).start();
            }
        });


        mImageView2 = (ImageView) findViewById(R.id.imageview2);
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat2 = AnimatedVectorDrawableCompat
                .create(
                this, R.drawable.animated_vector_handwriting_linzewu);
        mImageView2.setImageDrawable(animatedVectorDrawableCompat2);
        mImageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Animatable)mImageView2.getDrawable()).start();
            }
        });
        
    }
}
