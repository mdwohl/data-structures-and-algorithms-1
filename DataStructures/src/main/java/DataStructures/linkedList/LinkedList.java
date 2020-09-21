package DataStructures.linkedList;

public class LinkedList {

    public Node head = null;

    public void insert(int value) {
        Node newNode = new Node(value);
        if (this.head != null) {
            newNode.setNext(this.head);
        }
        this.head = newNode;
    }

    public String toString() {
        if (this.head == null) {
            return "NULL";
        }
        String output = String.format("{%s}", this.head.toString());
        Node nextNode = this.head.getNext();
        while (nextNode != null) {
            output += String.format(" -> {%s}", nextNode.toString());
            nextNode = nextNode.getNext();
        }
        output += " -> NULL";
        return output;
    }

    public boolean includes(int value) {
        if (this.head.getValue() == value) {
            return true;
        }
        Node nextNode = this.head.getNext();
        while (nextNode != null) {
            if (nextNode.getValue() == value) {
                return true;
            }
            nextNode = nextNode.getNext();
        }
        return false;
    }

    public void append(int newValue) {
        if (this.head == null) {
            Node newNode = new Node(newValue);
            head = newNode;
            return;
        }

        Node nextToCheck = head;

        do {
            if (nextToCheck.getNext() == null) {
                Node newNode = new Node(newValue);
                nextToCheck.setNext(newNode);
                break;
            } else {
                nextToCheck = nextToCheck.getNext();
            }
        } while (nextToCheck != null);
    }

    public void insertBefore(int searchValue, int newValue) throws Exception {
        if (head.getValue() == searchValue) {
            insert(newValue);
        } else {
            Node previousChecked = head;
            do {
                if (previousChecked.getNext() == null) {
                    throw new Exception("Value not found.");
                }
                if (previousChecked.getNext().getValue() == searchValue) {
                    Node newNode = new Node(newValue);
                    newNode.setNext(previousChecked.getNext());
                    previousChecked.setNext(newNode);
                    return;
                } else {
                    previousChecked = previousChecked.getNext();
                }
            } while (previousChecked != null);

        }
    }

    public void insertAfter(int searchValue, int newValue) throws Exception {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.getValue() == searchValue) {
                Node newNode = new Node(newValue);
                newNode.setNext(currentNode.getNext());
                currentNode.setNext(newNode);
                return;
            }
        }
        throw new Exception("Value not found.");
    }
}
