package herança



   class Preguiça(nome: String, idade: Int)
         :Animal2(nome, idade)

   {

       fun DadosDoANimal() {
           println("O nome do Bicho Preguiça é:$nome\n" +
                   "A idade do Bicho Preguiça é: $idade"
           )
          }

       override fun emetirSom() {
        println("O som que ele emiti é:\nAN AN AN")
    }

    override fun correr() {
        println("Não corre porque tem preguiça kkkkkk")
    }
}