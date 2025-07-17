//2.Kotlin program to generate a multiplication table

import java.util.Scanner

fun main() {
    val read = Scanner(System.`in`)

    print("Enter a number: ")
    val num = read.nextInt()

    for (x in 1..10) {
        println("$num x $x = ${num * x}")
    }
}
