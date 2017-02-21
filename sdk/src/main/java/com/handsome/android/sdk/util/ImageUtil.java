package com.handsome.android.sdk.util;

import android.opengl.GLES10;

import javax.microedition.khronos.opengles.GL10;

/**
 * 作者: shuaizhimin
 * 描述:
 * 日期: 2017-02-21
 * 时间: 15:19
 * 版本:
 */
public class ImageUtil {
    private static final int DEFAULT_MAX_BITMAP_DIMENSION = 2048;

    public static int[] getMaxTextureSize() {
        int[] maxTextureSize = new int[1];
        GLES10.glGetIntegerv(GL10.GL_MAX_TEXTURE_SIZE, maxTextureSize, 0);
        maxTextureSize[0] = Math.max(maxTextureSize[0], DEFAULT_MAX_BITMAP_DIMENSION);
        maxTextureSize[1] = Math.max(maxTextureSize[1], DEFAULT_MAX_BITMAP_DIMENSION);
        return maxTextureSize;
    }

}
