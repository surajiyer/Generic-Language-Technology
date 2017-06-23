public class SampleBuildStep extends RobotFrame {
	public SampleBuildStep() {}
	
	protected void perform() {
		if (isAllowedRow(1) && isAllowedCol(4)) {
			addWall(1, 4);
			minipause();
		} else {
			reportError("Attempted to build wall outside of the playground!");
		}
		if (canMove()) {
			moveKaja();
			pause();
		} else {
			reportError("Oops, There's a wall in front of me. I can't make a step forward.");
		}
	}
	
	public static void main(String[] args){
		SampleBuildStep script = new SampleBuildStep();
		script.initializeComponents();
		script.run();
	}
}