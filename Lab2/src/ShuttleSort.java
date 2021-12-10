public class ShuttleSort implements Runnable {
    @Override
    public void run() {
        shuttleSort(Main.array);
    }

    void shuttleSort(String[] str) {

        String[] array = new String[str.length];
        for (int i = 0; i < str.length; i++)
            array[i] = str[i];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(array[i - 1]) > 0) {
                swap(array, i, i - 1);
                for (int z = i - 1; (z - 1) >= 0; z--) {
                    if (array[z].compareTo(array[z - 1]) > 0) {
                        swap(array, z, z - 1);
                    } else {
                        break;
                    }
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
        System.out.println("Челночная:");
        for (var i : array)
            System.out.println(i);
    }
}
