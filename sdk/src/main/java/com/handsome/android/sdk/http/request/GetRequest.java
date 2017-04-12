package com.handsome.android.sdk.http.request;

import okhttp3.Request;
import okhttp3.RequestBody;

/**
 * 作者: shuaizhimin
 * 描述: Get Request 构造
 * 日期: 2017-04-10
 * 时间: 18:38
 * 版本:
 */
public class GetRequest extends BaseRequest<GetRequest>{


    public GetRequest(String url) {
        super(url);
    }

    @Override
    public Request buildRequest(RequestBody requestBody) {
        Request.Builder requestBuilder=new Request.Builder();
        return requestBuilder.get().url(requestParam.getUrl()).tag(requestParam.getTag()).build();
    }
}
