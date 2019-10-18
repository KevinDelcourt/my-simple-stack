package deqo.kdel.mysimplestack;

public interface SimpleStack {

    boolean isEmpty();

    int getSize();

    void push(Item item);

    Item peek() throws EmptyStackException;

    Item pop() throws EmptyStackException;
}
