package browserbuddy;

import java.util.LinkedList;
import java.util.Stack;

public class BrowserTab {
	  private HistoryNode current;

	    public void visit(String url) {
	        HistoryNode newNode = new HistoryNode(url);

	        if (current != null) {
	            current.next = null; // clear forward history
	            newNode.prev = current;
	            current.next = newNode;
	        }
	        current = newNode;
	        System.out.println("Visited: " + url);
	    }

	    public void back() {
	        if (current != null && current.prev != null) {
	            current = current.prev;
	            System.out.println("Back to: " + current.url);
	        } else {
	            System.out.println("No back history");
	        }
	    }

	    public void forward() {
	        if (current != null && current.next != null) {
	            current = current.next;
	            System.out.println("Forward to: " + current.url);
	        } else {
	            System.out.println("No forward history");
	        }
	    }

	    public String getCurrentPage() {
	        return current != null ? current.url : "Empty Tab";
	    }
	}

	

