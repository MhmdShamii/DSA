package Queue;

import LinkedList.linkedList;
import LinkedList.node;

public class queue<type> {
    linkedList<type> list;

    public queue(){
        list = new linkedList<>();
    }

    public boolean isEmpty()
    {
        return list.getHead() == null;
    }
    
    //adding
    public void inQueue(type value)
    {
        list.addLast(value);
    }

    //removing
    public node<type> deQueue()
    {
        if (!isEmpty()) {
            return list.removeFirst();
        }
        return null;
    }

    //view
    public type peek()
    {
        if (!isEmpty()) {
            return list.getHead().value;
        }
        return null;
    }
}