/*
 * Java
 *
 * Copyright 2016 IS2T. All rights reserved.
 * Use of this source code is governed by a BSD-style license that can be found at http://www.is2t.com/open-source-bsd-license/.
 */
package com.microej.howto.microui.image;

import java.io.IOException;

import ej.microui.MicroUI;
import ej.microui.display.Colors;
import ej.microui.display.Display;
import ej.microui.display.Displayable;
import ej.microui.display.GraphicsContext;
import ej.microui.display.Image;
import ej.microui.display.transform.ImageRotation;
import ej.microui.util.EventHandler;


/**
 * This class shows how to use the ImageRotation utility class
 */
public class RotatedImages {

	public void display() {
		// We will need to access the display to draw stuff
		final Display display = Display.getDefaultDisplay();

		// A displayable is an object that will be drawn on the display
		Displayable displayable = new Displayable(display) {
			@Override
			public void paint(GraphicsContext g) {

				// fill up background with black
				g.setColor(Colors.BLACK);
				g.fillRect(0, 0, display.getWidth(), display.getHeight());


				try {
					Image microejImage = Image.createImage("/images/microej.png");

					final int left = display.getWidth() / 4;
					final int top = display.getHeight() / 4;
					final int right = display.getWidth() / 4 * 3;
					final int bottom = display.getHeight() / 4 * 3;

					{ // top-left corner - 45°
						ImageRotation rotation = new ImageRotation();
						rotation.setRotationCenter(left, top);
						rotation.setAngle(45);

						// Use the bilinear algorithm to render the image. This
						// algorithm performs better rendering than nearest
						// neighbor algorithm but it is slower to apply.
						rotation.drawBilinear(g, microejImage, left, top,
								GraphicsContext.HCENTER | GraphicsContext.VCENTER);
					}

					{ // top-right corner - 135°
						ImageRotation rotation = new ImageRotation();
						rotation.setRotationCenter(right, top);
						rotation.setAngle(135);

						// Use the bilinear algorithm to render the image. This
						// algorithm performs better rendering than nearest
						// neighbor algorithm but it is slower to apply.
						rotation.drawBilinear(g, microejImage, right, top,
								GraphicsContext.HCENTER | GraphicsContext.VCENTER);
					}

					{ // bottom-left corner - 45°
						ImageRotation rotation = new ImageRotation();
						rotation.setRotationCenter(left, bottom);
						rotation.setAngle(45);

						// Uses the nearest neighbor algorithm to render the
						// image. This algorithm is faster than bilinear
						// algorithm but its rendering is more simple.
						rotation.drawNearestNeighbor(g, microejImage, left, bottom,
								GraphicsContext.HCENTER | GraphicsContext.VCENTER);
					}

					{ // bottom-right corner - 270°
						ImageRotation rotation = new ImageRotation();
						rotation.setRotationCenter(right, bottom);
						rotation.setAngle(135);

						// Uses the nearest neighbor algorithm to render the
						// image. This algorithm is faster than bilinear
						// algorithm but its rendering is more simple.
						rotation.drawNearestNeighbor(g, microejImage, right, bottom,
								GraphicsContext.HCENTER | GraphicsContext.VCENTER);
					}
				} catch (IOException e) {
					throw new AssertionError(e);
				}

			}

			@Override
			public EventHandler getController() {
				// No event handling is required for this sample.

				return null;
			}
		};

		displayable.show();
	}

	/**
	 * Entry Point for the example.
	 *
	 * @param args
	 *             Not used.
	 */
	public static void main(String[] args) {
		// A call to MicroUI.start is required to initialize the graphics
		// runtime environment
		MicroUI.start();

		RotatedImages transparentImages = new RotatedImages();
		transparentImages.display();
	}

}
