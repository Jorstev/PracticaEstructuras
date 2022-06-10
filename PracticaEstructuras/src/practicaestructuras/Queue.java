/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaestructuras;

/**
 *
 * @author JordanStevenChavarri
 */
public class Queue<T> {

    private Node<T> front;
    private Node<T> back;

    public void add(T value) {
        if (back == null) {
            Node temp = new Node(value);
            back = temp;
            front = temp;
        } else {
            Node temp = new Node(value);
            back.setNext(temp);
            back = temp;
        }
    }
    
    public T remove(){
        if(front == null){
            return null;
        }else{
            Node<T> temp = front;
            front = temp.getNext();
            temp.setNext(null);
            if(front == null){
                back = null;
            }
            return temp.getValue();
        }
    }
    
    /*public T current(){
        if(front == null){
            return null;
        }else{
            Node<T> temp = front;
            return temp.getValue();
        }
    }*/
}
