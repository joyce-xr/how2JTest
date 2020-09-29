package intermediate.collectionPackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HeroNode {

    public HeroNode leftHeroNode;
    public HeroNode rightHeroNode;
    public Hero nodeValue;

    public void addHero(Hero hero){

        if (nodeValue == null){
            nodeValue = hero;
        }else {
            if(hero.hp <= nodeValue.hp){
                if(leftHeroNode == null){
                    leftHeroNode = new HeroNode();
                }
                leftHeroNode.addHero(hero);
            }else {
                if(rightHeroNode == null){
                    rightHeroNode = new HeroNode();
                }
                rightHeroNode.addHero(hero);
            }
        }

    }

    public List<Hero> traverse(){

        List<Hero> heroList = new LinkedList<>();

        if(leftHeroNode != null){
            heroList.addAll(leftHeroNode.traverse());
        }
        heroList.add(nodeValue);
        if(rightHeroNode != null){
            heroList.addAll(rightHeroNode.traverse());
        }

        return heroList;
    }

    public static void main(String[] args) {
        List<Hero> heroes = new ArrayList<>();
        for(int i=0; i<10;i++){
            heroes.add(new Hero("Hero"+i, (float)Math.random()*1000));
        }

        HeroNode heroNode = new HeroNode();
        for(Hero h: heroes){
            //System.out.printf("%s-%.2f\t",h.toString(),h.hp);
            heroNode.addHero(h);
        }

        System.out.println(heroNode.traverse());


    }
}
