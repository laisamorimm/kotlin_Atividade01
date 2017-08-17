package br.unifor.firstProject

/**
 * Created by laisa on 10/08/2017.
 */
/*
2. Dois times estão disputando a final do campeonato nacional de basquete, o Time A e o
Time B. Faça um algoritmo que, dado como entrada a quantidade de cestas de 1, 2 e 3
pontos de cada um dos dois times, indica o time vencedor ou, em caso de empate, mostra
a mensagem “Empate”.
*/

fun main(args: Array<String>) {
    var cestas: Int
    var entrada:String
    var totalCestasA:Int
    var totalCestasB:Int

    println("Informe a quantidade de cestas de um ponto do Time A")
    entrada= readLine() ?: ""
    cestas = entrada.toInt()
    totalCestasA = cestas

    println("Informe a quantidade de cestas de dois pontos do Time A")
    entrada= readLine() ?: ""
    cestas = entrada.toInt()
    totalCestasA = cestas*2 + totalCestasA

    println("Informe a quantidade de cestas de tres pontos do Time A")
    entrada= readLine() ?: ""
    cestas = entrada.toInt()
    totalCestasA = cestas*3 + totalCestasA

    println("A soma das cestas do time A é $totalCestasA")



    println("Informe a quantidade de cestas de um ponto do Time B")
    entrada= readLine() ?: ""
    cestas = entrada.toInt()
    totalCestasB = cestas

    println("Informe a quantidade de cestas de dois pontod do Time B")
    entrada= readLine() ?: ""
    cestas = entrada.toInt()
    totalCestasB = cestas*2 + totalCestasB

    println("Informe a quantidade de cestas de tres pontos do Time B")
    entrada= readLine() ?: ""
    cestas = entrada.toInt()
    totalCestasB = cestas*3 + totalCestasB

    println("A soma das cestas do time B é $totalCestasB")


    if(totalCestasA> totalCestasB){
        println("Time A ganhou")
    }else{
        if(totalCestasB> totalCestasA){
            println("Time B ganhou")
        }else{
            println("Empate")
        }
    }
}