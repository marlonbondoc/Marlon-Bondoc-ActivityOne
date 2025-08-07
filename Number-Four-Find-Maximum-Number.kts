fun main() {
    val numbers = listOf(58, 120, 36, 29, 102)
    var max = numbers[0]

    for (number in numbers) {
        if (number > max) {
            max = number
        }
    }

    println("Greatest Number: $max")
}
