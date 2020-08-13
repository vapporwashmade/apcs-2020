package org.apoorv.ap.cs2020practice;

public class LogMessage {
    private String machineId;
    private String description;

    public LogMessage(String message) {
        // check precondition: message is a valid log message
        int indexOfColon = message.indexOf(':');
        if (indexOfColon < 0) {
            throw new IllegalArgumentException("The message does not contain a colon");
        }
        this.machineId = message.substring(0, indexOfColon);
        this.description = message.substring(indexOfColon + 1);
    }

    public boolean containsWord(String keyword) {
        int index = this.description.indexOf(keyword);
        if (index > -1) {
            // used String charAt(int index) method
            if (':' == description.charAt(index - 1) || description.charAt(index - 1) == ' ') {
                // used String charAt(int index) method
                if (index == description.length() - keyword.length() || description.charAt(index + 1) == ' ') {
                    return true;
                }
            }
        }
        return false;
    }

    public String getMachineId() {
        return machineId;
    }

    public String getDescription() {
        return description;
    }
}
