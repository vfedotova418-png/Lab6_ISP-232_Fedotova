package Classwork.characters

class Enemy (
    val name: String = "",
    var hp: Int = 0,
    val element: String = ""
) {

//    constructor(name: String, hp: Int, element: String) {
//        this.name = name
//        this.hp = hp
//        this.element = element
//    }

    fun takeDamage(amount: Int){
        println("$name получает $amount урон!")
        hp -= amount
        if (hp < 0) hp = 0
        else {
            println("Осталось HP врага: $hp")
        }
    }

    fun isStrong(): Boolean {
        return hp > 100
    }

    fun getThreatLevel(): String {
        if (hp < 0) {
            return "Некорректное здоровье"
        }
         return when {
            hp <= 50 -> "Низкий"
            hp >= 150 -> "Средний"
            else -> "Высокий"
        }
    }

    fun calculatePower(aggressionLevel: Int = 2): Int {
        val power = hp * aggressionLevel
        return power
    }
}