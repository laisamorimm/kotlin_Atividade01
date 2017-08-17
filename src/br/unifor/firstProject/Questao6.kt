package br.unifor.firstProject

/**
 * Created by laisa on 15/08/2017.
 */
/*
6. Declare e inicialize um vetor com as matrículas de dez alunos e uma matriz 10x4 para
armazenar as 3 notas de cada um dos alunos, conforme a tabela abaixo:
(a) Imprima a matriz de matriculas e notas de forma tabular;
(b) Construa um vetor com a média de cada aluno;
(c) Crie um programa que leia uma matriz de ordem Anxn, n ∈ N e imprima de forma
matricial o que se pede:
i. todos os elementos da matriz;
ii. a diagonal principal;
1
Aluno Nota 1 Nota 2 Nota 3
1600 7,5 8,9 6,5
1601 8,2 7,3 9,4
1602 10,0 9,6 7,1
1603 6,8 7,5 8,1
1604 8,8 7,4 9,2
1605 8,3 7,9 9,0
1606 7,2 8,7 9,8
1607 8,3 7,7 8,9
1608 7,8 7,7 8,5
1609 8,0 7,0 9,0
iii. a matriz triangular superior;
iv. a matriz triangular inferior;
v. tudo, exceto a diagonal principal;
(d) Construa uma matriz A10x2 onde a primeira coluna armazene as matrículas dos alunos
e a segunda coluna se o aluno foi aprovado por média (média aritimética simples com
resultado maior ou igual a sete).
Código-fonte 1: Exemplo de Código para a criação de uma matriz 10x4 com valores do
tipo double em Kotlin
1 v a l a l u n o s = A r r a y ( 1 0 , { D o u bl e A r r ay ( 4 ) } )*/

fun main(args: Array<String>){

val alunos = arrayOf(doubleArrayOf(1600.0, 7.5, 8.9, 6.5)  //0
        , doubleArrayOf(1601.0, 8.2, 2.3, 9.4)  //1
        , doubleArrayOf(1602.0, 10.0, 9.6, 7.1) //2
        , doubleArrayOf(1603.0, 6.8, 7.5, 8.1)  //3
        , doubleArrayOf(1604.0, 8.8, 7.4, 9.2)  //4
        , doubleArrayOf(1605.0, 8.3, 7.9, 9.0)  //5
        , doubleArrayOf(1606.0, 7.2, 8.7, 9.8)  //6
        , doubleArrayOf(1607.0, 8.3, 7.7, 8.9)  //7
        , doubleArrayOf(1608.0, 7.8, 7.0, 9.0)  //8
        , doubleArrayOf(1609.0, 8.0, 7.0, 9.0))


    val mediaAluno = listOf("")
    var soma : Double =0.0
    var vetorMedia = Array<Double>(10, { i -> 0.0 })
    println("Informe o tamanho da matriz desejada")
    val n =(readLine()?.toInt() ?:0)
    var matriz = Array(n,{IntArray(n)})

    //imprimir tabulado:
    println("Aluno  \t  Np1  \t  NP2  \t  Np3")
    for (i in 0..9){
        for (j in 0..3){
           print(alunos[i][j])
            print(" \t ")

        }
        println()
    }
    println()

    //media:
    println("Media dos alunos")
    for (i in 0..9){
        soma =0.0
        for (j in 1..3){
            soma = soma + alunos[i][j]

        }
        vetorMedia[i] = soma/3
    }

    for (i in 0..9){
        println( vetorMedia[i])
    }

    //imprimir matriz:
for (i in 0..n-1){
    for (j in 0..n-1){
        println("Informe um numero")
        matriz[i][j] = (readLine()?.toInt() ?:0)
    }
}
    println("A matriz é: ")
    for (i in 0..n-1){
        for(j in 0..n-1){
            print("${matriz[i][j]}  ")
        }
        println()
    }
    println()

    //imprimir diagonal principal

println("A diagonal principal é: ")
    for (i in 0..n-1){
        for (j in 0..n-1){
           if(i==j){
               print("[ ${matriz[i][j]} ]   ")
           }else{
               print("[  ]   ")
           }
        }
        println()
    }

    //imprimir triangulo superior

    println("Triangulo superior é: ")
    for (i in 0..n-1){
        for (j in 0..n-1){
            if(j>=i){
                print("[ ${matriz[i][j]} ]   ")
            }else{
                print("[  ]   ")
            }
        }
        println()
    }

    //imprimir triangulo inferior

    println("Triangulo superior é: ")
    for (i in 0..n-1){
        for (j in 0..n-1){
            if(i>=j){
                print("[ ${matriz[i][j]} ]   ")
            }else{
                print("[  ]   ")
            }
        }
        println()
    }

    //imprimir tudo menos a diagonal principal

    println("Menos a diagonal principal: ")
    for (i in 0..n-1){
        for (j in 0..n-1){
            if(i==j){
                print("[  ]   ")
            }else{
                print("[ ${matriz[i][j]} ]   ")
            }
        }
        println()
    }

    //imprimir os alunos com media maior que 7

    println("Alunos com media maior ou igual a 7")
    for (i in 0..9){
            if(vetorMedia[i]>=7){
               println(alunos[i][0])

        }
    }
}