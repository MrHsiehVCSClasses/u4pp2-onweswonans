package u4pp;
import java.util.Scanner;
public class InputHelper {
    Scanner scanner = new Scanner(System.in);
    //a constructor which takes in a scanner that is used to read the input
    InputHelper(Scanner scanner){
        this.scanner = scanner;
    }

    /*takes in a prompt, asks the player the prompt. 
    Everytime the player does not answer something that starts with a `y`, `Y`, `n`, or `N`, 
    it tell the player that their input is invalid, and asks them the prompt again.
    Loops until proper input is given, at which point, it returns a `true` for yes and `false` for no.*/
    public boolean getYesNoInput(String prompt){
        String ans = "";
        while ( ans.equals("") || ans.charAt(0) != 'y' || ans.charAt(0) != 'n'){
            System.out.println(prompt + " Yes or No");
            ans = scanner.nextLine();
            ans = ans.toLowerCase();
            if (ans.charAt(0) == 'y'){
                return true;
            } else if ( ans.charAt(0) == 'n'){
                return false;
            } else{
                System.out.println("put in a valid input please :D");
            }
        }
        return true;


    }

    /*does the same thing as `getYesNoInput`, except for a few differences: 
    Repeatedly prompts until a proper integer input is given. The integer must be larger than or equal to `min`,
    and less than or equal to `max`.*/
    public int getIntegerInput(String prompt, int min, int max){
        boolean go = true;
        int ans;
        int trys = 0;
        while(go == true){
            System.out.println(prompt);
            ans = scanner.nextInt();
            if (ans < min || ans > max){
                System.out.println("wrong input, try again");
                trys += 1;
                if (trys > 3){
                    System.out.println("What the fuck did you just fucking say about me, you little bitch? Ill have you know I graduated top of my class in the Navy Seals, and Ive been involved in numerous secret raids on Al-Quaeda, and I have over 300 confirmed kills. I am trained in gorilla warfare and Im the top" + "/n" + "sniper in the entire US armed forces. You are nothing to me but just another target. I will wipe you the fuck out with precision the likes of which has never been seen before on this Earth, mark my fucking words. You think you can get away with saying that shit to me over the Internet? Think again, fucker. As we speak I am contacting my secret network of spies across the USA and your IP is being traced right now so you better prepare for the storm, maggot. The storm that wipes out the pathetic little thing you call your life. You’re fucking dead, kid. I can be anywhere, anytime, and I can kill you in over seven hundred ways, and thats just with my bare hands.Not only am I extensively trained in unarmed combat, but I have access to the entire arsenal of the United States Marine Corps and I will use it to its full extent to wipe your miserable ass off the face of the continent, you little shit. If only you could have known what unholy retribution your little “clever” comment was about to bring down upon you, maybe you would have held your fucking tongue.But you couldnt, you didnt, and now youre paying the price, you goddamn idiot. I will shit fury all over you and you will drown in it.Youre fucking dead, kiddo.");
                }
            }else {
                return ans;
            }
        }
        return -1;
    }

    


}

