package com.handsome.android.sdk.http.request;


import com.handsome.android.sdk.http.builder.BaseRequestBuilder;

import okhttp3.Request;
import okhttp3.RequestBody;

/**
 * 作者: shuaizhimin
 * 描述:
 * 日期: 2017-02-14
 * 时间: 13:47
 * 版本:
 */
public abstract class OkHttpRequest<T extends BaseRequestBuilder> {

    public OkHttpRequest() {
    }

    public abstract RequestBody buildRequestBody(T t);

    public abstract Request buildRequest(T t,RequestBody requestBody);
}
