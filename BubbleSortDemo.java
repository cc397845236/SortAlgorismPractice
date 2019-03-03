public class BubbleSortDemo {
    private static void bubbleSort(int[] array){
        boolean swapedFlag = false;
        for(int i=0; i< array.length-1; i++){
            for (int j =array.length-1; j > i; j--){
                if (array[j-1] > array[j]){
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                    swapedFlag= true;
                }
            }
            if(!swapedFlag){
                break;
            }
        }
    }

    public static void main(String[] args){
        int[] array = {5,4,3,2,1,5,3,21};
        int[] array1 = {1,2,3,4,5,6,7};

        bubbleSort(array1);
        System.out.println(array1);
    }
}
