package com.company;

public abstract class Hero implements HavingSuperAbility {
    int hp;
    int damage;
    String superAbilityType;

    public int getHp(){
        return hp;
    }

    public int getDamage() {
        return damage;
    }
    public String getSuperAbilityType(){
        return superAbilityType;
    }

    public void setHp(int hp){
        this.hp = hp;
    }
    public void setDamage(int damage){
        this.damage = damage;
    }
    public void setSuperAbilityType(String superAbilityType){
        this.superAbilityType = superAbilityType;
    }

    @Override
    public void applySuperAbility() {

    }
}
