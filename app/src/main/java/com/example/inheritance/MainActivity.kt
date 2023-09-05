
package com.example.inheritance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //calls the classes in the main function
      val specialForces = SpecialForces()
      specialForces.shoot()  //this function is inherited from the super class Soldier()
        specialForces.SneakOnEnemy()

        //second class calling
        val paratrooper = Paratrooper()
        paratrooper.shoot() //function from the super class
        paratrooper.jumpOutOfPlane()

        //sniper class
        val sniper = Sniper()
        sniper.getIntoPosition()
        sniper.shoot() //this overrides the function shoot in Soldier() class
        sniper.shoot()
        sniper.shoot()
        //Damn! NO ammo
        sniper.shoot()


    }
}