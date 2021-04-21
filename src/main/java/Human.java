public class Human implements Playerable{
    private double heightLimit;
    private int distanceLimit;
    private boolean isStopGame;
    private String name;


    Human(String name,double heightLimit, int distanceLimit){
        this.name=name;
        this.heightLimit=heightLimit;
        this.distanceLimit=distanceLimit;
        this.isStopGame=false;
    }

    public String getName() {
        return name;
    }

    public void setStopGame(boolean stopGame) {
        isStopGame = stopGame;
    }

    public boolean isStopGame() {
        return isStopGame;
    }

    public double getHeightLimit() {
        return heightLimit;
    }

    public void setHeightLimit(double heightLimit) {
        this.heightLimit = heightLimit;
    }

    public int getDistanceLimit() {
        return distanceLimit;
    }

    public void setDistanceLimit(int distanceLimit) {
        this.distanceLimit = distanceLimit;
    }



    @Override
    public void jump() {
      if (!this.isStopGame)  System.out.println(this.getName()+ " is Jumping");
     // else System.out.println(this.getName()+" прекратил выступление");
    }

    @Override
    public void run() {
        if (!this.isStopGame) System.out.println(this.getName()+ " is Running");
       // else System.out.println(this.getName()+ " прекратил выступление");
    }
}
