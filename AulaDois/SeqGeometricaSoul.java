package AulaDois;

public class SeqGeometricaSoul {
	 private int a;
	 private int n;
	 private int result;
	 private int count;
	 public SeqGeometricaSoul(int n) { //Construtor
	  this.a = 1;
	  this.n = n;
	  this.result = 0;
	  this.count = 0;
	 }
	 
	 public Integer next() {
	  if (count == 0) {
	   this.result = 1;
	   this.count++;
	  } else {
	   this.result = this.a * 3;
	   this.a = this.result;
	   this.count++;
	  }
	  return new Integer(result);
	 }
	 
	 public boolean hasNext() {
	  return this.count < this.n;
	 }
}
