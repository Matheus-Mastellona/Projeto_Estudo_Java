package observer;

public class Namorada implements ChegadaAniversarianteObserver {

    @Override
    public void chegou(ChegadaAniversarianteEvent event) {
        System.out.println("Apagar as luzes...");
        System.out.println("Fzer silêncio...");
        System.out.println("Surpresa!!!");
    }

}
