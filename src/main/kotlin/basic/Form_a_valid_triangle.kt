package basic

class Form_a_valid_triangle {
}

fun main() {
    val a = (Math.random() * 20).toInt()
    val b = (Math.random() * 20).toInt()
    val c = (Math.random() * 20).toInt()

    if (a + b > c && a + c > b && b + c > a){
        println("represent a valid triangle, the lengths is $a, $b, $c.")
    }else
        println("Cannot represent a valid triangle.")
}