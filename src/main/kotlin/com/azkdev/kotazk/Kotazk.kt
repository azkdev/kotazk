package com.azkdev.kotazk

import processing.core.PApplet
import processing.core.PConstants

class Kotazk: PApplet() {

    override fun settings() {
        size(600, 600) // Constant need to be used.
    }

    override fun setup() {
        frameRate(90F) // Constant need to be used.
        background(50) // Constant need to be used.
    }

    override fun draw() {
        background(50) // Constant need to be used.
        textSize(30F) // Init text size.
        textAlign(PConstants.CENTER, PConstants.CENTER) // Align text to center and underline.
        stroke(255) // Stroke color.
        strokeWeight(3F) // Stroke weight.
        line(0F, 325F, 600F, 325F) // Line x1 = 0, x2 = 600.
        text("Initial stage", 300F, 300F) // Text and positioning.
    }

}

fun main(args: Array<String>) {
    PApplet.main("com.azkdev.kotazk.Kotazk")
}