package ru.allfound.bluetoothexample;

interface ICommunicator {
    void startCommunication();
    void write(String message);
    void stopCommunication();
}
