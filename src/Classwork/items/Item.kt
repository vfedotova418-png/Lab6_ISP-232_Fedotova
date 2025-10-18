package Classwork.items

class Item(
    val name: String = "",
    val price: Int = 0
) {
    fun displayInfo() {
        println("Товар: $name, Цена: $price")
    }
}