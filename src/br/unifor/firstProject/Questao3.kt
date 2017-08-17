package br.unifor.firstProject

/**
 * Created by laisa on 10/08/2017.
 */

/*
3. Um hotel cobra R$ 60,00 a diária e mais uma taxa adicional de: R$ 5,50 por diária, se o
número de diárias for maior que 10; R$ 6,00 por diária, se o número de diárias for igual a
10; R$ 8,00 por diária, se o número de diárias for menor que 10. Faça um algoritmo que,
dado um cliente e seu número de diárias, mostra o nome do cliente e sua conta. Utilize
seleção encadeada.
*/

fun main(args: Array<String>) {
    var diaria:Double = 60.0
    var entrada:String
    val dias:Int
    val nome:String

    println("Informe seu nome")
    nome = readLine() ?: ""
    println("Quantos dias você vai passar?")
    entrada= readLine() ?: ""
    dias = entrada.toInt()
     if(dias>10){
         diaria = (diaria + 5.5)*dias
     }else{
         if(dias==10){
             diaria = (diaria + 6)*dias
         }else{
             if(dias <10){
                 diaria = (diaria + 8)*dias
             }
         }
     }


    println("Nome: $nome")
    println("Conta: $diaria")
}