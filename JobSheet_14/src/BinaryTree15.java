

public class BinaryTree15 {

    Node15 root;

    public BinaryTree15() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Student15 data) {
        if (isEmpty()) {
            root = new Node15(data);
        } else {
            Node15 current = root;
            while (true) {
                if (data.ipk < current.data.ipk) {
                    if (current.left != null) {
                        current = current.left;
                    } else {
                        current.left = new Node15(data);
                        break;
                    }
                } else if (data.ipk > current.data.ipk) {
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new Node15(data);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }

    public boolean find(double ipk) {
        boolean result = false;
        Node15 current = root;
        while (current != null) {
            if (current.data.ipk == ipk) {
                result = true;
                break;
            } else if (ipk < current.data.ipk) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return result;
    }

    public void traversePreOrder(Node15 node) {
        if (node != null) {
            node.data.print();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traverseInOrder(Node15 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.data.print();
            traverseInOrder(node.right);
        }
    }

    public void traversePostOrder(Node15 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.data.print();
        }
    }

    Node15 getSuccessor(Node15 del) {
        Node15 successor = del.right;
        Node15 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    public void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        Node15 parent = root;
        Node15 current = root;
        boolean isLeftChild = false;
        while (current.data.ipk != ipk) {
            parent = current;
            if (ipk < current.data.ipk) {
                isLeftChild = true;
                current = current.left;
            } else {
                isLeftChild = false;
                current = current.right;
            }
            if (current == null) {
                System.out.println("Couldn't find data!");
                return;
            }
        }
        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            } else if (isLeftChild) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        } else if (current.right == null) {
            if (current == root) {
                root = current.left;
            } else if (isLeftChild) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }
        } else if (current.left == null) {
            if (current == root) {
                root = current.right;
            } else if (isLeftChild) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        } else {
            Node15 successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.left = successor;
            } else {
                parent.right = successor;
            }
            successor.left = current.left;
        }
    }

    public class BinaryTreeMain00 {

        public static void main(String[] args) {
            BinaryTree15 bst = new BinaryTree15();
            bst.add(new Student15("244107020138", "Devin", "TI-1I", 3.57));
            bst.add(new Student15("244107020023", "Dewi", "TI-1I", 3.85));
            bst.add(new Student15("244107020225", "Wahyu", "TI-1I", 3.21));
            bst.add(new Student15("244107020076", "Angelina", "TI-1I", 3.54));
            System.out.println("Student list (in-order traversal)");
            bst.traverseInOrder(bst.root);
            System.out.println("Search data");
            System.out.print("Search a student with IPK: 3.54: ");
            String result = bst.find(3.54) ? "Found" : "Not Found";
            System.out.println(result);
            System.out.print("Search a student with IPK: 3.22: ");
            result = bst.find(3.22) ? "Found" : "Not Found";
            System.out.println(result);
            bst.add(new Student15("244107020223", "Andhika", "TI-1I", 3.72));
            bst.add(new Student15("244107020226", "Bima", "TI-1I", 3.37));
            bst.add(new Student15("244107020181", "Eiyu", "TI-1I", 3.46));
            System.out.println("Student list:");
            System.out.println("In-order traversal:");
            bst.traverseInOrder(bst.root);
            System.out.println("Pre-order traversal:");
            bst.traversePreOrder(bst.root);
            System.out.println("Post-order traversal:");
            bst.traversePostOrder(bst.root);
            System.out.println("Data deletion");
            bst.delete(3.57);
            System.out.println("Student list after deletion:");
            bst.traverseInOrder(bst.root);
        }
    }

    //Assignment 

    public void addRekursif(Student15 data) {
        root = addRekursif(root, data);
    }

    private Node15 addRekursif(Node15 current, Student15 data) {
        if (current == null) {
            return new Node15(data);
        }

        // Jika IPK lebih kecil, telusuri cabang kiri
        if (data.ipk < current.data.ipk) {
            current.left = addRekursif(current.left, data);
        } 
        // Jika IPK lebih besar, telusuri cabang kanan
        else if (data.ipk > current.data.ipk) {
            current.right = addRekursif(current.right, data);
        }
        
        return current;
    }

    public void getMinIPK() {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        Node15 current = root;
        // Telusuri terus ke kiri hingga ujung
        while (current.left != null) {
            current = current.left;
        }
        System.out.println("Mahasiswa dengan IPK terendah:");
        current.data.print();
    }

    public void getMaxIPK() {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        Node15 current = root;
        // Telusuri terus ke kanan hingga ujung
        while (current.right != null) {
            current = current.right;
        }
        System.out.println("Mahasiswa dengan IPK tertinggi:");
        current.data.print();
    }

    // Method utama
    public void displayStudentsWithIPKAbove(double threshold) {
        System.out.println("Daftar Mahasiswa dengan IPK di atas " + threshold + ":");
        displayStudentsWithIPKAbove(root, threshold);
    }

    // Method rekursif bantuan
    private void displayStudentsWithIPKAbove(Node15 node, double threshold) {
        if (node != null) {
            displayStudentsWithIPKAbove(node.left, threshold); // Kiri
            
            // Cetak jika IPK memenuhi syarat batas (threshold)
            if (node.data.ipk > threshold) {
                node.data.print();
            }
            
            displayStudentsWithIPKAbove(node.right, threshold); // Kanan
        }
    }

}
