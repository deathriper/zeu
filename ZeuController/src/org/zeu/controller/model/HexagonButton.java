package org.zeu.controller.model;

import org.zeu.controller.Network;
import org.zeu.controller.ZeuControllerActivity;
import org.zeu.controller.model.base.BaseButton;
import org.zeu.controller.model.json.Input;

public class HexagonButton extends BaseButton {

	public HexagonButton(ZeuControllerActivity zeu, Network net) {
		super(zeu.CAMERA_WIDTH - 32 - zeu.getJoystickKnobTexture().getWidth(),
				32, zeu.getJoystickKnobTexture(), net, Input.BUTTON_HEXAGON);
	}

}
