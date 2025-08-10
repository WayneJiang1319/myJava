package com.wayne.jiang.extend;

public class Teacher extends People{

    private String skill;

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void printInfo(){
        System.out.println(getName()+" has the skills:"+getSkill());
    }
}
