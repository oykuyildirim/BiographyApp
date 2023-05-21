package com.kotlinegitim.hw3_kotlin

import PersonInfo.ConnectionInfo
import PersonInfo.Person
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class Information : AppCompatActivity() {

    lateinit var listView_information : ListView
    var list = mutableListOf<Person>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_information)


        var adress = "Kent Koop Mh., Arı Kovanı 2 Sitesi, 12/10, Batıkent/Ankara"
        var telephone ="05546149683"
        var email = "oyku_112@outlook.com"
        var linkedin = "https://www.linkedin.com/in/öyküyıldırım/"
        var connectionObj = ConnectionInfo(adress,telephone,email,linkedin,this)
        connectionObj.setConnectionInfo()



    }
}