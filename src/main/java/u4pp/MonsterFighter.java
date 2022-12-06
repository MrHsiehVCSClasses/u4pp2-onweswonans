package u4pp;
import java.util.Scanner;

public class MonsterFighter {
    private boolean cont;
    private int userInput;
    
    public MonsterFighter(){
        cont = false;
        userInput = 0;
    }


    public void play (Scanner scanner){
        InputHelper clippy = new InputHelper(scanner);
        printLogo();
        
        if (clippy.getYesNoInput("do you want to enter the cave?") == true){
            System.out.println("you decend deep into the cavity, further than any man has ever gone before. who is this brave traveler? (input name) ");
            cont = true;
            Fighter player = new Fighter(scanner.nextLine(), 5, 3);
            Monster monster1 = new Monster("Goblin", 4, 1,1);
            DefenseMonster monster2 = new DefenseMonster("Dwarf", 10, 2, 20, 3);
            RandomMonster eldritchHorror = new RandomMonster("QWERTYUasdfghjYGVBHgdfgbvcfghb", 20, 100, 300);
            while(cont == true){
                System.out.println("as you stumble into the first cavern, you spot a little goblin man eating rocks without hesitation, you kick him and the fight begins");
                
                while (player.canFight() == true && monster1.canFight() == true){
                    userInput = clippy.getIntegerInput( "do you want to attack (1), block (2), or focus (3)", 1, 3);
                    if (userInput == 1){
                        player.attack(monster1);
                        System.out.println("you attacked. " + "The monster now has " + monster1.getHealth() + " health");
                    } else if (userInput == 2){
                        player.block();
                        System.out.println("you blocked");
                    } else if (userInput == 3){
                        player.focus();
                        System.out.println("you focused using your crystals you found off of the crazy person yesterday");
                    }
//System.out.println();
                    if(monster1.canFight() == true){
                    monster1.takeTurn(player);
                    System.out.println("the monster dealt " + monster1.getAttackPower() + ". You now have " + player.getHealth() + " health" );
                    }
                    }

                if (player.canFight() == true){
                    player.gainEXP(monster1.getExpGiven());
                    System.out.println("as you dive deeper into the dark moist cavern, you spot a little woman hunched in the corner. However, Upon closer inspection, you notice that this \"woman\" has a beard! HOW HIDEOUS!! you grab her face and pull the beard off");

                    while (player.canFight() == true && monster2.canFight() == true){
                        userInput = clippy.getIntegerInput( "do you want to attack (1), block (2), or focus (3)", 1, 3);
                        if (userInput == 1){
                            player.attack(monster2);
                            System.out.println("you attacked. " + "The monster now has " + monster2.getHealth() + " health");
                        } else if (userInput == 2){
                            player.block();
                            System.out.println("you blocked");
                        } else if (userInput == 3){
                            player.focus();
                            System.out.println("you focused using your crystals you found off of the crazy person yesterday");
                        }

                        if(monster2.canFight() == true){
                            monster2.takeTurn(player);
                            System.out.println("the monster dealt " + monster2.getAttackPower() + ". You now have " + player.getHealth() + " health" );
                            }
                    }

                    if (player.canFight() == true){
                        player.gainEXP(monster2.getExpGiven());
                        System.out.println("Finally you reach the bottom of the cave. here lies a monster so hideous and terrifying your mind bends from merely gazing at the writheing flesh that seems to be there but not there at the same time. the Monster seems to be a almalgum of matter that cannot even be described as matter. You begin to feel your mind shattering as your perception of all that is real is shattered as pure cosmic terror replaces all emotions you will ever feel ever");
                        while (player.canFight() == true && eldritchHorror.canFight() == true){
                            userInput = clippy.getIntegerInput( "do you want to attack (1), block (2), or focus (3)", 1, 3);
                            if (userInput == 1){
                                player.attack(eldritchHorror);
                            } else if (userInput == 2){
                                player.block();
                            } else if (userInput == 3){
                                player.focus();
                            }
                            if(eldritchHorror.canFight() == true){
                                int startHealth = player.getHealth();
                                eldritchHorror.takeTurn(player);

                                if (player.getHealth() == startHealth){
                                    System.out.println("oadihfdjlhfalsidjhfalskjdhfakdndjvrgavuyrhiejkbcreIAMTHEDEEPONEhjlakdjfhsdfjakhdflkajh");
                                } else {
                                System.out.println("the monster dealt " + eldritchHorror.getAttackPower() + ". You now have " + player.getHealth() + " health" );
                                }
                                }
                        }

                        if(player.canFight() == true){
                            System.out.println("you win");
                            cont = false;
                        } else{
                            System.out.println("you die");
                        cont = false;
                        }
                    } else{
                        System.out.println("you die");
                    cont = false;
                    }
                } else{
                    System.out.println("you die");
                    cont = false;
                }


            }

        } else {
            System.out.println("ok be a little wimpy stupid boy. too afraid of the cave");
        }
        
        
    }

    private void printLogo() {
        System.out.println( // looks a little weird because need to use double backslash to print 1 backslash
        "_______  _______  _        _______ _________ _______  _______    _______ _________ _______          _________ _______  _______ \n" +
        "(       )(  ___  )( (    |(  ____ \\\\__   __/(  ____ \\(  ____ )  (  ____ \\\\__   __/(  ____ \\|\\     /|\\__   __/(  ____ \\(  ____ )\n" +
        "| () () || (   ) ||  \\  ( || (    \\/   ) (   | (    \\/| (    )|  | (    \\/   ) (   | (    \\/| )   ( |   ) (   | (    \\/| (    )|\n" +
        "| || || || |   | ||   \\ | || (_____    | |   | (__    | (____)|  | (__       | |   | |      | (___) |   | |   | (__    | (____)|\n" +
        "| |(_)| || |   | || (\\ \\) |(_____  )   | |   |  __)   |     __)  |  __)      | |   | | ____ |  ___  |   | |   |  __)   |     __)\n" +
        "| |   | || |   | || | \\   |      ) |   | |   | (      | (\\ (     | (         | |   | | \\_  )| (   ) |   | |   | (      | (\\ (   \n" +
        "| )   ( || (___) || )  \\  |/\\____) |   | |   | (____/\\| ) \\ \\__  | )      ___) (___| (___) || )   ( |   | |   | (____/\\| ) \\ \\__\n" +
        "|/     \\|(_______)|/    )_)\\_______)   )_(   (_______/|/   \\__/  |/       \\_______/(_______)|/     \\|   )_(   (_______/|/   \\__/");
    }
}
