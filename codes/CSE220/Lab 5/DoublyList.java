public class DoublyList{
  public Node head;
  
  
  /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
   */ 
  public DoublyList(Object [] a){
    head = new Node(null, null, null);
    Node tail = head;
    
    for(int i = 0; i<a.length; i++){
      Node mn = new Node(a[i], null, null);
      tail.next = mn;
      mn.prev=tail;
      tail=tail.next;
    }
    tail.next=head; // Making it circular
    head.prev=tail;
  }
  
  /* Second Constructor:
   * Sets the value of head. head will refer
   * to the given LinkedList
   */
  public DoublyList(Node h){
    head = h;
  }
  
  /* Counts the number of Nodes in the list */
  public int countNode(){
    // TO DO
    int count=0;
    for(Node n=head.next; n!=head; n=n.next){
      count++;
    }
    return count;
  }
  
  /* prints the elements in the list */
  public void forwardprint(){
    // TO DO  
    int i=1;
    for(Node n=head.next; n!=head; n=n.next){
      if(i==countNode()){
        System.out.print(n.element+".");
        break;
      }
      System.out.print(n.element+",");
      i++;
    }
    System.out.println();
  }
  
  public void backwardprint(){
    // TO DO  
    int i=1;
    for(Node n=head.prev; n!=head; n=n.prev){
      if(i==countNode()){
        System.out.print(n.element+".");
        break;
      }
      System.out.print(n.element+",");
      i++;
    }
    System.out.println();
  }
  
  
  // returns the reference of the Node at the given index. For invalid index return null.
  public Node nodeAt(int idx){
    // TO DO
    if(idx<-1 || idx>=countNode()){
      throw new NullPointerException ("wrong index!!");
      //return null;
    }
    else{
      Node n=head;
      for(int i=0; i<=idx; i++){
        n=n.next;
      }
      return n;
    }
    // return null; // please remove this line!
  }
  
  
  
  /* returns the index of the Node containing the given element.
   if the element does not exist in the List, return -1.
   */
  public int indexOf(Object elem){
    // TO DO
    int i=0;
    for(Node n=head.next; n!=head; n=n.next){
      if(n.element==elem){
        return i;
      }
      i++;
    }
    return -1;
  }
  
  
  
  /* inserts Node containing the given element at the given index
   * Check validity of index.
   */
  public void insert(Object elem, int idx){
    // TO DO
    if(idx<0 || idx>countNode()){
      
    }
    else{
      Node p= new Node(elem,null,null);
      Node x=nodeAt(idx-1);
      Node y=x.next;
      x.next=p;
      p.next=y;
      y.prev=p;
      p.prev=x;
    }
  }
  
  
  
  
  /* removes Node at the given index. returns element of the removed node.
   * Check validity of index. return null if index is invalid.
   */
  public Object remove(int index){
    // TO DO
    if(index<0 || index>countNode()){
      return null;
    }
    else{
      Node n=nodeAt(index);
      Object temp=n.element;
      Node porerTa=n.next;
      Node agerTa=n.prev;
      agerTa.next=porerTa;
      porerTa.prev=agerTa;
      n.prev=null;
      n.next=null;
      return temp;
    }
    //return null; // please remove this line!
  }
  
  
  
}