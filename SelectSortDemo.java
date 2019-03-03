public class SelectSortDemo {

    private static void selectSort(int[] array){
        for (int i=0; i <array.length; i++){
            int k = i;
            for(int j = k+1; j<array.length; j++){
                if (array[j] < array[k]){
                    k = j;
                }
            }
            if (i != k){
                int temp = array[k];
                array[k] = array[i];
                array[i] = temp;
            }
        }
    }

    public static void main(String[] args){
        int[] array = {5,4,3,2,1,5,3,21};
        int[] array1 = {1,2,3,4,5,6,7};

        selectSort(array);
        System.out.println(array);
    }
}
