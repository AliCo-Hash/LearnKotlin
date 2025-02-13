fun main () {
    val timeToday = 300
    val timeYesterday = 200
    val timeYesterday2 = 400

    println(compareTwoNumbers(timeToday, timeYesterday))
    println(compareTwoNumbers(timeToday, timeYesterday2))
}

fun compareTwoNumbers (timeSpentToday: Int, timeSpentYesterdy: Int): Boolean {
    return timeSpentToday > timeSpentYesterdy
}