require recipes-kernel/linux/linux-mainline-common.inc

LINUX_VERSION ?= "5.5.x"
KERNEL_VERSION_SANITY_SKIP="1"

BRANCH = "linux-5.5.y"
SRCREV = "v5.5.4"
SRC_URI = " \
    git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux.git;branch=${BRANCH} \
"

SRC_URI_append_freedom-u540 = " \
    file://extra.cfg \
    file://0001-PCI-microsemi-Add-host-driver-for-Microsemi-PCIe-con.patch \
    file://0002-Microsemi-PCIe-expansion-board-DT-entry.patch \
    file://0004-SiFive-Unleashed-CPUFreq.patch \
    file://0005-GPIO-Hierarchy-IRQ-support-for-HiFive-Unleashed-v4.patch \
    file://0006-SiFive-Unleashed-GPIO-restart.patch \
    file://0007-Add-PWM-LEDs-D1-D2-D3-D4.patch \
    file://0001-Revert-riscv-defconfigs-enable-more-debugging-option.patch \
    file://riscv-add-support-to-determine-no-of-L2-cache-way-enabled.patch \
"
