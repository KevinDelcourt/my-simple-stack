package deqo.kdel.mysimplestack;

import java.util.Stack;

public class MySimpleStack implements SimpleStack {

    private Stack<Item> stack = new Stack<Item>();

    @Override
    public boolean isEmpty() {
        return this.stack.empty();
    }

    @Override
    public int getSize() {
        return this.stack.size();
    }

    @Override
    public void push(Item item) {
        this.stack.push(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        try{
            return this.stack.peek();
        }catch(java.util.EmptyStackException e){
            throw new EmptyStackException();
        }
    }

    @Override
    public Item pop() throws EmptyStackException {
        try{
            return this.stack.pop();
        }catch(java.util.EmptyStackException e){
            throw new EmptyStackException();
        }
    }
}
