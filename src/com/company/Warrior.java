package com.company;

public class Warrior extends Hero{
    @Override
    public void applySuperAbility() {
        setHp(200);
        setDamage(60);
        setSuperAbilityType("CRITICAL DAMAGE");
        System.out.println("WARRIOR" + "\n" + "hp:" + getHp() + "\n" + "damage:" + getDamage()+"\n" + "применил суперспособность:" + getSuperAbilityType());
    }
}
