DESCRIPTION = "poplar user space libs for drivers"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8860c6daecb5fe2cbc4eb4fc9d9b33f6"

PV = "1.0+gitr${SRCPV}"

SRCREV="2742d30f3ff97871e658db80a90fd418fdc036f9"

SRC_URI = "git://github.com/spitzbube/hisilicon-linux.git;protocol=https;branch=poplar-msp-drivers"
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
    
    # components
    oe_runmake -C source/component install

    # common module
    oe_runmake -C source/common/api install

    # msp module
    oe_runmake -C source/msp api_install
    
    oe_runmake -C source/msp/api/higo all
}

FILES_${PN} = "${libdir}"
FILES_${PN}-dev = "${includedir}"

