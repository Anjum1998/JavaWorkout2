class Tile
{
    int edgeLength;
    int tileArea;
    Tile(int edgeLength)
    {
        this.edgeLength=edgeLength;
        tileArea=edgeLength*edgeLength;
    }
    int getTileArea()
    {
        return tileArea;
    }

}
class  Floor
{
    int length,width;
    Floor(int length,int width)
    {
        this.length=length;
        this.width=width;
    }
    void totalTiles(Tile t)
    {
        double tileArea=t.tileArea;
        double floorArea=length*width;
        double no_ofTiles=floorArea/ tileArea;
        System.out.println("No of tiles="+no_ofTiles);
    }
}
public class TotalTile {
    public static void main(String[] args) {
        Tile t1=new Tile(5);

        int s1= t1.edgeLength;
        System.out.println("Edge length: "+s1);

        int s= t1.getTileArea();
        System.out.println("TileArea is : "+s);

        Floor f1=new Floor(500,750);
        System.out.println("Floor length is: " + f1.length);
        System.out.println("Floor width is : "+ f1.width);
        f1.totalTiles(t1);
    }

}
