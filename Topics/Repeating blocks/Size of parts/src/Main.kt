fun main() {
    val componentsNumber =  readln().toInt()
    var larger = 0
    var smaller = 0
    var perfect = 0
    repeat(componentsNumber) {
        val componentSize = readln().toInt()
        if (componentSize > 0) {
            larger++
        } else if (componentSize < 0) {
            smaller++
        } else {
            perfect++
        }
    }
    println("$perfect $larger $smaller")
}