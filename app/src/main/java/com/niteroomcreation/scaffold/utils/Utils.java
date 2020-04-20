package com.niteroomcreation.scaffold.utils;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Build;

import java.util.Locale;

/**
 * Created by Septian Adi Wijaya on 20/04/2020.
 * please be sure to add credential if you use people's code
 */
public class Utils {

    public static void setLanguageLocale(Activity context, String langCode){
        Locale locale = new Locale(langCode);
        Locale.setDefault(locale);
        Configuration conf = context.getBaseContext().getResources().getConfiguration();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            conf.setLocale(locale);
        } else {
            conf.locale = locale;
        }
        context.getBaseContext().getResources().updateConfiguration(conf, context.getBaseContext().getResources().getDisplayMetrics());
        context.recreate();

    }
}
