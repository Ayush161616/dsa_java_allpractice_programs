public class insertnodeatend {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;

        }
        public static class Linkeslist{
        Node head = null;
        Node tail=null;
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if (head==null){
                head=temp;
                tail=temp;

            }
            else {
                tail.next=temp;

            }
            tail=temp;

        }
        void dispaly(){
            Node temp = head;
            while (temp!=null){
                System.out.print(temp.data+"    ");
                temp = temp.next;
            }
        }
        int size(){
            Node temp = head;
            int count=0;
            while (temp!=null){
                count++;
                temp=temp.next;
            }
            return count;


        }

        }

        public static void main(String[] args) {
          Linkeslist ll = new Linkeslist();
          ll.insertAtEnd(4);
          ll.insertAtEnd(5);
          ll.dispaly();


            ll.insertAtEnd(12);
            System.out.println();
            System.out.println(ll.size());;
            ll.dispaly();
        }
    }
}
