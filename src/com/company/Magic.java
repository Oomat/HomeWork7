package com.company;

public class Magic extends Hero{
    @Override
    public void applySuperAbility() {
        setHp(200);
        setDamage(50);
        setSuperAbilityType("FIRE");
        System.out.println("MAGIC"  + "\n" + "hp:" + getHp() + "\n" + "damage:" + getDamage()+"\n" + "применил суперспособность:" + getSuperAbilityType());
    }
}
