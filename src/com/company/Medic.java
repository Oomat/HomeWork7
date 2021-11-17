package com.company;

public class Medic extends Hero {
    @Override
    public void applySuperAbility() {
        setHp(200);
        setDamage(40);
        setSuperAbilityType("VENOM");
        System.out.println("Medic"  + "\n" + "hp:" + getHp() + "\n" + "damage:" + getDamage()+"\n" + "применил суперспособность:" + getSuperAbilityType());
    }

}

