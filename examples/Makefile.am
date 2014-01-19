LINK = $(LIBTOOL) --mode=link $(CC) $(CFLAGS) $(LDFLAGS) -o $@

INCLUDES = @INCLUDES@

noinst_PROGRAMS =
cpuinfo_LDADD =
sigar_ps_LDADD =

if OS_ANDROID
extra_OS_ANDROID_LIBS = -lc $(top_builddir)/src/os/android/libsigar_os.la
noinst_PROGRAMS += android_ndk_link_hacking
cpuinfo_LDADD += $(extra_OS_ANDROID_LIBS)
sigar_ps_LDADD += $(extra_OS_ANDROID_LIBS)
android_ndk_link_hacking:
	cd $(top_builddir)/src/.libs && cp -rf libsigar.so.0.0.0 libsigar.so
#	cd $(top_builddir)/src/os/android && cp -rf libsigar_os.so.0.0.0 libsigar_os.so
endif
noinst_PROGRAMS += cpuinfo sigar_ps

cpuinfo_SOURCES = cpuinfo.c
cpuinfo_LDADD += $(top_builddir)/src/libsigar.la

sigar_ps_SOURCES = sigar_ps.c
sigar_ps_LDADD += $(top_builddir)/src/libsigar.la
