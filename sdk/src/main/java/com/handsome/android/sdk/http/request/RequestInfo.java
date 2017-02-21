package com.handsome.android.sdk.http.request;

import java.io.Serializable;

/**
 * 作者: shuaizhimin
 * 描述:
 * 日期: 2017-02-16
 * 时间: 15:54
 * 版本:
 */
public class RequestInfo implements Serializable{
    //请求Url
    private String requestUrl;
    //请求方法
    private String requestMethod;
    //请求可接受的媒体类型
    private String requestAccept;
    //请求上下文信息的服务器
    private String requestReferer;
    //请求接受语言
    private String requestAcceptLanguage;
    //请求内容
    private String requestContentType;
    //请求接受编码方法
    private String requestAcceptEncoding;
    //请求客户端的操作系统、浏览器版本和名称
    private String requestUserAgent;
    //请求连接方式
    private String requestConnection;
    //发送给服务器的长度
    private String requestContentLength;
    //请求Host
    private String requestHost;
    //请求缓存
    private String requestPragma;
    //请求cookie
    private String requestCookie;
    //请求接受编码
    private String requestAcceptCharset;














    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public String getRequestAccept() {
        return requestAccept;
    }

    public void setRequestAccept(String requestAccept) {
        this.requestAccept = requestAccept;
    }

    public String getRequestReferer() {
        return requestReferer;
    }

    public void setRequestReferer(String requestReferer) {
        this.requestReferer = requestReferer;
    }

    public String getRequestAcceptLanguage() {
        return requestAcceptLanguage;
    }

    public void setRequestAcceptLanguage(String requestAcceptLanguage) {
        this.requestAcceptLanguage = requestAcceptLanguage;
    }

    public String getRequestContentType() {
        return requestContentType;
    }

    public void setRequestContentType(String requestContentType) {
        this.requestContentType = requestContentType;
    }

    public String getRequestAcceptEncoding() {
        return requestAcceptEncoding;
    }

    public void setRequestAcceptEncoding(String requestAcceptEncoding) {
        this.requestAcceptEncoding = requestAcceptEncoding;
    }

    public String getRequestUserAgent() {
        return requestUserAgent;
    }

    public void setRequestUserAgent(String requestUserAgent) {
        this.requestUserAgent = requestUserAgent;
    }

    public String getRequestConnection() {
        return requestConnection;
    }

    public void setRequestConnection(String requestConnection) {
        this.requestConnection = requestConnection;
    }

    public String getRequestContentLength() {
        return requestContentLength;
    }

    public void setRequestContentLength(String requestContentLength) {
        this.requestContentLength = requestContentLength;
    }

    public String getRequestHost() {
        return requestHost;
    }

    public void setRequestHost(String requestHost) {
        this.requestHost = requestHost;
    }

    public String getRequestPragma() {
        return requestPragma;
    }

    public void setRequestPragma(String requestPragma) {
        this.requestPragma = requestPragma;
    }

    public String getRequestCookie() {
        return requestCookie;
    }

    public void setRequestCookie(String requestCookie) {
        this.requestCookie = requestCookie;
    }

    public String getRequestAcceptCharset() {
        return requestAcceptCharset;
    }

    public void setRequestAcceptCharset(String requestAcceptCharset) {
        this.requestAcceptCharset = requestAcceptCharset;
    }
}
