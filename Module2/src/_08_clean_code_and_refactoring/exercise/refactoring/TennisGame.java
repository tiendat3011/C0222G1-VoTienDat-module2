package _08_clean_code_and_refactoring.exercise.refactoring;

public class TennisGame {
    public static final int ADVANTAGE1 = 1;
    public static final int ADVANTAGE2 = -1;
    public static final int WISCONSINITE = 2;
    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String score = "";
        int tempScore = 0;
        if (player1Score == player2Score) {
            score = check1(player1Score);
        } else if (player1Score >= 4 || player2Score >= 4) {
            score = check2(player1Score, player2Score);
        } else {
            score = check3(player1Score, player2Score, tempScore);
        }
        return score;
    }

    public static String check1(int player1Scores) {
        String score = "";
        switch (player1Scores) {

            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }

    public static String check2(int player1Scores, int player2Scores) {
        String score = "";
        int scoreDifference = player1Scores - player2Scores;
        if (scoreDifference == ADVANTAGE1) score = "Advantage player1";
        else if (scoreDifference == ADVANTAGE2) score = "Advantage player2";
        else if (scoreDifference >= WISCONSINITE) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }

    public static String check3(int player1Scores, int player2Scores, int tempScore) {
        String score = "";
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = player1Scores;
            else {
                score += "-";
                tempScore = player2Scores;
            }
            switch (tempScore) {
                case 0:
                    score += "Love";
                    break;
                case 1:
                    score += "Fifteen";
                    break;
                case 2:
                    score += "Thirty";
                    break;
                case 3:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }
}







