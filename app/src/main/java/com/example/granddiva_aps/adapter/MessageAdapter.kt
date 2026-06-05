package com.example.granddiva_aps.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.granddiva_aps.R
import com.example.granddiva_aps.databinding.ItemMessageBinding
import com.example.granddiva_aps.model.Message

class MessageAdapter(private val listMessage: List<Message>) :
    RecyclerView.Adapter<MessageAdapter.MessageViewHolder>() {

    inner class MessageViewHolder(val binding: ItemMessageBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        val binding = ItemMessageBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return MessageViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        val message = listMessage[position]
        with(holder.binding) {
            textSender.text = message.senderName
            textMessage.text = message.messageText
            avatarImg.setImageResource(message.avatarResId ?: R.drawable.ic_launcher_foreground)
        }
    }

    override fun getItemCount(): Int = listMessage.size
}
