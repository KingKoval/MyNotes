package com.example.mynotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.FragmentManager
import com.example.mynotes.CreateNoteFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_add_note.setOnClickListener {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, CreateNoteFragment())
                    .setCustomAnimations(
                            R.anim.to_right_in, R.anim.to_right_out,
                            R.anim.to_left_in, R.anim.to_left_out
                    )
                    .commit()
        }
    }
}