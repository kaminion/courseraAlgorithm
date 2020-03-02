package firstWeek;

import java.util.ArrayList;
import java.util.Arrays;

public class UF {

    // 집합에 엮어서 생각
    // 동치, 서로 연결되어있다.
    private int[] unionArray;

    public UF(int n)
    {
        unionArray = new int[n];

        // 자기 인덱스로 초기화
        for(int i=0;i<unionArray.length;i++) {
            unionArray[i] = i;
        }

    }

    // 루트 찾는 메서드
    private int root(int i)
    {
        while( i != unionArray[i] ) i = unionArray[i]; // 값을 계속 추적해나가 루트를 구함.
        return i;
    }

    public void union(int p, int q)
    {
        // 근데 누구의 값을 덮어씔 건지 결정, 첫번째 인자에 두번째 인자껄 덮어씌움
        // 문제점 1. 첫번째 인자에 들어있는 값에 두번째 인자에 넣는 과정 필요
//        int pid = unionArray[p];
//        int qid = unionArray[q];
//
//        // 연결되어있는 모든것에 두번째 인자 삽입
//        for(int i = 0; i < unionArray.length; i++)
//        {
//            if(unionArray[i] == pid) unionArray[i] = qid;
//        }

        //QUICK UNION으로 변경
        int i = root(p); // 한번에 바꾸어야하므로 이 트리 전체를 q로 받은 것에 붙인다.
        int j = root(q); // 루트로 구분하므로 q의 루트를 구해서 붙인다.
        unionArray[i] = j;

    }

    public boolean connected(int p, int q)
    {
        // 루트를 비교하면 됨
        return root(p) == root(q);
    }

    public int find(int p)
    {
        return unionArray[p];
    }

    public int count()
    {
        return unionArray.length;
    }

    public void show()
    {
        System.out.println(Arrays.toString(unionArray));
    }
}
