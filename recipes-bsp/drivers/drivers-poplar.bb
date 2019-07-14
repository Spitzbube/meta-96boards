DESCRIPTION = "drivers-poplar module"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

inherit module

SRC_URI = "file://Makefile \
           file://COPYING \
           file://base.mak \
           file://cfg.mak \
           file://source/common/include/hi_common.h \
           file://source/common/include/hi_debug.h \
           file://source/common/include/hi_module.h \
           file://source/common/include/hi_osal.h \
           file://source/common/include/hi_type.h \
           file://source/common/drv/Makefile \
           file://source/common/drv/include/hi3798cv200/hi_reg_crg.h \
           file://source/common/drv/include/hi3798cv200/hi_reg_io.h \
           file://source/common/drv/include/hi3798cv200/hi_reg_peri.h \
           file://source/common/drv/include/hi3798cv200/hi_reg_sys.h \
           file://source/common/drv/include/hi3798cv200/hi_reg_vdp.h \
           file://source/common/drv/include/hi3798cv200/hi_reg_vpss.h \
           file://source/common/drv/include/hi3798cv200/hi_reg_vpss_wbc.h \
           file://source/common/drv/include/drv_log_ioctl.h \
           file://source/common/drv/include/drv_mmz_ioctl.h \
           file://source/common/drv/include/drv_module_ioctl.h \
           file://source/common/drv/include/drv_stat_ioctl.h \
           file://source/common/drv/include/drv_sys_ioctl.h \
           file://source/common/drv/include/drv_userproc_ioctl.h \
           file://source/common/drv/include/hi_drv_dev.h \
           file://source/common/drv/include/hi_drv_file.h \
           file://source/common/drv/include/hi_drv_log.h \
           file://source/common/drv/include/hi_drv_mem.h \
           file://source/common/drv/include/hi_drv_memdev.h \
           file://source/common/drv/include/hi_drv_mmz.h \
           file://source/common/drv/include/hi_drv_module.h \
           file://source/common/drv/include/hi_drv_proc.h \
           file://source/common/drv/include/hi_drv_reg.h \
           file://source/common/drv/include/hi_drv_stat.h \
           file://source/common/drv/include/hi_drv_struct.h \
           file://source/common/drv/include/hi_drv_sys.h \
           file://source/common/drv/include/hi_drv_userproc.h \
           file://source/common/drv/include/hi_kernel_adapt.h \
           file://source/common/drv/include/hi_reg_common.h \
           file://source/common/drv/dev/drv_dev_ext_k.c \
           file://source/common/drv/file/drv_file_ext.c \
           file://source/common/drv/himedia/himedia_base.c \
           file://source/common/drv/himedia/himedia_base.h \
           file://source/common/drv/himedia/himedia.c \
           file://source/common/drv/log/drv_log.h \
           file://source/common/drv/log/drv_log_ext_k.c \
           file://source/common/drv/log/drv_log_ext.c \
           file://source/common/drv/mem/drv_mmgr.h \
           file://source/common/drv/mem/drv_mutils.c \
           file://source/common/drv/mem/drv_mutils.h \
           file://source/common/drv/memdev/drv_memdev.c \
           file://source/common/drv/mmz/drv_media_mem.h \
           file://source/common/drv/mmz/drv_media_mem.c \
           file://source/common/drv/mmz/drv_mmz.h \
           file://source/common/drv/mmz/drv_mmz_compat.c \
           file://source/common/drv/mmz/drv_mmz_compat.h \
           file://source/common/drv/mmz/drv_mmz_ext_k.c \
           file://source/common/drv/mmz/drv_mmz_intf.c \
           file://source/common/drv/mmz/drv_mmz_userdev.c \
           file://source/common/drv/mmz/drv_tee_smmu_agent.h \
           file://source/common/drv/mmz/drv_tzsmmu.c \
           file://source/common/drv/mmz/drv_tzsmmu.h \
           file://source/common/drv/module/drv_module_ext.c \
           file://source/common/drv/osal/drv_osal.c \
           file://source/common/drv/proc/drv_proc_ext_k.c \
           file://source/common/drv/proc/drv_proc_ext.c \
           file://source/common/drv/stat/drv_stat_ext_k.c \
           file://source/common/drv/stat/drv_stat_ext.c \
           file://source/common/drv/sys/drv_base_ext_k.h \
           file://source/common/drv/sys/drv_base_ext_k.c \
           file://source/common/drv/sys/drv_base_ext.c \
           file://source/common/drv/sys/drv_reg_common.c \ 
           file://source/common/drv/sys/drv_sys_ext_k.c \
           file://source/common/drv/sys/drv_sys_ext.c \
           file://source/common/drv/userproc/drv_userproc.c \
           file://source/msp/include/hi_audio_codec.h \
           file://source/msp/include/hi_unf_common.h \
           file://source/msp/include/hi_unf_audio.h \
           file://source/msp/include/hi_unf_avplay.h \
           file://source/msp/include/hi_unf_cipher.h \
           file://source/msp/include/hi_unf_disp.h \
           file://source/msp/include/hi_unf_edid.h \
           file://source/msp/include/hi_unf_frontend.h \
           file://source/msp/include/hi_unf_hdcp.h \
           file://source/msp/include/hi_unf_hdmi.h \
           file://source/msp/include/hi_unf_i2c.h \
           file://source/msp/include/hi_unf_mce.h \
           file://source/msp/include/hi_unf_pdm.h \
           file://source/msp/include/hi_unf_sound.h \
           file://source/msp/include/hi_unf_video.h \
           file://source/msp/include/hi_unf_vo.h \
           file://source/msp/include/hi_error_mpi.h \
           file://source/msp/api/higo/include/hi_go_comm.h \
           file://source/msp/api/higo/include/hi_go_errno.h \
           file://source/msp/api/higo/include/hi_go_surface.h \
           file://source/msp/drv/Makefile \
           file://source/msp/drv/include/drv_cipher_ext.h \
           file://source/msp/drv/include/drv_cipher_ioctl.h \
           file://source/msp/drv/include/drv_disp_ext.h \
           file://source/msp/drv/include/drv_hdmi_ext.h \
           file://source/msp/drv/include/drv_hdmi_ioctl.h \
           file://source/msp/drv/include/drv_pdm_ext.h \
           file://source/msp/drv/include/drv_pq_define.h \
           file://source/msp/drv/include/hi_drv_cipher.h \
           file://source/msp/drv/include/hi_drv_disp.h \
           file://source/msp/drv/include/hi_drv_edid.h \
           file://source/msp/drv/include/hi_drv_hdmi.h \
           file://source/msp/drv/include/hi_drv_pdm.h \
           file://source/msp/drv/include/hi_drv_video.h \
           file://source/msp/drv/hdmi/Makefile \
           file://source/msp/drv/hdmi/hdmi_2_0/hal/ctrl/imagev200/driver/common/si_drv_common.c \
           file://source/msp/drv/hdmi/hdmi_2_0/hal/ctrl/imagev200/driver/common/si_drv_common.h \
           file://source/msp/drv/hdmi/hdmi_2_0/hal/ctrl/imagev200/driver/tpg/si_drv_tpg_api.h \
           file://source/msp/drv/hdmi/hdmi_2_0/hal/ctrl/imagev200/driver/vtg/si_drv_vtg_api.h \
           file://source/msp/drv/hdmi/hdmi_2_0/hal/ctrl/imagev200/driver/pll/si_drv_pll_vo_api.h \
           file://source/msp/drv/hdmi/hdmi_2_0/hal/ctrl/imagev200/driver/cpi/si_drv_cpi.c \
           file://source/msp/drv/hdmi/hdmi_2_0/hal/ctrl/imagev200/driver/cpi/si_drv_cpi_api.h \
           file://source/msp/drv/hdmi/hdmi_2_0/hal/ctrl/imagev200/driver/cpi/si_drv_cpi_internal.h \
           file://source/msp/drv/hdmi/hdmi_2_0/hal/ctrl/imagev200/driver/tx/si_drv_tx.c \
           file://source/msp/drv/hdmi/hdmi_2_0/hal/ctrl/imagev200/driver/tx/si_drv_tx_api.h \
           file://source/msp/drv/hdmi/hdmi_2_0/hal/ctrl/imagev200/driver/tx/tx_hdmi/si_mod_tx_hdmi.c \
           file://source/msp/drv/hdmi/hdmi_2_0/hal/ctrl/imagev200/driver/tx/tx_hdmi/si_mod_tx_hdmi_api.h \
           file://source/msp/drv/hdmi/hdmi_2_0/hal/ctrl/imagev200/driver/tx/scdc/si_mod_tx_scdc.c \
           file://source/msp/drv/hdmi/hdmi_2_0/hal/ctrl/imagev200/driver/tx/scdc/si_mod_tx_scdc_api.h \
           file://source/msp/drv/hdmi/hdmi_2_0/hal/ctrl/imagev200/driver/tx/videopath/si_mod_videopath.c   \
           file://source/msp/drv/hdmi/hdmi_2_0/hal/ctrl/imagev200/driver/tx/videopath/si_mod_videopath_cra.c \
           file://source/msp/drv/hdmi/hdmi_2_0/hal/ctrl/imagev200/driver/tx/videopath/si_mod_videopath_api.h \
           file://source/msp/drv/hdmi/hdmi_2_0/hal/ctrl/imagev200/driver/tx/videopath/si_vidpath_regs.h \
           file://source/msp/drv/hdmi/hdmi_2_0/hal/ctrl/imagev200/driver/tx/hdcp/si_mod_tx_hdcp.c   \
           file://source/msp/drv/hdmi/hdmi_2_0/hal/ctrl/imagev200/driver/tx/hdcp/si_mod_tx_hdcp_api.h \
           file://source/msp/drv/hdmi/hdmi_2_0/hal/ctrl/imagev200/driver/tx/si_drv_tx_api.h \
           file://source/msp/drv/hdmi/hdmi_2_0/hal/ctrl/imagev200/driver/cra/si_drv_cra.c  \
           file://source/msp/drv/hdmi/hdmi_2_0/hal/ctrl/imagev200/driver/cra/si_drv_cra_api.h \
           file://source/msp/drv/hdmi/hdmi_2_0/hal/ctrl/imagev200/driver/cra/si_drv_cra_cfg.h \
           file://source/msp/drv/hdmi/hdmi_2_0/hal/ctrl/imagev200/driver/si_drv_tx_regs.h \
           file://source/msp/drv/hdmi/hdmi_2_0/hal/ctrl/imagev200/driver/si_drv_tx_regs_enums.h \
           file://source/msp/drv/hdmi/hdmi_2_0/hal/ctrl/imagev200/library/log/si_lib_log.c \
           file://source/msp/drv/hdmi/hdmi_2_0/hal/ctrl/imagev200/library/malloc/si_lib_malloc.c \
           file://source/msp/drv/hdmi/hdmi_2_0/hal/ctrl/imagev200/library/malloc/si_lib_malloc_api.h \
           file://source/msp/drv/hdmi/hdmi_2_0/hal/ctrl/imagev200/library/obj/si_lib_obj.c \
           file://source/msp/drv/hdmi/hdmi_2_0/hal/ctrl/imagev200/library/obj/si_lib_obj_api.h \
           file://source/msp/drv/hdmi/hdmi_2_0/hal/ctrl/imagev200/library/log/si_lib_log_api.h \
           file://source/msp/drv/hdmi/hdmi_2_0/hal/ctrl/imagev200/library/seq/si_lib_seq.c \
           file://source/msp/drv/hdmi/hdmi_2_0/hal/ctrl/imagev200/library/seq/si_lib_seq_api.h \
           file://source/msp/drv/hdmi/hdmi_2_0/hal/ctrl/imagev200/library/time/si_lib_time.c \
           file://source/msp/drv/hdmi/hdmi_2_0/hal/ctrl/imagev200/library/time/si_lib_time_api.h \
           file://source/msp/drv/hdmi/hdmi_2_0/hal/ctrl/imagev200/library/video/si_lib_video_api.h \
           file://source/msp/drv/hdmi/hdmi_2_0/hal/ctrl/imagev200/platform/platform.c \
           file://source/msp/drv/hdmi/hdmi_2_0/hal/ctrl/imagev200/platform/platform_api.h \
           file://source/msp/drv/hdmi/hdmi_2_0/hal/ctrl/imagev200/platform/sii_time.c \
           file://source/msp/drv/hdmi/hdmi_2_0/hal/ctrl/imagev200/platform/sii_time.h \
           file://source/msp/drv/hdmi/hdmi_2_0/hal/ctrl/imagev200/platform/si_datatypes.h \
           file://source/msp/drv/hdmi/hdmi_2_0/hal/ctrl/imagev200/hdmi_hal.c \
           file://source/msp/drv/hdmi/hdmi_2_0/hal/ctrl/imagev200/hal_cec.c \
           file://source/msp/drv/hdmi/hdmi_2_0/hal/ctrl/imagev200/hal_cec.h \
           file://source/msp/drv/hdmi/hdmi_2_0/hal/ctrl/imagev200/c8051_hdcp22_program.bin \
           file://source/msp/drv/hdmi/hdmi_2_0/hal/emi/hdmi_emi.c \
           file://source/msp/drv/hdmi/hdmi_2_0/hal/emi/hdmi_emi.h \
           file://source/msp/drv/hdmi/hdmi_2_0/hal/hdmi_hal.h \
           file://source/msp/drv/hdmi/hdmi_2_0/product/Hi3798CV200/hdmi_product_define.c \
           file://source/msp/drv/hdmi/hdmi_2_0/product/Hi3798CV200/hdmi_product_define.h \
           file://source/msp/drv/hdmi/hdmi_2_0/product/Hi3798CV200/hdmi_platform.h \
           file://source/msp/drv/hdmi/hdmi_2_0/osal/hisiv200/hdmi_osal.c \
           file://source/msp/drv/hdmi/hdmi_2_0/osal/hisiv200/hdmi_osal.h \
           file://source/msp/drv/hdmi/hdmi_2_0/drv_hdmi_infoframe.c \
           file://source/msp/drv/hdmi/hdmi_2_0/drv_hdmi_infoframe.h \
           file://source/msp/drv/hdmi/hdmi_2_0/drv_hdmi_event.c \
           file://source/msp/drv/hdmi/hdmi_2_0/drv_hdmi_event.h \
           file://source/msp/drv/hdmi/hdmi_2_0/drv_hdmi_edid.c \
           file://source/msp/drv/hdmi/hdmi_2_0/drv_hdmi_edid.h \
           file://source/msp/drv/hdmi/hdmi_2_0/drv_hdmi_edid_test.c \
           file://source/msp/drv/hdmi/hdmi_2_0/drv_hdmi_edid_test.h \
           file://source/msp/drv/hdmi/hdmi_2_0/drv_hdmi_intf.c \
           file://source/msp/drv/hdmi/hdmi_2_0/drv_hdmi_intf.h \
           file://source/msp/drv/hdmi/hdmi_2_0/drv_hdmi_intf_k.c \
           file://source/msp/drv/hdmi/hdmi_2_0/drv_hdmi_common.c \
           file://source/msp/drv/hdmi/hdmi_2_0/drv_hdmi_common.h \
           file://source/msp/drv/hdmi/hdmi_2_0/drv_hdmi_compatibility.c \
           file://source/msp/drv/hdmi/hdmi_2_0/drv_hdmi_compatibility.h \
           file://source/msp/drv/hdmi/hdmi_2_0/drv_hdmi_srm.c \
           file://source/msp/drv/hdmi/hdmi_2_0/drv_hdmi_srm.h \
           file://source/msp/drv/hdmi/hdmi_2_0/drv_hdmi_debug.c \
           file://source/msp/drv/hdmi/hdmi_2_0/drv_hdmi_debug.h \
           file://source/msp/drv/hdmi/hdmi_2_0/drv_hdmi_log.c \
           file://source/msp/drv/hdmi/hdmi_2_0/drv_hdmi_log.h \
           file://source/msp/drv/hdmi/hdmi_2_0/drv_hdmi_proc.c \
           file://source/msp/drv/hdmi/hdmi_2_0/drv_hdmi_proc.h \
           file://source/msp/drv/hdmi/hdmi_2_0/drv_hdmi_platform.h \
           file://source/msp/drv/pq/pq_v4_0/include/drv_pq_define.h \
          "

S = "${WORKDIR}"

#PV = "1.0+gitr${SRCPV}"

#SRCREV="013b5fdc0bd52a1ed94e46710304171341a6c734"

#SRC_URI = "git://github.com/spitzbube/hisilicon-linux.git;protocol=https;branch=poplar-msp-drivers"

#S = "${WORKDIR}/git"

# Kernel module packages MUST begin with 'kernel-module-', otherwise
# multilib image generation can fail.
#
# The following line is only necessary if the recipe name does not begin
# with kernel-module-.
#
PKG_${PN} = "kernel-module-${PN}"

