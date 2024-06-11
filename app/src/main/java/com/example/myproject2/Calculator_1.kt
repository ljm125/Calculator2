package com.example.myproject2

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

        var test = Calculator()

        when{
            calculation == "1" -> {
                println("number1 + number2 = ${test.plus(number1, number2)}")
            }
            calculation == "2" -> {
                println("number1 - number2 = ${test.minus(number1,number2)}")
            }
            calculation == "3" -> {
                println("number1 * number2 = ${test.multiple(number1,number2)}")
            }
            calculation == "4" -> {
                println("number1 / number2 = ${test.division(number1,number2)}")
            }
            calculation == "5" -> {
                println("number1 % number2 = ${test.remainder(number1,number2)}")
            }

        }

    }
}



class Calculator() {
    fun plus(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    fun minus(num1: Int, num2: Int): Int {
        return num1 - num2
    }

    fun multiple(num1: Int, num2: Int): Int {
        return num1 * num2
    }

    fun division(num1: Int, num2: Int): Int {
        return num1 / num2
    }

    fun remainder(num1: Int, num2: Int): Int {
        return num1 % num2
    }
}