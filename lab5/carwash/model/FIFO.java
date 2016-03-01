package lab5.carwash.model;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class FIFO {

	ArrayList<Object> qList = new ArrayList<Object>(); //Skapar en arraylist
	int storlek = 0;	// Denna variabel används i maxSize

	public int size() {	 //Returnerar Storleken på ArrayList		
		return qList.size();
	}


	public boolean isEmpty() {	//Kollar om listan är tom och isf returnerar True
		if (qList.size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	public Object getFirst() {	//Returnerar listans första element
		if (isEmpty() == true)
			throw new NoSuchElementException();
		else {
			return qList.get(0);
		}
	}

	public void deleteFirst() throws NoSuchElementException {   //Tar bort listans första element
		if (qList.size() == 0) {
			throw new NoSuchElementException();
		} else {
			qList.remove(0);
		}
	}


	public void add(Object item) { //Lägger till ett element i listan
		qList.add(item);
	}
}
