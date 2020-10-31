public class task1{
    public static boolean firstLast6(int[] arr){
        if((arr[0]==6)||(arr[arr.length-1]==6)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[]args){
        int[] array1={1, 2, 6}, array2={6, 1, 2, 3}, array3={13, 6, 1, 2, 3};
        if(firstLast6(array1)==true){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        if(firstLast6(array2)==true){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        if(firstLast6(array3)==true){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
