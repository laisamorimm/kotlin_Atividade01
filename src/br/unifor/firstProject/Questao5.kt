package br.unifor.firstProject

/**
 * Created by laisa on 15/08/2017.
 */
/*
5. Na UNIFOR, o rendimento acadêmico é baseado em duas notas parciais NP1 e NP2. Todo
aluno com média ME = (NP1 + NP2)/2 ≥ 8 está aprovado por média. Há ainda, uma
terceira nota, a da prova final (PF), que só é aplicada se o aluno tiver média 4 ≤ ME < 8.
Neste caso, para ser aprovado, o aluno deve obter média final MF = (ME + NF)/2 ≥
5. Entretanto o rendimento acadêmico do aluno só é considerado caso o aluno tenha
frequência de, pelo menos, 75%. Do contrário, o aluno está automaticamente reprovado
por falta. Escreva um algoritmo que leia a freqência e as notas de um aluno da UNIFOR
e mostra sua situação “Reprovado por Frequência”, “Aprovado por Média”, “Aprovado
por Média Final”, “Reprovado por Média” ou “Reprovado por Média Final”.
*/

fun main(args: Array<String>) {
    val fregencia:Int
    val np1:Double
    val np2:Double
    val provaFinal:Double
    val media:Double
    val mediafinal:Double

    println("Informe sua fregência ")
    fregencia = (readLine()?.toInt() ?:0)
    if(fregencia>= 75){
        println("Informe sua np1")
        np1 = (readLine()?.toDouble() ?:0.0)

        println("Informe sua np2")
        np2 = (readLine()?.toDouble() ?:0.0)

        media =(np1+np2)/2
        if(media>= 8){
            println("Aprovado por media")
        }else{
            println("Informe sua nota final")
            provaFinal = (readLine()?.toDouble() ?:0.0)

            mediafinal = (media + provaFinal)/2
            if(mediafinal>=5){
                println("Aprovado por final")
            }
        }
    }else{
        println("Reprovado por falta")
    }

}