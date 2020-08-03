package com.ctyeung.themeex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatDelegate
import androidx.databinding.DataBindingUtil
import com.ctyeung.themeex.databinding.ActivityMainBinding

/*
 * Dark theme
 * https://material.io/develop/android/theming/dark
 *
 * Material
 * https://medium.com/over-engineering/setting-up-a-material-components-theme-for-android-fbf7774da739
 */
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.layout = this
    }

    fun showAlertDialog() {
        /*
         * https://stackoverflow.com/questions/29797134/how-to-use-and-style-new-alertdialog-from-appcompat-22-1-and-above
         */
        val builder = AlertDialog.Builder(this)
        builder.setTitle("AppCompatDialog")
        builder.setMessage("Lorem ipsum dolor...")
        builder.setPositiveButton("OK", null)
        builder.setNegativeButton("Cancel", null)
        builder.show()
    }

    fun onClickButton() {
        showAlertDialog()
    }
}