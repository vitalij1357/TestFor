package ArreyList;

import java.util.List;

public class myArreyListTest {
    public static void main(String[] args) {
     myArreyList List = new myArreyList();
        for (int i = 0; i < 10; i++) {
            List.add(i);
        }
        System.out.println(List.get(0));
        System.out.println(List.size());
        System.out.println(List);
        List.remove(2);
        System.out.println(List);
        List.clear();
        System.out.println(List);


    }
}
