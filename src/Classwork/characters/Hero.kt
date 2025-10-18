package Classwork.characters

import Classwork.magic.Spell
import Classwork.world.Quest

class Hero (
    val name: String = "",
    val gender: String = "",
    val role: String = "",
    var hp: Int = 0,
    var mp: Int = 0,
    val level: Int = 0,
    val element: String = ""
) {

//    constructor(name: String, gender: String, role: String, hp: Int, mp: Int, level: Int, element: String) {
//        this.name = name
//        this.gender = gender
//        this.role = role
//        this.hp = hp
//        this.mp = mp
//        this.level = level
//        this.element = element
//    }

    fun hello(){
        println("Привет, герой!")
    }

    fun sayHello(){
        println("Я - $name, мой путь только начинается")
    }

    fun showStats(){
        println("Имя: $name | Класс: $role | HP: $hp | MP: $mp | Level: $level | Element: $element")
    }

    fun meditate(){
        println("$name медитирует...")
        mp += 20
        println("Мана восстановлена! Текущая мана: $mp")
    }

    fun takeDamage(amount: Int){
        println("$name получает $amount урон!")
        hp -= amount
        if (hp < 0) {
            hp = 0
            die()
        } else {
            println("Осталось здоровья: $hp")
        }
    }

    fun die(){
        if (hp <= 0){
            println("$name умер!")
        }
    }

    fun castSpell(){
        if (mp - 10 <= 0) {
            println("Не хватает маны! Использование магии запрещено!")
        } else {
            mp -= 10
            println("Герой применяет магию!")
        }
    }

    fun heal(){
        if (mp - 10 <= 0) {
            println("Недостаточно маны! У вас только $mp")
        } else {
            hp += 10
            mp -= 10
            println("Лечусь! Восстановлено здоровье, потрачено 10 маны.")
            println("Здоровье: $hp | Мана: $mp")
        }
    }

    fun greet(name: String){
        println("Привет, $name")
    }

    fun attack(enemy: Enemy, damage: Int){
        println("$name атакует врага ${enemy.name}!")
        enemy.takeDamage(damage)
    }

    fun castSpellOn(enemy: Enemy, spellName: String, damage: Int){
        println("$name использует заклинание '$spellName' против ${enemy.name}!")
        if (element == enemy.element) {
            println("Стихии совпадают! Урон снижен.")
            val reducedDamage = damage / 2
            enemy.takeDamage(reducedDamage)
        } else {
            enemy.takeDamage(damage)
        }
        mp -= 10
        if (mp < 0) mp = 0
        println("Осталось маны: $mp")
    }

    fun duel(opponent: Hero) {
        println("Дуэль между $name и ${opponent.name} начинается!")

        println("$name атакует первым!")
        opponent.takeDamage(15)

        println("${opponent.name} отвечает!")
        this.takeDamage(15)

        println("Дуэль завершена.")
        println("Состояние героев:")
        this.showStats()
        opponent.showStats()
    }

    fun isAlive(): Boolean {
        return hp > 0
    }

    fun canAcceptQuest(quest: Quest): Boolean {
        val canAccept = when (quest.difficulty.lowercase()) {
            "лёгкий" -> level >= 1
            "средний" -> level >= 3
            "сложный" -> level >= 5
            else -> false
        }

        if (canAccept) {
            println("$name может принять квест \"${quest.title}\"!")
        } else {
            println("$name не может принять квест \"${quest.title}\". Требуется более высокий уровень.")
        }

        return canAccept
    }

    fun castSpell(spell: Spell): Boolean {
        return spell.name.length <= level * 2
                && spell.height <= 5
                && spell.width <= 5
    }
}