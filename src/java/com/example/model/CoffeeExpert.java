package com.example.model;

import java.util.*;

public class CoffeeExpert {
    public List getTypes(String type, String drink) {
        List types = new ArrayList();
        if(drink.equals("iced")){
            switch (type) {
                case "milky":
                    types.add("Cappuccino"); types.add("images/icedcappuccino.jpg");
                    types.add("Latte"); types.add("images/icedlatte.png");
                    types.add("Mocha"); types.add("images/icedmocha.png"); 
                break;
                case "strong":
                    types.add("Iced Coffee"); types.add("images/icedcoffee.png");
                    types.add("Espesso");types.add("images/icedespresso.jpg");
                    types.add("NesCafe Frappe"); types.add("images/icednescafe.jpg");
                break;
                case "sweet":
                    types.add("NesCafe Icecram"); types.add("images/nescafeicecream.jpg");
                    types.add("Caramel"); types.add("images/icedcaramellatte.png");
                    types.add("Whipped Cream"); types.add("images/icedwhite.png");
                break;
                case "classic":
                    types.add("Greek Coffee Iced");types.add("images/greekiced.jpg");
                    types.add("Irish Coffee Iced");types.add("images/irishcoffee.png");
                break;
                default:
                    types.add("No coffee");
                break;
            }
        }
        else if(drink.equals("hot")){
            switch (type) {
                case "milky":
                    types.add("Cappuccino"); types.add("images/cappuccino.png");
                    types.add("Latte Macchiato"); types.add("images/lattemacchiato.png");
                    types.add("Latte"); types.add("images/caffelatte.png");
                break;
                case "strong":
                    types.add("Americano"); types.add("images/caffeamericano.png");
                    types.add("Espesso");types.add("images/espresso.png");
                    types.add("Macchiato"); types.add("images/caffemacchiato.png");
                    types.add("NesCafe"); types.add("images/nescafe.jpg");
                break;
                case "sweet":
                    types.add("White Chocolate Mocha"); types.add("images/whitechocmocha.png");
                    types.add("Mocha"); types.add("images/caffemocha.png");
                break;
                case "classic":
                    types.add("Greek Coffee"); types.add("images/greekcoffee.jpg");
                    types.add("Filter Coffee"); types.add("images/filter.jpg");
                    types.add("Irish Coffee"); types.add("images/irish.jpg");
                break;
                default:
                    types.add("No coffee");
                break;
            }
        }
        return(types);
    }
}