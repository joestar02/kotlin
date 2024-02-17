package org.example

fun main(args: Array<String>) {
    println("Hello World!")
    println("Program argumentgs:   ${args.joinToString()}")
    println("Program argumentgs:   ${args[0]}")
    //en configuration edit podemos indicar los argumentos y correr programa. Para ello, tiene que tener la palabra reservada main.

    //Comentario
    /*
    Comentario grande
     */

    print("print sin ln")
    print(" print con escape\n")

    var number: Int= 10
    var name: String= "Jamila"

    println(number)
    println(name)
    println("Name: ${name}  Number:${number}")

    var n: Int = 10
    var l: Long = 100L
    var d: Double = 3.14
    var f: Float = 3.14F
    var b: Boolean= true
    var s: String = "aoaoaooa"
    var c: Char = 'a'

    var other: Any= 20 //Se debe eviar el uso de Any,  usar el tipo
    var other2: Any="Jamila2"



}