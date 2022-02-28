package com.design.pattern.objectStructure.facde.after;

public class EmailMessage {
    private String from;

    private String to;

    private String subject;

    private String text;

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }

    public String getText() {
        return text;
    }

    public EmailMessage setFrom(String from) {
        this.from = from;
        return this;
    }

    public EmailMessage setTo(String to) {
        this.to = to;
        return this;
    }

    public EmailMessage setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public EmailMessage setText(String text) {
        this.text = text;
        return this;
    }
}
