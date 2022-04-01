package com.TestingHW3;

import java.util.ArrayList;


public class GymMembership {
    private ArrayList<Member> members;

    public GymMembership() {
        this.members = new ArrayList<>();
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Member> members) {
        this.members = members;
    }

    public Member addMember(Member member){
        if (!members.contains(member)){
            members.add(member);
        }
        return member;
    }

    public boolean removeMember(Member member){
        if(members.contains(member)){
            members.remove(member);
            return true;
        }
        else return false;
    }

    public int numberOfMembers(){
        int count = 0;
        for (int i = 0; i < members.size(); i++) {
            count++;
        }
        return count;
    }

    public boolean isEligibleForExtension(Member member){
        if (members.contains(member)){
            if (member.getMembershipLength() >= 30){
                return true;
            }
            else return false;
        }
        return false;

    }


}
