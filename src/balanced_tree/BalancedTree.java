package balanced_tree;

import java.util.LinkedList;
import java.util.Queue;

class BalancedTree {
    private TreeNode root;
    private int size;

    public BalancedTree() {
        this.root = null;
        this.size = 0;
    }

    public void add(int data) {
        root = insert(root, data);
        size++;
    }

    private TreeNode insert(TreeNode node, int data) {
        if (node == null) {
            node = new TreeNode(data);
        } else {
            if (data < node.data) {
                node.leftNode = insert(node.leftNode, data);
            } else {
                node.rightNode = insert(node.rightNode, data);
            }
        }
        return node;
    }

    public boolean search(int data) {
        return searchNode(root, data);
    }

    private boolean searchNode(TreeNode node, int data) {
        if (node == null) {
            return false;
        }
        if (data == node.data) {
            return true;
        } else if (data < node.data) {
            return searchNode(node.leftNode, data);
        } else {
            return searchNode(node.rightNode, data);
        }
    }

    public void remove(int data) {
        root = deleteNode(root, data);
        size--;
    }

    private TreeNode deleteNode(TreeNode root, int data) {
        if (root == null) {
            return null;
        }
        if (data < root.data) {
            root.leftNode = deleteNode(root.leftNode, data);
        } else if (data > root.data) {
            root.rightNode = deleteNode(root.rightNode, data);
        } else {
            if (root.leftNode == null) {
                return root.rightNode;
            } else if (root.rightNode == null) {
                return root.leftNode;
            }
            root.data = findMinValue(root.rightNode);
            root.rightNode = deleteNode(root.rightNode, root.data);
        }
        return root;
    }

    private int findMinValue(TreeNode node) {
        int minValue = node.data;
        while (node.leftNode != null) {
            minValue = node.leftNode.data;
            node = node.leftNode;
        }
        return minValue;
    }

    public int getDepth() {
        return calculateDepth(root);
    }

    private int calculateDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftDepth = calculateDepth(node.leftNode);
        int rightDepth = calculateDepth(node.rightNode);
        return Math.max(leftDepth, rightDepth) + 1;
    }

    public int getSize() {
        return size;
    }

    public void traversalWidth() {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.data + " ");

            if (node.leftNode != null) {
                queue.add(node.leftNode);
            }
            if (node.rightNode != null) {
                queue.add(node.rightNode);
            }
        }
        System.out.println();
    }

    public void traversalDepth() {
        traverseInOrder(root);
        System.out.println();
    }

    private void traverseInOrder(TreeNode node) {
        if (node != null) {
            traverseInOrder(node.leftNode);
            System.out.print(node.data + " ");
            traverseInOrder(node.rightNode);
        }
    }

    private class TreeNode {
        private int data;
        private TreeNode leftNode;
        private TreeNode rightNode;

        public TreeNode(int data) {
            this.data = data;
            this.leftNode = null;
            this.rightNode = null;
        }
    }
}