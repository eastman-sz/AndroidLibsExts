package com.android.libs.main.ext.view.common.base

import android.content.BroadcastReceiver
import android.content.IntentFilter
import com.android.libs.main.ext.view.init.CommonViewsContext

abstract class BaseBroadcastReceiver : BroadcastReceiver{

    private var hasRegistered = false

    constructor()

    open fun register(){
        if (!hasRegistered){
            val filter = IntentFilter()
            val actionS = addActions()
            actionS.forEach {
                filter.addAction(it)
            }
            CommonViewsContext.getContext()?.registerReceiver(this , filter)
            hasRegistered = true
        }
    }

    open fun unRegister(){
        if (hasRegistered){
            CommonViewsContext.getContext()?.unregisterReceiver(this)
            hasRegistered = false
        }
    }

    abstract fun addActions() : List<String>


}