package com.handsome.android.sdk.http.callback;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.handsome.android.sdk.http.HSOKHttp;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;

/**
 * 作者: shuaizhimin
 * 描述:
 * 日期: 2017-06-20
 * 时间: 16:13
 * 版本:
 */
public class HSCall<T> {
    private Request request;

    public HSCall(Request request) {
        this.request = request;
    }


    public void excute(final AbsCallBack<T> callBack) {
        HSOKHttp.getInstance().newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (response != null) {
                    final T t = JSON.parseObject(response.body().string(), new TypeReference<T>() {
                    });
                    HSOKHttp.getInstance().getHttpHandler().post(new Runnable() {
                        @Override
                        public void run() {
                            callBack.onSuccess(t);
                        }
                    });
                }
            }
        });
    }

}
