package com.ecwid.ipAddrCounter;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> addresses = IpAddressReader.getIpAddresses();

        long uniqueCount = IpAddressUtil.countUniqueIPs(addresses);
        System.out.println("Unique IP addresses: " + uniqueCount);
    }
}
