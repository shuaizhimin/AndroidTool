package com.handsome.android.sdk.http.builder;

import com.handsome.android.sdk.http.HSOkHttp;
import com.handsome.android.sdk.http.call.RequestCall;
import com.handsome.android.sdk.http.callback.CallBack;

import java.util.Map;

import okhttp3.Call;
import okhttp3.Request;
import okhttp3.RequestBody;

/**
 * 作者: shuaizhimin
 * 描述:
 * 日期: 2017-02-16
 * 时间: 16:32
 * 版本:
 */
public abstract class BaseRequestBuilder<T extends BaseRequestBuilder> {
    public String url;                    //url
    public String baseUrl;                //基础Url
    public String method;                 //请求类型
    public Map<String, String> headers;   //请求头
    public Map<String, String> params;    //参数
    public Object tag;                    //标识
    private Request request;

    public BaseRequestBuilder(String url) {
        this.url = url;
    }


    public T baseUrl(String baseUrl) {
        baseUrl = baseUrl;
        return (T) this;
    }

    public T url(String url) {
        url = url;
        return (T) this;
    }

    public T addHeader(String key, String value) {

        return (T) this;
    }

    /**
     * 执行请求
     * request
     *
     * @param callback
     */
    public void execute(CallBack callback) {
        RequestBody requestBody = buildRequestBody();
        request = buildRequest(requestBody);
        Call call = HSOkHttp.getInstance().getOkHttpClient().newCall(request);
        new RequestCall(call).excute(callback);
    }


    public abstract RequestBody buildRequestBody();

    public abstract Request buildRequest(RequestBody requestBody);

    public Request getRequest() {
        return request;
    }
}
