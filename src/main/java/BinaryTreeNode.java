import lombok.Getter;
import lombok.Setter;
import org.graalvm.compiler.graph.spi.Canonicalizable;
import org.jetbrains.annotations.NotNull;

@Getter
@Setter
public class BinaryTreeNode<T extends Comparable<T>> implements Comparable<T> {

    private T payload;

    private BinaryTreeNode leftChild;
    private BinaryTreeNode rightChild;


    public BinaryTreeNode() {

    }

    public int compareTo(@NotNull T t) {
        return 0;
    }

    public BinaryTreeNode(T payload, BinaryTreeNode leftChild, BinaryTreeNode rigthChild) {
        this.payload = new payload;
        leftChild = new leftChild;
        rightChild = new rightChild;
    }

}
