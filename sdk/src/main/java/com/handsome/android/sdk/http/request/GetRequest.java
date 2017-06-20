package com.handsome.android.sdk.http.request;

import okhttp3.Request;
import okhttp3.RequestBody;

/**
 * 作者: shuaizhimin
 * 描述: get请求
 * 日期: 2017-06-20
 * 时间: 15:49
 * 版本:
 */
public class GetRequest extends BaseRequest<GetRequest>{

    public GetRequest(String url) {
        super(url);
    }

    @Override
    public Request generateRequest(RequestBody requestBody) {
        Request.Builder requestBuilder=new Request.Builder();
        return requestBuilder.get().url(url).tag(tag).build();
    }

    @Override
    protected RequestBody generateRequestBody() {
        return null;
    }
}
