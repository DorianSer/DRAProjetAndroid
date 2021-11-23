package com.example.tabbed

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import fragments.AnimationFragment
import fragments.AvisFragment
import fragments.RestaurantFragment
import fragments.adapters.ViewPagerAdapter


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(RestaurantFragment(), "Restaurant")
        adapter.addFragment(AnimationFragment(), "Animation")
        adapter.addFragment(AvisFragment(), "Avis")
        findViewById<androidx.viewpager.widget.ViewPager>(R.id.viewPager).adapter = adapter
        findViewById<com.google.android.material.tabs.TabLayout>(R.id.tabs).setupWithViewPager(findViewById<androidx.viewpager.widget.ViewPager>(R.id.viewPager))
        findViewById<com.google.android.material.tabs.TabLayout>(R.id.tabs).getTabAt(0)!!.setIcon(R.drawable.resto)
        findViewById<com.google.android.material.tabs.TabLayout>(R.id.tabs).getTabAt(1)!!.setIcon(R.drawable.coin_removebg_preview)
        findViewById<com.google.android.material.tabs.TabLayout>(R.id.tabs).getTabAt(2)!!.setIcon(R.drawable.red_star_1_logo_png_transparent)

    }
    fun btn1(v: View) {
        Toast.makeText(this, R.string.pizza, Toast.LENGTH_SHORT).show()
    }
    fun btn2(v: View) {
        Toast.makeText(this, R.string.burger, Toast.LENGTH_SHORT).show()
    }
    fun btn3(v: View) {
        Toast.makeText(this, R.string.pate, Toast.LENGTH_SHORT).show()
    }
    fun btn4(v: View) {
        Toast.makeText(this, R.string.frite, Toast.LENGTH_SHORT).show()
    }
}