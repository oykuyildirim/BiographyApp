package PersonInfo

import android.app.Activity
import android.widget.TextView
import com.kotlinegitim.hw3_kotlin.R

class ConnectionInfo{


    private var Adress : String = ""
    private var Telephone : String = ""
    private var Email : String = ""
    private var Linkedin : String =""
    private var context_Activity: Activity


     lateinit var adress_txt : TextView
     lateinit var telephone_txt : TextView
     lateinit var email_txt : TextView
     lateinit var linkedin_txt : TextView




    constructor(adress : String, telephone : String, email : String, linkedin:String, context_activity : Activity){

        Adress = adress
        Telephone = telephone
        Email = email
        Linkedin = linkedin
        context_Activity = context_activity




    }



    fun setConnectionInfo(){

        adress_txt =  context_Activity.findViewById(R.id.adresstxt)
        telephone_txt = context_Activity.findViewById(R.id.telephonetxt)
        email_txt = context_Activity.findViewById(R.id.emailtxt)
        linkedin_txt = context_Activity.findViewById(R.id.linkedintxt)

        adress_txt.text = Adress
        telephone_txt.text = Telephone
        email_txt.text = Email
        linkedin_txt.text = Linkedin


    }






}
