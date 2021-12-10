public class SelectionSort implements Runnable {
    @Override
    public void run() {
        selectionSort(Main.array);
    }

    void selectionSort(String[] str) {

        String[] array = new String[str.length];
        for (int i = 0; i < str.length; i++)
            array[i] = str[i];
        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = left; i < array.length; i++) {
                if (array[i].compareTo(array[minInd]) > 0) {
                    minInd = i;
                }
            }
            swap(array, left, minInd);
        }
        print(array);

    }

    void swap(String[] array, int i, int j) {
        var dummy = array[i];
        array[i] = array[j];
        array[j] = dummy;

    }

    void print(String[] array) {
        System.out.println("Выбором:");
        for (var i : array)
            System.out.println(i);
    }
}

