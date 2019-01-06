package com.javacze.ceidg;

public class Firma {
    private String nazwa;
    private long nip;
    private int regon;
    private Address address;

    public Firma(String n, long nip, int r, Address a){
        this.nazwa = n;
        this.nip = nip;
        this.regon = r;
        this.address = a;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Firma{");
        sb.append("nazwa='").append(nazwa).append('\'');
        sb.append(", nip=").append(nip);
        sb.append(", regon=").append(regon);
        sb.append(", address=").append(address);
        sb.append('}');
        return sb.toString();
    }
}