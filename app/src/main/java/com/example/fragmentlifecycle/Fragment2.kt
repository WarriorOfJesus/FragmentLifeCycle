package com.example.fragmentlifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment

class Fragment2 : Fragment() {


    val LOG_TAG: String ="myLoga"

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(LOG_TAG, "Fraegment2 onAttach ")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(LOG_TAG, "Fraegment2 onCreate ")
    }


}