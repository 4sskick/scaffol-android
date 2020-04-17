package com.niteroomcreation.scaffold.utils;

import android.app.Activity;
import android.content.Intent;

import com.niteroomcreation.scaffold.ui.activity.main.MainActivity;

/**
 * Created by Septian Adi Wijaya on 17/04/2020.
 * please be sure to add credential if you use people's code
 */
public class NavigationUtils {

    public static void directToMainScreen(Activity act) {
        Intent i = new Intent(act, MainActivity.class);
        act.startActivity(i);
    }

}
