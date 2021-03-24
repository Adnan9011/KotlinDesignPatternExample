package com.google.adnan9011.creational.builder

import android.util.Log

fun runBuilderExample() {
    val p = Person.Builder(name = "Adnan")
        .setPersonFamily("Abdollah Zaki")
        .setPersonAge(31)
        .create()

    println("builder design pattern : ${p.toString()}")
    Log.d("Example","builder design pattern : ${p.toString()}")
}
