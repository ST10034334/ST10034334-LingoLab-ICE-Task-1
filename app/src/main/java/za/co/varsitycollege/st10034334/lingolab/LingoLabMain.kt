package za.co.varsitycollege.st10034334.lingolab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class LingoLabMain : AppCompatActivity() {

    //Declares variables.
    lateinit var imgIta: ImageView
    lateinit var imgEng: ImageView
    lateinit var imgSpa: ImageView
    lateinit var imgChi: ImageView
    lateinit var imgFre: ImageView
    lateinit var imgGer: ImageView
    lateinit var tvLang: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lingo_lab_main)

        //View Binding.
        imgIta = findViewById(R.id.imgItalian)
        imgEng = findViewById(R.id.imgEnglish)
        imgSpa = findViewById(R.id.imgSpanish)
        imgChi = findViewById(R.id.imgChinese)
        imgFre = findViewById(R.id.imgFrench)
        imgGer = findViewById(R.id.imgGerman)
        tvLang = findViewById(R.id.tvLangInverter)


        //Calls the languageInverter() method for each ImageView.
        languageInverter(imgIta)
        languageInverter(imgEng)
        languageInverter(imgSpa)
        languageInverter(imgChi)
        languageInverter(imgFre)
        languageInverter(imgGer)


    }

    //languageInverter() method takes in an ImageView, and through using the setonClickListener()
    //event and a WHEN clause, the correct language can be printed to the user.
    fun languageInverter(langImg: ImageView)
    {
        langImg.setOnClickListener {
            when (langImg.id) {
                R.id.imgItalian -> tvLang.text = "Ciao mondo!"
                R.id.imgEnglish -> tvLang.text = "Hello world!"
                R.id.imgSpanish -> tvLang.text = "Hola mundo!"
                R.id.imgChinese -> tvLang.text = "你好世界!"
                R.id.imgFrench -> tvLang.text = "Bonjour le monde!"
                R.id.imgGerman -> tvLang.text = "Hallo welt!"
            }
        }
    }
}