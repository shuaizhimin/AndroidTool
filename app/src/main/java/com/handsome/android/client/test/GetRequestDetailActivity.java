package com.handsome.android.client.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.handsome.android.client.R;
import com.handsome.android.sdk.http.HSOkHttp;
import com.handsome.android.sdk.http.builder.GetBuilder;
import com.handsome.android.sdk.http.callback.StringCallback;

import java.io.IOException;
import java.util.Iterator;

import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;

public class GetRequestDetailActivity extends AppCompatActivity {
    private GetBuilder mGetBuilder;

    private TextView mHeadersText;
    private TextView mCookiesText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_request_detail);
        initView();
        doGet();
    }
    private void initView() {
        mHeadersText = (TextView) findViewById(R.id.mHeadersText);
        mCookiesText = (TextView) findViewById(R.id.mCookiesText);
    }
    private void doGet() {
        mGetBuilder = HSOkHttp.getInstance().get("http://192.168.4.137:8080/home");

        mGetBuilder.execute(new StringCallback() {
            @Override
            public String parseResponse(Response response) throws IOException {
                updateView(response);
                return super.parseResponse(response);
            }

            @Override
            public void onSuccess(String s) throws IOException {
                Log.e("onSuccess", "" + s);
            }

            @Override
            public void onError() {

            }

            @Override
            public void onFinish() {

            }


        });
    }



    private void updateView(Response response) {
        if (response == null) return;
        Request request = mGetBuilder.getRequest();
        if (request == null) return;
        Headers headers = response.headers();
        Iterator it = headers.names().iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            String value = headers.get(key);
            Log.e("Headers", "key: " + key + " value: " + value);
        }
        mHeadersText.setText(headers.toString());
    }
}
