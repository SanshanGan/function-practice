package basic

fun main() {
    val originalNum = (Math.random() * 999).toInt() + 2
    var isPrime = true

    print("The number is $originalNum")

    for(n in 2..originalNum) {
        isPrime = true
        for(i in 2..n-1)
            if(n % i == 0) {
                isPrime = false
                break
            }
        if(isPrime)
            println(n)
    }

}