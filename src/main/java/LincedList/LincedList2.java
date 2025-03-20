package LincedList;

import java.util.StringJoiner;

public class LincedList2<T>{
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public LincedList2(){
        this.head=null;
        this.tail=null;
        this.size = 0;

    }
    private static class Node<T>{
        T value;
        Node<T> prev;
        Node<T> next;

        Node(T value,Node<T> prev,Node<T> next){
            this.prev = prev;
            this.next = next;
            this.value = value;
        }
    }
    public void add(T value){
        Node<T> newNode = new Node<>(value,tail,null);
        if (tail!= null)
        {
            tail.next = newNode;
        }
            else
            {
                head = newNode;
            }
            tail = newNode;
            size ++;
        }
        public Node<T> getNod(int index){
        Node<T> current;
        if (index<(size/2))
        {
            current = head;
            for (int i = 0; i < index; i++)
            {
                current = current.next;
            }
        }
        else
        {
            current = tail;
            for (int i = size-1; i>index ; i--)
            {
                current=current.prev;
            }
        }
            System.out.println(current.value);
            return current;
    }
    public void remove(int index){
        if (index <0 || index >= size){
            throw new IndexOutOfBoundsException("index out of bound "+ index);
        }
        Node<T> current = getNod(index);
        if (current.prev!= null){
            current.prev.next = current.next;
        }
        else {
            current.next=head;
        }
        if (current.next!= null){
            current.next.prev= current.prev;
        }
        else{
            current.prev = tail;
        }
        current.next = null;
        current.prev = null;
        size--;
    }
    public int size(){
        return size;
    }
    public void clear(){
        Node<T> current = head;
        while (current!=null){
            Node<T> Next = current.next;
            current.next= null;
            current.prev=null;
            current = Next;
        }
        head =null;
        tail= null;
        size = 0;
    }
    @Override
    public String toString(){
        StringJoiner sj = new StringJoiner(",","[","]");
        Node<T> current = head;
        while (current != null){
            sj.add(current.value.toString());
            current = current.next;
        }
        return sj.toString();
    }

    public static void main(String[] args) {
        LincedList2<Integer> lincedList2 = new LincedList2<>();
        lincedList2.add(1);
        lincedList2.add(2);
        lincedList2.add(3);
        System.out.println(lincedList2);
        System.out.println(lincedList2.size());
        lincedList2.remove(1);
        System.out.println(lincedList2);
        lincedList2.getNod(1);
        lincedList2.clear();
        System.out.println(lincedList2);

    }

}

