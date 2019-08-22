package com.bikeming.multilanguage;

import android.app.Application;
import android.content.Context;

/**
 * @ClassName: com.bikeming.multilanguage
 * @Description:
 * @author: fjm
 * @date: 2019/8/22 9:28
 * @Version:1.0
 */
public class MultiLanguageApp extends Application {
    private static MultiLanguageApp INSTANCE;

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE = this;
    }

    public static MultiLanguageApp getINSTANCE() {
        return INSTANCE;
    }

}
