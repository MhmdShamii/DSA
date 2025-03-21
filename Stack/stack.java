package Stack;

import LinkedList.linkedList;
import LinkedList.node;

public class stack<type> {
    
    linkedList<type> list;

    public stack(){
        list = new linkedList<>();
    }

    //adding
    public void push(type value)
    {
        list.addFirst(value);
    }

    //removing
    public node<type> pop()
    {

        if (!this.isEmpty()) {
            return list.removeFirst();
        }
        return null;
    }

    //view
    public type top()
    {
        if (!this.isEmpty()) {
            return list.getHead().value;
        }
        return null;
    }

    public boolean isEmpty()
    {
        return list.getHead() == null;
    }
    
}