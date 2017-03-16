package com.handsome.android.client.test.pic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.airbnb.deeplinkdispatch.DeepLink;
import com.handsome.android.client.R;
import com.handsome.android.sdk.design.image.LargeImageView;

import java.io.IOException;
import java.io.InputStream;

@DeepLink("Handsome://pic.com/pic/large")
/**
 *
 * 大图片资源直接转换成bitmap 对象容易导致OOM
 * 所有使用流的形式加载
 *
 *
 */
public class PicTestActivity extends AppCompatActivity {
    private LargeImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pic_test);
        setTitle("大图加载");

        mImageView = (LargeImageView) findViewById(R.id.image);


        InputStream inputStream = null;
        try {
            inputStream = getAssets().open("large_img.jpg");
        } catch (IOException e) {
            e.printStackTrace();
        }
        mImageView.setInputStream(inputStream);
    }
}

