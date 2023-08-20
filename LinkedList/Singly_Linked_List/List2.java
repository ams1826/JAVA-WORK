// Printing Linked List

package LinkedList.Singly_Linked_List;

public class List2 {
    public static class Node{
        public int data;
        public Node next;
        public Node (int data){
            this.data = data;
            this.next = null;
        }
    }


    public static class LinkedList{
        public Node first;
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

        public void show(){
            Display disp = new Display();
            disp.display(first);
        }

        
    }


    public static class Display{
        public void display(Node first){
            Node temp = first;
            while(temp!=null){
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
        }
    }




public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.InsertLast(9);
    list.InsertLast(10);
    list.InsertLast(11);
    list.InsertLast(12);
    list.InsertLast(13);

    list.show();
    // Display disp = new Display();
    // disp.display(first);

    }
}
