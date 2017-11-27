package BD;

import java.util.List;

public class TestContact {
    public static void maidn(String[] args) {
        ManagerContact mc = new ManagerContact();

        Contact c1 = new Contact("Михаил", "Троцкий", "097-165-99-48", "miha@ukr.net");
        Contact c2 = new Contact("Валера", "Крупицкия", "097-189-80-48", "Valera89@mail.ru");
        Contact c3 = new Contact("Ирина", "Глуховская", "097-899-56-33", "IrKA75@yandex.ru");

        System.out.println("ADD CONTACT==========================");
        Long cId1 = mc.addContact(c1);
        Long cId2 = mc.addContact(c2);
        Long cId3 = mc.addContact(c3);
        List<Contact> res1 = mc.findContacts();
        for (Contact con1 : res1) {
            System.out.println(con1);
        }
        System.out.println("UPDATE===============================");
        Contact change = new Contact(cId1, "Михаил", "Троцкий", "097-178-99-48", "miha78@ukr.net");
        mc.updateContact(change);
        List<Contact> res2 = mc.findContacts();
        for (Contact con2 : res2) {
            System.out.println(con2);
        }
        System.out.println("DELETE===============================");
        mc.deleteContact(cId2);
        List<Contact> res3 = mc.findContacts();
        for (Contact con3 : res3) {
            System.out.println(con3);
        }
        System.out.println("GET CONTACT=========================");
        Contact contact = mc.getContact(cId1);
        System.out.println(contact);


    }


}
