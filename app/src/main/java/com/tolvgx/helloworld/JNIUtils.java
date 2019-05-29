package com.tolvgx.helloworld;

/**
 * <pre>
 *     author: Tolvgx
 *     date  : 2019/5/29
 *     email : tolvgx@163.com
 *     github: https://github.com/tolvgx
 * </pre>
 */
public class JNIUtils {
    /*
        1.定义一个c方法的接口:
        相当于在java代码中定义了一个接口, 接口的实现方法是C语言实现的
     */
    public static native String helloFromC();

    /*
        2.生成头文件:
        首先Rebuild Project(自动生成class文件, 也可通过javac手动生成),
        然后"cd app/src/main/java",
        最后"javah -d ../jni com.tolvgx.helloworld.JNIUtils"将class文件转换为h文件
      */

    /*
        7.引入库函数 加载动态链接库
     */
    static{
        System.loadLibrary("hello");//此处注意, 默认只
    }
}
