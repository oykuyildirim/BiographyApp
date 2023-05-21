package com.kotlinegitim.hw3_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso


class DetailInfo : AppCompatActivity() {

    lateinit var DescriptionText : TextView
    lateinit var LocationText : TextView
    lateinit var  animalTypeText : TextView
    lateinit var  animalImage : ImageView
    lateinit var  lifeText : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_info)



        animalTypeText = findViewById(R.id.speciesname)
        LocationText = findViewById(R.id.age)
        DescriptionText = findViewById(R.id.description)
        animalImage = findViewById(R.id.animal)
        lifeText = findViewById(R.id.lifeTime)



        var description = intent.getStringExtra("description")
        var location = intent.getStringExtra("location")
        var Url = intent.getStringExtra("url")
        var name = intent.getStringExtra("name")
        var life = intent.getStringExtra("lifeTime")

        animalTypeText.text = name
        LocationText.text = location
        DescriptionText.text = description
        lifeText.text = life


        Picasso.get()
            .load(Url)
            .into(animalImage);








    }
}