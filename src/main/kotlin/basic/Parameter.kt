package basic

class Parameter {
    fun boo(bar: Int = 0, baz: Int = 1, qux: () -> kotlin.Unit,) {
    }
}

fun main() {
    Parameter().boo { println("qux") }
}