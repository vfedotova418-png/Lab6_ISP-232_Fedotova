package Homework

import Classwork.characters.Enemy

fun main() {
    //Задание 1
    println("Задание 1")
    println()
    val item1 = Item("Old Nail", "оружие")
    val item2 = Item("Abyss Shriek", "заклинание", 1200)
    item1.printInfo()
    item2.printInfo()
    println()

    //Задание 2
    println("Задание 2")
    println()
    val location1 = Location("Dirtmoth", "Низкий", 0)
    val location2 = Location("Path of Pain", "Высокий", 10)
    println(if (location1.isDangerous()) "Высокий уровень опасности!" else "Нормальный уровень опасности")
    println(if (location2.isDangerous()) "Высокий уровень опасности!" else "Нормальный уровень опасности")
    println()

    //Задание 3 (находится в Classwork -> characters -> Hero)
    println("Задание 3")
    println()
    val hero = Classwork.characters.Hero("Hornet", "Женский", "Sentinel", 56, 100, 6, "Silk")
    val spell = Classwork.magic.Spell("Thread Storm", 5, 5, "*")
    println(if (hero.castSpell(spell)) "Может кастовать" else "Не может кастовать")
    val hero1 = Classwork.characters.Hero("Ghost", "None", "Knight", 100, 200, 10, "Void")
    val spell1 = Classwork.magic.Spell("Descending Dark", 6, 6, "^")
    println(if (hero1.castSpell(spell1)) "Может кастовать" else "Не может кастовать")
    println()

    //Задание 4 (находится в Classwork -> characters -> Enemy)
    println("Задание 4")
    println()
    val enemy = Enemy("Grand Mother Silk",100, "Silk")
    println("Сила врага ${enemy.name} - ${enemy.calculatePower(100)}")
    println()
}