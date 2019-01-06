package com.javacze;

import com.javacze.ceidg.Address;
import com.javacze.ceidg.Firma;

public class Main {

    public static void main(String[] args) {

        Address address = new Address("NMP 20", "Częstochowa", "42-200");
        Firma firma = new Firma("TRW", 9493241278L, 2329328, address);
        System.out.println(firma);
    }
}