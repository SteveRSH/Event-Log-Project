package com.Steve;

import java.util.ArrayList;
import java.util.List;

public class EventLog {
    private List<Event> eventList;

    public EventLog() {
        this.eventList = new ArrayList<>();
    }

    public boolean addEvent(Event event) {
        // Throw an IllegalArgumentException if the event parameter is null or if either
        // if the two variables of event are null.
//        if (event == null ||
//                event.getAction() == null ||
//                event.getName()  == null) {
//            throw new IllegalArgumentException("Event is not fully formed.");
//        }

        switch(event.getAction()) {
            case "Face2Face":
            case "PhoneCall":
            case "TextMessaging":
            case "Unknown":
                break;
            default:
                throw new IllegalArgumentException("Event action is invalid.");
        }

        String action = event.getAction();

        if (!(action.equals("Face2Face") ||
                action.equals("PhoneCall") ||
                action.equals("TextMessaging") ||
                action.equals("Unknown"))) {
            throw new IllegalArgumentException("Event Action is invalid");
        }

        // If both parameters are set then
        // print the event to the console and
        System.out.println(event);

        // add it to the list.
        eventList.add(event);

        // The return value from the addEvent method should be true.
        return true;
    }

    public int getNumEvents () {
        return eventList.size();
    }


}


