package com.example.z1mediasamplekotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.z1media.android.sdk.Z1InterstitialAd
import com.z1media.android.sdk.listeners.Z1AdManagerInterstitialI

class InterstitialAdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interstitial_ad)

        val interstitialAd =  Z1InterstitialAd.Builder(this)
            .setTagName("in-app-sample-in-Z1")
            .setEnvironment(BuildConfig.BUILD_TYPE)
            .setZ1AdManagerInterstitialAdLoadCallback( object : Z1AdManagerInterstitialI {
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
            }).build()
        interstitialAd.loadInterstitialAd()
    }
}