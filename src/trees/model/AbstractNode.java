package trees.model;

/**
 * It represents an individual node in a tree.
 * User: rpanjrath
 * Date: 10/3/13
 * Time: 12:07 PM
 */
public abstract class AbstractNode<T> {

    private T leftChild;
    private T rightChild;
    private boolean visited = false;

    public T getRightChild() {
        return rightChild;
    }

    public void setRightChild(T rightChild) {
        this.rightChild = rightChild;
    }

    public T getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(T leftChild) {
        this.leftChild = leftChild;
    }

    public abstract void displayNode();

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
}
