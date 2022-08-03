public class BonusMilesService {
    public int calculate(int cost) {

        int costBonusMile = 20;

        int bonusMile = cost / costBonusMile;

        return bonusMile;
    }
}
