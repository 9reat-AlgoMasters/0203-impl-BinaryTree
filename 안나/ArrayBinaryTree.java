
import java.util.Arrays;

public class ArrayBinaryTree {
	public char[] tree;
	
	public void createNode(char value, char leftValue, char rightValue) {
		if(tree[1] =='\u0000') { //root 가 null 이면 새로 만드는 노드추가한다. tree[1]이 root
			tree[1] = value;
			 if(leftValue != '.') { //leftValue가 있으면 
				 tree[2] = leftValue;
			 }
			 if(rightValue != '.') { //rightValue가 있으면 
				 tree[3] = rightValue;
			 }
		}else { //root가 있다면 추가할 위치를 탐색한다.
			for (int i = 1; i < tree.length; i++) {
				if(tree[i] == value) {
					if(leftValue != '.') { //leftValue가 있으면
						if(i*2 >= tree.length) {
							char[] temp = new char[i*2+1];
							for (int j = 0; j < tree.length; j++) {
								temp[j]=tree[j];
							}
							tree= temp;
						}
						tree[i*2] = leftValue;
					 }
					 if(rightValue != '.') { //rightValue가 있으면 
						 if(i*2+1 >= tree.length) {
								char[] temp = new char[i*2+2];
								for (int j = 0; j < tree.length; j++) {
									temp[j]=tree[j];
								}
								System.out.println(tree.length);
								System.out.println(Arrays.toString(tree));
								tree= temp;
								System.out.println("늘림" + tree.length);
								System.out.println(Arrays.toString(temp));
							}
						 tree[i*2+1] = rightValue;
					 }
				}
			}
		}
		
	}

	
	
	//전위 순회  루트 - 왼쪽 - 오른쪽
	public void preOrder(int idx) {
		if(tree[idx] != '\u0000') { 
			System.out.print(tree[idx]);
			if(idx*2+1 >= tree.length ) {
				return;
			}
			preOrder(idx*2);
			preOrder(idx*2+1);
		}
	}
	//중외 순회  왼쪽 - 루트 - 오른쪽
	public void inOrder(int idx) {
		if(tree[idx] != '\u0000') { 
			if(idx*2 < tree.length ) {
				inOrder(idx*2);
			}
			System.out.print(tree[idx]);

			if(idx*2+1 < tree.length ) {
				inOrder(idx*2+1);
			}
		}
	}
	//후외 순회  왼쪽 - 오른쪽- 루트
	public void postOrder(int idx) {
		if(tree[idx] != '\u0000') { 
			if(idx*2+1 < tree.length) {
				postOrder(idx*2);
				postOrder(idx*2+1);
			}
			System.out.print(tree[idx]);
		}
	}
}

/*
 input 
 7
A B C
B D .
C E F
E . .
F . G
D . .
G . .
	A
   / \
  B   C
 /   / \
D   E   F
         \
          G
          
pre ABDCEFG
in DBAECFG
post DBEGFCA

 */

