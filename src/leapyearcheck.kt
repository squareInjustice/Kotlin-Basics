//1.Kotlin program to check leap year

import java.util.Scanner

fun main() {
    val read = Scanner(System.`in`)

    print("Enter a year: ")
    val year = read.nextInt()

    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        println("$year is a leap year.")
    } else {
        println("$year is not a leap year.")
    }
}
