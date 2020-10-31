public class LinearArray{
    public static int[] copyArray(int[] ar, int n){
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=ar[i];
        }
        return a;
    }
    public static void printReverse(int[] b){
        for(int i=b.length-1; i>=0; i--){
            if(i==b.length-1){
                System.out.print("{ "+b[i]+", ");
            }
            else if(i==0){
                System.out.print(b[i]+" }");
            }
            else{
                System.out.print(b[i]+", ");
            }
        }
    }
    public static void printArray(int[] b){
        for(int i=0; i<b.length; i++){
            if(i==0){
                System.out.print("{ "+b[i]+", ");
            }
            else if(i==b.length-1){
                System.out.print(b[i]+" }");
            }
            else{
                System.out.print(b[i]+", ");
            }
        }
    }
    //public static void reverseArray(int[] ar){
    //int[] arr=new int[ar.length];
    //for(int i=0; i<ar.length; i++){
    //arr[i]=ar[i];
    //}
    //for(int i=0; i<ar.length; i++){
    //ar[i]=arr[arr.length-1-i];
    //}
    //}
    public static void reverseArray(int[] arr){
        for(int i=0; i<arr.length/2; i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
    }
    public static void main(String [] args){
        int [] a = {10, 20, 30, 40, 50, 60};
        
        System.out.println("\n///// TEST 01: Copy Array example /////");
        int [] b = copyArray(a, a.length);
        printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
        
        System.out.println("\n///// TEST 02: Print Reverse example /////");
        printArray(a); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
        printReverse(a); // This Should Print: { 60, 50, 40, 30, 20, 10 } 
        
        
        System.out.println("\n///// TEST 03: Reverse Array example /////");
        reverseArray(b);
        printArray(b); // This Should Print: { 60, 50, 40, 30, 20, 10 } 
        
        
        System.out.println("\n///// TEST 04: Shift Left k cell example /////");
        b = copyArray(a, a.length);
        b=shiftLeft(b,3);
        printArray(b); // This Should Print: { 40, 50, 60, 0, 0, 0 } 
        
        System.out.println("\n///// TEST 05: Rotate Left k cell example /////");
        b = copyArray(a, a.length); 
        printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
        b=rotateLeft(b,3);
        printArray(b); // This Should Print: { 40, 50, 60, 10, 20, 30 } 
        
        System.out.println("\n///// TEST 06: Shift Right k cell example /////");
        b = copyArray(a, a.length);
        printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
        b=shiftRight(b,3);
        printArray(b);  // This Should Print: { 0, 0, 0, 10, 20, 30 } 
        
        System.out.println("\n///// TEST 07: Rotate Right k cell example /////");
        b = copyArray(a, a.length);
        printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
        b=rotateRight(b,3);
        printArray(b); // This Should Print: { 40, 50, 60, 10, 20, 30 } 
        
        
        System.out.println("\n///// TEST 08: Insert example 1 /////");
        
        b = copyArray(a, a.length);
        printArray(b);  // This Should Print: { 10, 20, 30, 40, 50, 60 } 
        boolean bol=insert(b,6, 70, 2); // This Should Print: No space Left 
        System.out.println(bol); // This Should Print: false
        printArray(b);  // This Should Print: { 10, 20, 30, 40, 50, 60 } 
        
        System.out.println("\n///// TEST 09: Insert example 2 /////");
        int [] c = {10, 20, 30, 40, 50, 0, 0}; 
        printArray(c);  // This Should Print: { 10, 20, 30, 40, 50, 0, 0 }
        bol=insert(c,5, 70, 2);  // This Should Print: Number of elements after insertion: 6
        System.out.println(bol); // This Should Print: true
        printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 0 } 
        
        System.out.println("\n///// TEST 10: Insert example 3 /////");
        printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 0 } 
        bol=insert(c,6, 70, 6); // This Should Print: Number of elements after insertion: 7 
        System.out.println(bol); // This Should Print: true
        printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
        
        System.out.println("\n///// TEST 11: Remove example 1 /////");
        
        printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
        bol=removeAll(c,7,90);
        System.out.println(bol); // This Should Print: false
        printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
        
        System.out.println("\n///// TEST 12: Remove example 2 /////");
        printArray(c);  // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
        bol=removeAll(c,7,70);
        System.out.println(bol); // This Should Print: true
        printArray(c);  // This Should Print: { 10, 20, 30, 40, 50, 0, 0 } 
        
        
        
    }
    // Shifts all the elements of the source array to the left by 'k' positions
    // Returns the updated array
    public static int [] shiftLeft(int [] source, int k){
        for(int i=k; i<source.length; i++){
            source[i-k]=source[i];
            source[i]=0;
        }
        return source;
    }
    
    // Rotates all the elements of the source array to the left by 'k' positions
    // Returns the updated array
    public static int [] rotateLeft(int [] source, int k){
        int j=source.length-1;
        while(k>0){
            for(int i=k-1; i<j; i++){
                int temp=source[i];
                source[i]=source[i+1];
                source[i+1]=temp;
            }
            j--;
            k--;
        }
        return source; // remove this line    
    }
    
    // Shifts all the elements of the source array to the right by 'k' positions
    // Returns the updated array
    public static int [] shiftRight(int [] source, int k){
        for(int i=k-1; i>=0; i--){
            source[i+k]=source[i];
            source[i]=0;
        }
        return source; // remove this line    
    }
    
    // Rotates all the elements of the source array to the right by 'k' positions
    // Returns the updated array
    public static int [] rotateRight(int [] source, int k){
        int j=source.length-k-1;
        int l=source.length;
        while(j>=0){
            for(int i=j; i<l-1; i++){
                int temp=source[i+1];
                source[i+1]=source[i];
                source[i]=temp;
            }
            j--;
            l--;
        }
        return source; // remove this line    
    }
    
    /** @return true if insertion is successful; @return false otherwise
      * @param arr the reference to the linear array
      * @param size the number of elements that exists in the array. size<=arr.length
      * @param elem the element that is to be inserted
      * @param index the index in which the element is required to be inserted
      * if insertion is not successful due to lack space, print "No space Left"
      * if given index is invalid, print "Invalid Index"
      * if insertion is successful, print the 'Number of elements after insertion' is completed
      */
    public static boolean insert(int [] arr, int size, int elem, int index){
        
        if(size==arr.length){
            System.out.println("No Space left");
            return false; // remove this line
        }
        else{
            for(int i=arr.length-1; i>index; i--){
                arr[i]=arr[i-1];
            }
            arr[index]=elem;
            int j=size+1;
            System.out.println("Number of elements after insertion:"+j);
            return true;
        }
    }
    
    /** 
     * removes all the occurences of the given element
     * @param arr the reference to the linear array
     * @param size the number of elements that exists in the array. size<=arr.length
     * @param elem the element to be removed
     * @return true if removal is successful; return false otherwise
     * if removal is successful, print the 'Number of elements after removal' is completed
     */  
    public static boolean removeAll(int [] arr, int size, int elem){
        boolean b= false;
        int count=0;
        for(int i=0; i<arr.length; i++){
            arr[i-count]=arr[i];
            if(arr[i]==elem){
                b=true;
                count++;
            }
        }
        for(int i=arr.length-count-1; i<arr.length; i++){
            arr[i]=0;
        }
        return b;
    }
}