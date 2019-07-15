DESCRIPTION = "poplar user space libs for drivers"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8860c6daecb5fe2cbc4eb4fc9d9b33f6"

PV = "1.0+gitr${SRCPV}"

SRCREV="e99b142b4a77326f1114990bb00586768a14dacb"

SRC_URI = "git://github.com/spitzbube/hisilicon-linux.git;protocol=https;branch=poplar-msp-drivers"
SRC_URI += "file://git/base.mak \
            file://git/source/msp/drv/include/drv_hdmi_ioctl.h \
            file://git/source/msp/Makefile \
            file://git/source/msp/api/Makefile \
            file://git/source/msp/api/include/hi_mpi_hdmi.h \
            file://git/source/msp/api/hdmi/hdmi_2_0/list.h \
            file://git/source/msp/api/hdmi/hdmi_2_0/mpi_hdmi.c \
            file://git/source/msp/api/hdmi/hdmi_2_0/unf_hdmi.c \
           "

S = "${WORKDIR}/git"

do_compile() {
    oe_runmake -C source/common/api
    oe_runmake -C source/msp api
}

do_install() {
    install -d ${D}${libdir}
    install -d ${D}${includedir}
    export INCLUDE_DIR="${D}${includedir}"
    export STATIC_LIB_DIR="${D}${libdir}"
    export SHARED_LIB_DIR="${D}${libdir}"
    export EXTERN_LIB_DIR="${D}${libdir}"

    # common module
    oe_runmake -C source/common/api install

    # msp module
    oe_runmake -C source/msp api_install
}

FILES_${PN} = "${libdir}"
FILES_${PN}-dev = "${includedir}"

