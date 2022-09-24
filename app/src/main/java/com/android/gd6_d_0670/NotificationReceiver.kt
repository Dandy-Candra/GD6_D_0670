package com.android.gd6_d_0670

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class NotificationReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent:Intent) {
        val message = intent.getStringExtra("toastMessage")
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }
}