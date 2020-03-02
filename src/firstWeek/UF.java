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

    public void union(int p, int q)
    {
        // 근데 누구의 값을 덮어씔 건지 결정, 첫번째 인자에 두번째 인자껄 덮어씌움
        // 문제점 1. 첫번째 인자에 들어있는 값에 두번째 인자에 넣는 과정 필요
        int pid = unionArray[p];
        int qid = unionArray[q];

        // 연결되어있는 모든것에 두번째 인자 삽입
        for(int i = 0; i < unionArray.length; i++)
        {
            if(unionArray[i] == pid) unionArray[i] = qid;
        }

    }

    public boolean connected(int p, int q)
    {
        // 같으면 true 대신 초기화가 됐다는 가정하에
        return unionArray[p] == unionArray[q];
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
