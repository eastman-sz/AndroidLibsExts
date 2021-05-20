package com.android.libs.main.ext.view.init

import android.content.Context

class CommonViewsContext {

    companion object{

        private var context : Context ?= null

        fun initContext(context : Context ?){
            this.context = context
        }


        fun getContext() : Context?{
            return context
        }

    }

}