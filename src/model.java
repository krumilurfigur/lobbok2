
public class model {
    public static void main(String[] args) {
        author gabriel = new author("gabriel", "oberg");
        entry entry1 = new entry(gabriel, "jag har gjort en entry");
        System.out.println(entry1.toString());
    }
}
