package br.unifor.firstProject

/**
 * Created by laisa on 08/08/2017.
 */

fun main(args: Array<String>) { //PSVM
    /*
 val == final int A (imutavel)
 var == variavel mutavel
  */
    val  a: Int = 3 //variavel especifica o tipo da variavel na criação
    val b = 2  //variavel ja fica subintendido que o valor atribuido é inteiro

    //variaveis criadas com var podem sofrer modificaçoes
    var c = 1
    c = 4
    //variaveis criadas com val nao podem ser alteradas apos sua atribuição



    println("Hello World") //println  == System.out.Println

    // kotlin faz interpolação dentro das Strings fazendo com que possa ser executado metodos ou codigos dentro da String
    println("A soma de 3 + 5 é ${soma(a,b)}")

    println("valor da soma de A + B : "+soma(a,b))

    imprimirSoma(a,b)

    // IF kotlin é igual ao IF java

    if (a < 5){
        println("o numero $a é menor do que 5")
    }else{
        println("o numero $a é maior ou igual a 5")
    }
    //mas possui um IF aprimorado, o if no kotlin ele é uma expressao

    var resultado = if (a < 5){
        -1
    }else{
        1
    }
    //IF APRIMORADO 2  pode ser resumido como uma expressao em uma so linha

    var resultado2 = if (a < 5) -1 else 1


    println("$resultado")
    //IF APRIMORADO 2.5 pode utilizar encadeamento  de ifs na mesma LINHA  !!! OH MY GODD

    var resultado3 = if (a < 5) -1 else if(
    a > 5) -2 else -10

}


fun soma(numero1:Int ,numero2: Int): Int{


    return numero1 + numero2
}
//nova instrucao do kotlin voce pode retornar o processo no nome da funcao apos especificar o retorno colocando o sinal =
//e passando a instrucao de execução
fun somaSemEscopoComRetorno(numero1:Int ,numero2: Int):Int = numero1 + numero2

// Unit é utilizado para especificar que o metodo não possui retorno ou seja é um procedimento. OPCIONAL a adicição de Unit
fun imprimirSoma(a:Int, b:Int): Unit = println("A soma de $a + $b é ${a + b}")




























































