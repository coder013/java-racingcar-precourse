package racinggame;

import racinggame.controller.RacingGameCtrl;

public class Application {
    public static void main(String[] args) {
        RacingGameCtrl racingGameCtrl = new RacingGameCtrl();
        racingGameCtrl.play();
    }
}
