class Node1 {
    int data;
    Node1 next;
}
public class Deletion {
    Node1 head;

    public void insert(int data)
{
    Node1 node = new Node1();
    node.data = data;
    node.next =  null;

    if(head == null) {
        head = node;
    } else {
        Node1 temp = head;
        while(temp.next!=null) {
            temp=temp.next;
        }
        temp.next = node;
    }
}

public void deleteAtStart() {
    if(head == null) {
        System.out.println("empty");
        return;
    }
    head = head.next;
} 

//Delete at last 
public void deleteAtLast() {
    //if head is null
    if(head == null) {
        return;
    }
    if(head.next == null) {
        head = null;
    }
    //if more than 1 node
    Node1 temp = head;
    while(temp.next.next!=null) {
        temp = temp.next;
    }
    temp.next = null;

}
public void display() {
    Node1 n = head;
    while(n.next!=null) {
        System.out.println(n.data);
        n=n.next;
    }
    System.out.println(n.data);
}
public static void main(String[] args) {
    Demo d = new Demo();
    d.insert(23);
    d.insert(56);
    d.insert(34);
    d.insert(4);
    d.insert(32);
    d.insert(3);

    d.deleteAtStart();
    
    d.deleteAtLast();
    d.display();
}
    
}
