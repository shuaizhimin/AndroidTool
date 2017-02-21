package com.handsome.android.client.deeplink;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.airbnb.deeplinkdispatch.DeepLinkHandler;

/**
 * 作者: shuaizhimin
 * 描述:
 * 日期: 2017-02-20
 * 时间: 23:20
 * 版本:
 */
@DeepLinkHandler({ AppDeepLinkModule.class, LibraryDeepLinkModule.class })
public class DeepLinkActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // DeepLinkDelegate, LibraryDeepLinkModuleLoader and AppDeepLinkModuleLoader
        // are generated at compile-time.
        DeepLinkDelegate deepLinkDelegate =
                new DeepLinkDelegate(new AppDeepLinkModuleLoader(), new LibraryDeepLinkModuleLoader());
        // Delegate the deep link handling to DeepLinkDispatch.
        // It will start the correct Activity based on the incoming Intent URI
        deepLinkDelegate.dispatchFrom(this);
        // Finish this Activity since the correct one has been just started
        finish();
    }
}
