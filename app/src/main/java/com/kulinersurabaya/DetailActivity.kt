package com.kulinersurabaya

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        collapsing_toolbar_detail.title = intent.getStringExtra("title")
        collapsing_toolbar_detail.setExpandedTitleColor(Color.WHITE)

        Picasso.get().load(intent.getStringExtra("img")).into(image_detail)

        text_detail_price.text = intent.getStringExtra("price")
        text_detail_address.text = intent.getStringExtra("address")
        text_detail_description.text = intent.getStringExtra("description")

        setBackNav()
    }

    private fun setBackNav() {
        toolbar_detail.setNavigationIcon(R.drawable.ic_navigate_back_2)
        toolbar_detail.setNavigationOnClickListener { finish() }
    }
}
