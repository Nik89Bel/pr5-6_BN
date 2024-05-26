import kotlin.math.pow

fun main(){
    println("Введите x")
    var x = readln()!!.toDouble()
    var f = 0.0
    when{
        x <= -3 -> {
            f = 9.0
            println("f = $f")
        }
        x > -3 -> {
            f = (1 / (x.pow(2) + 1))
            println("f = $f")
        }
        else -> println("Не верный ввод")
    }
}