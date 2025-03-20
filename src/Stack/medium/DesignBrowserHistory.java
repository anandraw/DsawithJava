package Stack.medium;

public class DesignBrowserHistory {
    class Node {
        String url;
        Node prev, next;
        Node(String url) {
            this.url = url;
        }
    }
    Node curr;  // Pointer to the current page

    // Initialize with the homepage.
    public DesignBrowserHistory(String homepage) {
        curr = new Node(homepage);
    }

    // Visit a new page: clear forward history.
    public void visit(String url) {
        Node newNode = new Node(url);
        // Clear forward history:
        curr.next = null;
        // Link current page with the new node:
        newNode.prev = curr;
        curr.next = newNode;
        curr = newNode;
    }

    // Move back by 'steps' pages.
    public String back(int steps) {
        while (steps > 0 && curr.prev != null) {
            curr = curr.prev;
            steps--;
        }
        return curr.url;
    }

    // Move forward by 'steps' pages.
    public String forward(int steps) {
        while (steps > 0 && curr.next != null) {
            curr = curr.next;
            steps--;
        }
        return curr.url;
    }
}
