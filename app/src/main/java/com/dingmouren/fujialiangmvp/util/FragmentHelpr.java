package com.dingmouren.fujialiangmvp.util;

import android.app.Activity;
import android.app.Fragment;

import com.dingmouren.fujialiangmvp.R;

/**
 * Created by dingzi on 2016/12/8.
 */

public class FragmentHelpr {

    public static void showFragment(Activity activity, Fragment fragment){
        activity.getFragmentManager().beginTransaction().replace(R.id.frame_home_activity,fragment).commit();
    }
}
