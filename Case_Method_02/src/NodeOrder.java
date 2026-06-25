public class NodeOrder {
    Order data;
    NodeOrder prev, next;

    public NodeOrder(NodeOrder prev, Order data, NodeOrder next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
    
}
