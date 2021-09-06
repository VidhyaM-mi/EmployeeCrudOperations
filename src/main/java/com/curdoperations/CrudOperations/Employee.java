package com.curdoperations.CrudOperations;

public class Employee {
    String eid;
    String name;
    String email;
    String contact;

    public  Employee(){
    }
    public Employee(String eid, String name,String email,String contact) {
        this.eid=eid;
        this.name=name;
        this.email=email;
        this.contact=contact;
    }
    public String getEid() {
        return eid;
    }
    public void setEid(String eid){
        this.eid=eid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact){
        this.contact=contact;
    }

}
