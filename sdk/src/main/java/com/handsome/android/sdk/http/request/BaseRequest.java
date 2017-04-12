package com.handsome.android.sdk.http.request;

import com.handsome.android.sdk.http.call.BaseCall;
import com.handsome.android.sdk.http.call.OKCallBack;

import java.io.IOException;

import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * 作者: shuaizhimin
 * 描述:
 * 日期: 2017-04-10
 * 时间: 19:10
 * 版本:
 */
public abstract class BaseRequest<T> {
    protected RequestParam requestParam=new RequestParam();
    protected BaseCall mBaseCall=new BaseCall();


    public BaseRequest(String url) {
        requestParam.setUrl(url);
    }
    public T url(String url){
        requestParam.setUrl(url);
        return (T) this;
    }

    public T tag(Object tag){
        requestParam.setTag(tag);
        return (T) this;
    }

    /**
     * 异步执行请求
     * @param callBack
     */
    public void excute(OKCallBack callBack){
        mBaseCall.excute(callBack);
    }

    /**
     * 同步执行请求
     * @return
     * @throws IOException
     */
    public Response excute() throws IOException {
        return mBaseCall.getCall().execute();
    }

    public abstract Request buildRequest(RequestBody requestBody);
}
