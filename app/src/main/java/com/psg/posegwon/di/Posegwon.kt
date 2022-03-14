package com.psg.posegwon.di

import android.app.Application
import com.psg.posegwon.di.module.appModule
import com.psg.posegwon.di.module.repositoryModule
import com.psg.posegwon.di.module.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class Posegwon: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.NONE)
            androidContext(this@Posegwon)
            modules(listOf(appModule, viewModelModule, repositoryModule))
        }
    }
}