package Classwork.world

class Quest (
    val title: String = "",
    val duration: Int = 0,
    val reward: Int = 0,
    val difficulty: String = ""
) {
    fun printInfo() {
        println("Название квеста: ${this.title} \nBpeмя выполнения: ${this.duration} \nНаграда: ${this.reward} золотых \nУровень сложности: ${this.difficulty}")
    }

    fun isHArd(): Boolean {
        return difficulty.lowercase() == "сложный"
    }

    fun goldPerHour(): Int {
        require(duration >= 0 && reward >= 0) {"Длительность и награда не могут быть отрицательными!"}
        if (duration == 0) return 0
        return reward / duration
    }
}