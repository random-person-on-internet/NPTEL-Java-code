class TreeNode {
    int element;
    TreeNode left;
    TreeNode right;

    public TreeNode(int element) {
        this.element = element;
        this.left = null;
        this.right = null;
    }

    // traversal
    public void visit() {
        System.out.print(this.element + " ");
    }

    public void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            root.visit();
            inorder(root.right);
        }
    }

    public void preorder(TreeNode root) {
        if (root != null) {
            root.visit();
            preorder(root.left);
            preorder(root.right);
        }
    }

    public void postorder(TreeNode root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            root.visit();
        }
    }

    // insertion
    public void insert(int obj) {
        if (this.element < obj) {
            if (this.right == null) {
                this.right = new TreeNode(obj);
            } else {
                this.right.insert(obj);
            }
        } else if (this.element > obj) {
            if (this.left == null) {
                this.left = new TreeNode(obj);
            } else {
                this.left.insert(obj);
            }
        }
    }

    // deletion
    public TreeNode delete(TreeNode root, int key) {
        // if root empty, i.e, for node with no child
        if (root == null)
            return null;

        if (root.element > key) {
            root.left = delete(root.left, key);
        } else if (root.element < key) {
            root.right = delete(root.right, key);
        } else {
            // for one child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // for 2 children
            root.element = minValue(root.right);
            root.right = delete(root.right, root.element);
        }
        return root;
    }

    // for finding min value
    public int minValue(TreeNode root) {
        int min = root.element;
        while (root.left != null) {
            min = root.left.element;
            root = root.left;
        }
        return min;
    }
}

public class binarySearchTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(35);
        root.insert(20);
        root.insert(45);
        root.insert(42);
        root.insert(16);
        root.insert(29);
        root.insert(24);
        root.insert(33);
        root.insert(27);

        root.inorder(root);
        System.out.println();
        root.preorder(root);
        System.out.println();
        root.postorder(root);
        System.out.println();

        // root.delete(root, 33);
        // root.delete(root, 27);
        root.delete(root, 20);
        root.insert(48);
        root.inorder(root);
        System.out.println();
        root.preorder(root);
        System.out.println();
    }
}