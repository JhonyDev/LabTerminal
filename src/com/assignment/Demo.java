package com.assignment;

public class Demo {
    public static void main(String[] args) {

        Handler textHandler = new TextFileHandler("Notepad++");
        Handler docHandler = new SoftwareTeamHandler("MS Word");
        Handler pdfHandler = new HardwareTeamHandler("Adobe Acrobat");
        Handler mp3Handler = new MP3FileHandler("VLC Media Player");

        textHandler.setNext(docHandler);
        docHandler.setNext(pdfHandler);
        pdfHandler.setNext(mp3Handler);

        Issue file = null;
        file = new Issue("Abc.doc", IssueTypes.DOC, "C:");


        textHandler.handle(file);
        System.out.println("--------------------------");
        file = new Issue("Def.pdf", IssueTypes.PDF, "C:");
        textHandler.handle(file);
        System.out.println("--------------------------");
        file = new Issue("Ghi.txt", IssueTypes.TXT, "C:");
        textHandler.handle(file);
        System.out.println("--------------------------");
        file = new Issue("Jkl.mp3", IssueTypes.MP3, "C:");
        textHandler.handle(file);
        System.out.println("--------------------------");
        file = new Issue("Mno.gif", IssueTypes.GIF, "C:");
        textHandler.handle(file);
    }
}
