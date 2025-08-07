fun main(){
    val numbers = (1..20).toList()
    val evenNumbers = numbers.filter {it % 2 == 0}
    val doubleEven = evenNumbers.map {it * 2}

    println(numbers)
    println("Filtered: $evenNumbers")
    println("Doubled: $doubleEven")
}
