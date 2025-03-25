package oo.composicao.desafios;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    List<Item> itens = new ArrayList<>();

    void adicionarItem(Produto p, int quantidade) {
        this.itens.add(new Item(p, quantidade));
    }

    void adicionarItem(double preco, String nome, int quantidade) {
        var produto = new Produto(preco, nome);
        this.itens.add(new Item(produto, quantidade));
    }

    double obterValorTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.quantidade * item.produto.preco;
        }
        return total;
    }

    String nomeProduto(){
        for (Item item : itens) {
            return item.produto.nome;
        }
        return null;
    }
}
