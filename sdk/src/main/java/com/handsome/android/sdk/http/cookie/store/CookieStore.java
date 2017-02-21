package com.handsome.android.sdk.http.cookie.store;

import java.util.List;

import okhttp3.Cookie;
import okhttp3.HttpUrl;

/**
 * 作者: shuaizhimin
 * 描述:
 * 日期: 2017-02-15
 * 时间: 17:24
 * 版本:
 */
public interface CookieStore {
    void add(HttpUrl url, List<Cookie> cookie);

    void add(HttpUrl url, Cookie cookie);

    List<Cookie> getCookie(HttpUrl url);

    List<Cookie> getAllCookie();

    boolean removeCookie(HttpUrl url);

    boolean removeCookie(HttpUrl url, Cookie cookie);

    boolean removeAllCookie();
}
