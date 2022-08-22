class Cliente (


    var nome: String,
    var cpf : String,
    var celular :String,
    var localizacao : String,
    var compras : String,

){
            fun NomeDoCliente(){
              println("Cliente: $nome")

            }
           fun DadosCliente(){
            println("Cpf: $cpf")
        }
          fun Contato(){
          println("Numero para contato: $celular")

    }
          fun Residencia(){
          println("Endereço de entrega: $localizacao")
    }
        fun ComprasEfetuadas() {
            println("Compras efetuadas:  $compras")

        }
}





