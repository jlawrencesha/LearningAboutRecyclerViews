package com.giftofhappiness.android.learningaboutrecyclerviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //RecyclerView Data
        var studentList = ArrayList<Students>()

        studentList.add(Students("John Lawrence", 25))
        studentList.add(Students("Ava Viola", 56))
        studentList.add(Students("Conner Lawrence", 78))

    }
}

