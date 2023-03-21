import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TreeTest {
	static int N;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		
		ArrayBinaryTree abt = new ArrayBinaryTree();
		LinkedListBinaryTree llbt = new LinkedListBinaryTree();
		abt.tree = new char[N*2+2];
		
		for (int i = 1; i < N+1; i++) {
			String str = br.readLine();
			char value = str.charAt(0);
			char leftValue = str.charAt(2);
			char rightValue = str.charAt(4);
		
			abt.createNode(value,leftValue, rightValue);
			llbt.createNode(value,leftValue, rightValue);
		}
		System.out.print("\n\n============Array로 구현한 트리 순회============");
		
		System.out.print("\n전위 : ");
		abt.preOrder(1);
		System.out.print("\n중위 : ");
		abt.inOrder(1);
		System.out.print("\n후위 : ");
		abt.postOrder(1);
		System.out.println("\n");
		
		
		
		System.out.print("===========LinkedList로 구현한 트리 순회===========");		
		System.out.print("\n전위 : ");
		llbt.preOrder(llbt.root);
		System.out.print("\n중위 : ");
		llbt.inOrder(llbt.root);
		System.out.print("\n후위 : ");
		llbt.postOrder(llbt.root);
		System.out.println();
	}

}
