fun main(){
    println("Введите a")
    var a = readln()!!.toInt()
    when(a){
        0 -> println("ноль")
        1 -> println("один")
        2 -> println("два")
        3 -> println("три")
        4 -> println("четырые")
        5 -> println("пять")
        6 -> println("шесть")
        7 -> println("семь")
        8 -> println("восемь")
        9 -> println("девять")
        else -> println("не цифра")
    }
}