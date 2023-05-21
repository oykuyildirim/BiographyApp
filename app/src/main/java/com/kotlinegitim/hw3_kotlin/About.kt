package com.kotlinegitim.hw3_kotlin

import CustomAdaptors.CodingCustomAdaptor
import CustomAdaptors.EducationCustomAdaptor
import PersonInfo.Education
import PersonInfo.Person
import PersonInfo.ProgramLanguage
import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class About : AppCompatActivity() {

    lateinit var listView_coding : ListView
    lateinit var listView_education : ListView
    var programList = mutableListOf<ProgramLanguage>()
    var educationList = mutableListOf<Education>()
    var list = mutableListOf<Person>()

    var contextList = mutableListOf<Activity>()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        listView_education = findViewById(R.id.education)
        listView_coding = findViewById(R.id.coding)



        var javaObj = ProgramLanguage("JAVA","https://www.mediaclick.com.tr/uploads/2018/08/java.png")
        var cSharpObj = ProgramLanguage("C#","https://www.kaizen40.com/wp-content/uploads/2018/04/csharp.png")
        var kotlinObj = ProgramLanguage("KOTLIN","https://download.logo.wine/logo/Kotlin_(programming_language)/Kotlin_(programming_language)-Logo.wine.png")


        var primary = Education(2000,2009,"Kent Koop Primary School","Primary School","https://pbs.twimg.com/profile_images/1274629914663272449/kt3jn6Fa_400x400.jpg")
        var high = Education(2009,2013,"Selcuklu Anatolian High School","High School","https://pbs.twimg.com/profile_images/1274629914663272449/kt3jn6Fa_400x400.jpg")
        var university = Education(2014,2019,"Yıldırım Beyazıt University","Becholar","https://upload.wikimedia.org/wikipedia/commons/thumb/a/a6/Ankara_Y%C4%B1ld%C4%B1r%C4%B1m_Beyaz%C4%B1t_University_logo.svg/1200px-Ankara_Y%C4%B1ld%C4%B1r%C4%B1m_Beyaz%C4%B1t_University_logo.svg.png")
        var msSchool = Education (2019,2023, "Yıldırım Beyazıt University","Master","https://upload.wikimedia.org/wikipedia/commons/thumb/a/a6/Ankara_Y%C4%B1ld%C4%B1r%C4%B1m_Beyaz%C4%B1t_University_logo.svg/1200px-Ankara_Y%C4%B1ld%C4%B1r%C4%B1m_Beyaz%C4%B1t_University_logo.svg.png")

        programList.add(javaObj)
        programList.add(cSharpObj)
        programList.add(kotlinObj)


        educationList.add(primary)
        educationList.add(high)
        educationList.add(university)
        educationList.add(msSchool)


        var life = "İlkokul eğitimini Kent Koop İlköğretim okulunda tamamladıktan sonra lise öğrenimini" +
                " Selçuklu Anadolu Lise'sinde 2013 yılında tamamladı. Bunun ardından üniversite eğitimi bilgisayar mühendisliği alanında Ankara" +
                " Yıldırım Beyazıt Üniversitesi'nde tamamladı ve ardından yüksek lisans eğitimine artırılmış gerçeklik üzerine devam etti." +
                " İlgi alanlarım ise Android programlama ve Unity'dir. Galeri kısmında ise bazı kedi ve köpek ve türleri ile ilgili bazı bilgiler"+
                " verildi."



        Person("Öykü","Yıldırım","Ankara","7/7/1994","",life,educationList, programList,this)



        val customAdapter_coding = CodingCustomAdaptor(this, programList)

        listView_coding.adapter = customAdapter_coding

        val customAdapter_education = EducationCustomAdaptor(this, educationList)

        listView_education.adapter = customAdapter_education

    }

}