package com.ch3d.android.utils

import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothManager
import android.content.Context
import android.content.pm.PackageManager
import android.os.Build

class BluetoothUtils {
    companion object {
        fun isBluetoothEnabled(context: Context): Boolean {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR2) {
                val bluetoothManager = context.getSystemService(
                        Context.BLUETOOTH_SERVICE) as BluetoothManager
                val mBluetoothAdapter = bluetoothManager.getAdapter()
                return mBluetoothAdapter != null && mBluetoothAdapter!!.isEnabled()
            } else {
                return BluetoothAdapter.getDefaultAdapter() != null
            }
        }

        fun isBluetoothSupported(context: Context): Boolean {
            return context.packageManager.hasSystemFeature(PackageManager.FEATURE_BLUETOOTH)
        }
    }
}
