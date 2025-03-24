package colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Ana");
        lista.add(u1);
        lista.add(new Usuario("Calos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));

        for (Usuario u : lista) {
            System.out.println(u.nome);
        }

        System.out.println();
        System.out.println(lista.get(3).nome); // Acessar pelo indice
        System.out.println(lista.get(3));

        System.out.println(lista.remove(1));
        System.out.println(lista.remove(new Usuario("Manu")));

        System.out.println("Tem? " + lista.contains(new Usuario("Lia")));

        System.out.println();

        for (Usuario usuario : lista) {
            System.out.println(usuario.nome);
        }
    }
}
