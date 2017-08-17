package br.unifor.firstProject

/**
 * Created by laisa on 10/08/2017.
 */
/*
4. Um garoto está planejando montar um aquário de peixes japoneses. Para cada peixe, são
necessários pelo menos 20 litros de água. Além disso, o comprimento mínimo do aquário
deve ser de 60 cm. Faça um algoritmo que recebe como entrada o número de peixes
desejados, o comprimento, a largura e a altura do aquário em centímetros, e mostra a
mensagem “Aquario inadequado!” caso o volume ou o comprimento do aquário sejam
insuficientes para abrigar os peixes.
*/

fun main(args: Array<String>) {
    var peixes:Int
    var litros:Int = 20
    var comprimento:Double
    var largura:Double
    var altura:Double
    var volume: Double
    var volumeCerto:Double

    println("Informe a quantidade de peixes")
   peixes = (readLine()?.toInt() ?:0)

    println("Informe o comprimento em cm")
    comprimento = (readLine()?.toDouble() ?:0.0)

    println("Informe o largura em cm")
    largura =(readLine()?.toDouble() ?:0.0)

    println("Informe o altura em cm")
    altura = (readLine()?.toDouble() ?:0.0)

    volume = (comprimento * largura * altura)/1000

    if((peixes*litros)<=volume){
        println("Aquario adquado")
    }else{
        println("Aquario inadequado")
    }
}