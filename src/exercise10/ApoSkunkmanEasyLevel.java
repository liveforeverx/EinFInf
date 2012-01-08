package exercise10;

import java.awt.Point;

import apoSkunkman.ai.ApoSkunkmanAI;
import apoSkunkman.ai.ApoSkunkmanAILevel;
import apoSkunkman.ai.ApoSkunkmanAIPlayer;

public class ApoSkunkmanEasyLevel extends ApoSkunkmanAI {

    @Override
    public String getPlayerName() {
        return "WayFinder";
    }

    @Override
    public String getAuthor() {
        return "Dmitry Aleksandrov(Russ)";
    }

    @Override
    public void think(ApoSkunkmanAILevel level, ApoSkunkmanAIPlayer player) {
        Point goalX = level.getGoalXPoint();
        int difX = goalX.x - (int) player.getX();
        int difY = goalX.y - (int) player.getY();
        if (difX > 0) {
            player.movePlayerRight();
            return;
        }
        if (difY > 0) {
            player.movePlayerDown();
        }
    }
}
