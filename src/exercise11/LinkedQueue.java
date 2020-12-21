package exercise11;

public class LinkedQueue {
    private Node frontNode;
    private Node backNode;

    public boolean isEmpty() {
        
        return frontNode == null;
    }

    public void offer(String data) {
         Node newNode = new Node (data);
        if (isEmpty()){
          frontNode = newNode;
          backNode = newNode;
        } else {
          backNode.setNextNode(newNode);
          backNode = newNode;
        }
    }
    

    public String poll() {
       if(isEmpty()){
          return null;
        } else {
          String data = frontNode.getData();
          frontNode = frontNode.getNextNode();
          if(frontNode==null){
            backNode=null;
          }
          return data;
        }
    }

    @Override
    public String toString() {
        return NodeUtils.createNodeTraversalString(frontNode);
    }
}
