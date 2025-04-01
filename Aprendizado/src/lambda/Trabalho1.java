package lambda;

public class Trabalho1 implements Runnable {
    public void run() {
        for (int index = 0; index < 10; index++) {
            System.out.println("Tarefa #01");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
        }
    }
}
