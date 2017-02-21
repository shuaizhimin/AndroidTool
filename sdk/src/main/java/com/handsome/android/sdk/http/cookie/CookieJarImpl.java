package com.handsome.android.sdk.http.cookie;

import com.handsome.android.sdk.http.cookie.store.CookieStore;

import java.util.List;

import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;

/**
 * 作者: shuaizhimin
 * 描述:
 * 日期: 2017-02-15
 * 时间: 17:21
 * 版本:
 */
public class CookieJarImpl implements CookieJar {
    private CookieStore mCookieStore;

    public CookieJarImpl(CookieStore cookieStore) {
        if (cookieStore == null) {
            throw new IllegalArgumentException("cookieStore can not be null!");
        }
        mCookieStore = cookieStore;
    }

    @Override
    public synchronized void saveFromResponse(HttpUrl url, List<Cookie> cookies) {
        mCookieStore.add(url, cookies);
    }

    @Override
    public synchronized List<Cookie> loadForRequest(HttpUrl url) {
        return mCookieStore.getCookie(url);
    }

    public CookieStore getCookieStore() {
        return mCookieStore;
    }
}
