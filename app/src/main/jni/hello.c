#include <stdio.h>
#include <stdlib.h>
//#include <jni.h>
#include "com_tolvgx_helloworld_JNIUtils.h" //此处也可直接引入#include <jni.h>

//3.实现c代码
JNIEXPORT jstring JNICALL Java_com_tolvgx_helloworld_JNIUtils_helloFromC
  (JNIEnv * env, jclass jclass ){

	// agr0:JNINativeInterface这个结构体的二级
	// arg1:JNIUtils的对象
	// return 一个java String 类型的字符串
	// jstring   (*NewStringUTF)(JNIEnv*, const char*);
	// (*env) 相当于 JNINativeInterface* JNIEnv
	// *(*env)  相当于 JNINativeInterface
	// return (**env).NewStringUTF(JNIEnv*, const char*);

	//JNIEnv是一级指针, env是二级指针.

	// c字符串转java字符串并返回
	return  (*env)->NewStringUTF(env,"helloworldfromc");

	// 4.生成.mk文件
	// andrond.mk 告诉编译器, 如何把c代码打包成函数库

	// 5.指定哪种abi体系结构下的so库
	// Application.mk

}
