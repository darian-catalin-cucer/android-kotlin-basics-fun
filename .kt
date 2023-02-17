// Examples of fun in Kotlin
fun main() {
    println("The maximum of 1 and 2 is ${max(1, 2)}")
    println("The sum of 1 to 10 is ${sum(1, 10)}")
    println("The product of 1 to 5 is ${product(1, 5)}")
}

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun sum(start: Int, end: Int): Int {
    var total = 0
    for (i in start..end) {
        total += i
    }
    return total
}

fun product(start: Int, end: Int): Int {
    var total = 1
    for (i in start..end) {
        total *= i
    }
    return total
}
