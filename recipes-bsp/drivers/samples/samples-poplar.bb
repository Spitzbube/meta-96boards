DESCRIPTION = "poplar user space samples for drivers"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8860c6daecb5fe2cbc4eb4fc9d9b33f6"

DEPENDS = "driverlibs-poplar"

SRC_URI = "file://Makefile \
           file://LICENSE \
           file://base.mak \
           file://hi_sample_rules.mak \
           file://common/hi_adp.h \
           file://log/Makefile \
           file://log/sample_log.c \
           file://log/sample_module.c \
           file://memdev/Makefile \
           file://memdev/sample_memdev.c \
           file://userproc/Makefile \
           file://userproc/sample_userproc.c \
"

S = "${WORKDIR}"

do_compile() {
	oe_runmake SAMPLE_DIR=${S}
}
	
FILES_${PN} = "${libdir}"
FILES_${PN}-dev = "${includedir}"
