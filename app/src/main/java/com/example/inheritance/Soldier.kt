package com.example.inheritance

import android.util.Log


//Super class
open class Soldier() {
    //open keyword makes the function overridden
    open fun shoot(){

            Log.i("Action","Bang bang bang")

    }
}