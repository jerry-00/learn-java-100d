package main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Jerry
 * @create 2022-11-24-23:52
 */
public class ArrayListTest {
    public static void main(String[] args) {
        System.out.println("hello world!");
        List<String> list = new ArrayList();
        list.add("aa");
        list.add("bb");
        list.add("cc");

        LinkedList<Object> linkedList = new LinkedList<>();
        //移除角标元素
        list.remove(2);
        //对应角标修改元素
        list.set(1, "kk");

        //遍历角标输出元素
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //iter按tab 快捷键
        for (String s : list) {
            System.out.println(s);
        }

        int m = 12;
        int n = 10;
        //三元运算 m>n成立为true 则输出m 否则是n
        int max = (m > n) ? m : n;
        System.out.println(max);

    }
}
