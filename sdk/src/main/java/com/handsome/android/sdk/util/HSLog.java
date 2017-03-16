package com.handsome.android.sdk.util;

import android.text.TextUtils;
import android.util.Log;


/**
 * 作者: shuaizhimin
 * 描述:
 * 日期: 2017-02-22
 * 时间: 18:41
 * 版本:
 */
public class HSLog {
    public static boolean OPEN_LOG = true;

    /**
     * 采用Log.i()打印日志
     *
     * @param param1 标签
     * @param param2 打印的内容
     */
    public static void i(String param1, String param2) {
        if (OPEN_LOG) {
            if (!TextUtils.isEmpty(param1)&&!TextUtils.isEmpty(param2)) {
                Log.i(param1, param2);
            } else {
                Log.i("EveLog", "Log 为空!");
            }
        }
    }

    /**
     * 采用Log.d()打印日志
     *
     * @param param1 标签
     * @param param2 打印的内容
     */
    public static void d(String param1, String param2) {
        if (OPEN_LOG) {
            if (!TextUtils.isEmpty(param1)&&!TextUtils.isEmpty(param2)) {
                Log.i(param1, param2);
            } else {
                Log.i("EveLog", "Log 为空!");
            }
        }
    }

    /**
     * 采用Log.e()打印日志
     *
     * @param param1 标签
     * @param param2 打印的内容
     */
    public static void e(String param1, String param2) {
        if (OPEN_LOG) {
            if (param1 != null && param2 != null && !param1.equals("") && !param2.equals("")) {
                Log.e(param1, param2);
            } else {
                Log.e("EveLog", "Log 为空!");
            }
        }
    }

    /**
     * 采用Log.v()打印日志
     *
     * @param param1 标签
     * @param param2 打印的内容
     */
    public static void v(String param1, String param2) {
        if (OPEN_LOG) {
            if (param1 != null && param2 != null && !param1.equals("") && !param2.equals("")) {
                Log.v(param1, param2);
            } else {
                Log.v("EveLog", "Log 为空!");
            }
        }
    }
}
