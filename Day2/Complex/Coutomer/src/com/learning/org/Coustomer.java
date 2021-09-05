package com.learning.org;

    public class Coustomer {
        private int cId;
        private String cName;
        private String cAddress;
        private int cMobile;



        public Coustomer(){
            System.out.println("Default constructor of coustomer is called");
            cId=0;
            cName="";
            cAddress="";
            cMobile=0;
        }

        public Coustomer(int cId, String cName, String cAddress, int cMobile) {
            System.out.println("Parameterised constructor of coustomer is called");
            this.cId = cId;
            this.cName = cName;
            this.cAddress = cAddress;
            this.cMobile = cMobile;
        }

        public void showCoustomerDetails(){
            System.out.println("Coustomer details are "+cId+" Name :- "+cName+" Salary :- "+cAddress+" Mobile No :- "+cMobile);
        }
    }


