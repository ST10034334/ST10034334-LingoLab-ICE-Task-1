package za.co.varsitycollege.st10034334.lingolab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class LingoLabSplash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Tom (2023) demonstrates how to create a splash screen.
        //Using Handler to delay the intent by 3 seconds to the LingoLabMain activity.
        Handler().postDelayed({
            //The intent describes what operation is to be done, and in this scenario, is to
            //navigate from the current activity, to the LingoLabMain activity.
            var intent = Intent(this, LingoLabMain::class.java)

            //Starts the LingoLabMain activity.
            startActivity(intent)

            //Closes the current activity.
            finish()
        }, 3000)
    }
}
//REFERENCE LIST:
//Tom. 2023. Implementing Splash Screens in Android (Kotlin). Medium, 5 February 2023 (Version 1.0)
//[Source code] https://medium.com/@ttdevelopment/implementing-splash-screens-in-android-kotlin-71d23c42b7e1
//(Accessed 28 February 2024).