package AulaDois;

public class SeqGeometrica {
 public static void main(String args[]) {
  final int FINISH = 8;
  SeqGeometricaSoul geometrica = new SeqGeometricaSoul(FINISH);
  do {
   Integer element = geometrica.next();
   System.out.println(element);
  } while (geometrica.hasNext());
 }
}