package Classwork

import Classwork.world.Contract
import Classwork.world.Quest
import Classwork.characters.Enemy
import Classwork.characters.Hero

fun main () {
    val quest = Quest("Охота на гоблинов", 2, 3400, "легкий")
    quest.printInfo()

    val naruto = Hero("Наруто", "мужской", "Шиноби", 150, 200, 5, "Ветер")
    naruto.showStats()
    val kakashi = Hero("Какаши", "мужской", "Шиноби", 250, 300, 15, "Молния")
    kakashi.showStats()
    val orochimaru = Enemy("Орочимару", 350, "Ветер")
    naruto.castSpellOn(orochimaru, "Расчитан", 30)
    println()
    naruto.duel(kakashi)
    println()

    val contract1 = Contract("Торговец Грам", "Сопровождение каравана", 1500, true)
    val contract2 = Contract("Безымянный", "Уничтожить крыс в подвале", 100, false)
    contract1.printContractInfo()
    println()
    contract2.printContractInfo()
    println()

    val hero1 = Hero(name = "Артур", hp = 100)
    println("Герой жив? ${hero1.isAlive()}")
    val hero2 = Hero(name = "Артур", hp = 0)
    println("Герой жив? ${hero2.isAlive()}")
    println()

    val hero = Hero(name = "Артур", level = 4)
    val easyQuest = Quest("Сбор трав", 2, 100, "Лёгкий")
    val hardQuest = Quest("Охота на дракона", 10, 1000, "Сложный")
    hero.canAcceptQuest(easyQuest)
    hero.canAcceptQuest(hardQuest)
    println()

    val enemy1 = Enemy("Гоблин", hp = 30)
    println(enemy1.getThreatLevel())
    val enemy2 = Enemy("Орк", hp = 100)
    println(enemy2.getThreatLevel())
    val enemy3 = Enemy("Дракон", hp = 200)
    println(enemy3.getThreatLevel())
    println()

    val quest1 = Quest("Охота", duration = 2, reward = 300, difficulty = "Средний")
    println(quest1.goldPerHour())
    val quest2 = Quest("Рыбалка", duration = 0, reward = 500, difficulty = "Лёгкий")
    println(quest2.goldPerHour())

}

fun getReward(): Int {
    return 500
}

fun getDifficulty(): String = "Лёгкий"