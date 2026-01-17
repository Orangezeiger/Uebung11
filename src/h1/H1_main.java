package h1;

public class H1_main {
    public static void main(String[] args) {
        Node e = new Node(null);
        Node d = new Node(e);
        Node c = new Node(d);
        Node b = new Node(c);
        Node a = new Node(b);

        System.out.println(distance(a,e));
    }

    public static int distance(Node x, Node y) {
        int currDistance = 0;
        if(x != y) {
            currDistance = distance(x.next,y) + 1;
        }
        return currDistance;
    }
}
