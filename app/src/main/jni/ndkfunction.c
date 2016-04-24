#include "pl_edu_wat_student_myndkproject_MainActivity.h"
/*
 * Class:     pl_edu_wat_student_myndkproject_MainActivity
 * Method:    addTwoNumbers
 * Signature: (II)I
 */
JNIEXPORT jint JNICALL Java_pl_edu_wat_student_myndkproject_MainActivity_addTwoNumbers
  (JNIEnv* env, jobject obj, jint a, jint b){

    int result = (a + b);

    return result;
}

