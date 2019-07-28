package com.raywenderlich.android.droidwiki.dagger

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class , PresenterModule::class])
interface AppComponent
