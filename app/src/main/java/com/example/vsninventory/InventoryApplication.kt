package com.example.vsninventory

import android.app.Application
import com.example.vsninventory.data.AppContainer
import com.example.vsninventory.data.AppDataContainer

class InventoryApplication : Application() {
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }
}