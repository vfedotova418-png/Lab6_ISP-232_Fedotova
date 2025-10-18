package Homework

class Location (
    val name: String = "",
    val dangerLevel: String = "",
    val requiredLevel: Int = 0
) {
    fun isDangerous(): Boolean {
        return dangerLevel == "Высокий"
    }
}