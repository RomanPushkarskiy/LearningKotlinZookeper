fun main() {
    val sequenceQuantity = readln().toInt()
    var output = 0
    val delimiter = 4

    repeat(sequenceQuantity) {
        val element = readln().toInt()
        val division = element % delimiter
        if (division == 0 && element > output) {
            output = element
        }
    }
    println(output)

}
