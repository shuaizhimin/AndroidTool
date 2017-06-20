package com.handsome.android.sdk.http.request;

import com.handsome.android.sdk.http.callback.AbsCallBack;
import com.handsome.android.sdk.http.callback.HSCall;


import okhttp3.Request;
import okhttp3.RequestBody;

/**
 * 作者: shuaizhimin
 * 描述:
 * 日期: 2017-06-20
 * 时间: 15:53
 * 版本:
 */
public abstract class BaseRequest<T> {
    protected String url;
    protected Object tag;

    public BaseRequest(String url) {
       this.url=url;
    }
    public T url(String url){
        this.url=url;
        return (T) this;
    }

    public T tag(Object tag){
        this.tag=tag;
        return (T) this;
    }

    /**
     * 异步执行请求
     * @param callBack
     */
    public void excute(AbsCallBack<T> callBack){
        new HSCall<T>(generateRequest(generateRequestBody())).excute(callBack);
    }

    public abstract Request generateRequest(RequestBody requestBody);
    protected abstract RequestBody generateRequestBody();
}
