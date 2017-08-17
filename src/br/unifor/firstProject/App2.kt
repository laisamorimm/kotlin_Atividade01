package br.unifor.firstProject

/**
 * Created by laisa on 08/08/2017.
 */

fun main(args: Array<String>) {
    var i = 0
//vetor (lista)
    val frutas = listOf("banana","maça","pêra")

//for
    for(f in frutas){
        println("$f")
    }
    //or
    for (f in 1..10 step 2){      //step= pulando de 2 em 2   ex: 1, 3, 5, 7, 9
        println("$f")
    }

    for (f in 100 downTo 1 step 2){      //decrecente ex: 100, 98, 96...
        println("$f")
    }

    while (i < frutas.size)
        println(frutas[i])
    i ++ // or i+= 1                        // =+: ++

    val a:Any = 2                       //Any: qualquer coisa
    val b:Any = 5

    when(setOf(a,b)){                //a ordem n importa a,b ou b,a
        setOf(2,3)  ->  println("2 e 3")
        setOf(5,7)  -> println("5 e 7")
        setOf(2,5)  -> println("2 e 5")
    // is String  -> println("variavel do tipo String")
    // (a == 10 || a==20)  -> println("O valor de a é igual a 10 ou 20")
    }

    when{

        "banana" in frutas -> println("Tem banana")
        "laranja" in frutas -> println("Tem laranja")
        "maça" in frutas -> println("Tem maça")
        else -> "Não tem"
    }

    val frutas1 = listOf("banana", "maça", "pêra", "mamão", "melão", "laranja")
    frutas1
            .filter{ i ->i.startsWith('m')}            //vai de um em um procurando as q começam c m
            .sortedBy { it }                           //bota em ordem
            .map { it.toUpperCase() }                  //bota letra maiuscula
            .forEach { println(it) }                     //printa


    var msg:String
    println("Digite algumas coisa: ")
    msg = readLine() ?: ""
    println("Você digitou isso $msg ")

}


























