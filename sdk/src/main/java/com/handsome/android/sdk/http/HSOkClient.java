package com.handsome.android.sdk.http;

import android.os.Handler;
import android.os.Looper;

import com.handsome.android.sdk.http.request.DeleteRequest;
import com.handsome.android.sdk.http.request.GetRequest;
import com.handsome.android.sdk.http.request.IRequest;
import com.handsome.android.sdk.http.request.PostRequest;
import com.handsome.android.sdk.http.request.PutRequest;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

/**
 * 作者: shuaizhimin
 * 描述:
 * 日期: 2017-04-10
 * 时间: 15:18
 * 版本:
 */
public class HSOkClient implements IRequest{
    private static final int DEFAULT_TIMEOUT_MILLISECONDS=60000;   //默认超时见见
    private OkHttpClient.Builder mHttpBuilder;
    private Handler mHttpHandler;                 //主线程Handler
    public HSOkClient() {
        mHttpBuilder=new OkHttpClient.Builder();
        mHttpBuilder.connectTimeout(DEFAULT_TIMEOUT_MILLISECONDS, TimeUnit.MILLISECONDS);
        mHttpBuilder.readTimeout(DEFAULT_TIMEOUT_MILLISECONDS,TimeUnit.MILLISECONDS);
        mHttpBuilder.writeTimeout(DEFAULT_TIMEOUT_MILLISECONDS,TimeUnit.MILLISECONDS);
        mHttpHandler=new Handler(Looper.getMainLooper());
    }

    public static HSOkClient getInstance(){
        return HSOkClientHolder.holder;
    }

    @Override
    public GetRequest get(String url) {
        return new GetRequest(url);
    }

    @Override
    public PostRequest post(String url) {
        return new PostRequest(url);
    }

    @Override
    public DeleteRequest delete(String url) {
        return new DeleteRequest(url);
    }

    @Override
    public PutRequest put(String url) {
        return new PutRequest(url);
    }

    private static class HSOkClientHolder{
        private static HSOkClient holder=new HSOkClient();
    }



}
