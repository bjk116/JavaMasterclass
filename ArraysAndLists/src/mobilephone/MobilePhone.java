/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobilephone;
import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contacts> myContacts;

    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contacts>();
    }
    
    public boolean addNewContact(Contacts contact){
        if(findContact(contact.getName()) >= 0){
            System.out.println("Contact already on file");
            return false;
        }
        
        myContacts.add(contact);
        return true;
    }
    
    public boolean updateContact(Contacts oldContact, Contacts newContact) {
        int foundPosition = findContact(oldContact);
        if(foundPosition<0) {
            System.out.println(oldContact.getName() + " was not found.");
            return false;
        }
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;
    }

    private int findContact(Contacts contact) {
        return this.myContacts.indexOf(contact);
    }
    
    private int findContact(String contactName) {
        for(int i = 0; i < this.myContacts.size(); i++) {
            Contacts contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }
}