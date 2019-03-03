public class InsertSortDemo {

    private static void insertSort(int[] array){
        for(int i = 0; i < array.length-1; i++){
            int j=0;
            int temp = array[i];
            for (j =i-1; j >= 0 && array[j] > temp; j--){
                array[j+1] = array[j];
            }
            array[j+1] = temp;
        }
    }

    public static void main(String[] args){
        int[] array = {5,4,3,2,1,5,3,21};
        int[] array1 = {1,2,3,4,5,6,7};

        insertSort(array);
        System.out.println(array);
    }
}
