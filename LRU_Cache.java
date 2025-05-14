class LRUCache {
    class Pair {
        int key, val;
        Pair(int k, int v) {
            this.key = k;
            this.val = v;
        }
    }
    class Node {
        Pair pair;
        Node prev, next;
        Node(Pair p, Node prev, Node next) {
            this.pair = p;
            this.prev = prev;
            this.next = next;
        }
    }
    int capacity;
    Map<Integer, Node> map;
    Node head, tail;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<Integer, Node>();
        head = new Node(new Pair(-1, -1), null, null);
        tail = new Node(new Pair(-1, -1), null, null);
        head.next = tail;
        tail.prev = head;
    }
    public void deleteNode(Node n) {
        Node prevNode = n.prev;
        Node nextNode = n.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }
    public void insertAfterHead(Node n) {
        Node nextNode = head.next;
        n.prev = head;
        head.next = n;
        n.next = nextNode;
        nextNode.prev = n;
    }
    public int get(int key) {
        if(!map.containsKey(key)) return -1;
        Node tmp = map.get(key);
        deleteNode(tmp);
        insertAfterHead(tmp);
        return tmp.pair.val;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)) {
            Node existing = map.get(key);
            existing.pair.val = value;
            deleteNode(existing);
            insertAfterHead(existing);
        }
        else {
            if(map.size() == capacity) {
                Node lastNode = tail.prev;
                deleteNode(lastNode);
                map.remove(lastNode.pair.key);
            }
            Node n = new Node(new Pair(key, value), null, null);
            insertAfterHead(n);
            map.put(key, n);
        }
    }
}
