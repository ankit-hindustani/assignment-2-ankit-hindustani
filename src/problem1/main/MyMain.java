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

//printing left child
        obj.LeftNodes(obj.getRoot());
    }
}
