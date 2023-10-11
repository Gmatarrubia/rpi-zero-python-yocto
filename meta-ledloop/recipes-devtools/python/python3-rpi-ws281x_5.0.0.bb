DESCRIPTION = "A module to control "
HOMEPAGE = "https://github.com/rpi-ws281x/rpi-ws281x-python/"
SECTION = "devel/python"
LICENSE = "closed"
LIC_FILES_CHKSUM = "file://LICENSE;md5=06d9cc0de5275c6ec26cc02bd7b82b5a"

PYPI_PACKAGE = "rpi-ws281x"

S = "${WORKDIR}/git"
inherit setuptools3
SETUPTOOLS_SETUP_PATH = "${S}/library"

SRC_URI = "gitsm://github.com/rpi-ws281x/rpi-ws281x-python.git;protocol=https"
SRCREV = "b45a8731459066c70ad3e8e71e627c3e74786311"

COMPATIBLE_MACHINE = "^rpi$"
CFLAGS += "-fcommon"