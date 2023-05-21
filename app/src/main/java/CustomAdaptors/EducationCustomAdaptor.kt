package CustomAdaptors

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import PersonInfo.Education
import com.kotlinegitim.hw3_kotlin.R
import com.squareup.picasso.Picasso

class EducationCustomAdaptor (private val context: Activity, private val list: MutableList<Education>) : ArrayAdapter<Education>(context,
    R.layout.education_custom_layout, list ) {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {



        val listView = context.layoutInflater.inflate(R.layout.education_custom_layout, null, true)

        val name = listView.findViewById<TextView>(R.id.school)
        val level = listView.findViewById<TextView>(R.id.level)
        val time = listView.findViewById<TextView>(R.id.time)
        val logo = listView.findViewById<ImageView>(R.id.schoolLogo)


        val education = list.get(position)

        name.text = education.SchoolName
        level.text = education.Level
        time.text ="${education.StartTime}-${education.FinishTime}"

        Picasso.get()
            .load(education.LogoURL)
            .into(logo);

        return listView


    }


}