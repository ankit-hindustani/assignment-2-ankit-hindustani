/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;
import problem1.mybst.MyBinarySearchTree;
import problem4.myqueue.MyQueue;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        //create a BST and enter some element
        MyBinarySearchTree BST=new MyBinarySearchTree();
        BST.insert(10);
        BST.insert(5);
        BST.insert(8);
        BST.insert(6);
        BST.insert(20);
        BST.insert(15);
        BST.insert(9);
        BST.insert(11);
        BST.insert(12);
        BST.insert(13);
        BST.insert(4);
//create a queue and passing BST for find pre-order succesor
        MyQueue obj=new MyQueue();
        obj.enqueue(BST);
//print Queue
        obj.printQueue();


    }

}
