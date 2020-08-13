package org.apoorv.ap.cs2020practice;

import java.util.List;

public class Recipients {
    private List<String> lines;

    public Recipients(List<String> lines) {
        this.lines = lines;
    }

    public String extractCity(String cityZip) {
        int commaPos = cityZip.indexOf(",");
        return cityZip.substring(0, commaPos);
    }

    public void printNames() {
        boolean newName = true;
        for (int i = 0; i < lines.size(); i++) {
            if (newName) {
                System.out.println(lines.get(i));
                newName = false;
            } else if ("".equals(lines.get(i))) {
                newName = true;
            }
        }
    }

    public String getAddress(String name) {
        String address = "";
        boolean recipientFound = false;
        for (int i = 0; i < lines.size(); i++) {
            if (recipientFound) {
                address += lines.get(i);
            }
            if (lines.get(i).equals(name)) {
                recipientFound = true;
            }
            if ("".equals(lines.get(i))) {
                break;
            }
        }
        return address;
    }
}
