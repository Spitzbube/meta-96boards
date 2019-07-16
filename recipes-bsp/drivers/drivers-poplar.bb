DESCRIPTION = "drivers-poplar module"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

inherit module

PV = "1.0+gitr${SRCPV}"

SRCREV="96bebace78bc87ddfced940e7fdaa28ce59f9b2a"

SRC_URI = "git://github.com/spitzbube/hisilicon-linux.git;protocol=https;branch=poplar-msp-drivers"

S = "${WORKDIR}/git"

# Kernel module packages MUST begin with 'kernel-module-', otherwise
# multilib image generation can fail.
#
# The following line is only necessary if the recipe name does not begin
# with kernel-module-.
#
PKG_${PN} = "kernel-module-${PN}"

