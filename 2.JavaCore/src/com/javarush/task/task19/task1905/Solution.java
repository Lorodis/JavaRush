package com.javarush.task.task19.task1905;

import java.util.HashMap;
import java.util.Map;

/* 
Закрепляем адаптер
*/

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();

    static {
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
        countries.put("UA", "Ukraine");
    }

    public static void main(String[] args) {

    }

    public static class DataAdapter implements RowItem {
        private Customer customer;
        private Contact contact;

        public DataAdapter(Customer customer, Contact contact) {
            this.contact = contact;
            this.customer = customer;
        }

        @Override
        public String getCountryCode() {
            String s = null;
            for (Map.Entry<String, String> pair :
                    countries.entrySet()) {
                if (pair.getValue().equals(customer.getCountryName())) {
                    s = pair.getKey();
                    break;
                }
            }
            return s;
        }

        @Override
        public String getCompany() {
            return this.customer.getCompanyName();
        }

        @Override
        public String getContactFirstName() {
            String[] pers = this.contact.getName().split(", ");
            return pers[1];
        }

        @Override
        public String getContactLastName() {
            String[] pers = this.contact.getName().split(", ");
            return pers[0];
        }

        @Override
        public String getDialString() {
            String pNumber = "callto://" + this.contact.getPhoneNumber().replace("(", "")
                    .replace(")", "").replace("-", "");
            return pNumber;
        }
    }

    public static interface RowItem {
        String getCountryCode();        //example UA

        String getCompany();            //example JavaRush Ltd.

        String getContactFirstName();   //example Ivan

        String getContactLastName();    //example Ivanov

        String getDialString();         //example callto://+380501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.

        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan

        String getPhoneNumber();        //example +38(050)123-45-67
    }
}