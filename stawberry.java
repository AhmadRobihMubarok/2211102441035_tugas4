import greenfoot.*;

public class stawberry extends Actor {
    private GreenfootSound collectSound = new GreenfootSound("collect.mp3"); // Ganti dengan nama file suara Anda

    public stawberry() {
        setImage("object.png");
    }

    public void act() {
        checkForCollision();
    }

    public void checkForCollision() {
        Actor character3 = getOneIntersectingObject(Character3.class);
        if (character3 != null) {
            ((Character3) character3).increaseScore();
            getWorld().removeObject(this);
            playCollectSound(); // Memainkan efek suara
        }
    }

    public void playCollectSound() {
        collectSound.play();
    }
}
