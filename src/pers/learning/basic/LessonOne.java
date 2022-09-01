package pers.learning.basic;

/**
 * @https://www.liaoxuefeng.com/wiki/1252599548343744/1255883729079552
 * 基础课程 第一课 变量和数据类型
 */

public class LessonOne {
    public static void main(String[] args) {
        // 变量复制
        int x = 1;
        System.out.println("demo result: " + x);

        x = 2;
        System.out.println("demo result: " + x);

        // 基本数据类型 int long
        System.out.println();
        System.out.println("print int & long");
        int i = 2147483647;
        int i2 = -2147483648;
        int i3 = 2_000_000_000;
        int i4 = 0xff0000;
        int i5 = 0b1000000000;
        long i6 = 9000000000000000000L;
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);
        System.out.println(i6);

        // 基本数据类型 float double
        System.out.println();
        System.out.println("print flout & double");
        float f1 = 3.14f;
        float f2 = 3.14e38f; // 科学计数法表示的3.14x10^38
        double d = 1.79e308;
        double d2 = -1.79e308;
        double d3 = 4.9e-324;
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(d);
        System.out.println(d2);
        System.out.println(d3);

        // 基本数据类型 字符
        System.out.println();
        char a = 'A';
        char b = '中';
        System.out.println(a);
        System.out.println(b);

        // 引用类型
        System.out.println();
        String s = "hello";

        // 常量

    }
}
