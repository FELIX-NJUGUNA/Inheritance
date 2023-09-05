package com.example.inheritance

import android.util.Log

class Sniper: Soldier() {
    //ammo
    var sniperAmmo = 3

    //this function overrides the function Shoot() in the Soldier super class
    override fun shoot() {
        //when overriding a function make it open also just as the class
      when(sniperAmmo>0){
          true -> {
              Log.i("Action","Steady.... get.... bang!")
              sniperAmmo--
          }

          false -> {
              super.shoot()
          }
      }
    }

    fun getIntoPosition(){
        Log.i("Action","Preparing line of sight to target")
    }




}