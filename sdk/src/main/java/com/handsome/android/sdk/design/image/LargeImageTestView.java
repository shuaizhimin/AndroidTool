package com.handsome.android.sdk.design.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import java.io.InputStream;

/**
 * 作者: shuaizhimin
 * 描述: 自己创造
 * 日期: 2017-02-22
 * 时间: 18:40
 * 版本:
 */
public class LargeImageTestView extends View {
    private Rect mRect=new Rect();
    private int mImageWidth;
    private int mImageHeight;
    private BitmapRegionDecoder mDecoder; //图片像素处理类
    //图片配置
    private static final BitmapFactory.Options options = new BitmapFactory.Options();

    public LargeImageTestView(Context context) {
        this(context,null);
    }

    public LargeImageTestView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    public void setImage(InputStream inputStream){

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bm = mDecoder.decodeRegion(mRect, options);
        canvas.drawBitmap(bm, 0, 0, null);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int width=getMeasuredWidth();
        int height=getMeasuredHeight();

        mRect.left=mImageWidth/2-width/2;
        mRect.top = mImageHeight / 2 - height / 2;
        mRect.right = mRect.left + width;
        mRect.bottom = mRect.top + height;
    }
}
