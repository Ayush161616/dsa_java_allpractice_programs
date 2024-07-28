public class insertatanyindex {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;

        }

        public static class Linkeslist {
            Node head = null;
            Node tail = null;
            private int size;

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
            int getAt(int idx){
                Node temp = head;
                for(int i =1 ;i<=idx;i++){
                    temp = temp.next;

                }
                return temp.data;
            }

            void insertAt(int idx, int val) {
                Node t = new Node(val);
                Node temp = head;

                for (int i = 0; i <= idx - 1; i++) {
                    temp = temp.next;
                }
                t.next = temp.next;
                temp.next = t;
            }
            void deleteAt(int idx){
                Node temp = head;
                for (int i = 0;i<=idx-1;i++){
                    temp = temp.next;
                }
                temp .next = temp.next.next;
                size--;

            }

            void display() {
                Node temp = head;
                while (temp != null) {
                    System.out.print(temp.data + "    ");
                    temp = temp.next;
                }


            }

            int size() {
                Node temp = head;
                int count = 0;
                while (temp != null) {
                    count++;
                    temp = temp.next;
                }
                return count;
            }

            }


        public static void main(String[] args) {
            Linkeslist ll = new Node.Linkeslist();
            ll.insertatsthead(3);
            //ll.display();
            System.out.println();
            ll.insertatsthead(5);
            //ll.display();
            System.out.println();

            ll.insertatsthead(11);
           // ll.display();
            System.out.println();
            ll.insertatsthead(15);
           // ll.display();
            ll.insertAt(2,55);
            ll.display();
            System.out.println();
            System.out.println(ll.getAt(2));
           ll.deleteAt(1);
            System.out.println();
            ll.display();

        }
    }
}