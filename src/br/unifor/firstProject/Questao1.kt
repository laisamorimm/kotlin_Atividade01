package br.unifor.firstProject

/**
 * Created by laisa on 10/08/2017.
 */

     /**
      * Questão 1.
      * Faça um algoritmo que lê 3 números e mostra a soma dos 2 maiores dentre estes números.
      * Considere que o usuário pode fornecer 2 ou mais números iguais. O resultado só deve
      * ser mostrado uma única vez.
      * Ex.:
      *      {3, 5, 1} → mostrar 8;
      *      {5, 3, 5} → mostrar 10;
      *      {4, 3, 3} → mostrar 7;
      *      {3, 3, 3} → mostrar 6.
      */

     fun main(args: Array<String>) {

          val vetorDeNumeros = arrayListOf(0,0,0)
          for(i in 0..2){
               println("Informe um numero")
               vetorDeNumeros[i] = readLine()?.toInt() ?: 0
          }

          //bota em ordem
          vetorDeNumeros.sort()
          println("A soma dos numeros ${vetorDeNumeros[1]} , ${vetorDeNumeros[2] } é : ${vetorDeNumeros[1]+ vetorDeNumeros[2]} ")

     }