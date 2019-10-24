package deqo.kdel.mysimplestack;

import java.util.Stack;

public class MySimpleStack implements SimpleStack {

    private Stack<Item> stack = new Stack<Item>();

    public int superUsefulFunction() {
        return 2;
    }

    public int anotherSuperUsefulFunction() {
        return 8;
    }

    @Override
    public boolean isEmpty() {
        return this.stack.empty();
    }

    @Override
    public int getSize() {
        return this.stack.size();
    }

    @Override
    public void push(final Item item) {
        this.stack.push(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        try {
            return this.stack.peek();
        } catch (java.util.EmptyStackException e) {
            throw new EmptyStackException();
        }
    }

    @Override
    public Item pop() throws EmptyStackException {
        try {
            return this.stack.pop();
        } catch (java.util.EmptyStackException e) {
            throw new EmptyStackException();
        }
    }
}
