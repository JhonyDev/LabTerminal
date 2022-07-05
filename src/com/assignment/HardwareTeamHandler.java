package com.assignment;

public class HardwareTeamHandler extends BaseHandler {
    public HardwareTeamHandler(String name) {
        super(name);
    }

    public void handle(Issue file) {
        if (file.getType() == IssueTypes.PDF) {
            System.out.println("Processing and saving pdf file... by " + name);
        } else if (next != null) {
            System.out.println(name + " fowards request to " + next.getName());
            next.handle(file);
        } else {
            System.out.println("File not supported");
        }

    }
}
