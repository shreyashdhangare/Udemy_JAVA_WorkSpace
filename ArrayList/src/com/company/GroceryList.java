package com.company;

import java.util.ArrayList;

public class GroceryList {
        private ArrayList<String> groceryList = new ArrayList<>();


        public void addGroceryItem(String item){
               groceryList.add(item);
        }

        public void getGroceryList(){
            System.out.println("You have" + groceryList.size() + " in your List");
            for(int i = 0 ; i < groceryList.size() ; i++){
                System.out.println((i+1)+"."+groceryList.get(i));
            }
        }

        public void modifyGroceryList(int position , String item){
            groceryList.set(position,item);
            System.out.println("Grcery item" + (position+1) + "Has been modified");
        }

        public void removeItem(int position){
            String theItem = groceryList.get(position);
            groceryList.remove(position);

        }

        public String findItem(String searchItem){
           // boolean exits = groceryList.contains(searchItem);
            int position = groceryList.indexOf(searchItem);

            if(position > 0){
                return groceryList.get(position);
            }
            else{
                return null;
            }

        }



}
