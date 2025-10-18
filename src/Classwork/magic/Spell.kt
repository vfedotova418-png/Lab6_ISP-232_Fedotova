package Classwork.magic

class Spell(
    val name: String = "",
    val width: Int = 0,
    val height: Int = 0,
    val symbol: String = ""
) {

//    constructor(name: String, width: Int, height: Int, symbol: String) {
//        this.name = name
//        this.width = width
//        this.height = height
//        this.symbol = symbol
//    }

//    constructor(name: String, size: Int, symbol: String) {
//        this.name = name
//        this.width = size
//        this.height = size
//        this.symbol = symbol
//    }

//    constructor() {
//        this.name = ""
//        this.width = 0
//        this.height = 0
//        this.symbol = ""
//    }

    constructor(name: String, size: Int, symbol: String) : this(name, size, size, symbol)

//    constructor() : this(name = "", 0, 0, symbol = "")

    fun cast() {
        println("Кастуем $name!")
        repeat(height) {
            repeat(width) {
                print(symbol)
            }
            println()
        }
    }

    fun area(): Int {
        return width * height
    }

    fun description(): String {
        return "Заклинание $name занимает область ${width}x$height и использует символ $symbol"
    }
}