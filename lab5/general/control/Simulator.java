package lab5.general.control;

public class Simulator {
		boolean flag = true;
		public Simulator(){
			while(flag == true || EventQueue.isEmpty() == false){
				EventQueue.getFirst().execute();
			}
		}
}


