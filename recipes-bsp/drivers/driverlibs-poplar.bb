DESCRIPTION = "poplar user space libs for drivers"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8860c6daecb5fe2cbc4eb4fc9d9b33f6"

SRC_URI = "file://Makefile \
           file://LICENSE \
           file://base.mak \
           file://cfg.mak \
           file://source/common/include/hi_common.h \
           file://source/common/include/hi_debug.h \
           file://source/common/include/hi_module.h \
           file://source/common/include/hi_osal.h \
           file://source/common/include/hi_type.h \
           file://source/common/drv/Makefile \
           file://source/common/api/Makefile \
           file://source/common/drv/include/drv_log_ioctl.h \
           file://source/common/drv/include/drv_sys_ioctl.h \
           file://source/common/drv/include/drv_userproc_ioctl.h \
           file://source/common/drv/include/hi_drv_log.h \
           file://source/common/drv/include/hi_drv_memdev.h \
           file://source/common/drv/include/hi_drv_stat.h \
           file://source/common/drv/include/hi_drv_struct.h \
           file://source/common/drv/include/hi_drv_sys.h \
           file://source/common/drv/include/hi_drv_userproc.h \
           file://source/common/api/include/mpi_mmz.h \
           file://source/common/api/include/mpi_memdev.h \
           file://source/common/api/include/mpi_userproc.h \
           file://source/common/api/include/hi_mpi_mem.h \
           file://source/common/api/include/hi_mpi_stat.h \
           file://source/common/api/log/mpi_log.h \
           file://source/common/api/module/mpi_module.h \
           file://source/common/api/sys/hi_common.c \
"

S = "${WORKDIR}"

do_compile() {
    oe_runmake -C source/common/api
}

###### Original ########

PV = "1.0+gitr${SRCPV}"

SRCREV="070d3abcef85da21b6afaa5881f6645a7e91e702"

SRC_URI = "git://github.com/spitzbube/hisilicon-linux.git;protocol=https;branch=poplar-msp-drivers"

S = "${WORKDIR}/git"

#do_compile() {
#    oe_runmake -C source/common/api
#    oe_runmake -C source/msp api
#}

do_install() {
    install -d ${D}${libdir}
    install -d ${D}${includedir}
    export INCLUDE_DIR="${D}${includedir}"
    export STATIC_LIB_DIR="${D}${libdir}"
    export SHARED_LIB_DIR="${D}${libdir}"
    export EXTERN_LIB_DIR="${D}${libdir}"

    # common module
    oe_runmake -C source/common/api install

#    # msp module
#    oe_runmake -C source/msp api_install
}

FILES_${PN} = "${libdir}"
FILES_${PN}-dev = "${includedir}"

