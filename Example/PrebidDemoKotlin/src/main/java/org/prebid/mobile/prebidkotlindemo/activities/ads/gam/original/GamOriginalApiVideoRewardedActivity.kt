package org.prebid.mobile.prebidkotlindemo.activities.ads.gam.original

import android.os.Bundle
import android.util.Log
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.admanager.AdManagerAdRequest
import com.google.android.gms.ads.rewarded.RewardedAd
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback
import org.prebid.mobile.PrebidMobile
import org.prebid.mobile.RewardedVideoAdUnit
import org.prebid.mobile.Signals
import org.prebid.mobile.VideoBaseAdUnit
import org.prebid.mobile.prebidkotlindemo.activities.BaseAdActivity

class GamOriginalApiVideoRewardedActivity : BaseAdActivity() {

    companion object {
        const val AD_UNIT_ID = "/21808260008/prebid-demo-app-original-api-video-interstitial"
        const val CONFIG_ID = "imp-prebid-video-rewarded-320-480"
        const val STORED_RESPONSE = "response-prebid-video-rewarded-320-480-original-api"
    }

    private var adUnit: RewardedVideoAdUnit? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // The ID of Mocked Bid Response on PBS. Only for test cases.
        PrebidMobile.setStoredAuctionResponse(STORED_RESPONSE)

        createAd()
    }

    private fun createAd() {
        val builder = AdManagerAdRequest.Builder()
        adUnit = RewardedVideoAdUnit(CONFIG_ID)
        adUnit?.parameters = configureVideoParameters()
        adUnit?.fetchDemand(builder) {
            val request = builder.build()
            RewardedAd.load(
                this,
                AD_UNIT_ID,
                request,
                object : RewardedAdLoadCallback() {
                    override fun onAdLoaded(rewardedAd: RewardedAd) {
                        rewardedAd.show(
                            this@GamOriginalApiVideoRewardedActivity
                        ) { }
                    }

                    override fun onAdFailedToLoad(loadAdError: LoadAdError) {
                        Log.e("GAM", "Ad failed to load: $loadAdError")
                    }
                }
            )
        }
    }

    private fun configureVideoParameters(): VideoBaseAdUnit.Parameters {
        return VideoBaseAdUnit.Parameters().apply {
            mimes = listOf("video/mp4")
            protocols = listOf(Signals.Protocols.VAST_2_0)
            playbackMethod = listOf(Signals.PlaybackMethod.AutoPlaySoundOff)
        }
    }

    override fun onDestroy() {
        super.onDestroy()

        adUnit?.stopAutoRefresh()
    }

}
