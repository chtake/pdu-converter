package com.attyh.pdu;

public class Main {

    public static void main(String[] args) {
        /**
         * sample SMS AT Command:
         * sending an SMS with text "Hallo World." to number "+491760045121" over o2 SMSC
         */
        System.out.println(PDUConverter.encode("+491760000443", "+491760045121", "Hallo World.").getPduCommand());
    }
}
