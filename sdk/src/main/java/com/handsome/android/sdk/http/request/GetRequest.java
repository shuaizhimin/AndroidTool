package com.handsome.android.sdk.http.request;


import com.handsome.android.sdk.http.builder.BaseRequestBuilder;

import okhttp3.Request;
import okhttp3.RequestBody;

/**
 * 作者: shuaizhimin
 * 描述:
 * 日期: 2017-02-14
 * 时间: 13:44
 * 版本:
 */
public class GetRequest extends OkHttpRequest {
    @Override
    public RequestBody buildRequestBody(BaseRequestBuilder builder) {
        return null;
    }

    @Override
    public Request buildRequest(BaseRequestBuilder builder, RequestBody requestBody) {
        Request.Builder reBuilder = new Request.Builder();
        reBuilder.url(builder.url);
        return reBuilder.get().build();
    }
}
