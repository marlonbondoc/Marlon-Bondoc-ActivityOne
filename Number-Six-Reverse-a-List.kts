fun main() {
    val list = listOf(1, 2, 3, 4)
    val reversed = mutableListOf<Int>()

    for (i in (list.size - 1) downTo 0) {
        reversed.add(list[i])
    }

    println("Original List: $list")
    println("Reversed List: $reversed")
}
