fun main() {
    var n = readln().toInt()
    // var sequence = mutableListOf<Int>()
    var sequenceString = "$n "
    while (n != 1) {
        if (n % 2 == 0) {
            n /= 2
            // sequence += n
            sequenceString += "$n "
        } else {
            n = (3 * n) + 1
            sequenceString += "$n "
            // sequence += n
        }
    }
    // println(sequence)
    println(sequenceString)

}
