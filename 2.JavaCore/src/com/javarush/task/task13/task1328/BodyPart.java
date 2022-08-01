package com.javarush.task.task13.task1328;

public final class BodyPart {
    final static BodyPart LEG = new BodyPart("ногой");
    final static BodyPart HEAD = new BodyPart("головой");
    final static BodyPart ARM = new BodyPart("рукой");
    final static BodyPart CHEST = new BodyPart("грудью");

    private String bodyPart;

    private BodyPart(String bodyPart) {
        this.bodyPart = bodyPart;
    }

    @Override
    public String toString() {
        return this.bodyPart;
    }
}
