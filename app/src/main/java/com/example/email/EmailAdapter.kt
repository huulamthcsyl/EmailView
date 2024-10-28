package com.example.email

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EmailAdapter(private val emails: List<EmailModel>) : RecyclerView.Adapter<EmailAdapter.EmailViewHolder>() {
     class EmailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val sender: TextView
        val subject: TextView
        val date: TextView
        val icon: TextView

        init {
            sender = itemView.findViewById(R.id.sender)
            subject = itemView.findViewById(R.id.subject)
            date = itemView.findViewById(R.id.date)
            icon = itemView.findViewById(R.id.icon)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_email, parent, false)
        return EmailViewHolder(view)
    }

    override fun getItemCount(): Int = emails.size

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        val email = emails[position]
        holder.sender.text = email.sender
        holder.subject.text = email.subject
        holder.date.text = email.date
        holder.icon.text = email.sender.first().toString()
    }
}