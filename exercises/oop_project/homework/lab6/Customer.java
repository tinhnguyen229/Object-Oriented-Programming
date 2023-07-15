package oop_project.homework.lab6;

public class Customer {
    private String  name;
    private boolean member;
    private String  memberType;

    public Customer() {
        this.member = false;
    }

    public Customer(String name) {
       this.name = name;
    }

    public String getName() {
        return this.name;
    }
    
    public boolean isMember() {
        return this.member;
    }
    
    public void setMember(boolean member) {
        this.member = member;
    }
    
    public String getMemberType() {
        return memberType;
    }
    
    public void setMemberType(String type) {
        this.memberType = type;
    }
    
    public String toString() {
        return String.format("%s | %s | %s"
                            , this.name, this.member ? "Member" : "Not member", this.memberType);
    }
}
