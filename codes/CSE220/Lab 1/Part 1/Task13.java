public class Task13{
    public static int [] removeOdd (int [] input){
        int flag=0;
        for(int i=0; i<input.length; i++){
            if(input[i]%2!=0){
                flag++;
            }
        }
        flag=input.length-flag;
        int[] a=new int[flag];
        for(int i=input.length-1; i>=0; i--){
            if(input[i]%2==0){
                a[flag-1]=input[i];
                flag--;
            }
        }
        return a;
    }
    public static void main(String [] args){
        int [] mixedArray = {21, 33, 44, 66, 11, 1, 88, 45, 10, 9};
        for (int i = 0; i < mixedArray.length; i++) {
            System.out.print(mixedArray[i] + " ");
        }
        System.out.println();
        int [] noOdd = removeOdd(mixedArray);
        for (int i = 0; i < noOdd.length; i++) {
            System.out.print(noOdd[i] + " ");
        }    
    }
}
