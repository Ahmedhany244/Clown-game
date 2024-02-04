package Controller;

import Model.Easy;
import Model.Hard;
import Model.Meduim;
import Model.MyWorld;
import View.Main_Menu;
import eg.edu.alexu.csd.oop.game.GameEngine;


public class GameController {
    public static void main(String[] args) {
        int choice=0;
        Main_Menu menu=new Main_Menu();
        while(choice==0){
            choice= menu.getChoice();
            System.out.print("");
        }
        //System.out.println("ff");
        MyWorld world=MyWorld.getInstance();
        if(choice==1)
            world.setStrategy(new Easy());
        else if(choice==2)
            world.setStrategy(new Meduim());
        else world.setStrategy(new Hard());
        final GameEngine.GameController gameController = GameEngine.start("Circus Of Plates", MyWorld.getInstance());
    }
}
