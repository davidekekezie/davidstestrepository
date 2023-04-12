package assessment;

import java.util.Scanner;

public class nokiaMenu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("press 1 for Phonebook ");
        System.out.println("press 2 for  Messages");
        System.out.println("press 3 for chats");
        System.out.println("press 4 for call register");
        System.out.println("press 5 for Templates");
        System.out.println("press 6 for Tones ");
        System.out.println("press 7 for Call divert");
        System.out.println("press 8 for Games");
        System.out.println("press 9 for Calculator");
        System.out.println("press 10 for Reminders");
        System.out.println("press 11 for Clock");
        System.out.println("press 12 for Profiles");
        System.out.println("press 13 for SIM services");

        int choice = input.nextInt();
        switch (choice){

            case 1 -> {

                System.out.println("press 1 for search");
                System.out.println("press 2 for service Nos.");
                System.out.println("press 3 for add name");
                System.out.println("press 4 for Erase ");
                System.out.println("press 5 for Edit");
                System.out.println("press 6 for assign tone");
                System.out.println("press 7 for send b'day card");
                System.out.println("press 8 for options");
                System.out.println("press 9 for speed dials");
                System.out.println("press 10 for voice tags");

                int phoneBook =input.nextInt();

                switch (phoneBook){
                    case 1 -> System.out.println("Search");
                    case 2 -> System.out.println("Service Nos.");
                    case 3 -> System.out.println("Add name");
                    case 4 -> System.out.println("erase");
                    case 5 -> System.out.println("Edit");
                    case 6 -> System.out.println("Assign tone");
                    case 7 -> System.out.println("send b'card");
                    case 8 ->{

                        System.out.println("press 1 for type of view");
                        System.out.println("press 2 for Memory Status");
                        int options = input.nextInt();
                        switch (options){

                            case 1 -> System.out.println("Type of view");
                            case 2-> System.out.println("Memory Status");
                            default -> System.out.println("stop that");
                        }
                    }
                    case 9 -> System.out.println("Speed dials");
                    case 10 -> System.out.println("Voice tags");
                    default -> System.out.println("Stop that");



                }




            }
            case 2 ->{

                System.out.println("press 1 for Write messages");
                System.out.println("press 2 for Inbox");
                System.out.println("press 3 for Outbox");
                System.out.println("press 4 for Picture messages");
                System.out.println("press 5 for Templates");
                System.out.println("press 6 for smileys");
                System.out.println("press 7 for message settings");
                System.out.println("press 8 for info service");
                System.out.println("press 9 for voice mailbox number");
                System.out.println("press 10 for Service command editor");
            int messages =input.nextInt();
            switch (messages){

                case 1 -> System.out.println("write messages");
                case 2 -> System.out.println("inbox");
                case 3 -> System.out.println("Outbox");
                case 4 -> System.out.println("picture messages");
                case 5 -> System.out.println("templates");
                case 6 -> System.out.println("smileys");
                case 7 ->{
                    System.out.println("press 1 for set 1");
                    System.out.println("press 2 for common");

                    int messageSettings =input.nextInt();
                    switch (messageSettings){

                        case 1 ->{
                            System.out.println("press 1 for centre number");
                            System.out.println("print 2 for messages sent as");
                            System.out.println("print 3 for message validity");

                            int setOneChoice =input.nextInt();
                            switch (setOneChoice){
                                case 1 -> System.out.println("message centre number");
                                case 2 -> System.out.println("messages sent as");
                                case 3 -> System.out.println("message validity");
                                default -> System.out.println("stop that");
                            }
                        }
                        case 2->{

                            System.out.println("press 1 for delivery reports");
                            System.out.println("press 2 for reply via same centre");
                            System.out.println(" press 3 for character support");
                            int common = input.nextInt();
                            switch (common){

                                case 1 -> System.out.println("Delivery reports");
                                case 2 -> System.out.println("reply via same centre");
                                case 3 -> System.out.println("character support");
                                default -> System.out.println("stop");
                            }

                        }

                    }




                }
                case 8 -> System.out.println("info service");
                case 9 -> System.out.println("voice mailbox number");
                case 10 -> System.out.println("Service command editor");
                    default -> System.out.println("stop that");

            }




            }
            case 3 -> System.out.println("Chat");
            case 4 ->{
                System.out.println("press 1 for missed calls");
                System.out.println("press 2 for recieved calls");
                System.out.println("press 3 for dialed calls");
                System.out.println("press 4 for erase recent call lists");
                System.out.println("press 5 for show call duration");
                System.out.println("press 6 for show call costs");
                System.out.println("press 7 for call cost setting");
                System.out.println("press 8 for prepaid credit");
                int register = input.nextInt();
                switch (register){

                    case 1 -> System.out.println("missed calls");
                case 2 -> System.out.println("recieved calls");
                case 3 -> System.out.println("dialed numbers");
                case 4 -> System.out.println("erase recent calls lists ");
                case 5 ->{
                    System.out.println("press 1 for last call duration");
                    System.out.println("press 2 for all calls duration");
                    System.out.println("press 3 for recieved calls' duration");
                    System.out.println("press 4 for dialed calls' duration");
                    System.out.println("press 5 for clear times");
                    int callDuration = input.nextInt();
                    switch (callDuration){
                        case 1 -> System.out.println("last call duration");
                        case 2 -> System.out.println("all calls duration");
                        case 3-> System.out.println("recieved calls' duration");
                        case 4 -> System.out.println("dialed calls' duration");
                        case 5 -> System.out.println("clear times");
                        default -> System.out.println("stop that");
                    }




                }
                case 6 ->{

                    System.out.println("press 1 for last call cost");
                    System.out.println("press 2 for all call cost");
                    System.out.println("press 3 for clear counters");
                    int callCost = input.nextInt();
                    switch (callCost){
                        case 1 -> System.out.println("Last call cost");
                        case 2 -> System.out.println("All calls' cost");
                        case 3 -> System.out.println("Clear counters");
                        default -> System.out.println("stop stat");
                    }


                }
                case 7 ->{
                    System.out.println(" press 1 for call cost limit");
                    System.out.println("press 2 for show costs in");
                    int costSettings = input.nextInt();
                    switch (costSettings){
                        case 1 -> System.out.println("call cost limit");
                        case 2 -> System.out.println("show costs in");
                        default -> System.out.println("stop that");
                    }



                }
                case 8 -> System.out.println("prepaid credit");



                }







            }
            case 5 -> {
                System.out.println("press 1 for Ringing time");
                System.out.println("press 2 for Ringing Volume");
                System.out.println("press 3 for incoming call alert");
                System.out.println("press 4 for Composer");
                System.out.println("press 5 for Message alert tone");
                System.out.println("press 6 for Keypad tones");
                System.out.println("press 7 for Warning and game tones");
                System.out.println("press 8 for Vibrating alert");
                System.out.println("press 9 for Screen Saver");
                int tones = input.nextInt();
                switch (tones){

                    case 1 -> System.out.println("ringing tone");
                    case 2 -> System.out.println("Ringing volume");
                    case 3 -> System.out.println("Incoming call alert");
                    case 4 -> System.out.println("composer");
                    case 5 -> System.out.println("Message alert tone");
                    case 6 -> System.out.println("Keypad Tones");
                    case 7 -> System.out.println("Warning and game tones");
                    case 8 -> System.out.println("Vibrating alert");
                    case 9 -> System.out.println("Screen Saver");
                    default -> System.out.println("no");

                }


            }
            case 6 ->{


                System.out.println("press 1 for call settings ");
                System.out.println("press 2 for phone settings");
                System.out.println("press 3 for security setting");
                System.out.println("press 4 for  restore factory settings" );
        int settings = input.nextInt();
        switch (settings){

            case 1->{
                System.out.println("press 1 for automatic redial");
                System.out.println("press 2 for speed dialling ");
                System.out.println("press 3 for call waiting options");
                System.out.println("press 4 fo own number sending ");
                System.out.println("press 5 phone line in use");
                System.out.println("press 6 for automatic answer");

                int callSettings =input.nextInt();
                switch (callSettings){
                    case 1 -> System.out.println("automatic redial");
                    case 2 -> System.out.println("speed dialling");
                    case 3-> System.out.println("call waiting options");
                    case 4 -> System.out.println("own number sending");
                    case 5 -> System.out.println("phone line in use");
                    case 6 -> System.out.println("automatic answerr");
                    default -> System.out.println("stop");
                }

            }
            case 2 ->{
                System.out.println("press 1 for language ");
                System.out.println("press 2 for cell info display");
                System.out.println("press 3 for welcome note");
                System.out.println("press 4 for network selection" );
                System.out.println("press 5 for lights");
                System.out.println("press 6 for confirm sim service actions");
                int phoneSettings = input.nextInt();
                switch (phoneSettings){
                    case 1 -> System.out.println("language");
                    case 2-> System.out.println("cell info display");
                    case 3 -> System.out.println("welcome note");
                    case 4-> System.out.println("network selection");
                    case 5-> System.out.println("lights");
                    case 6-> System.out.println("confirm sim service actions");
                    default -> System.out.println("stop ");
                }

            }
            case 3 ->{
                System.out.println("press 1 for pin code request");
                System.out.println("press 2 for call barring service");
                System.out.println("press 3 for fixed dialling");
                System.out.println("press 4 for closed user group");
                System.out.println("press 5 for phone security");
                System.out.println("press 6 for change access code");
                int securitySettings = input.nextInt();
                switch (securitySettings){

                    case 1-> System.out.println("pin code requset");
                    case 2-> System.out.println("call barring service");
                    case 3-> System.out.println("fixed dialling");
                    case 4-> System.out.println("closed user group");
                    case 5 -> System.out.println("phone security");
                    case 6 -> System.out.println(" change access code");
                    default -> System.out.println("stop that");

                }
            }
            case 4 -> System.out.println("restore factory settings");
            default -> System.out.println("stop that");
        }




            }
            case 7 -> System.out.println("call divert");
            case 8 -> System.out.println("Games");
            case 9 -> System.out.println("calculator");
            case 10 -> System.out.println("Reminders");
            case 11 -> {

                System.out.println("press 1 for Alarm Clock");
                System.out.println("press 2 for Clock setting");
                System.out.println("press 3 for Date Settings ");
                System.out.println("press 4 for Stopwatch");
                System.out.println("press 5 for Countdown timer");
                System.out.println("press 6 for Auto update of date and time");

                int clock = input.nextInt();
                switch (clock){

                    case 1 -> System.out.println("Alarm Clock");
                    case 2 -> System.out.println("Clock Setting");
                    case 3 -> System.out.println("Date Settings ");
                    case 4 -> System.out.println("Stop watch ");
                    case 5 -> System.out.println("Countdown Timer");
                    case 6 -> System.out.println("Auto update of date and time");
                    default -> System.out.println("stop that");
                }
            }
            case 12 -> System.out.println("profiles");
            case 13 -> System.out.println("SIM services");
            default -> System.out.println("stop that");


        }
    }








}
