public class Delete {
    Node del(Node start, int x) {
        if (start == null || start.data > x) {
            return start;
        }
        else if (start.data == x) {
            return start.next;
        }
        for (Node p = start; p.next != null; p = p.next) {
            if (p.next.data > x) {
                break;
            }
            else if (p.next.data == x) {
                p.next = p.next.next;
                break;
            }
        }
        return start;
    }
}