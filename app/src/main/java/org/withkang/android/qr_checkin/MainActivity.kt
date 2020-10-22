package org.withkang.android.qr_checkin

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://nid.naver.com/login/privacyQR")))
        finish()
    }




}

