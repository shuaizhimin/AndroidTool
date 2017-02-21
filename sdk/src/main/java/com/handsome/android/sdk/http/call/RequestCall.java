package com.handsome.android.sdk.http.call;


import com.handsome.android.sdk.http.HSOkHttp;
import com.handsome.android.sdk.http.callback.CallBack;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * 作者: shuaizhimin
 * 描述:
 * 日期: 2017-02-14
 * 时间: 14:54
 * 版本:
 */
public class RequestCall implements ICall {
    public static final String TAG = "RequestCall";
    private Call mCall;

    public RequestCall(Call call) {
        this.mCall = call;
    }

    public void excute(final CallBack callBack){
        if (mCall == null) return;
        mCall.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                sendFinishCall(callBack);
                sendFailedResultCall(callBack, call, null, e);
            }

            @Override
            public void onResponse(Call call, Response response) {
                sendFinishCall(callBack);
                if (response != null && response.body() != null) {
                    sendSuccessResultCall(callBack, call, response);
                }
            }
        });
    }

    @Override
    public void sendFinishCall(final CallBack callBack) {
        if (callBack == null) return;
        HSOkHttp.getInstance().getDelivery().post(new Runnable() {
            @Override
            public void run() {
                callBack.onFinish();
            }
        });

    }

    @Override
    public void sendSuccessResultCall(final CallBack callBack, Call call, final Response response) {
        if (callBack == null) return;
        HSOkHttp.getInstance().getDelivery().post(new Runnable() {
            @Override
            public void run() {
                try {
                    callBack.onSuccess(callBack.parseResponse(response));
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
    }

    @Override
    public void sendFailedResultCall(final CallBack callBack, Call call, Response response, Exception e) {
        if (callBack == null) return;
        HSOkHttp.getInstance().getDelivery().post(new Runnable() {
            @Override
            public void run() {
                callBack.onError();
            }
        });
    }
}
