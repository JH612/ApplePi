fun main(args:Array<String>) {
    print("enter num1 : ")
    var num1 : Int = readLine()!!.toInt() // 첫번째 숫자 입력
    print("enter num2 : ")
    var num2 : Int = readLine()!!.toInt() // 두번째 숫자 입력
    print("enter operator : ")
    var op : Char = readLine()!![0] // 연산자 입력

    if(op == '+'){
        println("num1 + num2 = ${num1+num2}")
    }
    else if(op == '-'){
        if(num1 > num2){
            println("num1 - num2 = ${num1-num2}")
        }
        else{
            println("num2 - num1 = ${num2-num1}")
        }
    }
    else if(op == '*'){
        println("num1 * num2 = ${num1*num2}")
    }
    else if(op == '/'){
        if(num2 != 0){
            println("num1 / num2 = ${num1/num2}")
        }
        else{
            println("0으로 나눌 수 없어요!")
        }
    }
}