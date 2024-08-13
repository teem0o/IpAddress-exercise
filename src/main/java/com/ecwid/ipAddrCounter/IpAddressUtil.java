package com.ecwid.ipAddrCounter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IpAddressUtil {
    public static int countUniqueIPs(List<String> ipAddresses) {
        Set<Integer> values = new HashSet<>(ipAddresses.size());
        int uniqueCount = 0;

        for (String ipAddress : ipAddresses) {
            boolean isUnique = true;
            int binary = toBinary(ipAddress);
            if (values.contains(binary)) {
                isUnique = false;
            } else {
                values.add(binary);
            }
            if (isUnique) {
                uniqueCount++;
            }
        }
        return uniqueCount;
    }

    public static int toBinary(String ipAddress) {
        String[] parts = ipAddress.replaceAll("[^\\x00-\\x7F]", "").trim().split("\\.");
        int binaryInt = 0;

        for (int i = 0; i < parts.length; i++) {
            int part = Integer.parseInt(parts[i]);
            binaryInt |= part << (8 * (3 - i));
        }
        return binaryInt;
    }
}
