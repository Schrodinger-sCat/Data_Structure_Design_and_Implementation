public class singly_bubble{
    public static void main(String[]shanto){
        int[] array={5, 7, 3, 10, 2, 1, 11};
        Node head=new Node(array[0],null);
        Node n=head;
        for(int i=1;i<array.length;i++){
            Node m=new Node(array[i],null);
            n.next=m;
            n=n.next;
        }
        for(Node m=head;m.next!=null;m=m.next){
            for(Node l=head;l.next!=null;l=l.next){
                if(l.elem>l.next.elem){
                    int temp=l.elem;
                    l.elem=l.next.elem;
                    l.next.elem=temp;
                }
            }
        }
        for(Node m=head;m!=null;m=m.next){
            System.out.print(m.elem+" ");
        }
    }
}