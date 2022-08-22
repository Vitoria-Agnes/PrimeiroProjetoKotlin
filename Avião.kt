

class Avião (

    val aviação: String,
    val pilotos: String,
    val passageiros: String,
    var aeromoças: String,
    var clase: String,
         ){

    var clasePremium = false

     constructor(
         aviação: String,
         pilotos: String,
         passageiros: String,
         aeromoças: String,
         clase: String,
         clasePremium: Boolean,
       ): this (aviação,pilotos,passageiros,aeromoças,clase){
           this.clasePremium = clasePremium

       }




    fun NomeDaAviação(){
        println("Aviação:$aviação")

    }
    fun DadosdoPilotos(){
        println("Pilotos:$pilotos")
    }
    fun QuantidadePassaeiros(){
        println("Quantidade de passageiros:$passageiros")

    }
    fun Aeromoçass(){
        println("Aeromoças a bordo:$aeromoças")

    }
    fun Clasee(){
        println("Você está em clase:$clase")









    }






      }



















