package com.example.inheritance

import android.util.Log
        //Child class inherits from Soldier by use of colon
class SpecialForces: Soldier() {
    fun SneakOnEnemy(){
        Log.i("Action","Sneaking on enemy")
    }
}