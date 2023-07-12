package com.example.z1mediasamplekotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.z1mediasamplekotlin.application.MyApplication
import com.z1media.android.sdk.Z1InterstitialAd
import com.z1media.android.sdk.listeners.Z1AdManagerInterstitialI
import com.z1media.android.sdk.models.Z1AdError

class InterstitialAdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interstitial_ad)

        val interstitialAd =  Z1InterstitialAd.Builder(this)
            .setTagName("in-app-sample-in-Z1")
            .setApplovinAdUnitId("6612297efccb6ca4")
            .setIronSourceParams((application as MyApplication).IRON_SOURCE_APP_KEY,"DefaultRewardedVideo")
            .setEnvironment(BuildConfig.BUILD_TYPE)
            .setZ1AdManagerInterstitialAdLoadCallback( object : Z1AdManagerInterstitialI {
                override fun onAdLoaded() {
                }

                override fun onAdFailedToLoad(adError: Z1AdError?) {
                }

                override fun onAdClicked() {
                }

                override fun onAdDismissedFullScreenContent() {
                }

                override fun onAdFailedToShowFullScreenContent(adError: Z1AdError?) {
                }

                override fun onAdShowedFullScreenContent() {
                }
            }).build()
        interstitialAd.loadInterstitialAd()
    }
}