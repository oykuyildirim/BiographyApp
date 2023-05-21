package com.kotlinegitim.hw3_kotlin

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient

class Blog : AppCompatActivity() {


    lateinit var detailWebView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blog)


        detailWebView = findViewById(R.id.myblog)

        var blank = "<p align=\"justify\">\n" +
                "<br>\n" +
                "\n" +
                "</p>"

        var scroll_1 = "Augmented reality technology is the merging of the virtual world and the real world. This joining is done with some technical tools and examples of these tools are Multimedia, 3D Modeling, Real Time Monitoring and Recording. In addition, the combination of the real world and the virtual world is also done with hardware devices. These devices are usually gadgets such as headsets and smartphones (those containing cameras, sensors, etc.). Also, there are SDKs and platforms that make it easy to create an Augmented Reality environment. These platforms that help us create the Augmented Reality environment such as Unreal Engine, Unity. Unity platform supports many software development kits (SDKs) such as Vuforia, ARKit and EasyAR. These SDKs provide great convenience for creating an Augmented Reality environment such as image targeting. Thanks to this feature, the desired virtual object can be easily placed in the real world environment.Thanks to these, Augmented Reality applications can be created easily."
        var scroll_2 ="Machine learning is a field of computer science and artificial intelligence that models human learning and makes use of data and algorithms in doing so. At the same time, it is the fastest growing field today, which has common points with artificial intelligence and statistics, and where data science greatly benefits. Some of the methods of machine learning are linear and polynomial regression. It focuses on linking a dependent and an independent variable to predictive modeling. While doing this, it aims to find the best fit line and regression equation between these two variables.Linear regression is a statistically supervised learning method that helps to find the dependent variable by establishing a linear relationship between one or more independent variables and the dependent variable. Polynomial regression is a special case of linear regression in which a curvilinear relationship is established between the x and y values."



        var scroll = "<button class=\"btn btn-primary\" type=\"button\" data-bs-toggle=\"offcanvas\" data-bs-target=\"#offcanvasScrolling\" aria-controls=\"offcanvasScrolling\">Introdution to Augmented Reality</button>\n" +
                "\n" +
                "<div class=\"offcanvas offcanvas-start\" data-bs-scroll=\"true\" data-bs-backdrop=\"false\" tabindex=\"-1\" id=\"offcanvasScrolling\" aria-labelledby=\"offcanvasScrollingLabel\">\n" +
                "  <div class=\"offcanvas-header\">\n" +
                "    <h5 class=\"offcanvas-title\" id=\"offcanvasScrollingLabel\">Introduction to Augmented Reality </h5>\n" +
                "    <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"offcanvas\" aria-label=\"Close\"></button>\n" +
                "  </div>\n" +
                "  <div class=\"offcanvas-body\">\n" +
                "    <p>${scroll_1}</p>\n" +
                "  </div>\n" +
                "</div>"

        var scroll2 = "<button class=\"btn btn-primary\" type=\"button\" data-bs-toggle=\"offcanvas\" data-bs-target=\"#offcanvasRight\" aria-controls=\"offcanvasRight\">Regression on Machine Learning</button>\n" +
                "\n" +
                "<div class=\"offcanvas offcanvas-end\" tabindex=\"-1\" id=\"offcanvasRight\" aria-labelledby=\"offcanvasRightLabel\">\n" +
                "  <div class=\"offcanvas-header\">\n" +
                "    <h5 class=\"offcanvas-title\" id=\"offcanvasRightLabel\">Regression on Machine Learning</h5>\n" +
                "    <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"offcanvas\" aria-label=\"Close\"></button>\n" +
                "  </div>\n" +
                "  <div class=\"offcanvas-body\">\n" +"${scroll_2}\n"+
                "  </div>\n" +
                "</div>"

        var list ="<ul class=\"list-group\">\n" +
                "  <li class=\"list-group-item\">TOP 8 - PROGRAMMING LANGUANGES IN 2023  </li>\n" +
                "\n" +
                "  <li class=\"list-group-item list-group-item-primary\">Javascript</li>\n" +
                "  <li class=\"list-group-item list-group-item-secondary\">Python</li>\n" +
                "  <li class=\"list-group-item list-group-item-success\">Go</li>\n" +
                "  <li class=\"list-group-item list-group-item-danger\">Java</li>\n" +
                "  <li class=\"list-group-item list-group-item-warning\">Kotlin</li>\n" +
                "  <li class=\"list-group-item list-group-item-info\">PHP</li>\n" +
                "  <li class=\"list-group-item list-group-item-light\">C#</li>\n" +
                "  <li class=\"list-group-item list-group-item-dark\">Swift</li>\n" +
                "</ul>"

        var slide = "<div id=\"carouselExampleIndicators\" class=\"carousel slide\">\n" +
                "  <div class=\"carousel-indicators\">\n" +
                "    <button type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide-to=\"0\" class=\"active\" aria-current=\"true\" aria-label=\"Slide 1\"></button>\n" +
                "    <button type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide-to=\"1\" aria-label=\"Slide 2\"></button>\n" +
                "    <button type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide-to=\"2\" aria-label=\"Slide 3\"></button>\n" +
                "  </div>\n" +
                "  <div class=\"carousel-inner\">\n" +
                "    <div class=\"carousel-item active\">\n" +
                "      <img src=\"https://sdsclub.com/wp-content/uploads/2021/07/Linear-vs-Multiple-Regression-02-min.png\" class=\"d-block w-100\" alt=\"Linear Regression\">\n" +
                "    </div>\n" +
                "    <div class=\"carousel-item\">\n" +
                "      <img src=\"https://codemodeon.com/wp-content/uploads/2019/11/AR-VR-Kapak1.png\" class=\"d-block w-100\" alt=\"Augmented Reality\">\n" +
                "    </div>\n" +
                "    <div class=\"carousel-item\">\n" +
                "      <img src=\"https://wear-studio.com/wp-content/uploads/2020/07/ar-gaming.jpg\" class=\"d-block w-100\" alt=\"Augmented Reality 2\">\n" +
                "    </div>\n" +
                "  </div>\n" +
                "  <button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide=\"prev\">\n" +
                "    <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n" +
                "    <span class=\"visually-hidden\">Previous</span>\n" +
                "  </button>\n" +
                "  <button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide=\"next\">\n" +
                "    <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n" +
                "    <span class=\"visually-hidden\">Next</span>\n" +
                "  </button>\n" +
                "</div>"

        val html = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ\" crossorigin=\"anonymous\">\n" +
                "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe\" crossorigin=\"anonymous\"></script>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div class=\"container\">\n"+blank+ scroll + blank + scroll2 + blank + slide + blank+ list+

        "</div>\n" +
                "</body>\n" +
                "</html>"
        detailWebView.settings.javaScriptEnabled = true
        detailWebView.loadData(html, "text/html", "utf-8")



    }

    class WebViewClass : WebViewClient() {

        override fun shouldOverrideUrlLoading(
            view: WebView?,
            request: WebResourceRequest?
        ): Boolean {

            return super.shouldOverrideUrlLoading(view, request)
        }

        override fun onPageFinished(view: WebView?, url: String?) {

            super.onPageFinished(view, url)
        }

        override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {

            super.onPageStarted(view, url, favicon)
        }

    }


}

