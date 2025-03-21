package LinkedList;

public class linkedList<type> {
    node<type> head;
    node<type> tail;

    public linkedList(){
        this.head = this.tail = null;
    }
    
    public node<type> getHead() {
        return head;
    }

    public void print(){
        node<type> temp = head;
        while (temp != null) {
            System.out.print(temp.value);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp=temp.next;
        }
        System.out.println();
    }
    
    //adding
    public void addFirst(type value)
    {
        node<type> newNode = new node<>(value);
        if (head == null) {
            this.head = newNode;
            this.tail= newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }
    public void addLast(type value)
    {
        node<type> newNode = new node<>(value);
        if (head == null) {
            this.head = newNode;
            this.tail= newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    //deleting
    public node<type> removeFirst()
    {
        if (this.head == null) {
            return null;
        }

        node<type> temp = head;
        
        if (head == tail) {
            this.head = null;
            this.tail = null;
        }else{
            this.head = head.next;
        }
        temp.next = null;
        return temp;
    }

    public node<type> removeLast()
    {
        if (this.head == null) {
            return null;
        }

        node<type> temp = head;
        
        if (head == tail) {
            this.head = null;
            this.tail = null;
        }else{
            while (temp.next != tail) {
                temp = temp.next;
            }
            tail = temp;
            temp = temp.next;
            tail.next = null;
        }
        temp.next = null;
        return temp;
    }
    

}
