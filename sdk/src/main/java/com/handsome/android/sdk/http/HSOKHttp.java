package com.handsome.android.sdk.http;

import android.os.Handler;
import android.os.Looper;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

/**
 * 作者: shuaizhimin
 * 描述:
 * 日期: 2017-06-20
 * 时间: 15:42
 * 版本:
 */
public class HSOKHttp extends OkHttpClient{
    private static final int DEFAULT_TIMEOUT_MILLISECONDS=60000;   //默认超时见见
    private OkHttpClient.Builder mHttpBuilder;
    private Handler mHttpHandler;                 //主线程Handler
    public HSOKHttp() {
        mHttpBuilder=new OkHttpClient.Builder();
        mHttpBuilder.connectTimeout(DEFAULT_TIMEOUT_MILLISECONDS, TimeUnit.MILLISECONDS);
        mHttpBuilder.readTimeout(DEFAULT_TIMEOUT_MILLISECONDS,TimeUnit.MILLISECONDS);
        mHttpBuilder.writeTimeout(DEFAULT_TIMEOUT_MILLISECONDS,TimeUnit.MILLISECONDS);
        mHttpHandler=new Handler(Looper.getMainLooper());
    }

    public static HSOKHttp getInstance(){
        return HSOkClientHolder.holder;
    }

    private static class HSOkClientHolder{
        private static HSOKHttp holder=new HSOKHttp();
    }

    public Handler getHttpHandler() {
        return mHttpHandler;
    }
}
