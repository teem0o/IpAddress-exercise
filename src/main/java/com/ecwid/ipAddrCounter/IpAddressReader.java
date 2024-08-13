package com.ecwid.ipAddrCounter;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import static java.nio.charset.StandardCharsets.UTF_8;


public class IpAddressReader {

    private static final Path wapPath = Paths.get("src", "main", "resources", "wap.txt");

    public static List<String> getIpAddresses() throws IOException {
        return Files.lines(wapPath, UTF_8).collect(Collectors.toList());
    }

}