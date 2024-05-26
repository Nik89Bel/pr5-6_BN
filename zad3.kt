fun main(){
    println("Введите a")
    var a = readln()!!.toDouble()
    when(a){
        in 0.0..2.0 -> println("младенец")
        in 2.0..7.0 -> println("ребенок")
        in 7.0..14.0 -> println("почти подросток")
        in 14.0..18.0 -> println("подросток")
        in 18.0..30.0 -> println("еще не кризис")
        in 30.0..65.0 -> println("кризис среднего возраста")
        in 65.0..110.0 -> println("пенсионер")
        else -> println("не правильный ввод")
    }
}