package deqo.kdel.mysimplestack;

public class Item {
    private String name;

    public void setName(final String name) {
        this.name = name;
    }

    public String toString() {
        if (this.name == "") {
            return "empty";
        }
        return this.name;
    }

    public void triggerException() throws Exception {
        throw new Exception("Fatal");
    }
}
