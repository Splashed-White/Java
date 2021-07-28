import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description: 二叉搜索树
 * User: TL
 * Date: 2021-07-28
 * Time: 9:07
 */
public class BST {
    public static class Node {
        public int val;
        public Node left;
        public Node right;

        public Node (int val) {
            this.val = val;
        }
    }

    /**
     * 查找
     * @param root
     * @param key
     */
    public Node search(Node root,int key) {
        Node cur = root;
        while (cur != null) {
            if (cur.val == key) {
                return cur;
            } else if (cur.val < key) {
                cur = cur.left;
            } else {
                cur = cur.right;
            }
        }
        return null;
    }

    /**
     * 插入
     * 1. 创建一个新节点
     * 2. 定义两个引用cur和parent，cur用来遍历寻找，parent用来记录cur的父节点，以便后续的插入
     * 3. 从根节点开始与插入节点比较，不断遍历，最后在叶子节点插入新节点
     * @param root
     * @param key
     * @return
     */
    public boolean insert(Node root,int key) {
        Node node = new Node(key);
        if(root == null) {  //空树
            root = node;
            return true;
        }
        Node cur = root;
        Node parent = null;
        while(cur != null){
            if(cur.val == node.val){ //原树中有此节点值，不能插入重复节点
                return false;
            }else if(cur.val > node.val){ //向左遍历
                parent = cur;
                cur = cur.left;
            }else{ //向右遍历
                parent = cur;
                cur = cur.right;
            }
        }
        //此时cur = null，parent指向要插入位置的父节点
        if(parent.val > key){ //判断新节点插入到parent的左边还是右边
            parent.left = node;
        }else{
            parent.right = node;
        }
        return true;
    }

    /**
     * 删除节点
     * @param root
     * @param parent
     */
    public void remove(Node root ,Node parent,Node cur) {
        //设待删除结点为 cur, 待删除结点的双亲结点为 parent
        //1. cur.left == null
        if (cur.left == null) {
            //1.1 cur是 root，则root = cur.right
            if (cur == root) {
                root = cur.right;
            } else if (cur == parent.left) {
                //1.2 cur不是 root，cur是 parent.left，则 parent.left = cur.right
                parent.left = cur.right;
            } else if (cur == parent.left) {
                //1.3 cur不是 root，cur是 parent.right，则 parent.right = cur.right
                parent.right = cur.right;
            }
        } else if (cur.right == null) {
            //2. cur.right == null
            if (cur == root) {
                //2.1 cur是root，则root = cur.left
                root = cur.left;
            } else if (cur == parent.left) {
                //2.2 cur不是root，cur是parent.left，则parent.left = cur.left
                parent.left = cur.left;
            } else if (cur == parent.right) {
                //2.3 cur不是root，cur是parent.right，则parent.right = cur.left
                parent.right = cur.left;
            }
        } else {
            //3. cur.left != null && cur.right != null
            //替罪羊法
            //找右边最小的，（或左边最大的）
            Node targetParent = cur;
            Node target = cur.right; //找替罪羊
            while (target.left != null) {
                targetParent = target;
                target = target.left;
            }
            //找到替罪羊节点target，把他的值给待删除节点，然后删除替罪羊节点即可
            cur.val = target.val;
            if (target == targetParent.left) {
                targetParent.left = target.right;//此时target的左边一定为null，直接指到右边
            } else {
                targetParent.right = target.right;
            }
           /* 或左边最大的  两个任选一个都可
            Node targetParent =  cur;
            Node target = cur.left;
            while (target.right != null) {
                targetParent = target;
                target = target.right;
            }
            cur.val = target.val;
            if(target == targetParent.left) {
                targetParent.left = target.left;
            }else {
                targetParent.right = target.left;
            }*/
        }
    }


    public void removeKey(Node root ,int key){ //向插入一样的过程，主函数只进行遍历
        if(root == null) return;
        Node cur = root;
        Node parent = null;
        while(cur != null){
            if(cur.val == key){
                //删除
                remove(root,parent,cur);
            }else if(cur.val < key){
                parent = cur;
                cur = cur.right;
            }else{
                parent = cur;
                cur = cur.left;
            }
        }
    }











}
