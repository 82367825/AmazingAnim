package com.zero.amazinganim;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by linzewu on 2017/2/6.
 */

public class DrawPathActivity extends AppCompatActivity {

    private ImageView mImageView1;
    private ImageView mImageView2;
    private ImageView mImageView3;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawpath);
        mImageView1 = (ImageView) findViewById(R.id.imageview1);
        mImageView2 = (ImageView) findViewById(R.id.imageview2);
        mImageView3 = (ImageView) findViewById(R.id.imageview3);
    }
    
    
}
