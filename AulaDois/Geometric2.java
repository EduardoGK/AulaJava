package AulaDois;

public class Geometric2 {
	  private int last;
	    private int previous;
	    private int sequence;
	    private int count;

	    public void FibonaccisSoul(int sequence) { //Contrutor
	        this.last = 1;
	        this.previous = 1;
	        this.sequence = sequence;
	        this.count = 1;
	    }

	    public Integer next() {
	        int result;
	        switch (count) {
	        case 1:
	            result = this.previous; 
	            break;
	        case 2:
	            result = this.last;
	            break;
	        default:
	            result = this.previous + this.last;
	            previous = this.last;
	            last = result;
	            break;
	        }
	        count++;
	        return new Integer(result);
	    }

	    public boolean hasNext() {
	        return this.count <= this.sequence;
	    }
	}
