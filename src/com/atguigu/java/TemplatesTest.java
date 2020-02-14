package com.atguigu.java;

import com.atguigu.bean.Customer;

import java.util.ArrayList;

/**
 * @author YN
 * @create 2020-02-14-11:25
 *
 * 1、IDEA中代码模板所处的位置：settings - Editor - Live Templates / Postfix Completion
 * 2、常用的模板
 */
public class TemplatesTest {

    //模板六：prsf: 可生成 private static final私有静态常量
    private static final Customer cust = new Customer();

    //变形：psf
    public static final int NUM = 1;
    //变形：psfi
    public static final int NUM2 = 2;
    //变形：psfs
    public static final String NATION = "china";





    //模板一：psvm
    public static void main(String[] args) {

        //模板二:sout
        System.out.println("hello");
        //变形 ：soutp / soutm /soutv / xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");

        int num1 = 10;
        System.out.println("num1 = " + num1);
        int num2 = 10;
        System.out.println(num1);

        //模板三 : fori  for循环
        String[] arr = new String[]{"Tom", "Jerry", "HanMeimei", "LiLei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        //变形 ：iter 增强for循环
        for (String s : arr) {
            System.out.println(s);
        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //模板四：List.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);

        for (Object o : list) {

        }

        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {

        }

        //变形: list.forr 倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }
    }

    public void method() {
        System.out.println("TemplatesTest.method");

        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);

        //模板五 ifn
        if (list == null) {

        }

        //变形：inn
        if (list != null) {

        }

        //变形：xxx.nn /xxx.null
        if (list == null) {

        }

        if (list != null) {

        }

    }

}