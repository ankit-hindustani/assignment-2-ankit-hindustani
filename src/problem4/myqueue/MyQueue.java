/*
 *
 *  Created by IntelliJ IDEA.
 *  Author: Ankit Singh
 *  GLA university mathura (U.P)
 *
 */

package problem4.myqueue;

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;
import problem3.node.Node;

import java.util.ArrayList;

// to create queue to store pre - order successor
public class MyQueue {
    Node front;  //head
    Node rear;
    static ArrayList ls=new ArrayList();

    //Finding Pre-order and store it into ArrayList
    public void traversePreOrder(TreeNode node) {
        if (node != null) {
            ls.add(node.getData());
            traversePreOrder(node.getLeft());
            traversePreOrder(node.getRight());

        }
    }
//insert pre-order succesor of all nodes into queue
    public void enqueue(MyBinarySearchTree BST){
        TreeNode root=BST.getRoot();
        //calling for pre-order
        traversePreOrder(root);
        //enter all pre-order element into queue except first element
        for(int i=1;i<ls.size();i++){
            int element= (int) ls.get(i);
            Node node=new Node(element);
            if(front==null){
                front=rear=node;

            }
            else{
                rear.setNext(node);
                rear=rear.getNext();
            }
        }
    }

    //printing queue
    public void printQueue(){
            Node temp=front;
            if(front==null){
                System.out.println("queue is empty");
            }
            else{
                while (temp.getNext() != null){
                    System.out.print(temp.getData()+" ");
                    temp=temp.getNext();
                }
                System.out.println(temp.getData());
            }
        }

    }

