package CustomAdaptors

import GallerySettings.Cat
import GallerySettings.Dog
import GallerySettings.GalleryInterface
import android.app.Activity
import android.content.Intent
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import com.kotlinegitim.hw3_kotlin.*


import com.squareup.picasso.Picasso

class GalleryCustomAdaptor(private val context: Activity, private val list: MutableList<GalleryInterface>) : ArrayAdapter<GalleryInterface>(context,
    R.layout.gallery_custom, list ) {





    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val rootView = context.layoutInflater.inflate(R.layout.gallery_custom, null, true)

        //val r_title = rootView.findViewById<TextView>(R.id.textView3)
        val image = rootView.findViewById<ImageView>(R.id.gallery_item)
        val button = rootView.findViewById<Button>(R.id.button2)




        var user  = list .get(position)

        if (user is Cat) {


            loadPhoto(user,image)


        }
        if(user is Dog){

            loadPhoto(user,image)

        }




       // r_title.text= "${user.Name}"





        button.setOnClickListener {

            if ( user is Cat) {

                IntentPutExtraCat(user)
            }
            if ( user is Dog){

                IntentPutExtraDog(user)

            }





           // Toast.makeText(context, user.Name, Toast.LENGTH_LONG).show()

        }






        return rootView
    }

    fun IntentPutExtraCat(user : Cat){

        val intent = Intent(context, DetailInfo::class.java)
        intent.putExtra("description", user.Description)
        intent.putExtra("location", user.Location)
        intent.putExtra("name", user.Name)
        intent.putExtra("url", user.url_Res)
        context.startActivity(intent)
    }


    fun IntentPutExtraDog (user : Dog){
        val intent = Intent(context, DetailInfo::class.java)
        intent.putExtra("description", user.Description)
        intent.putExtra("location", user.Location)
        intent.putExtra("name", user.Name)
        intent.putExtra("url", user.Url_img)
        intent.putExtra("lifeTime", user.Life)
        context.startActivity(intent)

    }

    fun loadPhoto(user : GalleryInterface, image: ImageView){

        if (user is Dog) {
            Picasso.get()
                .load((user).Url_img)
                .into(image)
        }
        if (user is Cat){

            Picasso.get()
                .load((user).url_Res)
                .into(image)

        }


    }











}



