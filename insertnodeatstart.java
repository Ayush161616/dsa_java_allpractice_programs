public class insertnodeatstart {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;

        }
        public static class Linkeslist{
            Node head = null;
            Node tail=null;


    void insertatsthead(int val){
        Node temp = new Node(val);
        if(head==null){
            head=tail=temp;


        }
        else {
            temp.next=head;

        }
        head=temp;

        }
        void display(){
        Node temp = head;
            while (temp!=null){
                System.out.print(temp.data+"    ");
                temp = temp.next;
            }


    }
        }

        public static void main(String[] args) {
            Linkeslist ll = new Linkeslist();
            ll.insertatsthead(3);
            ll.display();
            System.out.println();
            ll.insertatsthead(5);
            ll.display();
            System.out.println();

            ll.insertatsthead(11);
            ll.display();
            System.out.println();
            ll.insertatsthead(15);
            ll.display();
        }

    }
}
