package bloodrush;

import com.sun.glass.events.KeyEvent;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

public class MainMenuState extends GameState {

	public MainMenuState(Renderer Render, StateManager Controller) {
		super(Render, Controller);
	}

	@Override
	public void Pause() {

	}

	@Override
	public void Resume() {

	}

	@Override
	public void Draw(Graphics g) {
	}

	private void HandleKeys() {
		if (Input.IsKeyPressed(KeyEvent.VK_ESCAPE)) {
			Controller.Exit();
		}
	}

	@Override
	public void Update() {
		HandleKeys();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}
}
