package section6;

public class Ex6 {

    public static int[] swap(int[] array, int pivot, int selectedNum){
        int tempNum;
        tempNum = array[pivot];
        array[pivot] = array[selectedNum];
        array[selectedNum] = tempNum;
        return array;
    }

    public static int[] selectedSort(int[] array){
        int pivot;
        int selectedNum;
        for(pivot=0;pivot< array.length-1; pivot++){
            System.out.println("pivot: " + pivot);
            for(selectedNum=pivot+1; selectedNum < array.length; selectedNum++){
                if(array[pivot]>array[selectedNum]){
                    String indexString = "";
                    for(int i = 0; i<pivot; i++){
                        indexString += "\t";
                    }
                    indexString += "*";
                    for(int i = pivot; i<selectedNum; i++){
                        indexString += "\t";
                    }
                    indexString += "+";
                    System.out.println(indexString);
                    for(int item: array){
                        System.out.print(item + "\t");
                    }
                    System.out.println();
                    array = swap(array, pivot, selectedNum);
                }

            }
        }
        return array;
    }

    public static void main (String[] args){
        int[] array = {7,4,6,3,1,2,5};
        array = selectedSort(array);
        System.out.println("결과");
        for(int item : array){
            System.out.print(item + "\t");
        }
    }
}
