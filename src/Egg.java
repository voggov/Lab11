public class Egg extends Thread {

    public Egg(String name) {
        super(name);
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Яйцо!");
                Main.lastName = new StringBuilder("Яйцо");
                Thread.sleep(200);
            }
        }catch (Exception ex){
            System.out.println("Thread is interrupted");
        }
    }
}
