
    fun main(){

       // 3 - Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
       // 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
       // idade for =-99. (WHILE)



    var idade = 0
    var p21 = 0
    var p50 = 0

    while (idade != -99){
        print("Digite uma idade diferente de -99: ")
        idade = readLine()!!.toInt()

        if(idade != -99){
            if(idade < 21){
                p21++
            }else if (idade > 50){
                p50++
            }
        }
    }

    println("O total de pessoas com menos de 21 anos é $p21" +
            " e com mais de 50 anos é $p50")













    }