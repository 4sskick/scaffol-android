package com.niteroomcreation.scaffold.utils;

import android.app.Activity;
import android.content.Intent;

import com.niteroomcreation.scaffold.presentation.activities.account_setup.AccountSetupActivity;
import com.niteroomcreation.scaffold.presentation.activities.intro.IntroActivity;
import com.niteroomcreation.scaffold.presentation.activities.language.LanguageActivity;
import com.niteroomcreation.scaffold.presentation.activities.main.MainActivity;

/**
 * Created by Septian Adi Wijaya on 17/04/2020.
 * please be sure to add credential if you use people's code
 */
public class NavigationUtils {

    public static void directToMainScreen(Activity act) {
        Intent i = new Intent(act, MainActivity.class);
        act.startActivity(i);
    }

    public static void directToIntroScreen(Activity act) {
        Intent i = new Intent(act, IntroActivity.class);
        act.startActivity(i);
        act.finish();
    }

    public static void directToChooseLangugeScreen(Activity act) {
        Intent i = new Intent(act, LanguageActivity.class);
        act.startActivity(i);
    }

    public static void directToAccountSetup(Activity act) {
        Intent i = new Intent(act, AccountSetupActivity.class);
        act.startActivity(i);
    }

}
