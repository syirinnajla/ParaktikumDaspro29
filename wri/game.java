package wri;
import java.util.Scanner;

public class game{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Roblox");
        System.out.println("2. Minecraft");
        System.out.println("3. PUBG");
        System.out.println("4. Valorant");
        System.out.println("pilih game yang mana?");
         int game = sc.nextInt();

         switch(game){
            case 1:
                System.out.println("bocil Roblox");
                break;
            case 2:
                System.out.println("bocil Minecraft");
                break;
            case 3:
                System.out.println("bocil PUBG");
                break;
            case 4:
                System.out.println("bocil Valorant"); 
                break;
                default:
                    System.out.println("Terimakasih");
                      

         }

    }
}

