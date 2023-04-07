package basic


fun main() {
    val base_name = "Australia"

    for (letter in base_name)
        println(letter)

    for (index in base_name.indices)
        if (index % 2 == 0)
            println(base_name[index])

    for ((index,letter) in base_name.withIndex())
        println("$index, $letter")
}