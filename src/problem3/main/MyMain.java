/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;
import problem5.student.Student;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue obj=new MyPriorityQueue();
        obj.enqueue((new Student(181500100)).getRollNum());
        obj.enqueue((new Student(181500533)).getRollNum());
        obj.enqueue((new Student(181500233)).getRollNum());
        obj.enqueue((new Student(181500002)).getRollNum());
        obj.enqueue((new Student(181500456)).getRollNum());
        obj.traverse();
    }
}
