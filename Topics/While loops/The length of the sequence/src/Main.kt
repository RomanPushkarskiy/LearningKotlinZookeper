fun main() {
    var numbers = mutableListOf<Int>()
    do {
        val n = readln().toInt()
        numbers += n
    } while (n != 0)
    println(numbers.size - 1)
}
