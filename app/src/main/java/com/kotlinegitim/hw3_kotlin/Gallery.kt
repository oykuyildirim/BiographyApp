package com.kotlinegitim.hw3_kotlin

import CustomAdaptors.GalleryCustomAdaptor
import GallerySettings.Cat
import GallerySettings.Dog
import GallerySettings.GalleryInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.*

class Gallery : AppCompatActivity() {


    lateinit var listView_gallery : ListView
    var list = mutableListOf<GalleryInterface>()

    lateinit var listBtn : Button
    lateinit var txt : TextView




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)




        listView_gallery = findViewById(R.id.gallery_view)
        var obj1 : GalleryInterface = Cat("Scotish Fold","Genellikle gri tonlarında olan Scottish Fold, 1961 yılında İskoçya'da William Ross adındaki bir çiftçi tarafından fark edilmiştir. 1966 yılında kulak kıkırdağındaki bir mutasyon sebebiyle küçük ve içe doğru kıvrık kulak yapısı ile ünlenmiş olup GCCF tarafından kayıt altına alınmıştır.","İskoçya","https://blog.petibom.com/wp-content/uploads/2021/09/tekir-desenli-scottish-fold.jpg")
        var obj2 : GalleryInterface = Cat("British Shorthair", "Mısır kökenli olmakla birlikte Büyük Britanya'yı istila eden Romalılar ile birlikte İngiltere'ye geldiği düşünülmektedir. Tanınan en eski kedi ırklarından birisidir, yüzyıllar içerisinde çok az değişime uğramıştır. 1914 - 1918 tarihleri arasında Fars Kedisi ile çaprazlanarak uzun tüy genine sahip versiyonu üretilmiştir.","Büyük Britanya","https://blog.petibom.com/wp-content/uploads/2021/09/british-shorthair-evcil-kedi.jpg")
        var obj3 : GalleryInterface = Dog("Shiba Inu","Japonya'dan gelen bir av köpeği türüdür. Küçük ila orta boy bir cins, Japonya'ya özgü altı orijinal ve farklı spitz köpek ırkının en küçüğüdür. Adı, oyunu yıkamak için kullanıldığı için kelimenin tam anlamıyla \"çalı köpeği\" anlamına gelir.", "Japonya", "https://cdn.britannica.com/71/234471-050-093F4211/shiba-inu-dog-in-the-snow.jpg","12–15 yıl" )
        var obj4 : GalleryInterface = Cat("Ragdoll","Belirgin bir renk noktalı kürkü ve mavi gözleri olan bir kedi türüdür. Morfolojisi büyük ve ağırdır, yarı uzun ve ipeksi yumuşak bir kürkü vardır. Amerikalı yetiştirici Ann Baker, 1960'larda Ragdolls'u geliştirdi. En çok uysal, sakin mizaçları ve sevecen doğaları ile tanınırlar.","Riverside","https://benimhayvanlarim.com/wp-content/uploads/2021/11/gato-ragdoll-veteriner-1024x683-1.jpg")
        var obj5 : GalleryInterface = Cat("Balinese", "Siyam tarzı nokta rengine ve safir mavisi gözlere sahip uzun tüylü bir evcil kedi cinsidir.","ABD","https://miyavliyo.com/wp-content/uploads/2020/04/balinese-kedi-cinsi-ozellikleri-ve-bakimi.jpg")
        var obj6 : GalleryInterface = Dog("Golden Retriever","İskoçya’da 19. yüzyıl dönemlerinde ortaya çıkmış ve o dönemlerde avcılık faaliyetlerinde yardımcı olarak kullanılmıştır.", " Birleşik Krallık, İskoçya, İngiltere", "https://blog.petibom.com/wp-content/uploads/2021/09/Yavru-golden-retriever-ozellikleri.jpg","10–12 yıl" )



        list.add(obj1)
        list.add(obj2)
        list.add(obj3)
        list.add(obj4)
        list.add(obj5)
        list.add(obj6)


        val customAdapter = GalleryCustomAdaptor(this, list)

        listView_gallery.adapter = customAdapter



    }

   }