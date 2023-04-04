package basic

import kotlin.Unit

class Unit {
    fun printHello(name: String?): Unit{
        if (name != null) {
            println("Hello $name")
        }else{
            println("Hello there!")
        }
    }
}

fun main(){
    Unit().printHello("Sanshan")
}