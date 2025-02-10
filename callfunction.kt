fun main() {
    println(birthdayGreeting("Rover", 2))
    println(birthdayGreeting("Rex", 5))
}

fun birthdayGreeting(name: String, age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}