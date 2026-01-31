package com.lambda.lightautomation;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		SmartLight light = new SmartLight();
		
		
        LightAction motionAction = () ->
                System.out.println("Motion detected → Lights ON at full brightness");

        LightAction nightAction = () ->
                System.out.println("Night time → Dim warm lights activated");

        LightAction voiceAction = () ->
                System.out.println("Voice command → Blue ambient lights turned ON");

		
        while(true) {
        	System.out.println();
        	System.out.println("======================================");
        	System.out.println("Choose an Option =>");
        	System.out.println("1. Motion detected");
            System.out.println("2. Night mode");
            System.out.println("3. Voice command");
            System.out.println("4. Exit");
            System.out.println("======================================");
            System.out.println();
            
            int option = input.nextInt();
            
            switch(option) {
            case 1 -> light.runLight(motionAction);
            case 2 -> light.runLight(nightAction);
            case 3 -> light.runLight(voiceAction);
            case 4 -> {
            	System.out.println("Exiting");
            	return;
            }
             
            
            
            }

        }
		                          
		
	}

}
