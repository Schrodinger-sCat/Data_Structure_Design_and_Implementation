public class CircularArray{
    Object[]cir;
    int start;
    int size;
    public CircularArray(Object[]lin, int st, int sz){
        start=st;
        size=sz;
        cir=new Object[lin.length];
        for(int i=0;i<size;i++,st=(st+1)%cir.length){
            cir[st]=lin[i];
        }
    }
    public void print(){
        for(int st=start,i=0;i<size;st=(st+1)%cir.length,i++){
            if(i==0) System.out.print("{"+cir[st]+", ");
            else if(i==size-1){
                System.out.println(cir[st]+"}");
                return;
            }
            else System.out.print(cir[st]+", ");
        }
        System.out.println("EMPTY LIST");
    }
    
    //This method will check whether the values of the circular array is following a palindromic sequence or not
    //Return true if yes; otherwise return false
    public boolean palindrome(){
        int f=(start+size-1)%cir.length;
        for(int i=0; i<=size/2; i++){
            if(cir[f]!=cir[(i+start)%cir.length]){
                return false;
            }
            f--;
        }
        return true; //remove this line
    }
    
    //This method will check whether the values in the SPECIFIED RANGE of the circular array is following a palindromic sequence or not
    //Return true if yes; otherwise return false
    //Here, rangeStart and rangeEnd are the positions on the circular array starting from the index start. Position of start is 0 (zero)
    public boolean palindrome(int rangeStart, int rangeEnd){
        int s=rangeStart, f=rangeEnd, n=0;
        if(rangeStart>rangeEnd){
            n=rangeStart-rangeEnd;
        }
        else{
            n=rangeEnd-rangeStart;
        }
        for(int i=0; i<=n/2; i++){
            if(cir[(s+start)%cir.length]!=cir[(f+start)%cir.length]){
                return false;
            }
            f--;
            s++;
        }
        return true; //remove this line
    }
    
    //This method will check whether the first half of the values of the circular array is exact repetition of the second half or not
    //For this method, you can assume that, number of values will always be even.
    //Return true if yes; otherwise return false
    public boolean exactRepetition(){
        int f=size/2;
        for(int i=0; i<size/2; i++){
            if(cir[(i+start)%cir.length]!=cir[(f+start)%cir.length]){
                return false;
            }
            f++;
        }
        return true; //remove this line
    }
    
    //This method will check whether the first half of the values in the SPECIFIED RANGE of the circular array is exact repetition of the second half or not
    //For this method, you can assume that, number of values in the SPECIFIED RANGE will always be even.
    //Return true if yes; otherwise return false
    //Here, rangeStart and rangeEnd are the positions on the circular array starting from the index start. Position of start is 0 (zero)
    public boolean exactRepetition(int rangeStart, int rangeEnd){
        int s=rangeStart, n=0;
        if(rangeStart>rangeEnd){
            n=rangeStart-rangeEnd;
        }
        else{
            n=rangeEnd-rangeStart;
        }
        int f=n/2;
        for(int i=0; i<n/2; i++){
            if(cir[(i+start)%cir.length]!=cir[(f+start)%cir.length]){
                return false;
            }
            f++;
        }
        return true; //remove this line
    }
    
    //This method will check whether the values of the circular array is following a sorted sequence (either ascending or descending) or not
    //Return true if yes; otherwise return false
    public boolean sortCheck(){
        if((Integer)cir[(0+start)%cir.length]<(Integer)cir[(1+start)%cir.length]){
            for(int i=1; i<size-1; i++){
                for(int j=i+1; j<size; j++){
                    if((Integer)cir[(i+start)%cir.length]>(Integer)cir[(j+start)%cir.length]){
                        return false;
                    }
                }
            }
        }
        else{
            for(int i=1; i<size-1; i++){
                for(int j=i+1; j<size; j++){
                    if((Integer)cir[(i+start)%cir.length]<(Integer)cir[(j+start)%cir.length]){
                        return false;
                    }
                }
            }
        }
        return true; //remove this line
    }
    
    //This method will check whether the values in the SPECIFIED RANGE of the circular array is following a sorted sequence (either ascending or descending) or not
    //Return true if yes; otherwise return false
    //Here, rangeStart and rangeEnd are the positions on the circular array starting from the index start. Position of start is 0 (zero)
    public boolean sortCheck(int rangeStart, int rangeEnd){
                int s=rangeStart, f=rangeEnd, n=0;
        if(rangeStart>rangeEnd){
            n=rangeStart-rangeEnd+1;
        }
        else{
            n=rangeEnd-rangeStart+1;
        }
                if((Integer)cir[(s+start)%cir.length]<(Integer)cir[(s+1+start)%cir.length]){
            for(int i=s; i<n; i++){
                for(int j=i+1; j<=n; j++){
                    if((Integer)cir[(i+start)%cir.length]>(Integer)cir[(j+start)%cir.length]){
                        return false;
                    }
                }
            }
        }
        else{
            for(int i=s; i<n; i++){
                for(int j=i+1; j<=n; j++){
                    if((Integer)cir[(i+start)%cir.length]<(Integer)cir[(j+start)%cir.length]){
                        return false;
                    }
                }
            }
        }
        return true; //remove this line
    }
}