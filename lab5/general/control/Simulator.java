package lab5.general.control;

public class Simulator {
		private EventQueue q1;
		private SimState state1;
		private SimView view1;
		public run(){
			while(state1.isActive == true && q.isEmpty() == false){
				q.getFirst().execute();
			}
		}
		public Simulator(SimState state, EventQueue q, SimView view){
			q1 = q;
			state1 = state;
			view1 = view;
		}
}


