package ru.allfound.bluetoothexample;

import android.bluetooth.BluetoothSocket;

public interface ICommunicatorService {
    ICommunicator createCommunicatorThread(BluetoothSocket socket);
}
