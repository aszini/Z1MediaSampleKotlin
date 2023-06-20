package com.example.z1mediasamplekotlin


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.z1mediasamplekotlin.databinding.ActivityRewardedVideoBinding
import com.z1media.android.sdk.Z1RewardedVideoAd
import com.z1media.android.sdk.listeners.Z1RewardedVideoI

class RewardedVideoActivity : AppCompatActivity() {
    lateinit var  binding: ActivityRewardedVideoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRewardedVideoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val rewardedVideoAd = Z1RewardedVideoAd.Builder(this)
            .setTagName("in-app-sample-rw-Z1")
            .setEnvironment(BuildConfig.BUILD_TYPE)
            .setZ1RewardInterstitialI(object : Z1RewardedVideoI {

                override fun onAdFailedToLoad(errorMessage: String) {
                }

                override fun onAdClicked() {
                }

                override fun onAdDismissedFullScreenContent() {
                }

                override fun onAdFailedToShowFullScreenContent(errMsg: String) {
                }

                override fun onAdImpression() {
                }

                override fun onAdShowedFullScreenContent() {
                }

                override fun onUserEarnedReward(amount: Int, type: String) {
                    binding.title.text = "Reward Amount $amount , type: $type"
                }

            }).build()
        rewardedVideoAd.loadRewardVideoAd()
    }
}