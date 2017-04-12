package com.handsome.android.sdk.http.call;

import okhttp3.Call;
import okhttp3.Response;

/**
 * 作者: shuaizhimin
 * 描述:
 * 日期: 2017-04-12
 * 时间: 16:29
 * 版本:
 */
public abstract class OKCallBack<T> {
    public void onBefore(){

    }
    public abstract void onSuccess(T t, Call call, Response response);
    public void onError(Call call,Response response,Exception e){

    }
    public void onFinish(){

    }

    /**
     * 上传
     * @param currentSize
     * @param totalSize
     * @param progress
     * @param networkSpeed
     */
    public void upProgress(long currentSize,long totalSize,float progress,long networkSpeed){

    }
    public void downloadProgress(long currentSize,long totalSize,float progress,long networkSpeed){

    }

}
