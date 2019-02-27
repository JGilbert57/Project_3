//John Gilbert 02/27/2019
package com.killoran.Week1;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Contact contact = new Contact("Johnny","johnnygilbert57@gmail.com");
        System.out.println(contact.toString());
        BusinessContact busCon = new BusinessContact("Mark Killoran","MKillor@gmail.com","(614)-818-9502");
        System.out.println(busCon.toString());
    }
}