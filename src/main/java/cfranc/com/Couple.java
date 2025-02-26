package cfranc.com;

public class Couple {
	
	private String first;
	private String second;
	
        
	public Couple(String w1, String w2) {
		init(w1, w2);
	}
        
        //Initializes Couple attributes w1 and w2
	public void init(String w1, String w2) {
		this.first = w1;
		this.second = w2;
	}
	
	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getSecond() {
		return second;
	}

	public void setSecond(String second) {
		this.second = second;
	}
        
        // override of the method hashCode with the method hashCodeEclispe
	@Override
	public int hashCode() {
		return hashCodeEclipse();
	}
        
        //Method that returns a hash (signed 32 bits int) of the instance's attribute
        //exemple : if first is null, prime * result + second.hashCode() is stored in result.
	int hashCodeEclipse() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((first == null) ? 0 : first.hashCode());
		result = prime * result + ((second == null) ? 0 : second.hashCode());
		return result;
	}
	
        //Method that compares two objects, if the instance equals obj returns true
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Couple other = (Couple) obj;
		if (first == null) {
			if (other.first != null)
				return false;
		} else if (!first.equals(other.first))
			return false;
		if (second == null) {
			if (other.second != null)
				return false;
		} else if (!second.equals(other.second))
			return false;
		return true;
	}

}
