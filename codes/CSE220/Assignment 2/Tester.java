public class Tester{
    public static void main(String[]args){
        int[] array={10, 1, 4, 7, 3, 2};
        int[] array1={11, 2, 5, 6, 12, 4};
        MyOrderList link1= new MyOrderList(array);
        MyOrderList link2= new MyOrderList(array1);
        link1.printList();
        Node n=new Node(5,null);
        link1.insert(n);
        link1.printList();
        System.out.println(link1.retrieve(6));
        System.out.println(link1.remove());
        link1.printList();
        System.out.println(link1.remove(2));
        link1.printList();
        link1.clear();
        link1.printList();
        System.out.println(link1.isEmpty());
        link2.gotoBegining();
        link2.printList();
        link2.gotoEnd();
        link2.printList();
        link2.gotoNext();
        link2.printList();
        link2.gotoPrior();
        link2.printList();
        System.out.println((link2.getCursor()).element);
        link2.showList();
    }
}