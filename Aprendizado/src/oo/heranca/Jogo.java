package oo.heranca;

public class Jogo {
    public static void main(String[] args) {
        Monstro monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 10;

        Heroi heroi = new Heroi(10, 11);
        // heroi.x = 10;
        // heroi.y = 11;

        System.out.println("O Monstro tem => " + monstro.vida + " HP");
        System.out.println("O Heroi tem => " + heroi.vida + " HP");

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println("O Monstro tem => " + monstro.vida + " HP");
        System.out.println("O Heroi tem => " + heroi.vida + " HP");

        /*
         * heroi.andar(Direcao.SUL);
         * monstro.atacar(heroi);
         * System.out.println(heroi.vida);
         * 
         * 
         * j1.andar(Direcao.NORTE);
         * j1.andar(Direcao.LESTE);
         * j1.andar(Direcao.NORTE);
         * j1.andar(Direcao.LESTE);
         * 
         * System.out.println(j1.x);
         * System.out.println(j1.y);
         */
    }
}
