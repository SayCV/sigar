LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)
LOCAL_MODULE := android_sigar_os
LOCAL_SRC_FILES := \
	../os/android/android.c \
	../os/android/linux_sigar.c
LOCAL_CFLAGS := \
	-D__android__=1 \
	-I../include
LOCAL_EXPORT_C_INCLUDES := $(LOCAL_PATH)/android_sigar_os
LOCAL_EXPORT_CFLAGS := \
	-D__android__=1
LOCAL_EXPORT_LDLIBS := -llog
include $(BUILD_STATIC_LIBRARY)

include $(CLEAR_VARS)
LOCAL_MODULE := sigar
LOCAL_SRC_FILES := \
	../sigar.c \
	../sigar_cache.c \
	../sigar_fileinfo.c \
	../sigar_format.c \
	../sigar_getline.c \
	../sigar_ptql.c \
	../sigar_signal.c \
	../sigar_util.c \
	../sigar_version_autoconf.c
LOCAL_CFLAGS := \
	-D__android__=1 \
	-I../include \
	-Ios/android
LOCAL_LDLIBS    += -lc
LOCAL_EXPORT_C_INCLUDES := $(LOCAL_PATH)/sigar
LOCAL_STATIC_LIBRARIES := android_sigar_os
include $(BUILD_SHARED_LIBRARY)


