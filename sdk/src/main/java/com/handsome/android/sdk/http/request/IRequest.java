package com.handsome.android.sdk.http.request;

/**
 * 作者: shuaizhimin
 * 描述:
 * 日期: 2017-04-12
 * 时间: 10:34
 * 版本:
 */
public interface IRequest {
    /**
     * get请求
     *
     * @param url
     * @return
     */
    GetRequest get(String url);

    /**
     * post请求
     *
     * @param url
     * @return
     */
    PostRequest post(String url);

    /**
     * delete请求
     *
     * @param url
     * @return
     */
    DeleteRequest delete(String url);

    /**
     * put请求
     *
     * @param url
     * @return
     */
    PutRequest put(String url);


}
