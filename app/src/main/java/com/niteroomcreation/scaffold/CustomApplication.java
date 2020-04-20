package com.niteroomcreation.scaffold;

import android.support.multidex.MultiDexApplication;

import com.facebook.stetho.Stetho;
import com.pixplicity.easyprefs.library.Prefs;

/**
 * Created by Septian Adi Wijaya on 03/09/19
 */
public class CustomApplication extends MultiDexApplication {

    @Override
    public void onCreate() {
        super.onCreate();

        Stetho.initialize(Stetho.newInitializerBuilder(this)
                .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
                .enableWebKitInspector(Stetho.defaultInspectorModulesProvider(this))
                .build()
        );

        new Prefs.Builder()
                .setContext(this)
                .setMode(MODE_PRIVATE)
                .setPrefsName(getPackageName())
                .setUseDefaultSharedPreference(true)
                .build();
    }
}
