package com.example.email

data class EmailModel(
    val sender: String,
    val subject: String,
    val message: String,
    val date: String
)