package com.kotlinegitim.hw3_kotlin

import android.content.Context
import android.content.Intent
import androidx.core.content.ContextCompat.startActivity

class Intention constructor(context: Context, cls : Class<*>) {

    var Context = context
    var Cls = cls

    fun IntentActivity(){

        var intent : Intent = Intent(Context, Cls)
        Context.startActivity(intent)
    }

}