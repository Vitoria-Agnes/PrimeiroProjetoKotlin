

fun addmercadoria(produto: String){

    if(produto != ""){
        estoque.add(produto)
        println("Nome $produto adicionado com sucesso!")
    }else{
        println("Produto Inválido")
    }
}

fun removemercadoria(){

    while (true){
        println("Digite o produto que quer remover do estoque: ")
        val produtoexc = readln()
        if (estoque.contains(produtoexc)){
            estoque.remove(produtoexc)
            println("Produto $produtoexc excluido com sucesso")
            break
        }else{
            println("O produto $produtoexc não esxite no estoque ")
        }

    }
}

fun attmerc(){
    println("Digite o produto que você quer atualizar: ")
    val produtoatt = readln()
    if (estoque.contains(produtoatt)) {
        val posicao = estoque.indexOf(produtoatt)
        println("Digite o novo nome do produto: ")
        estoque[posicao] = readln()
        println("Produto atualizado com sucesso")
    }else{
        println("O produto $produtoatt não existe no estoque")

    }
}
fun listarMer(){
    println("Produtos\n")
    println(listarMer())
}