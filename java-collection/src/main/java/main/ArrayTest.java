package main;

/**
 * @author Jerry
 * @create 2022-11-25-23:56
 */
public class ArrayTest {
    public static void main(String[] args) {
//        一维数组的声明和初始化
        int num;
//        初始化
        num = 10;
//        声明+初始化
        int id = 10;

        int[] ids;
//        静态初始化 数组初始化和数组元素赋值同时操作
        ids = new int[]{1, 2, 3, 4, 5};
//        动态初始化 初始化和元素赋值分开操作
        int[] number = new int[5];

//        类型推断写法
        int[] arr1 = {1, 2, 3, 4, 5};
//        数组一旦初始化完成,长度也就确定了.

//        通过角标调用数组指定位置元素
        arr1[0] = 3;

//        获取数组长度
        System.out.println(arr1.length);

//        遍历数组
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        /*
         * ⑤ 数组元素的默认初始化值
         * 		> 数组元素是整形：0
         * 		> 数组元素是浮点型：0.0
         * 		> 数组元素是char型：0或'\u0000'，而非'0'
         * 		> 数组元素是boolean型:false
         *
         * 		> 数组元素是引用数据类型：null
         */

    }
}
