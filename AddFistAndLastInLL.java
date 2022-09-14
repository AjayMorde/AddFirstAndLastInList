package linkedList;

public class AddFistAndLastInLL {
	Node head;
	class Node {
		String data;
		Node next;
		Node(String data){
			this.data=data;
			this.next=null;
		}
		
	}
	public  void AddFirst(String data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
		
		
	}
	public void AddLast(String data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;   
		}
		Node currNode=head;
		while(currNode.next!=null) {
			currNode=currNode.next;
		}
		currNode.next=newNode;
	}
	public void printList() {
		if(head==null) {
			System.out.println("List is Empty ");
			return;
		}
		Node currNode=head;
		while(currNode!=null) {
			System.out.print(currNode.data+"->");
			currNode=currNode.next;
		}
		System.out.println("NULL");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddFistAndLastInLL List=new AddFistAndLastInLL();
		List.AddFirst("a");
		List.AddFirst("is");
		List.printList();
		List.AddLast("List");
		List.printList();

	}

}
