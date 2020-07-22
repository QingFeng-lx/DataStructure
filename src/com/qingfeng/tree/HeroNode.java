package com.qingfeng.tree;
@SuppressWarnings("all")
class BinaryTree {
    private HeroNode root;

    public void setRoot(HeroNode root) {
        this.root = root;
    }

    public void preOrder() {
        if (this.root != null) {
            this.root.preOrder();
        } else {
            System.out.println("BinaryTree is empty!");
        }
    }

    public void infixOrder() {
        if (this.root != null) {
            this.root.infixOrder();
        } else {
            System.out.println("BinaryTree is empty!");
        }
    }

    public void postOrder() {
        if (this.root != null) {
            this.root.postOrder();
        } else {
            System.out.println("BinaryTree is empty!");
        }
    }

    public HeroNode preOrderSearch(int no) {
        if (root != null) {
            return root.preOrderSearch(no);
        } else {
            return null;
        }
    }

    public HeroNode infixOrderSearch(int no) {
        if (root != null) {
            return root.infixOrderSearch(no);
        } else {
            return null;
        }
    }

    public HeroNode postOrderSearch(int no) {
        if (root != null) {
            return root.postOrderSearch(no);
        } else {
            return null;
        }
    }


}

public class HeroNode {
    private int no;
    private String name;
    private HeroNode left;
    private HeroNode right;

    public HeroNode(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        HeroNode root = new HeroNode(1, "liuxin");
        HeroNode node1 = new HeroNode(2, "yanghai");
        HeroNode node2 = new HeroNode(3, "daxia");
        HeroNode node3 = new HeroNode(4, "xiaoming");
        HeroNode node4 = new HeroNode(5, "刘海哥");

        root.setLeft(node1);
        root.setRight(node2);
        node2.setRight(node3);
        node2.setLeft(node4);

        System.out.println("preOrder......");
        binaryTree.setRoot(root);
        binaryTree.preOrder();
        System.out.println("--------------------------------");
        System.out.println("infixOrder....");
        binaryTree.infixOrder();
        System.out.println("------------------------------------");
        System.out.println("postOrder....");
        binaryTree.postOrder();


        System.out.println("------------------------------------");
        HeroNode preOrderSearch = binaryTree.preOrderSearch(5);
        if (preOrderSearch != null) {
            System.out.println("信息如下：");
            System.out.println("编号：" + preOrderSearch.getNo());
            System.out.println("姓名：" + preOrderSearch.getName());
        } else {
            System.out.println("未找到任何信息！");
        }
        System.out.println("------------------------------------");
        HeroNode infixOrderSearch = binaryTree.infixOrderSearch(5);
        if (infixOrderSearch != null) {
            System.out.println("信息如下：");
            System.out.println("编号：" + infixOrderSearch.getNo());
            System.out.println("姓名：" + infixOrderSearch.getName());
        } else {
            System.out.println("未找到任何信息！");
        }

        System.out.println("------------------------------------");
        HeroNode postOrderSearch = binaryTree.postOrderSearch(5);
        if (postOrderSearch != null) {
            System.out.println("信息如下：");
            System.out.println("编号：" + postOrderSearch.getNo());
            System.out.println("姓名：" + postOrderSearch.getName());
        } else {
            System.out.println("未找到任何信息！");
        }

    }

    public HeroNode getLeft() {
        return left;
    }

    public void setLeft(HeroNode left) {
        this.left = left;
    }

    public HeroNode getRight() {
        return right;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }

    /**
     * 二插树的前序遍历
     */
    public void preOrder() {
        System.out.println(this);
        if (this.left != null) {
            this.left.preOrder();
        }
        if (this.right != null) {
            this.right.preOrder();
        }
    }

    /**
     * 二插树的中序遍历
     */
    public void infixOrder() {
        if (this.left != null) {
            this.left.infixOrder();
        }
        System.out.println(this);

        if (this.right != null) {
            this.right.infixOrder();
        }
    }

    /**
     * 二插树的后序遍历
     */
    public void postOrder() {
        if (this.left != null) {
            this.left.postOrder();
        }
        if (this.right != null) {
            this.right.postOrder();

        }
        System.out.println(this);
    }

    public void setRight(HeroNode right) {
        this.right = right;
    }

    /**
     * 前序查找
     *
     * @param no
     * @return
     */
    public HeroNode preOrderSearch(int no) {
        System.out.println("进行前序遍历....");
        if (this.no == no) {
            return this;
        }
        HeroNode resNode = null;
        if (this.left != null) {
            resNode = this.left.preOrderSearch(no);
        }
        if (resNode != null) {
            return resNode;
        }
        if (this.right != null) {
            resNode = this.right.preOrderSearch(no);
        }
        return resNode;
    }

    /**
     * 中序查找
     *
     * @param no
     * @return
     */
    public HeroNode infixOrderSearch(int no) {
        HeroNode resNode = null;
        if (this.left != null) {
            resNode = this.left.infixOrderSearch(no);
        }
        if (resNode != null) {
            return resNode;
        }
        System.out.println("进行中序遍历....");
        if (this.no == no) {
            return this;
        }
        if (this.right != null) {
            resNode = this.right.infixOrderSearch(no);
        }
        return resNode;
    }

    /**
     * 后序查找
     *
     * @param no
     * @return
     */
    public HeroNode postOrderSearch(int no) {
        HeroNode resNode = null;
        if (this.left != null) {
            resNode = this.left.postOrderSearch(no);
        }
        if (resNode != null) {
            return resNode;
        }
        if (this.right != null) {
            resNode = this.right.postOrderSearch(no);
        }
        if (resNode != null) {
            return resNode;
        }
        System.out.println("进行后序遍历....");
        if (this.no == no) {
            return this;
        }
        return resNode;
    }


}
