package Classwork.world

fun main() {
    val quest = Quest()
    print("Введите название квеста: ")
    val title = readln()
    print("Введите время выполнения (в часах): ")
    val duration = readln().toInt()
    print("Введите награду (в монетах): ")
    val reward = readln().toInt()
    print("Введите уровень сложности: ")
    val difficulty = readln()

//    quest.title = title
//    quest.duration = duration
//    quest.reward = reward
//    quest.difficulty = difficulty

//    println("Название квеста: ${quest.title} \nBpeмя выполнения: ${quest.duration} \nНаграда: ${quest.reward} золотых \nУровень сложности: ${quest.difficulty}")

//    quest.printInfo()
//    quest.init(title, duration, reward, difficulty)
//    quest.init("Охото на тролля", 3, 500, "Средний")
//    quest.init("Охото на тролля", 500, 3, "Средний")
//    quest.init(
//        title = "Охото на тролля",
//        reward = 500,
//        duration = 3,
//        difficulty = "Средний"
//    )

    val quests = mutableListOf<Quest>()
    for (i in 1..3) {
        println("Добавим квест #$i")
        val q = Quest()
        print("Название: ")
        val title = readln()
        print("Время (ч): ")
        val duration = readln().toInt()
        print("Награда: ")
        val reward = readln().toInt()
        print("Сложность: ")
        val difficulty = readln()

//        q.init(title, duration, reward, difficulty)
//        quests.add(q)
        println()
    }

    println("Bce доступные квесты:")
    for (q in quests) {
        q.printInfo()
    }

    val quest1 = Quest("Побег из замка", 5, 700, "Сложный")
    println("Квест сложный? ${quest1.isHArd()}")
}