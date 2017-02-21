package com.handsome.android.sdk.http.call;

import com.handsome.android.sdk.http.callback.CallBack;

import okhttp3.Call;
import okhttp3.Response;

/**
 * 作者: shuaizhimin
 * 描述:
 * 日期: 2017-02-17
 * 时间: 19:22
 * 版本:
 */
public interface ICall {

    /**
     * 发送请求完成标识
     *
     * @param callBack
     */
    void sendFinishCall(CallBack callBack);

    /**
     * 发送成功结果
     *
     * @param callBack
     * @param call
     * @param response
     */
    void sendSuccessResultCall(CallBack callBack, Call call, Response response);

    /**
     * 发送失败结果
     *
     * @param callBack
     * @param call
     * @param response
     * @param e
     */
    void sendFailedResultCall(CallBack callBack, Call call, Response response, Exception e);

}
