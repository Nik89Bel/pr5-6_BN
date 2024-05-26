import kotlin.math.pow

fun main(){
    println("Введите а и b")
    var a = readln()!!.toDouble()
    var b = readln()!!.toDouble()
    when{
        a > b -> println(a + 1)
        a < b -> println(b + 1)
        a == b -> println( a.pow(3))
    }
}