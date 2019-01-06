package com.javacze.ceidg;

public class Address {
    private String ulica;
    private String miasto;
    private String kodPocztowy;

    public Address(String s1, String s2, String s3){
        this.ulica = s1;
        this.miasto = s2;
        this.kodPocztowy = s3;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Address{");
        sb.append("ulica='").append(ulica).append('\'');
        sb.append(", miasto='").append(miasto).append('\'');
        sb.append(", kodPocztowy='").append(kodPocztowy).append('\'');
        sb.append('}');
        return sb.toString();
    }
}