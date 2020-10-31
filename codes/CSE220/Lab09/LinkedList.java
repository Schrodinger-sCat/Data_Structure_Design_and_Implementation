public class LinkedList{
    public Node head;
    
    
    /* First Constructor:
     * Creates a linked list using the values from the given array. head will refer
     * to the Node that contains the element from a[0]
     */ 
    public LinkedList( int[] a){
        head=new Node(a[0], null);
        Node h=head;
        for(int i=1; i<a.length; i++){
            Node tail=new Node(a[i], null);
            h.next=tail;
            h=tail;
        }
    }
    
    /* Second Constructor:
     * Sets the value of head. head will refer
     * to the given LinkedList
     */
    public LinkedList(Node h){
        head=h;
    }
    
    /* Counts the number of Nodes in the list */
    public int countNode(){
        int count=0;
        for(Node i=head; i!=null; i=i.next){
            count++;
        }
        return count; // please remove this line!
    }
    
    /* prints the elements in the list */
    public void printList(){
        for(Node i=head; i!=null; i=i.next){
            System.out.print(i.element+" ");
        }
        System.out.println();
    }
    
    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx){
        int count=0;
        for(Node i=head; i!=null; i=i.next){
            if(count==idx){
                return i;
            }
            count++;
        }
        return null; // please remove this line!
    }
    
    
// returns the element of the Node at the given index. For invalid idx return null.
    public int get(int idx){
        int count=0;
        for(Node i=head; i!=null; i=i.next){
            if(count==idx){
                return i.element;
            }
            count++;
        }
        return 0; // please remove this line!
    }
    
    
    
    /* updates the element of the Node at the given index. 
     * Returns the old element that was replaced. For invalid index return null.
     * parameter: index, new element
     */
    public int set(int idx, int elem){
        int count=0;
        for(Node i=head; i!=null; i=i.next){
            if(count==idx){
                int r=i.element;
                i.element=elem;
                return r;
            }
            count++;
        }
        return 0; // please remove this line!
    }
    
    
    /* returns the index of the Node containing the given element.
     if the element does not exist in the List, return -1.
     */
    public int indexOf(int elem){
        int count=0;
        for(Node i=head; i!=null; i=i.next){
            if(i.element==elem){
                return count;
            }
            count++;
        }
        return -1; // please remove this line!
    }
    
    // returns true if the element exists in the List, return false otherwise.
    public boolean contains(int elem){
        for(Node i=head; i!=null; i=i.next){
            if(i.element==elem){
                return true;
            }
        }
        return false; // please remove this line!
    }
    
    // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
    public Node copyList(){
        Node dHead=new Node(head.element, null);
        Node h=dHead;
        for(Node i=head.next; i!=null; i=i.next){
            Node tail= new Node(i.element, null);
            h.next=tail;
            h=tail;
        }
        return dHead;
    }
    
    // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
    public Node reverseList(){
        Node dHead=new Node(head.element, null);
        for(Node i=head.next; i!=null; i=i.next){
            Node h=new Node(i.element, dHead);
            dHead=h;
        }
        return dHead;
    }
    /* inserts Node containing the given element at the given index
     * Check validity of index.
     */
    public void insert(int elem, int idx){
        int count=0;
        Node h=new Node(0, null);
        if(idx>0){
            for(Node i=head; i!=null; i=i.next){
                if(count==idx-1){
                    h.element=elem;
                    h.next=i.next;
                    i.next=h;
                }
                count++;
            }
            if(count+2<=idx){
                System.out.println("Invalid");
            }
        }
        else if(idx==0){
            h.element=elem;
            h.next=head;
            head=h;
        }
    }
    
    
    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    public int remove(int index){
        int count=0;
        int r=0;
        Node t=new Node(0, null);
        for(Node i=head; i!=null; i=i.next){
            if(index==0){
                r=i.element;
                head=i.next;
                break;
            }
            if(count==index){
                r=i.element;
                t.next=i.next;
                break;
            }
            t=i;
            count++;
        }
        return r; // please remove this line!
    }
    
    // Rotates the list to the left by 1 position.
    public void rotateLeft(){
        Node t=head;
        head=head.next;
        for(Node i=head; i!=null; i=i.next){
            if(i.next==null){
                i.next=t;
                t.next=null;
            }
        }
    }
    
    // Rotates the list to the right by 1 position.
    public void rotateRight(){
        Node h;
        Node t=new Node(0, null);
        for(Node i=head; i!=null; i=i.next){
            if(i.next==null){
                i.next=head;
                head=i;
                t.next=null;
                break;
            }
            t=i;
        }
    }
    
}