package com.jd.ascpect;

/**
 * @author xuzhangwang
 * @date 2019/11/14 21:26
 */
public class Test {

    public static void main(String[] args) {
        String name = "Cs";
        StringBuilder sb = new StringBuilder(name);
        name = sb.substring(0, 1).toUpperCase() + sb.substring(1);
        System.out.println(name);
    }
}
