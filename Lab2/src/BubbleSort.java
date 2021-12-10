public class BubbleSort implements Runnable {

    @Override
    public void run() {
        bubbleSort(Main.array);
    }

    private void bubbleSort(String[] str) {
        String[] array = new String[str.length];
        for (int i = 0; i < str.length; i++)
            array[i] = str[i];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i].compareTo(array[j]) > 0) {
                    swap(array, i, j);
                }
            }
        }
        print(array);

    }

    void swap(String[] array, int i, int j) {
        var dummy = array[i];
        array[i] = array[j];
        array[j] = dummy;

    }


    void print(String[] array) {
        System.out.println("Пузырьком:");
        for (var i : array)
            System.out.println(i);
    }
}
