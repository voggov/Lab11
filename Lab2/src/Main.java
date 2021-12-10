public class Main {
    static String[] array = {"asdas", "jaskldj1", "1122", "", "Slovo", "dva slov", "qweoieworjkjs"};
    public static void main(String[] args) {
        System.out.println("Начальный массив:");
        for (var i : array)
            System.out.println(i);
        System.out.println("//////////////////////////////////\n");
        BubbleSort bubbleSort = new BubbleSort();
        SelectionSort selectionSort = new SelectionSort();
        Thread thread = new Thread(new BubbleSort(),"BubbleSort");
        Thread thread2 = new Thread(new SelectionSort(),"SelectionSort");
        Thread thread3 = new Thread(new ShuttleSort(),"ShuttleSort");
        thread.start();
        thread2.start();
        thread3.start();

    }
}
