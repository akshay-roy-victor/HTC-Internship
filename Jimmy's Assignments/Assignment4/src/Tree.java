import java.util.Stack;
//class Stack {
//    static final int MAX = 1000;
//    int top;
//    int a[] = new int[MAX]; // Maximum size of Stack
//  
//    boolean isEmpty()
//    {
//        return (top < 0);
//    }
//    Stack()
//    {
//        top = -1;
//    }
//  
//    boolean push(int x)
//    {
//        if (top >= (MAX - 1)) {
//            System.out.println("Stack Overflow");
//            return false;
//        }
//        else {
//            a[++top] = x;
//            System.out.println(x + " pushed into stack");
//            return true;
//        }
//    }
//  
//    int pop()
//    {
//        if (top < 0) {
//            System.out.println("Stack Underflow");
//            return 0;
//        }
//        else {
//            int x = a[top--];
//            return x;
//        }
//    }
//  
//    int peek()
//    {
//        if (top < 0) {
//            System.out.println("Stack Underflow");
//            return 0;
//        }
//        else {
//            int x = a[top];
//            return x;
//        }
//    }
//     
//    void print(){
//    for(int i = top;i>-1;i--){
//      System.out.print(" "+ a[i]);
//    }
//  }
//}
 

class Node
{
    int data;
    Node left, right;
 
    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}

class BinaryTree
{
    Node root;
    void inorder()
    {
        if (root == null)
            return;
 
 
        Stack<Node> s = new Stack<Node>();
        Node curr = root;
 
        // Traverse the tree
        while (curr != null || s.size() > 0)
        {
 
            // Reach the left most Node of the
            // curr Node
            while (curr !=  null)
            {
                // Place pointer to a tree node on
                // the stack before traversing
                // the node's left subtree
                s.push(curr);
                curr = curr.left;
            }
 
            // Current must be NULL at this point
            curr = s.pop();
 
            System.out.print(curr.data + " ");
 
            // we have visited the node and its
            // left subtree. Now, it's right
            // subtree's turn
            curr = curr.right;
        }
    }
// Driver code
class Main {
    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Top element is :" + s.peek());
        System.out.print("Elements present in stack :");

    }
}
}

