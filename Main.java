import java.util.Scanner;
//import javax.swing.RootPaneContainer;

public class Main{
    
    //private static String Outputs;

    public static void main(String[] args){

        Scanner tree_input = new Scanner(System.in);

        System.out.println("");
        System.out.println("Please enter 9 numbers: ");
        
        int num1 = tree_input.nextInt();
        int num2 = tree_input.nextInt();
        int num3 = tree_input.nextInt();
        int num4 = tree_input.nextInt();
        int num5 = tree_input.nextInt();
        int num6 = tree_input.nextInt();
        int num7 = tree_input.nextInt();
        int num8 = tree_input.nextInt();
        int num9 = tree_input.nextInt();
        
        System.out.println("");
        String inputs = (num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + num6 + " " + num7 + " " + num8 + " " + num9 + " ");
        BST tree = new BST();

        System.out.println("The inputs are: " + inputs);
        System.out.println("");
        System.out.println("Binary Search Tree Results: ");

        tree.insert(new Node(num1));
        tree.insert(new Node(num2));
        tree.insert(new Node(num3));
        tree.insert(new Node(num4));
        tree.insert(new Node(num5));
        tree.insert(new Node(num6));
        tree.insert(new Node(num7));
        tree.insert(new Node(num8));
        tree.insert(new Node(num9));
                
        tree.display();
        
        //String Outputs = ("Outputs: "+ num1+" "+num2+" "+num3+" "+num4+" "+num5+" "+num6+" "+num7+" "+num8+" "+num9);
        //System.out.println("outputs of tree: " + num1+" "+num2+" "+num3+" "+num4+" "+num5+" "+num6+" "+num7+" "+num8+" "+num9);
        //String Outputs2 = (tree.root.data + " " + tree.root.left.data + " " + tree.root.right.data + " " + tree.root.left.left.data + " " + tree.root.left.right.data + " " + tree.root.right.left.data + " " + tree.root.right.right.data);
        //System.out.println("The output is: " + Outputs2);
        //trying to print nodes of balanced BST tree in sorted order
        //System.out.println("The output is: " + Outputs);
        //System.out.println(data);

        // System.out.println(tree.root);
        // System.out.println(tree.root.data);
        // System.out.println(tree.root.left);
        // System.out.println(tree.root.left.data);
        // System.out.println(tree.root.right);
        // System.out.println(tree.root.right.data);
        // System.out.println(tree.root.left.left);
        // System.out.println(tree.root.left.left.data);
        // System.out.println(tree.root.left.right);
        // System.out.println(tree.root.left.right.data);
        // System.out.println(tree.root.right.left);
        // System.out.println(tree.root.right.left.data);
        // System.out.println(tree.root.right.right);
        // System.out.println(tree.root.right.right.data);
        // System.out.println("The output is: " + tree.root.data + " " + tree.root.left.data + " " + tree.root.right.data + " " + tree.root.left.left.data + " " + tree.root.left.right.data + " " + tree.root.right.left.data + " " + tree.root.right.right.data);
        //System.out.println(outputtest);
        tree_input.close();
    }
}


