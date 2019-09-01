package com.kulinersurabaya

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_about.*

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        Picasso.get().load("https://www.dicoding.com/images/small/avatar/2019082423330460b46aa6141a529616298da932847780.jpg").into(image_about)
        setBackNav()
    }

    private fun setBackNav() {
        toolbar_about.setNavigationIcon(R.drawable.ic_navigate_back)
        toolbar_about.setNavigationOnClickListener { finish() }
    }
}
