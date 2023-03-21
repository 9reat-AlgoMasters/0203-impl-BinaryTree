package impl_tree_0203;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("원하는 방식을 선택하세요>>" );
        StringBuilder sb = new StringBuilder();
        sb.append("1. 배열\n");
        sb.append("2. 링크드리스트\n");

        sb.append("3. 종료\n");

        System.out.println(sb.toString());

        int select = Integer.parseInt(br.readLine());

        if (select == 3) {
            System.exit(0);
        }

        ArrBinaryTree binaryTree = new ArrBinaryTree();
//        LinkedListBinaryTree binaryTree = new LinkedListBinaryTree();

        binaryTree.appendChild(1, 2, true);
        binaryTree.appendChild(1, 3, false);

        binaryTree.appendChild(2, 4 , true);
        binaryTree.appendChild(2, 5, false);

        binaryTree.appendChild(3, 6, true);
        binaryTree.appendChild(3, 7, false);

        binaryTree.appendChild(4, 8, true);
        binaryTree.appendChild(4, 9, false);

        binaryTree.appendChild(5, 10, true);

        binaryTree.appendChild(6, 11, false);


        switch (select) {
            case 1:
                System.out.println("*************배열 방식*************");

                System.out.println("preorder 방식");
                binaryTree.preOrder();
                System.out.println();

                System.out.println("inorder 방식");
                binaryTree.inOrder();
                System.out.println();
                
                System.out.println("postorder 방식");
                binaryTree.postOrder();
                System.out.println();
                break;
            case 2:
                System.out.println("*************링크드리스트 방식*************");

                System.out.println("preorder 방식");
                binaryTree.preOrder();
                System.out.println();

                System.out.println("inorder 방식");
                binaryTree.inOrder();
                System.out.println();

                System.out.println("postorder 방식");
                binaryTree.postOrder();
                System.out.println();
                break;
        }
    }
}
