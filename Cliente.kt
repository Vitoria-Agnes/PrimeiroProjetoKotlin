
class Cliente (
    var nome: String,
    var endereco: String,
    var telefone: String
) {

    private val comprasEfetuadas = mutableListOf<String>()

    init {
        checarDados()
    }

    fun addCompra(compra: String) {
        if (compra.isNotBlank()) {
            comprasEfetuadas.add(compra)
            println("Produto adicionado com sucesso!")
        } else {
            println("Produto Inválido")
        }
    }

    fun removeCompra(compra: String) {
        if (comprasEfetuadas.contains(compra)) {
            comprasEfetuadas.remove(compra)
            println("Produto removido com sucesso!")
        } else {
            println("O produto $compra não existe na lista!")
        }
    }

    fun exibirCompras() {
        println("***Lista de Compras***\n")
        comprasEfetuadas.forEach {
            println(it)
        }
    }

    private fun checarDados() {
        if (nome.isBlank()) {
            throw Exception("Cadastro feito de maneira incorreta!")
        }
    }

}







