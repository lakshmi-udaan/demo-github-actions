package ch01.ex1_ATasteOfKotlin

data class Person(val name: String,val age: Int? = null)

fun main(args: Array<String>) {
    val persons = listOf(Person("Bob"),
        Person("Alice", age = 29))

    val oldest = persons.maxBy { it.age ?: 0 }
    println("The oldest is: $oldest")
}

// The oldest is: Person(name=Bob, age=29)
