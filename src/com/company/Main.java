package com.company;

public class Main{

    public static int bossHealth = 700;
    public static int bossDamage = 35;
    public static String bossDefence = "";
    public static int[] heroesHealth = {260, 250, 270, 200};
    public static int[] heroesDamage = {15, 20, 10, 0};
    public static String[] heroesAttackType = {
            "Physical", "Magical", "Kinetic", "Medic"};

    public static void main(String[] args) {

        System.out.println("+++++++++++++++++");
        System.out.println("Boss health " + bossHealth + " ["
                + bossDamage + "]");
        for (int i = 0; i < heroesHealth.length; i++) {
            System.out.println(heroesAttackType[i]
                    + "health: " + heroesAttackType[i] + " ["
                    + heroesDamage[i] + "]");
        }


            }
        }








///Добавить 4-го игрока Medic, у которого есть способность лечить после каждого раунда на N-ное количество единиц здоровья
// только одного из членов команды, имеющего здоровье менее 100 единиц.
// Мертвых героев медик оживлять не может, и лечит он до тех пор пока жив сам. Медик не участвует в бою, но получает урон от Босса. Сам себя медик лечить не может.Добавить 4-го игрока Medic, у которого есть способность лечить после каждого раунда на N-ное количество единиц здоровья только одного из членов команды, имеющего здоровье менее 100 единиц. Мертвых героев медик оживлять не может, и лечит он до тех пор пока жив сам.
// Медик не участвует в бою, но получает урон от Босса.
// Сам себя медик лечить не может.//