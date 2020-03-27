/*
 *  Created by IntelliJ IDEA.
 *  Author: Ankit Singh
 *  GLA university mathura (u.p)
 */
package problem1.mybst;
// to implement BinarySearchTree
import problem1.node.TreeNode;

public class MyBinarySearchTree {

        TreeNode root;

        public TreeNode getRoot(){
            return root;
        }
        //insert element in BST
        public void insert(int data){
            TreeNode node=new TreeNode(data);
            if(root==null){
                root=node;
            }
            else{
                TreeNode temp=root;
                TreeNode parent=null;
                while(temp!=null){
                    parent=temp;
                    if(node.getData()<=temp.getData()){
                        temp=temp.getLeft();
                    }
                    else{
                        temp=temp.getRight();
                    }
                }
                if(node.getData()<=parent.getData()){
                    parent.setLeft(node);
                }
                else{
                    parent.setRight(node);
                }
            }
        }

//Algorithm
    /* if tree != null


     */
//method to print left child
    public void LeftNodes(TreeNode root)
        {

            int countNoLeftChild=0;
            if (root.getLeft() != null)
            {
                System.out.print(root.getLeft().getData()+" ");
                LeftNodes(root.getLeft());
            }
            else{
                countNoLeftChild+=1;
            }
            if(root.getRight() != null)
            {
                LeftNodes(root.getRight());
            }
        }



    public void traversePreOrder(TreeNode node){
        if(node != null){
            System.out.print(node.getData()+" ");
            traversePreOrder(node.getLeft());
            traversePreOrder(node.getRight());

        }
    }

    public void traversePostOrder(TreeNode node){
        if(node != null){
            traversePostOrder(node.getLeft());
            traversePostOrder(node.getRight());
            System.out.print(node.getData()+" ");
        }
    }

    }


