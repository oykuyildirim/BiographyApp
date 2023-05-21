package PersonInfo

import android.app.Activity
import android.text.method.ScrollingMovementMethod
import android.widget.TextView
import com.kotlinegitim.hw3_kotlin.R


class Person constructor(name : String, surname: String, bornPlace:String, bornDate: String, imageUrl: String, lifePart: String,
                         educationPart: List<Education>, codingInfo: List<ProgramLanguage>, context: Activity
) : AboutInfo(
    lifePart, educationPart, codingInfo)
{


    var Name = name
    var Surname = surname
    var BornPlace = bornPlace
    var ImageUrl = imageUrl
    var BornDate = bornDate
    var Context = context


    var bornPlaceTxt : TextView
    var bornDateTxt : TextView
    var nameTxt : TextView
    var surnameTxt : TextView
    var lifeTxt : TextView




    init{

        nameTxt = Context.findViewById(R.id.firstname)
        surnameTxt = Context.findViewById(R.id.lastname)
        bornDateTxt = Context.findViewById(R.id.bornDate)
        bornPlaceTxt = Context.findViewById(R.id.bornPlace)
        lifeTxt = Context.findViewById(R.id.life)

        nameTxt.text = Name
        surnameTxt.text = Surname
        bornDateTxt.text = BornDate
        bornPlaceTxt.text = BornPlace
        lifeTxt.text = lifePart
        lifeTxt.movementMethod = ScrollingMovementMethod()

    }



}