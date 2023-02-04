package com.example.service_operator.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.service_operator.R
import com.example.service_operator.databinding.LoginActivityBinding

class LoginActivityFragment: Fragment() {

    private lateinit var binding: LoginActivityBinding
    lateinit var username : EditText
    lateinit var password: EditText
    lateinit var loginButton: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = LoginActivityBinding.inflate(layoutInflater)


        binding.loginButton.setOnClickListener(View.OnClickListener {
            if (binding.username.text.toString() == "user" && binding.password.text.toString() == "1234"){
                val fragment = LargeNewsFragment()
                val transaction = fragmentManager?.beginTransaction()
                transaction?.replace(R.id.frame_layout, LargeNewsFragment())?.commit()
            } else {
                Toast.makeText(requireContext(), "Login Failed!", Toast.LENGTH_SHORT).show()
            }
        })

        return binding.root
    }
}