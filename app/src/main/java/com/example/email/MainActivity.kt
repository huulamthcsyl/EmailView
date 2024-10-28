package com.example.email

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val emails = listOf(
            EmailModel("Google", "Welcome to Gmail", "Welcome to Gmail! You can now send emails, chat, and more.", "2:00 PM"),
            EmailModel("Facebook", "Your Facebook account was accessed", "We detected a login into your account from an unknown device. If this was you, you can ignore this email.", "1:00 PM"),
            EmailModel("Twitter", "Your Twitter account was accessed", "We detected a login into your account from an unknown device. If this was you, you can ignore this email.", "12:00 PM"),
            EmailModel("Instagram", "Welcome to Instagram", "Welcome to Instagram! You can now share photos, videos, and more.", "11:00 AM"),
            EmailModel("LinkedIn", "Welcome to LinkedIn", "Welcome to LinkedIn! You can now connect with professionals, find jobs, and more.", "10:00 AM"),
            EmailModel("Snapchat", "Welcome to Snapchat", "Welcome to Snapchat! You can now share photos, videos, and more.", "9:00 AM"),
            EmailModel("TikTok", "Welcome to TikTok", "Welcome to TikTok! You can now share short videos, and more.", "8:00 AM"),
            EmailModel("Pinterest", "Welcome to Pinterest", "Welcome to Pinterest! You can now discover new ideas, and more.", "7:00 AM"),
            EmailModel("Reddit", "Welcome to Reddit", "Welcome to Reddit! You can now join communities, and more.", "6:00 AM"),
            EmailModel("WhatsApp", "Welcome to WhatsApp", "Welcome to WhatsApp! You can now send messages, and more.", "5:00 AM")
        )

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = androidx.recyclerview.widget.LinearLayoutManager(this)
        recyclerView.adapter = EmailAdapter(emails)

    }
}