package com.kulinersurabaya

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_food.view.*

class FoodAdapter(private val foods: MutableList<Food> = mutableListOf()):
        RecyclerView.Adapter<FoodAdapter.ViewHolder>() {

    private lateinit var ctx: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        ctx = parent.context
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_food, parent, false))
    }

    override fun getItemCount(): Int = foods.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData(foods[position])
        holder.itemView.setOnClickListener {
            val intent = Intent(ctx, DetailActivity::class.java)
            intent.putExtra("title", foods[position].title)
            intent.putExtra("img", foods[position].img_url)
            intent.putExtra("price", foods[position].price)
            intent.putExtra("address", foods[position].address)
            intent.putExtra("description", foods[position].description)
            ctx.startActivity(intent)
        }
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        fun bindData(food: Food){
            itemView.text_item_food_title.text = food.title
            itemView.text_item_food_address.text = food.address
            itemView.text_item_food_price.text = food.price
            Picasso.get().load(food.img_url).into(itemView.image_item_food_thumb)
        }
    }
}