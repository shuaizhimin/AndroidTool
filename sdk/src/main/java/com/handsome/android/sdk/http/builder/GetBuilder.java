package com.handsome.android.sdk.http.builder;

import com.handsome.android.sdk.http.request.GetRequest;

import okhttp3.Request;
import okhttp3.RequestBody;

/**
 * 作者: shuaizhimin
 * 描述:
 * 日期: 2017-02-16
 * 时间: 16:41
 * 版本:
 */
public class GetBuilder extends BaseRequestBuilder {
    private GetRequest mGetRequest=new GetRequest();

    public GetBuilder(String url) {
        super(url);
        method="get";
    }

    @Override
    public RequestBody buildRequestBody() {
        return mGetRequest.buildRequestBody(this);
    }

    @Override
    public Request buildRequest(RequestBody requestBody) {
        return mGetRequest.buildRequest(this,requestBody);
    }


}
