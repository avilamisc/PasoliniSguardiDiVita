package com.omd.pasolinisdv.ui.base

import android.os.Bundle
import android.support.annotation.CallSuper
import android.support.v7.app.AppCompatActivity
import com.omd.pasolinisdv.ApplicationComponent
import com.omd.pasolinisdv.PasoliniSguardiDiVitaApp

abstract class BaseActivity: AppCompatActivity() {

    @CallSuper
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        injectDependencies(PasoliniSguardiDiVitaApp.graph)
    }

    abstract fun injectDependencies(graph: ApplicationComponent)
}