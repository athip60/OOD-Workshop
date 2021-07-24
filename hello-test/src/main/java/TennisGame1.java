import java.util.Objects;

public class TennisGame1 {
    private int m_score1 = 0;
    private int m_score2 = 0;
    private final String player1Name;
    private final String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (Objects.equals(playerName, this.player1Name)) {
            m_score1++;
        } else {
            m_score2++;
        }
    }

    public String getScore() {
        String[] scoreResults = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
        // All
        if (isAll()) {
            return scoreResults[m_score1] + "-" + "All";
        }

        // Deuce
        if (isDeuce()) {
            // Deuce
            return "Deuce";
        }

        // ???? Advantage and Win ????
        if (m_score1 >= 4 || m_score2 >= 4) {
            StringBuilder score = new StringBuilder();
            int minusResult = m_score1 - m_score2;
            if (minusResult == 1 || minusResult == -1) score = new StringBuilder("Advantage ").append(CheckAdvantage());
            else if (minusResult >= 2) score = new StringBuilder("Win for ").append(CheckWinner());
            else score = new StringBuilder("Win for ").append(CheckWinner());
            return score.toString();
        }

        // Normal game
        return scoreResults[m_score1] + "-" + scoreResults[m_score2];
    }

    private boolean isDeuce() {
        return m_score1 == m_score2 && m_score1 > 2;
    }

    private boolean isAll() {
        return m_score1 == m_score2 && m_score1 <= 2;
    }

    private String CheckWinner() {
        if (m_score1 > m_score2) {
            return this.player1Name;
        } else if (m_score1 < m_score2) {
            return this.player2Name;
        }
        return this.player2Name;
    }
    private String CheckAdvantage() {
        if (m_score1 < m_score2) {
            if (m_score2 % 2 != 0) {
                return this.player2Name;
            }
        }
         else {
            return this.player1Name;
        }
        return this.player2Name;
    }
}