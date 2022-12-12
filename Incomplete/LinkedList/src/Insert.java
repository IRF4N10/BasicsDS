public class Insert {
    Insert(Node start, int x){
        Node p = start;
        while (p.next != null) {
            if (p.next.data > x) break;
            p = p.next;
        }
        p.next = new Node(x,p.next);
    }
}