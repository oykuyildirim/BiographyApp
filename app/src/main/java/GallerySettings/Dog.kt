package GallerySettings


class Dog: GalleryInterface {

    var Name : String
    var Description : String
    var Location : String
    var Url_img : String
    var Life : String

    constructor(name : String , description : String, location : String, url_img : String, life : String){

        Name = name
        Description = description
        Location = location
        Url_img = url_img
        Life = life

    }
}