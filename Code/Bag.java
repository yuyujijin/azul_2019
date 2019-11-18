//We should had import to a xml file, for all package
import java.util.ArrayList;

public class Bag{
  private ArrayList<Tile> pieces;

  public Bag(){
    ArrayList<Tile> p = new ArrayList<Tile>(100);

    //On ajoute les 20 pièces de chaque couleur

    for(int i = 0 ; i < 100 ; i++){
      if(i<20) p.add(new Tile('r')); //Red
      if(i>=20 && i<40) p.add(new Tile('b')); //Blue
      if(i>=40 && i<60) p.add(new Tile('g')); //Green
      if(i>=60 && i<80) p.add(new Tile('w')); //White
      if(i>=80) p.add(new Tile('n')); //Noir
    }
    pieces = p;
  }

  //Methode pour mélanger
  public void shuffle(){
    Collections.shuffle(pieces);
  }

  //Methode pour voir si vide
  public boolean isEmpty(){
    return pieces.isEmpty();
  }

  //Methode pour prendre une pieces
  public Tile pick(){
    if(!isEmpty){
      shuffle();
      return p.remove(0);
    }
    return null;
  }
}