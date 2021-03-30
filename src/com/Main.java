package com;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scn = new Scanner(new InputStreamReader(System.in));
	    Double x = scn.nextDouble();
	    Integer n = scn.nextInt();
	    Problems_manager pm = new Problems_manager();
	    System.out.println(pm.second(x, n));
    }
}
