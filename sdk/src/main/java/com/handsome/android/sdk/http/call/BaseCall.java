package com.handsome.android.sdk.http.call;

import okhttp3.Call;

/**
 * 作者: shuaizhimin
 * 描述:
 * 日期: 2017-04-12
 * 时间: 14:45
 * 版本:
 */
public class BaseCall {
    private Call call;

    public void excute(OKCallBack callBack){

    }

    public Call getCall() {
        return call;
    }

    public void setCall(Call call) {
        this.call = call;
    }
}
