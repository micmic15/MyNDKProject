LOCAL_PATH := $(call my-dir)

   include $(CLEAR_VARS)

   LOCAL_MODULE    := nativefunction
   LOCAL_SRC_FILES := ndkfunction.c

   include $(BUILD_SHARED_LIBRARY)