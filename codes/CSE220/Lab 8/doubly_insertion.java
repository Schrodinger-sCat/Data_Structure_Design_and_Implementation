public class doubly_insertion{
    public static void main(String[]shanto){
        int[] array={5, 7, 3, 10, 2, 1, 11};
        Node head=new Node(array[0],null,null);
        Node n=head;
        for(int i=1;i<array.length;i++){
            Node m=new Node(array[i],null,null);
            n.next=m;
            m.prev=n;
            n=n.next;
        }
        Node tail=head.prev;
        for(Node m=head.next;m!=null;m=m.next){
            Node j=m.prev;
            while(j!=tail && j.elem>m.elem){
                int temp=m.elem;
                m.elem=j.elem;
                j.elem=temp;
                m=j;
                j=j.prev;
            }
        }
        for(Node m=head; m!=null; m=m.next){
            System.out.print(m.elem+" ");
        }
    }
}