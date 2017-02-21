package com.handsome.android.sdk.http.util;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/**
 * 作者: shuaizhimin
 * 描述: 主机校验
 * 日期: 2017-02-14
 * 时间: 13:16
 * 版本:
 */
public class HSHostNameVerifier implements HostnameVerifier{
    @Override
    public boolean verify(String hostname, SSLSession session) {
        return true;
    }
}
