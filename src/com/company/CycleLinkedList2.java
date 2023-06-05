package com.company;

public class CycleLinkedList2 {
    static class Node {
        Node next;
        int data;
        public Node (int d, Node next) {
            this.next = next;
            this.data = d;
        }
        public Node (int d) {
            this.data = d;
            this.next = null;
        }
    }
    public static Node firstNode(Node head)
    {
        //    Write your code here.
        if (head == null || head.next == null || head.next.next == null) return null;
        Node f = head;
        Node s = head;
        Node entry = head;
        while (f.next != null && f.next.next != null) {
            f = f.next.next;
            s = s.next;
            if (f == s) {
                while (entry != s) {
                    entry = entry.next;
                    s = s.next;
                }
                return entry;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Node one = new Node(2);
        Node two = new Node(3, one);
        Node three = new Node(4, two);
        Node four = new Node (5, three);
        one.next = three;
        System.out.println(firstNode(four).data);
    }
}
