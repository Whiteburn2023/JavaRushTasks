package com.javarush.task.pro.task13.task1313;

public class StringLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement != null) && (currentElement != last)) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        Node node = new Node();
        node.value = value;

        if (last.prev == null){
            first.next = node;
            last.prev = node;
            node.next = last;
            node.prev = first;
        } else {
            Node prevNode = last.prev;
            prevNode.next = node;
            last.prev = node;
            node.prev = prevNode;
            node.next = last;

        }
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
