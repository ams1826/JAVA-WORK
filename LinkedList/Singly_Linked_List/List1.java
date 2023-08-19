// Creating a Linked List and inserting elements in List

package LinkedList;
public class List1 {

    public static class Node{
        public int data;
        public Node next;
        public Node (int data){
            this.data = data;
            this.next = null;
        }
    }


    public static class LinkedList{
        private Node first;
        public LinkedList(){
            first = null;
        }

        public void InsertLast(int data){
            Node newNode = new Node(data);

            if(first == null){
                first = newNode;
                return;
            }

            Node tempNode = first;
            while(tempNode.next != null){
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;

        }
    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.InsertLast(9);
        list.InsertLast(10);
        list.InsertLast(11);
        list.InsertLast(12);
        list.InsertLast(13);
    }
}
