DESCRIPTION = "poplar user space samples for drivers"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8860c6daecb5fe2cbc4eb4fc9d9b33f6"

DEPENDS = "driverlibs-poplar"

PV = "1.0+gitr${SRCPV}"

SRCREV="314271219bf012b95d54481192fcbeecd53e7d48"

SRC_URI = "git://github.com/spitzbube/hisilicon-samples.git;protocol=https;branch=test/poplar-samples"

S = "${WORKDIR}/git"

do_compile() {
	oe_runmake SAMPLE_DIR=${S}
}
	
FILES_${PN} = "${libdir}"
FILES_${PN}-dev = "${includedir}"
