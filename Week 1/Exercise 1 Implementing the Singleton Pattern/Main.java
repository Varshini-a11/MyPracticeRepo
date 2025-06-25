package com.singleton.demo;

public class Main {

	public static void main(String[] args) {
		SingletonExample obj1 = SingletonExample.getInstance();
        SingletonExample obj2 = SingletonExample.getInstance();

        obj1.showMessage();

        if (obj1 == obj2) {
            System.out.println("Both obj1 and obj2 refer to the same Singleton instance.");
        } else {
            System.out.println("Different instances exist (which shouldn't happen in Singleton).");
        }
    }

	}


