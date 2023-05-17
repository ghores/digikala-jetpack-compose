package com.ghores.digikalacompose.util

import android.content.Context
import android.content.res.Configuration
import java.util.Locale

object LocaleUtils {
    fun setLocale(c: Context, language: String) = updateResource(c, language)

    private fun updateResource(context: Context, language: String) {
        context.resources.apply {
            val locale = Locale(language)
            val config = Configuration(configuration)

            context.createConfigurationContext(configuration)
            Locale.setDefault(locale)
            config.setLocale(locale)
            updateConfiguration(config, displayMetrics)
        }
    }
}