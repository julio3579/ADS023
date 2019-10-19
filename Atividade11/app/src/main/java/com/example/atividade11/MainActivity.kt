package com.example.atividade11

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        println("onCreate disparado...")


    }

    override fun onStart() {
        super.onStart();
        println("onStart disparado...")


    }
    override fun onResume() {
        super.onResume();
        println("onResume disparado...")


    }
    override fun onPause() {
        super.onPause();
        println("onPause disparado...")


    }
    override fun onStop() {
        super.onStop();
        println("onStop disparado...")


    }


    override fun onDestroy() {
        super.onDestroy();
        println("onDestroy disparado...")


    }
}
