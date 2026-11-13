package latihanSmster1.Loop;

public class Looping{
    public static void main(String[] args){
        try(java.util.Scanner scanner = new java.util.Scanner(System.in)){
            while(true){
                System.out.println("Say hello to Alice!");
                String greeting = scanner.nextLine();
                do{
                    if(!greeting.equalsIgnoreCase("Hello")){
                        System.out.println("You must say hello to Alice!");
                        greeting = scanner.nextLine();
                    }
                }while(!greeting.equalsIgnoreCase("Hello"));
                if (greeting.equalsIgnoreCase("Hello")){
                    System.out.println("Hello user, i'm Alice. Nice to meet you!");
                }
                System.out.println("Want to say hello again to alice? (Y/N)");
                String ask = scanner.nextLine();
                do{
                    if((!ask.equalsIgnoreCase("Y"))&&(!ask.equalsIgnoreCase("N"))){
                        System.out.println("Choose correct option!");
                        ask = scanner.nextLine();
                    }
                }while ((!ask.equalsIgnoreCase("Y"))&&(!ask.equalsIgnoreCase("N")));
                if (ask.equalsIgnoreCase("N")){
                    System.out.println("See you!");
                    break;
                }
            }
        }
    }
}
