fun solve(firstNum: Double, secondNum: Double, operation: Char): Double {
    return when (operation) {
        '+' -> firstNum + secondNum
        '-' -> firstNum - secondNum
        '*' -> firstNum * secondNum
        '/' -> { if (secondNum != 0.0) firstNum / secondNum
                else {
                    println("Invalid. Division by zero.")
                    0.0
                }
        }
        else -> {
            println("Invalid Operator.")
            0.0
        }
    }
}

fun main() {
    val resultOne = solve(20.0, 2.0, '+')
    println("Result: $resultOne")

    val resultTwo = solve(20.0, 2.0, '-')
    println("Result: $resultTwo")

    val resultThree = solve(20.0, 2.0, '*')
    println("Result: $resultThree")

    val resultFour = solve(20.0, 2.0, '/')
    println("Result: $resultFour")

    val resultFive = solve(25.0, 0.0, '/')
    println("Result: $resultFive")
}
