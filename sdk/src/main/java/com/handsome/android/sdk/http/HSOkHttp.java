package com.handsome.android.sdk.http;

import android.os.Handler;
import android.os.Looper;

import com.handsome.android.sdk.http.builder.GetBuilder;
import com.handsome.android.sdk.http.cookie.CookieJarImpl;
import com.handsome.android.sdk.http.cookie.store.CookieStore;
import com.handsome.android.sdk.http.util.HSHostNameVerifier;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

/**
 * 作者: shuaizhimin
 * 描述: OkHttp封装类
 * 日期: 2017-02-14
 * 时间: 11:57
 * 版本:
 */
public class HSOkHttp extends OkHttpClient {
    public static final int TIME_OUT = 60_000;//超时时间
    private OkHttpClient.Builder mOkHttpBuilder = this.newBuilder();
    private CookieJarImpl mCookieJar;
    private Handler mDelivery;

    public HSOkHttp() {
        //主机校验
        mOkHttpBuilder.hostnameVerifier(new HSHostNameVerifier());
        //设置连接超时时间
        mOkHttpBuilder.connectTimeout(TIME_OUT, TimeUnit.MILLISECONDS);
        //设置读取超时时间
        mOkHttpBuilder.readTimeout(TIME_OUT, TimeUnit.MILLISECONDS);
        //设置写入超时时间
        mOkHttpBuilder.writeTimeout(TIME_OUT, TimeUnit.MILLISECONDS);
        mDelivery = new Handler(Looper.getMainLooper());

    }

    public static HSOkHttp getInstance() {
        return HSOkHttpHolder.instance;
    }

    /**
     * get请求
     *
     * @param url
     * @return
     */
    public GetBuilder get(String url) {
        return new GetBuilder(url);
    }

    /**
     * 设置全局Cookie
     *
     * @param cookieStore
     * @return
     */
    public HSOkHttp setCookieStore(CookieStore cookieStore) {
        mCookieJar = new CookieJarImpl(cookieStore);
        mOkHttpBuilder.cookieJar(mCookieJar);
        return this;
    }

    public OkHttpClient getOkHttpClient() {
        return mOkHttpBuilder.build();
    }


    /**
     * 静态内部类,实现线程安全
     */
    public static class HSOkHttpHolder {
        private static HSOkHttp instance = new HSOkHttp();
    }

    public Handler getDelivery() {
        return mDelivery;
    }

}
