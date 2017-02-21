package com.handsome.android.sdk.http.callback;


import java.io.IOException;

import okhttp3.Response;

/**
 * 作者: shuaizhimin
 * 描述:
 * 日期: 2017-02-17
 * 时间: 11:52
 * 版本:
 */
public abstract class StringCallback extends CallBack<String> {
    @Override
    public String parseResponse(Response response) throws IOException {
        if (response == null || response.body() == null) return "";
        return response.body().string();
    }
}
