package com.dataart.btle_android.btle_gateway;

import android.os.ParcelUuid;

import com.dataart.btle_android.btle_gateway.model.BTLECharacteristic;

import java.util.ArrayList;
import java.util.List;


public class GattCharacteristicCallBack {

    public void onServices(List<ParcelUuid> uuidList) {
    }

    public void onCharacteristics(ArrayList<BTLECharacteristic> characteristics) {
    }

    public void onRead(byte[] value) {
    }

    @SuppressWarnings("EmptyMethod")
    public void onWrite(int status) {
    }
}
