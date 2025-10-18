package Classwork.magic

fun main() {
    val fireWall = Spell("Огненная Стена", 5, 3, "\uD83D\uDD25")
    fireWall.cast()
    val iceShield = Spell("Ледяной щит", 4, "\u2744\uFE0F")
    iceShield.cast()
    val spell = Spell()
    spell.cast()

    println(fireWall.area())
    println(iceShield.area())
    println(spell.area())
}