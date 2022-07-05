package com.assignment;

public class SoftwareTeamHandler extends BaseHandler {

    public SoftwareTeamHandler(String name) {
        super(name);
    }

    public void handle(Issue file) {
        if (file.getType() == IssueTypes.DOC) {
            System.out.println("Processing and saving doc file... by " + name);
        } else if (next != null) {
            System.out.println(name + " fowards request to " + next.getName());
            next.handle(file);
        } else {
            System.out.println("File not supported");
        }

    }
}
