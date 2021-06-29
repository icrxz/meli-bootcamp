package modulo5.aula5.exercicio2;

public class SortUtil {
    public static <T> void sort(Precedente<T> arr[]) {
        int n = arr.length;

        while (n > 0) {
            int lastModifiedIndex = 0;

            for (int currentIndex = 1; currentIndex < n; currentIndex++) {
                if(arr[currentIndex].precedeA((T)arr[currentIndex-1]) < 0) {
                    Precedente<T> aux = arr[currentIndex - 1];
                    arr[currentIndex - 1] = arr[currentIndex];
                    arr[currentIndex] = aux;

                    lastModifiedIndex = currentIndex;
                }
            }

            n = lastModifiedIndex;
        }
    }
}
