# A simple test for the minimal standard C++ library
#

LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)
LOCAL_MODULE    := sigar
LOCAL_SRC_FILES := libsigar.so
LOCAL_EXPORT_C_INCLUDES := ../include
#include $(BUILD_SHARED_LIBRARY)
include $(PREBUILT_SHARED_LIBRARY)

include $(CLEAR_VARS)
LOCAL_MODULE := sigar_cpu
LOCAL_SRC_FILES := ../t_sigar_cpu.c
LOCAL_CFLAGS := -Wall -g \
	-D__android__=1 \
	-I../include
LOCAL_LDFLAGS := -Wl,-Map,sigar_cpu.map	
# for logging
LOCAL_LDLIBS    += -llog
LOCAL_SHARED_LIBRARIES := sigar
include $(BUILD_EXECUTABLE)

include $(CLEAR_VARS)
LOCAL_MODULE := sigar_mem
LOCAL_SRC_FILES := ../t_sigar_mem.c
LOCAL_CFLAGS := \
	-D__android__=1 \
	-I../include
# for logging
LOCAL_LDLIBS    += -llog
LOCAL_SHARED_LIBRARIES := sigar
include $(BUILD_EXECUTABLE)

include $(CLEAR_VARS)
LOCAL_MODULE := sigar_netconn
LOCAL_SRC_FILES := ../t_sigar_netconn.c
LOCAL_CFLAGS := \
	-D__android__=1 \
	-I../include
# for logging
LOCAL_LDLIBS    += -llog
LOCAL_SHARED_LIBRARIES := sigar
include $(BUILD_EXECUTABLE)