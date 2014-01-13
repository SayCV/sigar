#include "sigar.h"

static sigar_version_t sigar_version = {
    "01/13/2014 11:30 обнГ",
    "exported",
    "1.7.0.0",
    "amd64-winnt",
    "sigar-amd64-winnt.dll",
    "sigar-amd64-winnt",
    "SIGAR-1.7.0.0, "
    "SCM revision exported, "
    "built 01/13/2014 11:30 обнГ as sigar-amd64-winnt.dll",
    1,
    7,
    0,
    0
};

SIGAR_DECLARE(sigar_version_t *) sigar_version_get(void)
{
    return &sigar_version;
}
