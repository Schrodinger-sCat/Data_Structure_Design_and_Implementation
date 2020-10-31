public class CircularArray{
    
    private int start;
    private int size;
    private Object [] cir;
    
    /*
     * if Object [] lin = {10, 20, 30, 40, null}
     * then, CircularArray(lin, 2, 4) will generate
     * Object [] cir = {40, null, 10, 20, 30}
     */
    public CircularArray(Object [] lin, int st, int sz){
        start=st;
        size=sz;
        cir=new Object[lin.length];
        int s=start;
        for(int i=0; i<lin.length; i++){
            cir[s]=lin[i];
            s=(s+1)%lin.length;
        }
    }
    
    //Prints from index --> 0 to cir.length-1
    public void printFullLinear(){
        for(int i=0; i<cir.length; i++){
            System.out.print(cir[i]+" ");
        }
        System.out.println();
    }
    
    // Starts Printing from index start. Prints a total of size elements
    public void printForward(){
        int s=start;
        for(int i=0; i<cir.length; i++){
            if(cir[s]!=null){
                System.out.print(cir[s]+" ");
            }
            s=(s+1)%cir.length;
        }
        System.out.println();
    }
    
    
    public void printBackward(){
        int s=start-1;
        if(s<0){
            s=s+cir.length;
        }
        for(int i=0; i<cir.length; i++){
            if(cir[s]!=null){
                System.out.print(cir[s]+" ");
            }
            s=s-1;
            if(s<0){
                s=s+cir.length;
            }
        }
        System.out.println();
    }
    
    // With no null cells
    public void linearize(){
        Object[] a=new Object[size];
        int j=start;
        for(int i=0; i<a.length; i++){
            a[i]=cir[j];
            j=(j+1)%cir.length;
        }
        cir=a;
    }
    
    // Do not change the Start index
    public void resizeStartUnchanged(int newcapacity){
        Object[] array=new Object[newcapacity];
        int j=start;
        int k=start;
        int l=0;
        while(l<size){
            array[j]=cir[k];
            k=(k+1)%cir.length;
            j++;
            l++;
        }
        cir=array;
    }
    
    // Start index becomes zero
    public void resizeByLinearize(int newcapacity){
        Object[] array=new Object[newcapacity];
        int j=start;
        for(int i=0; i<size; i++){
            array[i]=cir[j];
            j=(j+1)%cir.length;
        }
        cir=array;
    }
    
    /* pos --> position relative to start. Valid range of pos--> 0 to size.
     * Increase array length by 3 if size==cir.length
     * use resizeStartUnchanged() for resizing.
     */
    public void insertByRightShift(Object elem, int pos){
        Object[] ar;
        if(size==cir.length){
            resizeStartUnchanged(size+3);
        }
        ar=cir;
        int k=(start+size)%ar.length;
        for(int i=pos; i<size; i++){
            ar[k]=ar[k-1];
            k--;
            if(k<0){
                k=ar.length-1;
            }
        }
        ar[start+pos]=elem;
        size=size+1;
        cir=ar;
    }
    
    public void insertByLeftShift(Object elem, int pos){
        Object[] array;
        if(size==cir.length){
            resizeStartUnchanged(size+3);
        }
        array=cir;
        int k=start;
        for(int i=0; i<=pos; i++){
            array[(k-1)%array.length]=array[k];
            k=(k+1)%array.length;
        }
        array[pos+start]=elem;
        start=(start-1)%array.length;
        size=size+1;
        cir =array;
    }
    
    /* parameter--> pos. pos --> position relative to start.
     * Valid range of pos--> 0 to size-1
     */
    public void removeByLeftShift(int pos){
        int k=(start+pos)%cir.length;
        for(int i=pos+1;i<size;i++){
            cir[k]=cir[(k+1)%cir.length];
            k=(k+1)%cir.length;
        }
        cir[(start+size-1)%cir.length]=null;
        size=size-1;
    }
    
    /* parameter--> pos. pos --> position relative to start.
     * Valid range of pos--> 0 to size-1
     */
    public void removeByRightShift(int pos){
        int j=(start+pos)%cir.length;
        cir[j]=null;
        for(int i=pos;i>-1;i--){
            cir[j]=cir[(j-1)%cir.length];
            j--;
            if(j<0){
                j=cir.length-1;
            }
        }
        cir[start]=null;
        start=start+1;
        size=size-1;
    }
    
    
    //This method will check whether the array is palindrome or not
    public void palindromeCheck(){
        boolean b=true;
        int j=cir.length/2;
        int k=0;
        int m=start;
        int n=0;
        while(k<j){
            //System.out.println(cir[m]+" "+cir[n]);  
            if(cir[m]==cir[n]){
                m++;
                n--;
                if(n<0){
                    n=n+cir.length;
                }
            }
            else{
                b=false;
                System.out.println("not plaindrome");
                break;
            }
            k++;
        }
        if(b==true){
            System.out.println("plaindrome");
        }
    }
    
    
    //This method will sort the values by keeping the start unchanged
    public void sort(){
        for(int i=0; i<size-1; i++){
            for(int j=i+1; j<size; j++){
                if((Integer)cir[(i+start)%cir.length]>(Integer)cir[(j+start)%cir.length]){
                    Object temp=cir[(i+start)%cir.length];
                    cir[(i+start)%cir.length]=cir[(j+start)%cir.length];
                    cir[(j+start)%cir.length]=temp;
                }
            }
        }
    }
    
    //This method will check the given array across the base array and if they are equivalent interms of values return true, or else return false
    public boolean equivalent(CircularArray k){
        boolean b=false;
        if(size==k.size){
            int start1=start;
            int start2=k.start;
            for(int i=0;i<size;i++){
                if(cir[start1].equals(k.cir[start2])){
                    b=true;
                }
                else{
                    b=false;
                    break;
                }
                start1=(start1+1)%cir.length;
                start2=(start2+1)%k.cir.length;
            }
        }
        else{
            b=false;
        }
        return b; // Remove this line
    }   
}