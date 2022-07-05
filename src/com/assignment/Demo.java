package com.assignment;

public class Demo {
    public static void main(String[] args) {

        Handler docHandler = new SoftwareTeamHandler("MS Word");
        Handler pdfHandler = new HardwareTeamHandler("Adobe Acrobat");

        docHandler.setNext(pdfHandler);

        Issue file = null;
        file = new Issue("Abc.doc", IssueTypes.DOC, "C:");


        System.out.println("--------------------------");
        file = new Issue("Def.pdf", IssueTypes.PDF, "C:");
        System.out.println("--------------------------");
        file = new Issue("Ghi.txt", IssueTypes.TXT, "C:");
        System.out.println("--------------------------");
        file = new Issue("Jkl.mp3", IssueTypes.MP3, "C:");
        System.out.println("--------------------------");
        file = new Issue("Mno.gif", IssueTypes.GIF, "C:");
    }
}
