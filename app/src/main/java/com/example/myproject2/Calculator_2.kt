package com.example.myproject1

fun main(){

    val exitnumber = -1

    while (true){

        print("첫 번째 숫자를 입력하세요 ${exitnumber}를 입력하면 종료됩니다. : ")
        var number1 = readLine()!!.toInt()
        if(number1 == exitnumber){
            break
        }

        print("두 번째 숫자를 입력하세요 : ")
        var number2 = readLine()!!.toInt()

        print("연산 번호를 입력하세요 : ")
        var calculation = readLine()!!

        var _plus = AddOperation()
        var _minus = SubstractOperation()
        var _multiple = MultiplyOperation()
        var _division = DivideOperation()

        when{
            calculation == "1" -> {
                println("number1 + number2 = ${_plus.operation(number1, number2)}")
            }
            calculation == "2" -> {
                println("number1 - number2 = ${_minus.operation(number1,number2)}")
            }
            calculation == "3" -> {
                println("number1 * number2 = ${_multiple.operation(number1,number2)}")
            }
            calculation == "4" -> {
                println("number1 / number2 = ${_division.operation(number1,number2)}")
            }

        }

    }
}



open class Calculator2(){
    open fun operation(num1:Int, num2:Int): Int{
        return num1
    }
}

class AddOperation() : Calculator2() {
    override fun operation(num1: Int, num2: Int): Int {
        return num1+num2
    }
}

class SubstractOperation() : Calculator2() {
    override fun operation(num1: Int, num2: Int): Int {
        return num1 - num2
    }
}

class MultiplyOperation() : Calculator2() {
    override fun operation(num1: Int, num2: Int): Int {
        return num1 * num2
    }
}

class DivideOperation() : Calculator2() {
    override fun operation(num1: Int, num2: Int): Int {
        return num1 / num2
    }
}