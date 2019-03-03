public class HeapSortDemo {

    private static void buildMaxHeap(int[] array){
        for (int i = (array.length)/2;i>=0; i--){
            heapAdjust(array, i, array.length);
        }
    }

    private static void heapAdjust(int[] array, int parent, int length){
        int temp = array[parent];
        int child = parent*2+1;
        while(child < length){
            if (child+1 < length && array[child]< array[child+1]){
                child++;
            }
            if(temp >= array[child]){
                break;
            }
            array[parent] = array[child];
            parent = child;
            child = child*2+1;
        }
        array[parent] = temp;
    }

    private static void heapSort(int[] array){
        buildMaxHeap(array);
        for(int i = array.length-1; i>0; i--){
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapAdjust(array, 0 , i);
        }
    }

    public static void main(String[] args){
        int[] array = {5,4,3,2,1,5,3,21};
        int[] array1 = {1,2,3,4,5,6,7};

        heapSort(array);
        System.out.println(array);
    }
}
