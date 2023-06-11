//class Car(val brand : String){
//    var color : String = "red"
//    fun printThis(){
//        println("This $brand car is $color")
//    }
//}
//
//fun main(args: Array<String>) {
//    var carA = Car("BMW")
//    carA.color = "blue"
//    carA.printThis()
//}

class Friend(val brand : String){
    val Department : String = "SW"
    var Clothes : String = "a T-shirt"
    var Age : String = "17"
    fun printThis(){
        println("$brand wears $Clothes.")
        println("$brand's Department is $Department.")
        println("$brand is $Age years old.\n")
    }
}

fun main(args : Array<String>) {
    var Friend1 = Friend("유도윤")
    Friend1.Clothes = "jeans"
    Friend1.printThis()

    var Friend2 = Friend("이정우")
    Friend2.Age = "5"
    Friend2.printThis()
}