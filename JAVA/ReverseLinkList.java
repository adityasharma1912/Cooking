public class ReverseLinkList{

	static Node head = null;

	static class Node{
		int value;
		Node next;

		Node(int value){
			this.value = value;
		}
	}

	/*
	* Generic function to print argument str of any type
	*/
	static <T> void print(T str){
		System.out.print(""+str);
	}

	static void reverLinkList(){
		if(head==null)
			print("Empty Link List");

		Node prev = null;
		Node next = null;
		Node curr = head;
		while(curr!=null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
	}

	static void printList(){
		if(head==null)
			print("Empty Link List");
		Node curr = head;
		while(curr!=null){
			print(curr.value+"--");
			curr = curr.next;
		}
	}

	public static void main(String args[]){
		head = new Node(54);
		head.next = new Node(15);
		head.next.next = new Node(26);
		head.next.next.next = new Node(57);
		print(head.value);
		printList();
		reverLinkList();
		print(head.value);
		printList();
	}
}