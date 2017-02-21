package com.handsome.android.sdk.http.callback;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Request;
import okhttp3.Response;

/**
 * 作者: shuaizhimin
 * 描述:
 * 日期: 2017-02-14
 * 时间: 14:27
 * 版本:
 */
public abstract class CallBack<T> {
    /**
     * 请求发起前
     *
     * @param request
     */
    public void onBefore(Request request) {

    }

    /**
     * 请求发起后
     */
    public void onAfter() {

    }

    public void inProgress(float progress, long total) {

    }



    public abstract void onSuccess(T t) throws IOException;

    public abstract void onError();

    public abstract void onFinish();

    public abstract T parseResponse(Response response) throws IOException;
}
