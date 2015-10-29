package com.nevinchen.myapplication

import android.app.Activity
import android.os.Bundle
import org.jetbrains.anko.*

/**
 * Created by nevin on 10/27/15.
 */
class MainActivity : Activity(){

    override fun onCreate(savedInstanceState: Bundle?){
        super<Activity>.onCreate(savedInstanceState)

        verticalLayout {
            padding = dip(30)
            editText {
                hint = "Name"
                textSize = 24f
            }
            editText {
                hint = "Password"
                textSize = 24f
            }
            button("Login") {
                textSize = 26f
            }
        }

    }
}
