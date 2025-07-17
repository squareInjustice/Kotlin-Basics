//3.Kotlin program to  check whether a number is prime or not

import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    print("Enter a number: ")
    val num = input.nextInt()

    if (num <= 1) {
        println("$num is not a prime number.")
        return
    }

    var isPrime = true
    for (i in 2..num-1) {
        if (num % i == 0) {
            isPrime = false
            break
        }
    }

    if (isPrime) {
        println("$num is a prime number.")
    } else {
        println("$num is not a prime number.")
    }
}
