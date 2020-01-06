package com.xcriptor.serial;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Created by Enzo Cotter on 2019/12/26.
 */
public class Test {

    public static void main(String[] args) {
        DatagramSocket server = null;
        try {
            server = new DatagramSocket(56379);
            byte[] container = new byte[1024];
            DatagramPacket packet = new DatagramPacket(container, container.length);
            while (true) {
                server.receive(packet);
                byte[] data = packet.getData();
                System.out.println(new String(data));
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}