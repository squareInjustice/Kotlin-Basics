import java.util.Scanner

fun main() {

    var read = Scanner(System.`in`)

    println("Enter first number :")
    var num1 = read.nextInt()

    println("Enter an Operator(+,-,*,/) :")
    var sign = readLine()

    println("Enter second number :")
    var num2 = read.nextInt()

    val result = when(sign){
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> {
            if (num2 == 0) {
                "Cannot divide by zero"
            } else {
                num1 / num2
            }
        }
        else -> "Invalid operator"
    }

    println("Result: $result")

}