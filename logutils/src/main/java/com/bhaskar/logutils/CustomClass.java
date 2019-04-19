package com.bhaskar.logutils;

import android.util.Log;

public class CustomClass {

    public static int multi(int a,int b,String TAG)
    {
        Log.d(TAG,"mullti of a and b ="+a*b);

        return a*b;

    }
}
