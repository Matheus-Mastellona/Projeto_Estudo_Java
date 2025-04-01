package lambda;

public class Threads {

    public static void main(String[] args) {

        Runnable trabalho1 = new Trabalho1();

        Runnable trabalho2 = new Runnable() {
            public void run() {
                for (int index = 0; index < 10; index++) {
                    System.out.println("Tarefa #02");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    }
                }
            }
        };

        Runnable trabalho3 = () -> {
            for (int index = 0; index < 10; index++) {
                System.out.println("Tarefa #03");
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }
            }
        };

        Thread t1 = new Thread(trabalho1);
        Thread t2 = new Thread(trabalho2);
        Thread t3 = new Thread(trabalho3);

        t1.start();
        t2.start();
        t3.start();
    }
    /*
     * static void trabalho3(){
     * for (int index = 0; index < 10; index++) {
     * System.out.println("Tarefa #03");
     * try {
     * Thread.sleep(100);
     * } catch (Exception e) {
     * }
     * }
     * }
     */
}
