/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.node.Node;

public class MyPriorityQueue {
    Node front;
    Node rear;
    int size;


    public void enqueue(int data) {
        Node node = new Node(data);
        if (front==null) {
            front = rear = node;
        } else if (data < front.getData()) {
            Node temp = front;
            node.setNext(temp);
            front = node;
        } else {
            Node current = front;
            while (current.getNext() != null && current.getNext().getData() < data) {
                current = current.getNext();
            }
            Node temp = current.getNext();
            node.setNext(temp);
            current.setNext(node);
        }
        this.size++;
    }



    public void traverse(){
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