INCLUDES = @INCLUDES@

SIGAR_OS_SRCS = linux_sigar.c android.c

SIGAR_OS_HDRS = sigar_os.h

if OS_ANDROID
noinst_LTLIBRARIES = libsigar_os.la

libsigar_os_la_SOURCES = ${SIGAR_OS_SRCS}

noinst_HEADERS = ${SIGAR_OS_HDRS}
else
EXTRA_DIST=\
	${SIGAR_OS_SRCS} \
	${SIGAR_OS_HDRS}
endif

