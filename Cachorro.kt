package herança

   class Cachorro (nome: String, idade: Int)
         :Animal2(nome, idade)
   {

        fun DadosDoANimal(){
            println("O nome do Cachorro é:$nome\n" +
                    "A idade do Cachorro é: $idade"
                      )
        }
       override fun emetirSom() {

           println( "O som que ele emiti é:\nAUAU")
       }

       override fun correr() {
           println("Correndo até que cansou")
       }


       }

