package com.kotlin.learn

fun main() {
    printMessage("Hello world")
    printMessage("Whatever works, make it work ")

    printMessage(addNumbers(4, 7).toString())
    manageString("Hey")

    defaultValue(23U, "male")
}


fun printMessage(message: String) {
    println(message)
}

fun addNumbers(x: Int, y: Int) = x + y

fun manageString(message: String) = println(message)

fun defaultValue(age: UInt, gender: String = "Other") {
    println("This person is $age years old $gender")
}