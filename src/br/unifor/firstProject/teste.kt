package br.unifor.firstProject

/**
 * Created by laisa on 16/08/2017.
 */
fun main(args: Array<String>) {
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

    var vetorMedia = Array<Double>(10, { i -> 0.0 })
    var soma : Double =0.0


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
}