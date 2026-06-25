public class NodeBuyer {
    Buyer data;
    NodeBuyer prev, next;

    public NodeBuyer(NodeBuyer prev, Buyer data, NodeBuyer next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
