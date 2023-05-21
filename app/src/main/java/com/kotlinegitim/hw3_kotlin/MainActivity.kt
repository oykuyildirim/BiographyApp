package com.kotlinegitim.hw3_kotlin

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {

    lateinit var gallery_button : Button
    lateinit var information_button : Button
    lateinit var about_button : Button
    lateinit var blog_button : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gallery_button = findViewById(R.id.gallery)
        information_button = findViewById(R.id.connection)
        about_button = findViewById(R.id.about)
        blog_button = findViewById(R.id.blog)



        gallery_button.setOnClickListener {


            Intention(this,Gallery::class.java).IntentActivity()

        }

        about_button.setOnClickListener {

            Intention(this, About::class.java).IntentActivity()

        }


        information_button.setOnClickListener {

            Intention(this, Information::class.java).IntentActivity()

        }

        blog_button.setOnClickListener {

            Intention(this, Blog::class.java).IntentActivity()

        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_tab, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.aboutoption -> {
                Intention(this, About::class.java).IntentActivity()
            }
            R.id.connectionoption -> {
                Intention(this, Information::class.java).IntentActivity()
            }
            R.id.blogoption -> {
                Intention(this, Blog::class.java).IntentActivity()
            }
            R.id.galleryoption -> {
                Intention(this,Gallery::class.java).IntentActivity()
            }
        }
        return super.onOptionsItemSelected(item)
    }




}