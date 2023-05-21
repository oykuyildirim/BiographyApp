package GallerySettings



class Cat : GalleryInterface {

    var Name : String
    var Description : String
    var Location : String
    var url_Res: String


    constructor(name : String , description : String, location : String, url_res : String){

        Name = name
        Description = description
        Location = location
        url_Res = url_res

    }


}