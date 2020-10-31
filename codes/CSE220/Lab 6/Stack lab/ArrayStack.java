public class ArrayStack implements Stack{
    int size;
    Object [] data;
    
    public ArrayStack(){
        size=0;
        data = new Object[5];
    }
    
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        if(size!=0) return false;
        return true;
    }
// Pushes the new item on the stack, throwing the
// StackOverflowException if the stack is at maximum capacity. It
// does not throw an exception for an "unbounded" stack, which
// dynamically adjusts capacity as needed.
    public void push(Object e) throws StackOverflowException{
        if(size==data.length) throw new StackOverflowException();
        if(size==0){
            data[0]=e;
        }
        else{
            data[size]=e;
        }
        size++;
    }
// Pops the item on the top of the stack, throwing the
// StackUnderflowException if the stack is empty.
    public Object pop() throws StackUnderflowException{
        if(size==0) throw new StackUnderflowException();
        Object o=data[size-1];
        data[size-1]=null;
        size--;
        return o;
    }
// Peeks at the item on the top of the stack, throwing
// StackUnderflowException if the stack is empty.
    public Object peek() throws StackUnderflowException{
        if(size==0) throw new StackUnderflowException();
        return data[size-1];
    }
// Returns a textual representation of items on the stack, in the
// format "[ x y z ]", where x and z are items on top and bottom
// of the stack respectively.
    public String toString(){
        if(size==0) return "Empty List";
        String s=""+data[size-1];
        for(int i=size-2; i>=0; i--){
            s=s+" "+data[i];
        }
        return s;
    }
// Returns an array with items on the stack, with the item on top
// of the stack in the first slot, and bottom in the last slot.
    public Object[] toArray(){
        Object[] array=new Object[size];
        int j=0;
        for(int i=size-1; i>=0; i--){
            array[j]=data[i];
            j++;
        }
        return array;
    }
// Searches for the given item on the stack, returning the
// offset from top of the stack if item is found, or -1 otherwise.
    public int search(Object e){
        for(int i=0; i<size; i++){
            if((data[i]).equals(e)==true) return size-1-i;
        }
        return -1;
    }
    
}