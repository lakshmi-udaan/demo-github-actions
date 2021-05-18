package ch01.ex1_ATasteOfKotlin

data class Person(val name: String,val age: Int? = null)

fun main(args: Array<String>) {
    val persons = listOf(Person("Alice"),
                         Person("Bob", age = 29))

    val oldest = persons.maxBy { it.age ?: 0 }
    println("The oldest is: $oldest")
}
/**
 * @property name The property is documented
 */
data class AnotherPerson(val name: String,val age: Int? = null,val anotherParam: String)

// The oldest is: Person(name=Bob, age=29)
