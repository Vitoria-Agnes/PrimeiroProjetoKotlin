package herança



    class Gato(nome: String, idade: Int)
          :Animal2(nome, idade)
    {

         fun DadosDoANimal() {
             println( "O nome do Gato é:$nome\n" +
                      "A idade do Gatoé: $idade"
             )}

         override fun emetirSom() {
             println("O som que ele emiti é:\nMiau")
         }

         override fun correr() {
             println("Correndo com preguiça")
         }


     }