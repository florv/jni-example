#include <jni.h>
#include <stdio.h>
#include "JNIExample.h"
#include "hello.h"

JNIEXPORT void JNICALL Java_JNIExample_hello (JNIEnv *env, jobject this, jint id) {
	hello(id);
}
