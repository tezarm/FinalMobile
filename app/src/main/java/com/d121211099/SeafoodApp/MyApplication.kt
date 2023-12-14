package com.d121211099.SeafoodApp

import android.app.Application
import com.d121211099.SeafoodApp.Data.AppContainer
import com.d121211099.SeafoodApp.Data.DefaultAppContainer

class MyApplication: Application() {

    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }

}