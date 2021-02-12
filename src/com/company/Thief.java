package com.company;

public class Thief implements MailService{
    private int minPrice;
    private int stolenValue;
    Thief(int minPrice) {
        this.minPrice = minPrice;
    }

    int getStolenValue() {
        return stolenValue;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        int price = ((MailPackage) mail).getContent().getPrice();
        if (mail instanceof MailPackage && minPrice <= price) {
            stolenValue += price;
            String content = "stones instead of " + ((MailPackage) mail).getContent().getContent();
            return new RealMailService().processMail(new MailPackage(mail.getFrom(), mail.getTo(), new Package(content, 0)));
        }
        return mail;

    }
}
