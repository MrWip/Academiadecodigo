package org.academiadecodigo.bootcamp.containers;

public class LinkedList {

    private Node head;
    private int length = 0;

    public LinkedList() {
        this.head = new Node(null);
    }

    public int size() {
        return length;
    }

    /**
     * Adds an element to the end of the list
     *
     * @param data the element to add
     */
    public void add(Object data) {

        Node node = new Node(data);
        Node iterator = head;
        while (iterator.getNext() != null) {
            iterator = iterator.getNext();
        }
        iterator.setNext(node);
        length++;

    }

    /**
     * Obtains an element by index
     *
     * @param index the index of the element
     * @return the element
     */
    public Object get(int index) {

        Node iterator = head;
        for (int i = 0; i <= index; i++) {
            iterator = iterator.getNext();
            if(iterator == null){
                return null;
            }
            if(iterator.getData() == null){
                return null;
            }
        }
        return iterator.getData();
    }

    /**
     * Returns the index of the element in the list
     *
     * @param data element to search for
     * @return the index of the element, or -1 if the list does not contain element
     */
    public int indexOf(Object data) {

        Node iterator = head.getNext();
        int index = 0;

        while (iterator != null) {

            if (data.equals(iterator.getData())) {
                return index;
            }

            iterator = iterator.getNext();
            index++;
        }

        return -1;
    }

    /**
     * Removes an element from the list
     *
     * @param data the element to remove
     * @return true if element was removed
     */
    public boolean remove(Object data) {

        Node iterator = head;
        Node iterator2;
        int index = indexOf(data);
        if (index == -1) {
            return false;
        }
        for (int i = -1; i < index-1; i++) {
            iterator = iterator.getNext();
        }
        iterator2 = iterator.getNext();
        iterator.setNext(iterator2.getNext());
        length--;
        return true;


    }

    private class Node {

        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
            next = null;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

}
