/**
 * Created by bruno on 4/06/17.
 */

fun main(args:Array<String>){

   print("Ingrese su nombre por favor: ")
    var name = readLine()
    print("Ingrese su edad")
    var age = readLine()!!.toInt()
    println("***output***")
    println(name)
    println(age + 4 )
}