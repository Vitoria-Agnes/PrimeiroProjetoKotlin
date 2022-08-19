

var estoque = mutableListOf<String>("Arroz", "Feijão", "macarrão", "oléo, ")

fun main() {

    while (true) {


        println("Digite uma das opções seguintes para verificar o estoque: ")
        println()
        println("1 - Adicionar Mercadoria")
        println("2 - Remover Mercadoria")
        println("3 - Atualizar Mercadoria")
        println("4 - Listar Mercadoria")
        println("5 - Sair")
        println()

        println("Opção: ")

        /* coloquei readln como String para quando eu digitar tanto letra ou número q não estiver dentro do menu
         retorne como opção invalida*/

        when (readln()) {

            "1" -> {
                println("Qual produto será adicionado: ")
                val produto = readln()
                addmercadoria(produto)
            }
            "2" -> removemercadoria()
            "3" -> attmerc()
            "4" -> listarMer()
            "5" -> break
            else  -> println("Opção invalida")


        }


        }

    }







