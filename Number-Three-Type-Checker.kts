fun main() {
    val list: List<Any> = listOf("Hello", "Hi", 2, 25, true, false)

    for (sample in list) {
        when (sample) {
            is String -> println("String: $sample - is ${sample.length} letters long")
            is Int -> println("Integer: $sample - becomes ${sample * 2} when multiplied by 2")
            is Boolean -> println("Boolean: $sample")
            else -> println("Not Known: $sample")
        }
    }
}
