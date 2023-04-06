package basic

fun main() {
    val monthNum = (Math.random() * 12).toInt() + 1
    val mothName = when(monthNum) {
        1 ->  "This is Jan"
        2 ->  "This is Feb"
        3 ->  "This is Mar"
        4 ->  "This is Apr"
        5 ->  "This is May"
        6 ->  "This is Jun"
        7 ->  "This is Jul"
        8 ->  "This is Aug"
        9 ->  "This is Sep"
        10 ->  "This is Oct"
        11 ->  "This is Nov"
        12 ->  "This is Dec"
        else -> ""
    }
    println(mothName)
}