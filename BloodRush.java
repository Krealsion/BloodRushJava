package bloodrush;

import java.util.Timer;
import java.util.TimerTask;

public class BloodRush {

	public static void main(String[] args) {
		StateManager MasterController = new StateManager();
		Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (!MasterController.IsRunning()){
					System.exit(0);
				}else{
					MasterController.Update();
				}
            }
        }, 0, 16);
	}
}
