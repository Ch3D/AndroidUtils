package com.ch3d.android.utils

import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothManager
import android.content.Context
import android.content.pm.PackageManager.FEATURE_BLUETOOTH
import android.os.Build

class BluetoothUtils {
    fun Context.isBluetoothEnabled(): Boolean {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR2) {
            val bluetoothManager = this.getSystemService(
                    Context.BLUETOOTH_SERVICE) as BluetoothManager
            return bluetoothManager.adapter?.isEnabled ?: false
        } else {
            return BluetoothAdapter.getDefaultAdapter() != null
        }
    }

    fun Context.isBluetoothSupported() = this.packageManager.hasSystemFeature(FEATURE_BLUETOOTH)
}
