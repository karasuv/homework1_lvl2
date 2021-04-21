public class Homework1 {
    public static void main(String[] args) {
            Object[] tests = {
                        new Wall(0.5),
                        new Track(100),
                        new Track(1000),
                          new Wall(1),
                        new Wall(1.5),
                        new Track(10000),


            };
            Playerable[] players = {
                        new Human("ГТОшник",1.6,3000),
                        new Robot("R2D2",1,15000),
                        new Cat ("Котейка",1.2,200),
                        new Robot("C3PO",2,25000),
                        new Human("Марафонец",2.2,42000)
            };


            for (Object test : tests){
                if (test instanceof Wall) {
                System.out.println("высота препятствия: "+((Wall) test).getHeight());}
                if (test instanceof Track) {
                    System.out.println("длина беговой дорожки: "+((Track) test).getDistance());}

            for (Playerable player: players) {
                if (test instanceof Wall) {

                            if (player instanceof Human && ((Human) player).isStopGame()==false)
                    if (((Wall) test).getHeight()< ((Human) player).getHeightLimit()){
                    player.jump();}
                    else {System.out.println(((Human) player).getName() +" прекращает прохождение препятствий");
                        ((Human) player).setStopGame(true);
                    }

                    if (player instanceof Robot && ((Robot) player).isStopGame()==false)
                        if (((Wall) test).getHeight()< ((Robot) player).getHeightLimit()){
                            player.jump();}
                        else {System.out.println(((Robot) player).getName() +" прекращает прохождение препятствий");
                            ((Robot) player).setStopGame(true);
                        }

                    if (player instanceof Cat && ((Cat) player).isStopGame()==false)
                        if (((Wall) test).getHeight()< ((Cat) player).getHeightLimit()){
                            player.jump();}
                        else {System.out.println(((Cat) player).getName() +" прекращает прохождение препятствий");
                            ((Cat) player).setStopGame(true);
                        }

                }
                if (test instanceof Track) {
                    if (player instanceof Human && ((Human) player).isStopGame()==false)
                        if (((Track) test).getDistance()< ((Human) player).getDistanceLimit()){
                            player.run();}
                        else {System.out.println(((Human) player).getName() +" прекращает прохождение препятствий");
                            ((Human) player).setStopGame(true);
                        }

                    if (player instanceof Robot && ((Robot) player).isStopGame()==false)
                        if (((Track) test).getDistance()< ((Robot) player).getDistanceLimit()){
                            player.run();}
                        else {System.out.println(((Robot) player).getName() +" прекращает прохождение препятствий");
                            ((Robot) player).setStopGame(true);
                        }

                    if (player instanceof Cat && ((Cat) player).isStopGame()==false)
                        if (((Track) test).getDistance()< ((Cat) player).getDistanceLimit()){
                            player.run();}
                        else {System.out.println(((Cat) player).getName() +" прекращает прохождение препятствий");
                            ((Cat) player).setStopGame(true);
                        }

                }

            }
            }
        System.out.println("тесты все пройдены");


        for (Playerable player : players) {
                if ( player instanceof Human && !((Human) player).isStopGame())
                    System.out.println(((Human) player).getName() + " прошел все соревнования");

            if ( player instanceof Robot && !((Robot) player).isStopGame())
                System.out.println(((Robot) player).getName() + " прошел все соревнования");

            if ( player instanceof Cat && !((Cat) player).isStopGame())
                System.out.println(((Cat) player).getName() + " прошел все соревнования");


           }


    }
}
