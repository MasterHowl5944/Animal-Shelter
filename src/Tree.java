import java.awt.Color;

public class Tree {
    private double heightFt;
    private double trunkDiameterInches;
    private TreeType treeType;
    static Color TRUNK_COLOR = new Color(102, 51, 0);

    public Tree(double heightFt, double trunkDiameterInches, TreeType treeType) {
        this.heightFt = heightFt;
        this.trunkDiameterInches = trunkDiameterInches;
        this.treeType = treeType;
    }

    public Tree() {
    }

    void grow() {
        this.heightFt = this.heightFt + 10;
        this.trunkDiameterInches = this.trunkDiameterInches + 1;
    }

    public double getHeightFt() {
        return heightFt;
    }

    public void setHeightFt(double heightFt) {
        this.heightFt = heightFt;
    }

    public double getTrunkDiameterInches() {
        return trunkDiameterInches;
    }

    public void setTrunkDiameterInches(double trunkDiameterInches) {
        this.trunkDiameterInches = trunkDiameterInches;
    }

    public TreeType getTreeType() {
        return treeType;
    }

    public void setTreeType(TreeType treeType) {
        this.treeType = treeType;
    }
    void announceTallTree() {
        if (getHeightFt() > 100) {
            System.out.println("That's a tall" + getTreeType() + " tree!");
        }
    }
    static void announceTree() {
                System.out.println("Look out for that " + TRUNK_COLOR + " tree!");}
}
