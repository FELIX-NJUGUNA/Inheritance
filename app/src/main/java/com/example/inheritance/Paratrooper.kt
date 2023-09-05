package com.example.inheritance

import android.util.Log

//second child class
class Paratrooper: Soldier() {

    fun jumpOutOfPlane(){
        Log.i("Action","Jump out of the plane")
    }
}