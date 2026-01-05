package com.towhid.greetingsdk

import android.content.Context
import android.widget.Toast

object GreetingSDK {

    fun showToast(context: Context, name: String) {
        Toast.makeText(
            context,
            "Hello, $name 👋",
            Toast.LENGTH_SHORT
        ).show()
    }
}