# A simple test for the minimal standard C++ library
#

LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)
LOCAL_MODULE    := sigar
LOCAL_SRC_FILES := ../../src/libs/libsigar.so
include $(BUILD_SHARED_LIBRARY)

include $(CLEAR_VARS)
LOCAL_MODULE := cpuinfo
LOCAL_SRC_FILES := ../cpuinfo.c
LOCAL_CFLAGS := \
	-D__android__=1 \
	-I../include
LOCAL_SHARED_LIBRARIES := sigar
include $(BUILD_EXECUTABLE)

include $(CLEAR_VARS)
LOCAL_MODULE := sigar_ps
LOCAL_SRC_FILES := ../sigar_ps.c
LOCAL_CFLAGS := \
	-D__android__=1 \
	-I../include
LOCAL_SHARED_LIBRARIES := sigar
include $(BUILD_EXECUTABLE)
