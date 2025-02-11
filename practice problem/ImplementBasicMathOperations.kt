/*
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    
    println("$firstNumber + $secondNumber = $result")
}
*/

// fun main() {
//     val firstNumber: Int = 10
//     val secondNumber: Int = 5
//     val result = firstNumber + secondNumber
    
//     println("$firstNumber + $secondNumber = $result")
// }

/*
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8
    
    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
}

// Define add() function below this line
*/

fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8
    
    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)
    val subResult = subtract(firstNumber, secondNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
    println("$firstNumber - $secondNumber = $subResult")
}

fun add(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber + secondNumber
}

fun subtract(firstN: Int, secondN: Int): Int {
    return firstN - secondN
}