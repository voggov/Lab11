public interface IForSort {
    default void swap(String[] array, int i, int j){
        var dummy = array[i];
        array[i] = array[j];
        array[j] = dummy;

    }
    default void print(String[] array){
        for (var i : array)
            System.out.println(i);

    }
}
