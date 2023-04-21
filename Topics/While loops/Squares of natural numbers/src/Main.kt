fun main() {
    val n = readln().toInt()
    var a = 1
    var square: Int
    var string = "$a\n"
    do {
        ++a
        square = a * a
        if (square <= n) {
            string += "$square\n" 
        }
    }
    while (square <= n)

    println(string)
}
