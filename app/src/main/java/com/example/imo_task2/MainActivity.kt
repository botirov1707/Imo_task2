package com.example.imo_task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

    }

    private fun initViews() {
        recyclerView = findViewById(R.id.rv_main)
        recyclerView.layoutManager = GridLayoutManager(this, 1)

        refreshAdapter(getAllChats())
    }

    private fun refreshAdapter(chats: java.util.ArrayList<Chat>) {
        val adapter = ChatAdapter(this, chats)
        recyclerView.adapter = adapter
    }

    private fun getAllChats(): ArrayList<Chat> {
        val chats: ArrayList<Chat> = ArrayList()
        chats.add(Chat(R.drawable.user, "Uchqun Azimboyev", 1))
        chats.add(Chat(R.drawable.user, "Uchqun Azimboyev", 1))
        chats.add(Chat(R.drawable.user, "Uchqun Azimboyev", 1))
        chats.add(Chat(R.drawable.user, "Uchqun Azimboyev", 1))
        chats.add(Chat(R.drawable.user, "Uchqun Azimboyev", 1))
        chats.add(Chat(R.drawable.user, "Uchqun Azimboyev", 1))
        chats.add(Chat(R.drawable.user, "Uchqun Azimboyev", 1))
        chats.add(Chat(R.drawable.user, "Uchqun Azimboyev", 1))
        chats.add(Chat(R.drawable.user, "Uchqun Azimboyev", 1))
        chats.add(Chat(R.drawable.user, "Uchqun Azimboyev", 1))
        chats.add(Chat(R.drawable.user, "Uchqun Azimboyev", 1))
        chats.add(Chat(R.drawable.user, "Uchqun Azimboyev", 1))
        chats.add(Chat(R.drawable.user, "Uchqun Azimboyev", 1))
        chats.add(Chat(R.drawable.user, "Uchqun Azimboyev", 1))
        chats.add(Chat(R.drawable.user, "Uchqun Azimboyev", 1))

        return chats
    }

}