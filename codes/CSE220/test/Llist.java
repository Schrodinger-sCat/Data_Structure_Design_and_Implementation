import java.util.Scanner;
public class Llist{
    public static void main(String[]args){
        System.out.println("Caution! Do not use zero as an input in this program...");
        Scanner sc=new Scanner(System.in);
        System.out.println("length of your linked list?");
        int n=sc.nextInt();
        Node head=new Node(0, null, null);
        Node h=head;
        System.out.println("elements, please?");
        for(int i=0; i<n; i++){
            int m=sc.nextInt();
            Node tail=new Node(m, head, h);
            h.next=tail;
            h=tail;
        }
        head.previous=h;
        System.out.println("print forward");
        for(Node i=head.next; i.element!=0; i=i.next){
            System.out.print(i.element+" ");
        }
        System.out.println();
        System.out.println("Print Backward");
        for(Node i=head.previous; i.element!=0; i=i.previous){
            System.out.print(i.element+" ");
        }
        sc.close();
    }
}