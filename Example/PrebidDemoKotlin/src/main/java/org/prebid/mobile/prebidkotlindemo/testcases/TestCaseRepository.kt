package org.prebid.mobile.prebidkotlindemo.testcases

import org.prebid.mobile.prebidkotlindemo.R
import org.prebid.mobile.prebidkotlindemo.activities.ads.admob.*
import org.prebid.mobile.prebidkotlindemo.activities.ads.applovin.*
import org.prebid.mobile.prebidkotlindemo.activities.ads.gam.original.*
import org.prebid.mobile.prebidkotlindemo.activities.ads.gam.rendering.*
import org.prebid.mobile.prebidkotlindemo.activities.ads.inapp.*

object TestCaseRepository {

    lateinit var lastTestCase: TestCase

    fun getList() = arrayListOf(
        /* GAM Original API */
        TestCase(
            R.string.gam_original_display_banner_320x50,
            AdFormat.DISPLAY_BANNER,
            IntegrationKind.GAM_ORIGINAL,
            GamOriginalApiDisplayBanner320x50Activity::class.java,
        ),
        TestCase(
            R.string.gam_original_display_banner_300x250,
            AdFormat.DISPLAY_BANNER,
            IntegrationKind.GAM_ORIGINAL,
            GamOriginalApiDisplayBanner300x250Activity::class.java,
        ),
        TestCase(
            R.string.gam_original_display_banner_multi_size,
            AdFormat.DISPLAY_BANNER,
            IntegrationKind.GAM_ORIGINAL,
            GamOriginalApiDisplayBannerMultiSizeActivity::class.java,
        ),
        TestCase(
            R.string.gam_original_display_interstitial,
            AdFormat.DISPLAY_INTERSTITIAL,
            IntegrationKind.GAM_ORIGINAL,
            GamOriginalApiDisplayInterstitialActivity::class.java,
        ),
        TestCase(
            R.string.gam_original_video_interstitial,
            AdFormat.VIDEO_INTERSTITIAL,
            IntegrationKind.GAM_ORIGINAL,
            GamOriginalApiVideoInterstitialActivity::class.java,
        ),
        TestCase(
            R.string.gam_original_video_rewarded,
            AdFormat.VIDEO_REWARDED,
            IntegrationKind.GAM_ORIGINAL,
            GamOriginalApiVideoRewardedActivity::class.java,
        ),
        TestCase(
            R.string.gam_original_native,
            AdFormat.NATIVE,
            IntegrationKind.GAM_ORIGINAL,
            GamOriginalApiNativeActivity::class.java,
        ),

        /* GAM Rendering API */
        TestCase(
            R.string.gam_rendering_display_banner_320x50,
            AdFormat.DISPLAY_BANNER,
            IntegrationKind.GAM_RENDERING,
            GamRenderingApiDisplayBanner320x50Activity::class.java,
        ),
        TestCase(
            R.string.gam_rendering_video_banner,
            AdFormat.VIDEO_BANNER,
            IntegrationKind.GAM_RENDERING,
            GamRenderingApiVideoBannerActivity::class.java,
        ),
        TestCase(
            R.string.gam_rendering_display_interstitial,
            AdFormat.DISPLAY_INTERSTITIAL,
            IntegrationKind.GAM_RENDERING,
            GamRenderingApiDisplayInterstitialActivity::class.java,
        ),
        TestCase(
            R.string.gam_rendering_video_interstitial,
            AdFormat.VIDEO_INTERSTITIAL,
            IntegrationKind.GAM_RENDERING,
            GamRenderingApiVideoInterstitialActivity::class.java,
        ),
        TestCase(
            R.string.gam_rendering_video_rewarded,
            AdFormat.VIDEO_REWARDED,
            IntegrationKind.GAM_RENDERING,
            GamRenderingApiVideoRewardedActivity::class.java,
        ),
        TestCase(
            R.string.gam_rendering_native,
            AdFormat.NATIVE,
            IntegrationKind.GAM_RENDERING,
            GamRenderingApiNativeActivity::class.java,
        ),

        /* In-App (no ad server) */
        TestCase(
            R.string.in_app_display_banner_320x50,
            AdFormat.DISPLAY_BANNER,
            IntegrationKind.NO_AD_SERVER,
            InAppDisplayBanner320x50Activity::class.java,
        ),
        TestCase(
            R.string.in_app_display_banner_multi_size,
            AdFormat.DISPLAY_BANNER,
            IntegrationKind.NO_AD_SERVER,
            InAppDisplayBannerMultiSizeActivity::class.java,
        ),
        TestCase(
            R.string.in_app_display_banner_mraid_resize,
            AdFormat.DISPLAY_BANNER,
            IntegrationKind.NO_AD_SERVER,
            InAppDisplayBannerMraidResizeActivity::class.java,
        ),
        TestCase(
            R.string.in_app_display_banner_mraid_expand,
            AdFormat.DISPLAY_BANNER,
            IntegrationKind.NO_AD_SERVER,
            InAppDisplayBannerMraidExpandActivity::class.java,
        ),
        TestCase(
            R.string.in_app_display_banner_mraid_resize_errors,
            AdFormat.DISPLAY_BANNER,
            IntegrationKind.NO_AD_SERVER,
            InAppDisplayBannerMraidResizeWithErrorsActivity::class.java,
        ),
        TestCase(
            R.string.in_app_video_banner,
            AdFormat.VIDEO_BANNER,
            IntegrationKind.NO_AD_SERVER,
            InAppVideoBannerActivity::class.java,
        ),
        TestCase(
            R.string.in_app_display_interstitial,
            AdFormat.DISPLAY_INTERSTITIAL,
            IntegrationKind.NO_AD_SERVER,
            InAppDisplayInterstitialActivity::class.java,
        ),
        TestCase(
            R.string.in_app_video_interstitial,
            AdFormat.VIDEO_INTERSTITIAL,
            IntegrationKind.NO_AD_SERVER,
            InAppVideoInterstitialActivity::class.java,
        ),
        TestCase(
            R.string.in_app_video_interstitial_end_card,
            AdFormat.VIDEO_INTERSTITIAL,
            IntegrationKind.NO_AD_SERVER,
            InAppVideoInterstitialWithEndCardActivity::class.java,
        ),
        TestCase(
            R.string.in_app_video_interstitial_multi_format,
            AdFormat.VIDEO_INTERSTITIAL,
            IntegrationKind.NO_AD_SERVER,
            InAppVideoInterstitialMultiFormatActivity::class.java,
        ),
        TestCase(
            R.string.in_app_video_rewarded,
            AdFormat.VIDEO_REWARDED,
            IntegrationKind.NO_AD_SERVER,
            InAppVideoRewardedActivity::class.java,
        ),
        TestCase(
            R.string.in_app_native,
            AdFormat.NATIVE,
            IntegrationKind.NO_AD_SERVER,
            InAppNativeActivity::class.java,
        ),

        /* AdMob */
        TestCase(
            R.string.ad_mob_display_banner_320x50,
            AdFormat.DISPLAY_BANNER,
            IntegrationKind.ADMOB,
            AdMobDisplayBanner320x50Activity::class.java,
        ),
        TestCase(
            R.string.ad_mob_display_interstitial,
            AdFormat.DISPLAY_INTERSTITIAL,
            IntegrationKind.ADMOB,
            AdMobDisplayInterstitialActivity::class.java,
        ),
        TestCase(
            R.string.ad_mob_video_interstitial,
            AdFormat.VIDEO_INTERSTITIAL,
            IntegrationKind.ADMOB,
            AdMobVideoInterstitialActivity::class.java,
        ),
        TestCase(
            R.string.ad_mob_video_rewarded,
            AdFormat.VIDEO_REWARDED,
            IntegrationKind.ADMOB,
            AdMobVideoRewardedActivity::class.java,
        ),
        TestCase(
            R.string.ad_mob_native,
            AdFormat.NATIVE,
            IntegrationKind.ADMOB,
            AdMobNativeActivity::class.java,
        ),

        /* AppLovin MAX */
        TestCase(
            R.string.app_lovin_max_display_banner_320x50,
            AdFormat.DISPLAY_BANNER,
            IntegrationKind.MAX,
            AppLovinMaxDisplayBanner320x50Activity::class.java,
        ),
        TestCase(
            R.string.app_lovin_max_display_banner_300x250,
            AdFormat.DISPLAY_BANNER,
            IntegrationKind.MAX,
            AppLovinMaxDisplayBanner300x250Activity::class.java,
        ),
        TestCase(
            R.string.app_lovin_max_display_interstitial,
            AdFormat.DISPLAY_INTERSTITIAL,
            IntegrationKind.MAX,
            AppLovinMaxDisplayInterstitialActivity::class.java,
        ),
        TestCase(
            R.string.app_lovin_max_video_rewarded,
            AdFormat.VIDEO_REWARDED,
            IntegrationKind.MAX,
            AppLovinMaxVideoRewardedActivity::class.java,
        ),
        TestCase(
            R.string.app_lovin_max_native,
            AdFormat.NATIVE,
            IntegrationKind.MAX,
            AppLovinMaxNativeActivity::class.java,
        ),
    )

}