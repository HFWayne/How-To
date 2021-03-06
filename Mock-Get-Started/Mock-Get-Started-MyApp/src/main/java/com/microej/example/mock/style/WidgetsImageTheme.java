/*
 * Java
 *
 * Copyright 2018 IS2T. All rights reserved.
 * For demonstration purpose only.
 * IS2T PROPRIETARY. Use is subject to license terms.
 */
package com.microej.example.mock.style;

import ej.widget.basic.image.ImageTheme;

/**
 * The image theme used in the demo.
 */
public class WidgetsImageTheme implements ImageTheme {

	@Override
	public String getCheckboxCheckedPath() {
		throw new UnsupportedOperationException();
	}

	@Override
	public String getCheckboxUncheckedPath() {
		throw new UnsupportedOperationException();
	}

	@Override
	public String getSwitchCheckedPath() {
		return "/images/switch_checked.png"; //$NON-NLS-1$
	}

	@Override
	public String getSwitchUncheckedPath() {
		return "/images/switch_unchecked.png"; //$NON-NLS-1$
	}

	@Override
	public String getRadioButtonCheckedPath() {
		throw new UnsupportedOperationException();
	}

	@Override
	public String getRadioButtonUncheckedPath() {
		throw new UnsupportedOperationException();
	}

	@Override
	public String getSliderHorizontalBarPath() {
		throw new UnsupportedOperationException();
	}

	@Override
	public String getSliderVerticalBarPath() {
		throw new UnsupportedOperationException();
	}

	@Override
	public String getSliderCursorPath() {
		throw new UnsupportedOperationException();
	}

	@Override
	public String getProgressBarHorizontalPath() {
		throw new UnsupportedOperationException();
	}

	@Override
	public String getProgressBarVerticalPath() {
		throw new UnsupportedOperationException();
	}

}
