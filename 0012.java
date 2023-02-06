import java.util.*;

public class Level1 {    public static String MassVote(int N, int[] Votes) {
        int maxVotes = Votes[0];
        int countMaxVotesRepeat = 0;
        int sumVotes = Votes[0];
        int numberOfWinner = 1;

        for (int numberOfCandidateInVotes = 1; numberOfCandidateInVotes < N; numberOfCandidateInVotes++) {
            sumVotes += Votes[numberOfCandidateInVotes];
            if (maxVotes < Votes[numberOfCandidateInVotes]) {
                maxVotes = Votes[numberOfCandidateInVotes];
                numberOfWinner = numberOfCandidateInVotes + 1;
                countMaxVotesRepeat = 0;
            } else if (Votes[numberOfCandidateInVotes] == maxVotes) {
                countMaxVotesRepeat++;
            }
        }
  
        if (countMaxVotesRepeat > 0) {
            return "no winner";
        } else if (Math.round((maxVotes * 100.0 / sumVotes) * 1000) / 1000.0d > 50.0) {
            return "majority winner " + numberOfWinner;
        } else return "minority winner " + numberOfWinner;
    }
}
