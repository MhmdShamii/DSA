package Stack;

public class stack<type> {
    
    private node<type> top;
    private int height;
    
    public stack(type value){
        node<type> newNode = new node<>(value);
        top = newNode;
        height = 1;
    }
    
    public node<type> getTop() {
        return top;
    }
    public int getHeight() {
        return height;
    }
}