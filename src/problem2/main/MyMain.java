/*
 *  Created by IntelliJ IDEA.
 *  Author: Ankit Singh
 *  GLA university mathura (u.p)
 */
package problem2.main;

import problem1.mybst.MyBinarySearchTree;

// executable class
// used problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree obj=new MyBinarySearchTree();
        obj.insert(115);
        obj.insert(32);
        obj.insert(42);
        obj.insert(9);
        obj.insert(244);

        System.out.println("tree root= "+obj.getRoot().getData());
        obj.traversePreOrder(obj.getRoot());

        //after execution of the program, we see that in preOrder traverse, root is first element


        System.out.println();
        obj.traversePostOrder(obj.getRoot());

        //after execution of the program, we see that in postOrder traverse, root is last element



        /* Problem 2 (b)
        but in both traverse(pre,post) mid point is different.
         */

    }
}
