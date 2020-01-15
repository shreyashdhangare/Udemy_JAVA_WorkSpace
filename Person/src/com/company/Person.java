package com.company;

public class Person {
        private String firstName,lastName;
        int age;


        public String getFirstName(){
            return firstName;
        }

        public String getLastName(){
            return lastName;
        }

        public int getAge(){
            return age;
        }

        public void setFirstName(String name){
            this.firstName = name;
        }

        public void setLastName(String surname){
            this.lastName = surname;
        }

        public void setAge(int age){
            if(age < 0 || age >100){
                this.age = 0;
            }
            else{
                this.age = age;
            }
        }

        public boolean isTeen(){
            if(this.age >12 && this.age < 20){
                return true;
            }
            else return false;
        }

        public String getFullName(){
            if(firstName.isEmpty()){
                return this.lastName;
            }
            else if(lastName.isEmpty()){
                return this.firstName;
            }
            else if(firstName.isEmpty() && lastName.isEmpty()){
                return " ";
            }
            else return firstName + lastName;
        }

}
