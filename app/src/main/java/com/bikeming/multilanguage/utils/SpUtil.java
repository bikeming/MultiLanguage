package com.bikeming.multilanguage.utils;

import android.content.Context;
import android.content.SharedPreferences;

import com.bikeming.multilanguage.MultiLanguageApp;

/**
 * @ClassName: com.bikeming.multilanguage.utils
 * @Description:
 * @author: fjm
 * @date: 2019/8/22 9:31
 * @Version:1.0
 */
public class SpUtil {

    private SpUtil() {

    }

    private static volatile SharedPreferences sSP;

    private static final String PREFERENCE_NAME = "preference_name";

    private static SharedPreferences createSp() {
        if (sSP == null) {
            synchronized (SpUtil.class) {
                if (sSP == null) {
                    sSP = MultiLanguageApp.getINSTANCE().getSharedPreferences(PREFERENCE_NAME,
                            Context.MODE_PRIVATE);
                }
            }
        }
        return sSP;
    }

    public static void clear() {
        createSp().edit().clear().apply();
    }

    public static void remove(String key) {
        createSp().edit().remove(key).apply();
    }

    public static void putString(String key, String value) {
        SharedPreferences.Editor editor = createSp().edit();
        editor.putString(key, value);
        editor.apply();
    }

    public static String getString(String key) {
        return createSp().getString(key, "");
    }
}
