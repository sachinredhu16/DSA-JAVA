package CollectionExample;

class Node {
    int num;
    int start;
    int end;

    public Node(int num, int start, int end) {
        this.num = num;
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return num + " " + start + " " + end;
    }
}
