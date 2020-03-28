/*
*  Created by IntelliJ IDEA.
*  Author: Ankit Singh
*  GLA university mathura (u.p)
*/
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree obj=new MyBinarySearchTree();
        obj.insert(10);
        obj.insert(5);
        obj.insert(8);
        obj.insert(6);
        obj.insert(20);
        obj.insert(15);
        obj.insert(9);
        obj.insert(10);
        obj.insert(12);
        obj.insert(13);
        obj.insert(4);

//printing left child nodes
        System.out.println("left child nodes= ");
        obj.LeftNodes(obj.getRoot());
//count and printing no. of nodes who doesn't have left child
        System.out.println();
        System.out.println("no. of nodes who doesn't have left child= "+obj.getCountnoLeftChild());
    }
}
