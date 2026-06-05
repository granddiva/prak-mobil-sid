package com.example.granddiva_aps

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.granddiva_aps.adapter.MessageAdapter
import com.example.granddiva_aps.databinding.FragmentMessageListBinding
import com.example.granddiva_aps.model.Message

class MessageListFragment : Fragment() {
    private var _binding: FragmentMessageListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMessageListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Data dummy sesuai request (Samsung, Justin, Tato)
        val listMessage = listOf(
            Message("Justin Bieber", "Halo, apa kabar?", R.drawable.justin),
            Message("Samsung Indonesia", "Promo terbaru untuk Anda!", R.drawable.sumsang),
            Message("Tato", "Jangan lupa pertemuan besok.", R.drawable.tato),
            Message("Admin PCR", "Pembayaran SPP sudah dibuka.", null),
            Message("Google", "Keamanan akun Anda ditingkatkan.", null)
        )

        val adapter = MessageAdapter(listMessage)
        binding.rvMessages.layoutManager = LinearLayoutManager(requireContext())
        binding.rvMessages.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
