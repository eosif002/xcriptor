package com.xcriptor.serial;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.Map;

/**
 */
public class Serial {

    public byte[] serialTobyte(byte[] map) {

        if (null == map) {
            return null;
        } else {
            DatagramSocket client = null;
            DatagramPacket packet = null;
            byte[] data = null;

            try {
                client = new DatagramSocket(56378);
                String msg = "";

                data = map;
                packet = new DatagramPacket(data, data.length, new InetSocketAddress("127.0.0.1", 56389));
                client.send(packet);
            } catch (Exception e) {
            } finally {
                if (null != client) {
                    try {
                        client.close();
                    } catch (Exception ee) {
                    }

                }

            }
        }
        return map;
    }

    public static void main(String[] args) {
        try {
            Serial s = (Serial) Class.forName("com.xcriptor.serial.Serial").newInstance();
//            s.serialTobyte(map);

        } catch (ClassNotFoundException e) {
        } catch (IllegalAccessException e) {
        } catch (InstantiationException e) {
        }
    }
}
