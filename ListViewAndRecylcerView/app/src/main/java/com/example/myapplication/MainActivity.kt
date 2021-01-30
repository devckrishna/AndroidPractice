package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.list_item_fruit.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        lvFruits.adapter = ArrayAdapter(
//            this,
//            R.layout.list_item_fruit,
//            R.id.tvFruitName,
//            arrayOf(
//                "Apple",
//                "Mango",
//                "Strawberry",
//                "Grapes",
//                "DragonFruit",
//                "Orange",
//                "Apple",
//                "Mango",
//                "Strawberry",
//                "Grapes",
//                "DragonFruit",
//                "Orange",
//                "Apple",
//                "Mango",
//                "Strawberry",
//                "Grapes",
//                "DragonFruit",
//                "Orange",
//            )
//        )
//
//        lvFruits.setOnItemClickListener{parent,view,position,id->
//            Toast.makeText(this,"Dev Ate ${position+1} ${view.tvFruitName.text} ",Toast.LENGTH_SHORT).show()
//        }

        val fruits=Fruit.genRandomFruits(100)

        val fruitAdapter= FruitAdapter(fruits)

        rvFruits.layoutManager = LinearLayoutManager(this)
        rvFruits.adapter=fruitAdapter



    }
}