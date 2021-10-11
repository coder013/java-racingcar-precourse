package racinggame;

import racinggame.controller.RacingGameCtrl;

import java.util.NoSuchElementException;

public class Application {
    public static void main(String[] args) {
        try {
            RacingGameCtrl racingGameCtrl = new RacingGameCtrl();
            racingGameCtrl.play();
        } catch (NoSuchElementException e) {
            System.out.println("[ERROR]");
        }
    }
}
