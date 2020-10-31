public class insertion_array{
    public static void main(String[]shanto){
        int[] array={5, 7, 3, 10, 2, 1, 11};
        int j, temp;
        for (int i = 1; i <array.length; i++)
        {
            j = i - 1;
            while (j >= 0 && array[j] > array[i] )
            {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i=j;
                j--;
                
            }
        }
        for(int x=0; x<array.length;x++){
            System.out.print(array[x]+" ");   
        }
    }
}
