package com.example.granddiva_aps.model

data class Message(
    val senderName: String,
    val messageText: String,
    val avatarResId: Int? = null
)
