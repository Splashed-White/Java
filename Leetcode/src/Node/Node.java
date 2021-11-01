package Node;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:N叉树
 * User: TL
 * Date: 2021-09-08
 * Time: 8:31
 */

public class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};