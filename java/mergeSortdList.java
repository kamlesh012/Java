package java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Node{
    public Node next;
    public int val;
    public Node(int val,Node next){
        this.val=val;
        this.next=next;
    }
}

public class mergeSortdList {

    public static void main(String [] args){
        int n=6;
        // Scanner scn=new Scanner(System.in);
        // n=scn.nextInt();

        Node prev=new Node(-1,null);
        Node head=prev;
        List<Integer> lst=new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);

        for(int i=0;i<n;i++){
            // int val=scn.nextInt();
            int val=lst.get(i);
            Node curr=new Node(val,null);
            prev.next=curr;
            prev=curr;
        }

        Node itr=head.next;
        for(int i=0;i<n;i++){
            System.out.println(itr.val);
            itr=itr.next;
        }
        

    }
}
