package Homework

class Item(
    val name: String = "",
    val type: String = "",
    val value: Int = 0
)
{
    constructor(name: String, type: String) : this(name, type, 0)

    fun printInfo() {
        println("Название предмета - $name, тип - $type, стоимость - $value")
    }
}
