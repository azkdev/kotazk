package com.azkdev.kotazk

import processing.core.PApplet
import processing.core.PImage

/**
 * @author "azkdev"
 * Kotlin and Processing development.
 * This class will contain all the game classes.
 */
class Kotazk: PApplet() {

    

    /**
     * Initialize settings.
     * Setting canvas width and height.
     */
    override fun settings() {
        size(CW, CH)
    }

    /**
     * Setup function.
     * Here we'll instantiate models, variables.
     */
    override fun setup() {
        frameRate(FR)
        background(BG)
    }

    /**
     * Draw function.
     * Infinite loop for drawing content.
     */
    override fun draw() {
        background(BG)
    }


    open inner class Character(
            var x: Float = CW * .5F,
            var y: Float = CH * .5F,
            var r: Float = HR
    )

    inner class Hero(
            var texture: PImage = loadImage(HT)
    ): Character(y = CH - 50F) {

        fun draw() {
            image(texture, x, y, r, r)
        }

    }

}

/**
 * Main function.
 * Entry point for our game.
 */
fun main(args: Array<String>) {
    PApplet.main("com.azkdev.kotazk.Kotazk")
}