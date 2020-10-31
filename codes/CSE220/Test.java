public class Test{
    public static int[] multipleOfTen(int[] num){
        int b=0;
        int c=0;
        int d=0;
        while(d==0){
            for(int i=0; i<num.length; i++){
                if(num[i]%10==0){
                    b=num[i];
                    c=i;
                    break;
                }
            }
            for(int j=c; j<num.length; j++){
                if(num[j]%10!=0){
                    num[j]=b;
                }
                else{
                    b=num[j];
                }
                if(j==num.length-1){
                    d++;
                }
            }
        }
        return num;
    }
    public static void main(String[]args){
        int[] a={2,10,3,4,20,5,7};
        multipleOfTen(a);
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}