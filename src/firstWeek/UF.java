package firstWeek;

import java.util.ArrayList;

public class UF {

    int[] unionArray;

    public UF(int n)
    {
        unionArray = new int[n];
        System.out.println(unionArray.length);
    }

    public void union(int p, int q)
    {
        unionArray[p] = q;
    }

    public boolean connected(int p, int q)
    {
        boolean flag = false;
        // 연결확인
        //8-3-4-9
        //8 부터 생각
        while(p != 0)
        {
            int nextNode = unionArray[p];
            if (nextNode == q) {
                flag = true;
                break;
            }
            p = nextNode;
        }

        return flag;
    }

    public int find(int p)
    {
        return 0;
    }

    public int count()
    {
        return 0;
    }
}
