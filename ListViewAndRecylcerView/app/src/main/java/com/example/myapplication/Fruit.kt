package com.example.myapplication
import kotlin.collections.ArrayList
import kotlin.random.Random
import kotlin.random.Random.Default.nextInt

data class Fruit (
    val name : String,
    val origin: String,
    val quantity: Int
    ){

    companion object{
        @JvmField
        val FRUIT_NAMES=arrayOf(
            "Apple","PineApple","Orange","Kiwi",
            "mango","DragonFruit","popaya","Mew"
        )
        @JvmField
        val ORIGIN=arrayOf(
            "Lakhnow","Mysore","Patna","Srinagar","kolkata"
        )
        @JvmStatic
        fun genRandomFruits(n:Int):ArrayList<Fruit>{
            val fruitArray=ArrayList<Fruit>(n)
            for(i in 1..n){
                fruitArray.add(
                    Fruit(
                        FRUIT_NAMES[Random.nextInt(8)],
                        ORIGIN[Random.nextInt(5)],
                        Random.nextInt(10)*100
                    )
                )
            }
            return fruitArray
        }
    }
}