package Classwork.world

class Contract (
    val clientName: String = "",
    val taskDescription: String = "",
    val reward: Int = 0,
    val isUrgent: Boolean = false
){
    fun printContractInfo() {
        println("Заказчик: $clientName")
        println("Задача: $taskDescription")
        println("Награда: $reward монет")
        println("Срочность: ${if (isUrgent) "Срочно!" else "Обычный конттракт"}")
    }
}