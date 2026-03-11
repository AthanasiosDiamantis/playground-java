package com.saki.javase9.chapter11;

import java.io.IOException;
import java.net.InetAddress;

public class MyDNS {

    public static void main(String[] args) throws IOException {
        InetAddress inet = InetAddress.getByName("www.tutego.de");
        System.out.println(inet.getCanonicalHostName());
        System.out.println(inet.getHostAddress());
        System.out.println(inet);

        inet = InetAddress.getByName("193.99.144.71");
        System.out.println(inet.getHostName());

        System.out.println(InetAddress.getByName("136.243.210.170").isReachable(2000));
//        System.out.println(InetAddress.getByName("100.100.100.100").isReachable(2000));

        // Check the local host address
        System.out.println("Host Name/Address: " + InetAddress.getLocalHost());

        // Find out if your local machine has more than one ip-address
        String localHost = InetAddress.getLocalHost().getHostName();
        for(InetAddress inetAddress : InetAddress.getAllByName(localHost)) {
            System.out.println(inetAddress);
        }

    }
}
