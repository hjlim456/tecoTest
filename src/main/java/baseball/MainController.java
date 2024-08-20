package baseball;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class MainController {
    public void run() {
        System.out.println("숫자 야구 게임을 시작합니다");
        do {
            //게임시작
            String userInput = readLine();
            //게임진행
            //게임종료
        }while(isRestartGame());
    }

    private boolean isRestartGame() {
        return true;
    }
}
