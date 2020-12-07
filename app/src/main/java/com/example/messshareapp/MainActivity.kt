//
package com.example.messshareapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() { // every screen is a seperated avtivity so if we have 5 screens then we have to make 5 activities
    // this class AppCompatActivity inherent it to call the onCreate method to lunch the app
    // this is activity and we can declare it like that Activity() but with the evaluation of the android used to use the AppCompatActivity()
    // also activity are component so we have to mention them in the AndroidManifest.xml file to tell that at the home first screen will be this avtivity
   private lateinit var buttom1press: Button
   private lateinit var buttonShowMessageToast: Button
private lateinit var mess:EditText

    override fun onCreate(savedInstanceState: Bundle?) { // we have to make sure in the first that we got the fun that have one parameter
        // which the fun of OnClick is the base for the app
        super.onCreate(savedInstanceState)
        // every activity should have layout to be shown in the screen so to attach that from setContentView() and get the direction to the layout
        // the path of it is the R(resource) then (layout)file then(activity_main)which is the xml file
        setContentView(R.layout.activity_main)

 buttom1press=findViewById(R.id.hello)  // to get the bottom inside the class and fun then call it AND THE PROBLEM WAS WITH THE DEPENDENCIES ARE NOT SUPPORTED WITH LONGER THAN ANDROID O
// here will declare the usage of the bottom
        buttom1press.setOnClickListener {  // here hello is the id of the button that we have already change it
            // to get it from the xml we  have to use the extension and PLUGIN put it in the gradle ********** apply plugin: 'kotlin-android-extensions' *****
            // here we can write the code to be executed when clicked on the bottom
            Log.i(
                "mainActivity",
                "the bottom have been clicked"
            )  // there is import for this and accept the tag with message that you
            // want to show in the logcat
            Toast.makeText(this, "Opps there is something wrong", Toast.LENGTH_LONG)
                .show() // this fun will show the text after click button
            // the string and the short duration to show the message IMPORTANT HAVE TO USE SHOW() TO MAKE IT VISIBLE TO THE USER
        }
// so here will create input text and view the text that entered in toast message
        // we need input text as a plain text in the layout and button to show the enter text
        // we have to repeat the process of getting access to view
        mess=findViewById(R.id.editTextTextPersonName)  // Binding view
        buttonShowMessageToast=findViewById(R.id.SendMessToNextActivity)

    buttonShowMessageToast.setOnClickListener { // when clicked on this button second activity page will appear and show the message from the previous activity
        val essStore =
            mess.text.toString()  // get the text from the plain text in the layout and convert it to string to show it
        Toast.makeText(this, essStore, Toast.LENGTH_LONG)
            .show() // we didn't see the mess because of the .show() fun

        val internt = Intent(
            this,
            SecondActivity::class.java
        )  // to make the transition between activities we have Intent method that put the current
        // activity and second parameter is the target activity
        startActivity(internt) // then start the
    }
    }
}




