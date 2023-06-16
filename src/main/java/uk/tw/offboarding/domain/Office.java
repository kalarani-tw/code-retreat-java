package uk.tw.offboarding.domain;

public enum Office {
    LONDON(1,"London", Country.UNITED_KINGDOM, Status.ACTIVE),
    SAN_FRANCISCO(2, "San Francisco", Country.UNITED_STATES, Status.ACTIVE),
    DALLAS(3, "Dallas", Country.UNITED_STATES, Status.ACTIVE),
    MELBOURNE(4, "Melbourne", Country.AUSTRALIA, Status.ACTIVE),
    SYDNEY(5, "Sydney", Country.AUSTRALIA, Status.ACTIVE),
    BANGALORE(6, "Bangalore", Country.INDIA, Status.ACTIVE),
    CHENNAI(7, "Chennai", Country.INDIA, Status.ACTIVE),
    COIMBATORE(8, "Coimbatore", Country.INDIA, Status.ACTIVE),
    NOIDA(9, "Noida", Country.INDIA, Status.CLOSED),
    HAMBURG(10, "Hamburg", Country.GERMANY, Status.ACTIVE),
    BEIJING(11, "Beijing", Country.CHINA, Status.ACTIVE),
    WUHAN(12, "Wuhan", Country.CHINA, Status.ACTIVE),
    SAO_PAULO(13, "Sao Paulo", Country.BRAZIL, Status.ACTIVE),
    TORONTO(14, "Toronto", Country.CANADA, Status.CLOSED)
    ;
    private int ID;
    private String name;
    private Country country;
    private Status status;

    Office(int ID, String name, Country country, Status status) {
        this.ID = ID;
        this.name = name;
        this.country = country;
        this.status = status;
    }
}
