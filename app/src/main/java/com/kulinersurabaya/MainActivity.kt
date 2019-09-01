package com.kulinersurabaya

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var listFood: ArrayList<Food> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listFood.addAll(FoodData.listData)
        button_about.setOnClickListener {
            startActivity(Intent(this, AboutActivity::class.java))
        }
        setRecycler()
    }

    private fun setRecycler() {
        recycler_food.setHasFixedSize(true)
        recycler_food.layoutManager = LinearLayoutManager(this)
        recycler_food.adapter = FoodAdapter(listFood)
    }
}
