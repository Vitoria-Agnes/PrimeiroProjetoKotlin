    import kotlin.math.pow

         // *3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
        //categoria ela se encontra//*


       fun main (args: Array<String>) {

       print (" Digite sua idade e descubra qual categoria você se encaixa:")
       val idade = readln().toInt()

       when(idade) {

           in 0..9   -> println("Categoria infantil ")
           in 10..14 -> println(" Categoria Adolescente")
           in 15..17 -> println(" Categoria Juvenil")
           in 18..25 -> println(" Categoria Adulto")

           else -> println(" Você é mais que adulto, está quase velho kkkk")


       }










}