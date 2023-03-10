
import java.util.Scanner;

public class Ex05_ArrayListAnother {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		//ArrayList arr = new ArrayList();
		Sungjuk data;
		LinkedList L = new LinkedList();

		int menu;

		do {
			print_menu();
			System.out.printf("\n메뉴 선택 => ");
			menu = in.nextInt();

			if (menu == 5) {
				System.out.printf("\n프로그램 종료...\n");
				break;
			}

			switch (menu) {

			case 1:
				System.out.println();
				data = new Sungjuk();
				System.out.print("번호 입력 => ");
				data.setBunho(in.nextInt());

				System.out.print("이름 입력 => ");
				data.setIrum(in.next());

				System.out.print("점수 입력 => ");
				data.setJumsu(in.nextInt());

				L.insertLastNode(data);
				break;

			case 2:
				L.printList();
				break;

			case 3:
				System.out.println();
				data = new Sungjuk();
				System.out.print("검색할 번호 입력 => ");
				data.setBunho(in.nextInt());

				L.searchNode(data);
				break;

			case 4:
				System.out.println();
				data = new Sungjuk();
				System.out.print("삭제할 번호 입력 => ");
				data.setBunho(in.nextInt());

				L.deleteNode(data);
				break;

			default:
				System.out.printf("\n메뉴를 다시 입력하세요\n");
				break;
			}

		} while (true);

	} // main 메소드의 끝

	static void print_menu() {

		System.out.printf("\n*** 메뉴 ***\n");
		System.out.printf("1. 데이터 입력\n");
		System.out.printf("2. 데이터 출력\n");
		System.out.printf("3. 데이터 검색\n");
		System.out.printf("4. 데이터 삭제\n");
		System.out.printf("5. 프로그램 종료\n");

	} // print_menu() 메소드의 끝

} // Ex05_ArrayList 클래스의 끝 ========================================================================

//class ArrayList { // XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
//	static int MAX = 10;
//	static int cnt = 0;
//	Sungjuk arr[];
//
//	ArrayList() {
//		this.arr = new Sungjuk[MAX];
//	}
//
//	public void insertLastNode(Sungjuk data) {
//		arr[cnt] = data;
//
//		System.out.println("데이터 입력 성공");
//		cnt++;
//	}
//
//	public void printList() {
//		System.out.println("번호\t 이름\t 점수");
//		System.out.println("========================");
//
//		for (int i = 0; i < cnt; i++) {
//			System.out.println(arr[i].getBunho() + "\t " + arr[i].getIrum() + "\t " + arr[i].getJumsu());
//
//		}
//
//	}
//
//	public void searchNode(Sungjuk data) {
//		int searchindex = 0;
//
//		for (int i = 0; i < cnt; i++) {
//			if (data.getBunho() == arr[i].getBunho())
//				searchindex = i;
//		}
//		System.out.println("번호\t 이름\t 점수");
//		System.out.println("========================");
//
//		System.out.println(arr[searchindex].getBunho() + "\t " + arr[searchindex].getIrum() + "\t " + arr[searchindex].getJumsu());
//
//	}
//
//	public void deleteNode(Sungjuk data) {
//		int searchindex = 0;
//
//		for (int i = 0; i < cnt; i++) {
//			if (data.getBunho() == arr[i].getBunho())
//				searchindex = i;
//		}
//
//		for (int i = 0; i < cnt - 1; i++) {
//			arr[searchindex + i] = arr[searchindex + (i + 1)];
//
//		}
//		cnt--;
//	}
//  XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
//} // ArratList 클래스의 끝 ========================================================================

class LinkedList {
	private ListNode head;

	public LinkedList() {
		head = null;
	}

	public void insertLastNode(Sungjuk data) {
		ListNode newNode = new ListNode(data);
		Sungjuk obj = null;
		
		ListNode pre = null;

		if (head == null) { // 빈 리스트
			this.head = newNode;
			System.out.println("\n삽입 성공");
			return;
		}

		ListNode temp = head;
		while (temp != null) { // 번호 중복 데이터 체크

			obj = temp.getData(); // Sungjuk 객체 읽어와서 저장
			if (data.getBunho() == obj.getBunho()) {
				System.out.println("\n입력 오류 - 존재하는 번호임\n");
				return;
			}
			pre = temp;
			
			temp = temp.link;
		}

//		temp = head;
//		while (temp.link != null) // 새노드를 삽입하기 위해 마지막 노드로 이동
//			temp = temp.link;

//		temp.link = newNode;
		pre.link = newNode;
		System.out.println("\n삽입 성공");

	} // insertLastNode(Sungjuk data) 메소드의 끝

	public void insertNode(Sungjuk data) {
		ListNode newNode = new ListNode(data);

		if (head == null) {
			this.head = newNode;
		} else {
			ListNode temp = head;
			while (temp.link != null)
				temp = temp.link;
			temp.link = newNode;
		}
	}

	public void searchNode(Sungjuk data) { // 찾을 성적 객체 학번 입력, 같은 스트링의 객체 주소 리턴
		ListNode temp = this.head;
		Sungjuk obj = null;
		
		if (this.head == null) {
			System.out.println("리스트에 데이터가 없습니다.");
			return;
		}
		System.out.println();
		
		while (temp != null) {
			obj = temp.getData();
			
			if (data.getBunho() == obj.getBunho()) {

				System.out.println("번호\t 이름\t 점수");
				System.out.println("========================");
//				System.out.println(temp.getData().getBunho() + "\t " + temp.getData().getIrum() + "\t " + temp.getData().getJumsu());
				
				obj.printData();
				
				return;
			} else
				temp = temp.link;
		}

		System.out.printf("리스트에 해당 데이터가 없습니다. (번호 : %d) \n", data.getBunho());

	}

	//	public void insertMiddleNode(ListNode pre, Sungjuk data) {
	//		ListNode newNode = new ListNode(data);
	//
	//		newNode.link = pre.link;
	//		pre.link = newNode;
	//	}
	//
	//	public void insertLastNode(Sungjuk data) {
	//		ListNode newNode = new ListNode(data);
	//		if (head == null) {
	//			this.head = newNode;
	//		} else {
	//			ListNode temp = head;
	//			while (temp.link != null)
	//				temp = temp.link;
	//			temp.link = newNode;
	//		}
	//	}

	//	public void deleteMiddleNode(ListNode pre) {
	//		ListNode temp;
	//
	//		temp = pre.link;
	//		pre.link = temp.link;
	//
	//	}

	//
	//	public void deleteMiddleNodeAnother(String data) {
	//		ListNode pre, temp;
	//		if (head == null) // 노드가 없을 경우
	//			return;
	//		if (head.link == null) { // 노드가 하나일 경우
	//			if (head.getData() != data)
	//				return;
	//			else {
	//				head = null;
	//			}
	//		}
	//
	//		else {
	//			pre = head;
	//			temp = head.link;
	//			while (temp.getData() != data) {
	//				pre = temp;
	//				temp = temp.link;
	//			}
	//			pre.link = temp.link;
	//		}
	//	}
	//
	public void deleteNode(Sungjuk data) { // deleteMiddleNodeAnother2
		ListNode pre, temp;

		if (head == null) {// 노드가 없을 경우
			System.out.println("리스트에 데이터가 없습니다.");
			return;
		}

		if (head.link == null) { // 노드가 하나일 경우
			if (head.getData().getBunho() != data.getBunho()) {
				System.out.printf("리스트에 해당 데이터가 없습니다. (번호 : %d) \n", data.getBunho());
				return;
			} else {
				System.out.printf("데이터 삭제. (번호 : %d) \n", data.getBunho());
				head = null;
			}
		}

		else { // 노드가 두개 이상일 경우
			temp = head;
			if (temp.getData().getBunho() != data.getBunho()) { // 지울 데이터가 첫번째가 아닐경우 찾을때까지 반복
				do {
					pre = temp;
					temp = temp.link;
					if (temp == null) {
						System.out.printf("리스트에 해당 데이터가 없습니다. (번호 : %d) \n", data.getBunho());
						//break;
						return;
					}
				}

				while (temp.getData().getBunho() != data.getBunho()); //찾는게 있으면 do-while 문을 빠져나옴

				if (temp.link != null) { // 지울 데이터가 리스트의 중간에 있을경우
					System.out.printf("데이터 삭제. (번호 : %d) \n", data.getBunho());
					pre.link = temp.link;
				} else { // 지울 데이터가 리스트의 끝에 있을 경우
					System.out.printf("데이터 삭제. (번호 : %d) \n", data.getBunho());
					pre.link = null;
				}
			} // if문 끝
			else { // temp.getData().getBunho() == data.getBunho())
					//노드가 2개이상일때, 지울 데이터가 첫번째일때
				pre = temp;
				temp = temp.link;

				head = temp;
				System.out.printf("데이터 삭제. (번호 : %d) \n", data.getBunho());
			}
		} // 큰 else 문의 끝

	} // deleteNode 메소드의 끝

	//	public void deleteLastNode() {
	//		ListNode pre, temp;
	//		if (head == null)
	//			return;
	//
	//		if (head.link == null) {
	//			head = null;
	//		} else {
	//			pre = head;
	//			temp = head.link;
	//			while (temp.link != null) {
	//				pre = temp;
	//				temp = temp.link;
	//			}
	//			pre.link = null;
	//		}
	//	}

	public void reverseList() {
		ListNode next = head;
		ListNode current = null;
		ListNode pre = null;
		while (next != null) {
			pre = current;
			current = next;
			next = next.link;
			current.link = pre;

		}
		head = current;

	}

	public void printList() {
		ListNode temp = this.head;

		if (this.head == null) {
			System.out.println("리스트에 데이터가 없음");
			return;
		}

		System.out.println("번호\t 이름\t 점수");
		System.out.println("========================");

		while (temp != null) {
			Sungjuk data = temp.getData();
//			System.out.println(temp.getData().getBunho() + "\t " + temp.getData().getIrum() + "\t " + temp.getData().getJumsu());
			data.printData();
			temp = temp.link;
		}
		System.out.println("========================");
	}

} // LinkedList 클래스의 끝 ========================================================================

class ListNode { // 노드(Node)
	private Sungjuk data;
	public ListNode link;

	public ListNode() {
		this.data = null;
		this.link = null;
	}

	public ListNode(Sungjuk data) {
		this.data = data;
		this.link = null;
	}

	//	public ListNode(Sungjuk data, ListNode link) {
	//		this.data = data;
	//		this.link = link;
	//	}

	public Sungjuk getData() {
		return this.data;
	}

} // ListNode 클래스의 끝 ========================================================================

class Sungjuk {
	private int bunho; // private 지만 클래스 내부에서는 접근 가능
	private String irum;
	private int jumsu;

	public Sungjuk link;

	public int getBunho() {
		return bunho;
	}

	public void setBunho(int bunho) {
		this.bunho = bunho;
	}

	public String getIrum() {
		return irum;
	}

	public void setIrum(String irum) {
		this.irum = irum;
	}

	public int getJumsu() {
		return jumsu;
	}

	public void setJumsu(int jumsu) {
		this.jumsu = jumsu;
	}
	
	public void printData() {
		System.out.printf("%3d    %3s    %4d  ", this.bunho, this,irum, this.jumsu);
	}

} // Sungjuk 클래스의 끝 ========================================================================