package Task27;

public	class Pair<T, U> {
	    private T first;
	    private U second;

	    public Pair(T first, U second) {
	        this.first = first;
	        this.second = second;
	    }

	    public T getFirst() {
	        return first;
	    }

	    public U getSecond() {
	        return second;
	    }

	    public void setFirst(T first) {
	        this.first = first;
	    }

	    public void setSecond(U second) {
	        this.second = second;
	    }

	    @Override
	    public String toString() {
	        return "(" + first + ", " + second + ")";
	    }
	}

	
	class Utils {
	    public static <T> void swap(Pair<T, T> pair) {
	        T temp = pair.getFirst();
	        pair.setFirst(pair.getSecond());
	        pair.setSecond(temp);
	    }

	    public static <T extends Comparable<T>> T findMaximum(T a, T b, T c) {
	        T max = a;
	        if (b.compareTo(max) > 0) {
	            max = b;
	        }
	        if (c.compareTo(max) > 0) {
	            max = c;
	        }
	        return max;
	    }
	}

	
	

