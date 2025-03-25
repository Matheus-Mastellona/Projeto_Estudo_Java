package oo.composicao.desafios;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Jose");
        
        Compra compra1 = new Compra();
        compra1.adicionarItem(1,"Caneta",100);
        compra1.adicionarItem(new Produto(2000,"Notebook"),2);
        
        Compra compra2 = new Compra();
        compra2.adicionarItem(10,"Caderno",10);
        compra2.adicionarItem(new Produto(1000,"Impressora"),1);
        
        c1.compras.add(compra1);
        c1.adicionarCompra(compra2);

        System.out.println("O valor total gasto foi: R$" + c1.obterGastoTotal());
        System.out.println("O clinete: "+c1.nome );
        System.out.println(compra1.nomeProduto());
    }
}
