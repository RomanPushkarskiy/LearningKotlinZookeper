fun main() {
    var n = readln().toInt()
    var sum = 0
    while (n != 0) {
        sum += n
        n = readln().toInt()
    }
    println(sum)
}