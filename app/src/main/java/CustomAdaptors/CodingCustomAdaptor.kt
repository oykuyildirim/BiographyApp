package CustomAdaptors

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import PersonInfo.ProgramLanguage
import com.kotlinegitim.hw3_kotlin.R
import com.squareup.picasso.Picasso

class CodingCustomAdaptor  (private val context: Activity, private val list: MutableList<ProgramLanguage>) : ArrayAdapter<ProgramLanguage>(context,
    R.layout.coding_custom_layout, list ) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val listView = context.layoutInflater.inflate(R.layout.coding_custom_layout, null, true)

        val name = listView.findViewById<TextView>(R.id.name)
        val image = listView.findViewById<ImageView>(R.id.imageView)


        val code = list.get(position)

        name.text = code.CodingName
        //surname.text = veterinar.Surname
        //email.text = veterinar.Email
        //phone.text = veterinar.Phone


        Picasso.get()
            .load(code.CodingImage)
            .into(image)

        return listView

    }




}
