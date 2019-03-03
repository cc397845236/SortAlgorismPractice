public class ShellSortDemo {

    private static void shellSort(int[] array){
        int gap = array.length / 2;
        while(1 <= gap){
            for (int i = gap; i < array.length; i++){
                int j = 0;
                int temp = array[i];
                for (j= i - gap; j>=0 && array[j] >temp; j= j-gap){
                    array[j+gap]= array[j];
                }
                array[j+gap] = temp;
            }
            gap = gap/2;
        }

    }

    public static void main(String[] args){
        int[] array = {5,4,3,2,1,5,3,21};
        int[] array1 = {1,2,3,4,5,6,7};

        shellSort(array);
        System.out.println(array);
    }
}
