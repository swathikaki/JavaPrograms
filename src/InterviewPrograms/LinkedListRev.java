package InterviewPrograms;

public class LinkedListRev {

	static Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	Node reverse(Node node){
		Node prev = null;
		Node current = node;
		Node next = null;
		
		while(current != null)
		{
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}
	
	void printList(Node node){
		while(node != null)
		{
			System.out.println(node.data + " ");
			node = node.next;
		}
		
	}
	
	public static void main(String[] args) {
		LinkedListRev list = new LinkedListRev();
		list.head = new Node(85);
		list.head.next = new Node(20);
		list.head.next.next = new Node(36);
		list.head.next.next.next = new Node(10);
		
		System.out.println("List before reversing");
		list.printList(head);
		head = list.reverse(head);
		
		System.out.println("List after reversing");
		list.printList(head);
	}

}
