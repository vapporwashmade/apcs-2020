package org.apoorv.ap.cs2020practice;

import java.util.ArrayList;
import java.util.List;

public class SystemLog {
    private List<LogMessage> messageList;

    public List<LogMessage> removeMessages(String keyword) {
        List<LogMessage> removedMessages = new ArrayList<>();
        for (int i = 0; i < messageList.size(); i++) {
            if (messageList.get(i).containsWord(keyword)) {
                removedMessages.add(messageList.get(i));
                messageList.remove(i);
                i--;
            }
        }
        return removedMessages;
    }
}
