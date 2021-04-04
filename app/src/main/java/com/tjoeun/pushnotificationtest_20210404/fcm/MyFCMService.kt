package com.tjoeun.pushnotificationtest_20210404.fcm

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFCMService : FirebaseMessagingService() {

    override fun onMessageReceived(p0: RemoteMessage) {
        super.onMessageReceived(p0)

        Log.d("푸시알림-제목", p0.notification!!.title!!)
        Log.d("푸시알림-내용", p0.notification!!.body!!)
    }

}