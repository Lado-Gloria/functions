fun main() {
    name()
    println(25.5 / 5.0)
    sum(40,20,12,10)
    funfact()

}
fun name(){
    var name = "Ada"
    println("Hello" + " " +name)
}
fun div( num1: Double, num2: Double ): Double{
    var divison: Double = num1/num2
    return  divison
}
fun sum(num1:Int, num2:Int, num3:Int, num4:Int){
    println(num1 + num2 + num3 + num4 )
}
fun funfact (){
    var fact ="Am a strong woman"
    println(fact)
}