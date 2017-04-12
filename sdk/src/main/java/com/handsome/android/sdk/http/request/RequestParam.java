package com.handsome.android.sdk.http.request;

/**
 * 作者: shuaizhimin
 * 描述:
 * 日期: 2017-04-12
 * 时间: 12:01
 * 版本:
 */
public class RequestParam {
    private String url;      //请求地址
    private Object tag;      //标识


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Object getTag() {
        return tag;
    }

    public void setTag(Object tag) {
        this.tag = tag;
    }
}
