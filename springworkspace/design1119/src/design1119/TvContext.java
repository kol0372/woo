package design1119;

public class TvContext  implements State {
		 
	    private State tvState;
	 
	    public void setState(State state) {
	        this.tvState=state;
	    }
	 
	    public State getState() {
	        return this.tvState;
	    }
	 
	    @Override
	    public void doAction() {
	        this.tvState.doAction();
	    }
	 
	}

