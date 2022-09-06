package nl.frankkie.android13multilang

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.os.LocaleListCompat
import nl.frankkie.android13multilang.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mainBtnDutch.setOnClickListener {
            setNewLocale("nl-NL")
        }
        binding.mainBtnFlemish.setOnClickListener {
            setNewLocale("nl-BE")
        }
        binding.mainBtnEnglish.setOnClickListener {
            setNewLocale("en")
        }
        binding.mainBtnGerman.setOnClickListener {
            setNewLocale("de")
        }
        binding.mainBtnPolish.setOnClickListener {
            setNewLocale("pl")
        }
    }

    private fun setNewLocale(tags: String) {
        val appLocale = LocaleListCompat.forLanguageTags(tags)
        AppCompatDelegate.setApplicationLocales(appLocale)
    }
}