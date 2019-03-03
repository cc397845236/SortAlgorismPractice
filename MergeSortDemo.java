public class MergeSortDemo {

    private static void merge(int[] array, int low, int mid, int high){
        int firIndex = low;
        int secIndex = mid +1;
        int tempIndex = 0;
        int[] tempArray = new int[high - low + 1];
        while(firIndex <= mid && secIndex <= high){
            if (array[firIndex] <= array[secIndex]){
                tempArray[tempIndex] = array[firIndex];
                firIndex++;
                tempIndex++;
            }else {
                tempArray[tempIndex] = array[secIndex];
                secIndex++;
                tempIndex++;
            }
        }

        while(firIndex <= mid){
            tempArray[tempIndex] = array[firIndex];
            firIndex++;
            tempIndex++;
        }

        while(secIndex <= high){
            tempArray[tempIndex] = array[secIndex];
            secIndex++;
            tempIndex++;
        }

        for (firIndex=low, tempIndex=0; firIndex< tempArray.length; firIndex++, tempIndex++){
            array[firIndex] = tempArray[tempIndex];
        }

    }

    private static void mergeSort(int[] array, int gap, int length){
        int i = 0;
        for(i =0; i+ 2*gap-1 < length; i = i + 2*gap ){
            merge(array, i, i + gap-1, i + 2 * gap - 1);
        }

        if (i + gap - 1 <length){
            merge(array, i, i + gap -1, length -1);
        }
    }

    public static void main(String[] args){
        int[] array = {5,4,3,2,1,5,3,21};
        int[] array1 = {1,2,3,4,5,6,7};

        for (int gap = 1; gap < array.length; gap = 2 * gap) {
            mergeSort(array, gap, array.length);
        }

        System.out.println(array);
    }
}
