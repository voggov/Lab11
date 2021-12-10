
public class Chicken extends Thread {

    public Chicken(String name) {
        super(name);
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Курица!");
                Main.lastName = new StringBuilder("Курица");
                Thread.sleep(200);
            }
        } catch (Exception ex) {
            System.out.println("Thread is interrupted");
        }
    }
}