package lectures.animation.threads.ui;


public interface FancyShuttleAnimator {
	public int getAnimationStep();
	public void setAnimationStep(int animationStep) ;
	public int getAnimationPauseTime() ;
	public void setAnimationPauseTime(int animationPauseTime) ;
	public void animateShuttle();

}
