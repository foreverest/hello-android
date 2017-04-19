package com.example.foreverest.helloandroid;

import android.app.Application;
import/**/
//
/**/com.buddybuild.sdk.BuddyBuild;/**/
/**
 * Created by Dmitry on 19.04.2017.
 */
/*
public class MainApplication1 extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
*/

public/**/class/*MainApplication1*/
//
MainApplication1
        //
        extends//
        Application/**/{/**/
    private static final String str = "@Override public void onCreate() {  super.onCreate(); }";

    //@Override public void onCreate() {
    //    super.onCreate();
    //}
    @Override/**/public/**/void/**//**/onCreate() //
    ///
    { //
        super.onCreate();
        /*}*/
        /// }
        BuddyBuild/**/./**/setup
                //
                (
                 /**/       this/**/
                );
    }
}
