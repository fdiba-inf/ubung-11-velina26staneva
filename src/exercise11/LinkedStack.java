package exercise11;

public class LinkedStack {
    private Node topNode;

    public boolean isEmpty() {
        return topNode == null;
    }

    public void push(String data) {
      Node nextNode = new Node(data);
        if(isEmpty()){
          topNode = nextNode;
        } else {
          nextNode.setNextNode(topNode);
          topNode=nextNode;
        }
    }

    public String pop() {
      if(isEmpty()) {
          return null;
        } else {
          String data = topNode.getData();
          topNode = topNode.getNextNode();
          return data;
        } 
    }
    
    @Override
    public String toString() {
        return NodeUtils.createNodeTraversalString(topNode);
    }
}
