public class Main {
    static StringBuilder lastName = new StringBuilder();

    public static void main(String[] args) {
        Chicken chicken = new Chicken("Chicken");
        Egg egg = new Egg("Egg");

        chicken.start();
        egg.start();
        try {
            egg.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            chicken.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Первым было: " + lastName);
    }
}
