public class QuickSortDemo {

    private static int division(int[] array, int left, int right){
        int key = array[left];
        while(left < right){
            while (left < right && array[right] >= key){
                right--;
            }
            array[left] = array[right];
            while (left < right && array[left] <= key){
                left++;
            }
            array[right] = array[left];
        }
        array[left] = key;
        return left;
    }

    private static void quickSort(int[] array, int start, int end){
        if (start < end){
            int keyIndex = division(array, start, end);
            quickSort(array, start, keyIndex-1);
            quickSort(array, keyIndex+1, end);
        }
    }

    public static void main(String[] args){
        int[] array = {5,4,3,2,1,5,3,21};
        int[] array1 = {1,2,3,4,5,6,7};

        quickSort(array,0 , 7);
        System.out.println(array);
    }
}
