package com.mindorks.example.android_dagger2_example.di.module

import android.content.Context
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.mindorks.example.android_dagger2_example.DemoApplication
import com.mindorks.example.android_dagger2_example.data.DataManager
import com.mindorks.example.android_dagger2_example.data.DbHelper
import com.mindorks.example.android_dagger2_example.data.SharedPrefsHelper
import com.mindorks.example.android_dagger2_example.di.component.ApplicationComponent

class NewClass:AppCompatActivity(), ApplicationComponent {
    override fun getContext(): Context? =this;

    override fun getDataManager(): DataManager {

    }

    override fun getPreferenceHelper(): SharedPrefsHelper {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getDbHelper(): DbHelper {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    var a=0;
    var b=10;
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        for (i in 0..b){
            var result=0;
            result=+i;
            Log.e("tag",""+result);
        }
        while (b>20){
            do {

            }
        }
    }

    override fun inject(demoApplication: DemoApplication?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}